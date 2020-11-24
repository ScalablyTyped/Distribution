package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object websql {
  
  // util interfaces
  type DOMString = java.lang.String
  
  //[Callback = FunctionOnly, NoInterfaceObject]
  type DatabaseCallback = js.Function1[/* database */ typings.websql.Database, scala.Unit]
  
  type ObjectArray = js.Array[js.Any]
  
  //[Callback = FunctionOnly, NoInterfaceObject]
  type SQLStatementCallback = js.Function2[
    /* transaction */ typings.websql.SQLTransaction, 
    /* resultSet */ typings.websql.SQLResultSet, 
    scala.Unit
  ]
  
  //[Callback = FunctionOnly, NoInterfaceObject]
  type SQLStatementErrorCallback = js.Function2[
    /* transaction */ typings.websql.SQLTransaction, 
    /* error */ typings.websql.SQLError, 
    scala.Boolean
  ]
  
  //[Callback = FunctionOnly, NoInterfaceObject]
  type SQLTransactionCallback = js.Function1[/* transaction */ typings.websql.SQLTransaction, scala.Unit]
  
  //[Callback = FunctionOnly, NoInterfaceObject]
  type SQLTransactionErrorCallback = js.Function1[/* error */ typings.websql.SQLError, scala.Unit]
  
  //[Callback = FunctionOnly, NoInterfaceObject]
  type SQLTransactionSyncCallback = js.Function1[/* transaction */ typings.websql.SQLTransactionSync, scala.Unit]
  
  //[Callback = FunctionOnly, NoInterfaceObject]
  type SQLVoidCallback = js.Function0[scala.Unit]
  
  type WorkerUtils = typings.websql.WorkerUtilsDatabase
}
