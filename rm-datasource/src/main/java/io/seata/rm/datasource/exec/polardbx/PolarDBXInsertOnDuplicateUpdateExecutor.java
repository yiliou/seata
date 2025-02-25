/*
 *  Copyright 1999-2019 Seata.io Group.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package io.seata.rm.datasource.exec.polardbx;

import io.seata.common.loader.LoadLevel;
import io.seata.common.loader.Scope;
import io.seata.rm.datasource.StatementProxy;
import io.seata.rm.datasource.exec.StatementCallback;
import io.seata.rm.datasource.exec.mysql.MySQLInsertOnDuplicateUpdateExecutor;
import io.seata.sqlparser.SQLRecognizer;
import io.seata.sqlparser.util.JdbcConstants;

/**
 * Insert on duplicated update executor for PolarDB-X
 *
 * @author hsien999
 */
@LoadLevel(name = JdbcConstants.POLARDBX, scope = Scope.PROTOTYPE)
public class PolarDBXInsertOnDuplicateUpdateExecutor extends MySQLInsertOnDuplicateUpdateExecutor {
    public PolarDBXInsertOnDuplicateUpdateExecutor(StatementProxy statementProxy, StatementCallback statementCallback,
                                                   SQLRecognizer sqlRecognizer) {
        super(statementProxy, statementCallback, sqlRecognizer);
    }
}
