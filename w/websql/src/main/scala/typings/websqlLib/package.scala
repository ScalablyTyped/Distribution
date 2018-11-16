package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object websqlLib {
  // util interfaces
  type DOMString = java.lang.String
  //[Callback = FunctionOnly, NoInterfaceObject]
  type DatabaseCallback = js.Function1[/* database */ Database, scala.Unit]
  type ObjectArray = js.Array[js.Any]
  //[Callback = FunctionOnly, NoInterfaceObject]
  type SQLStatementCallback = js.Function2[/* transaction */ SQLTransaction, /* resultSet */ SQLResultSet, scala.Unit]
  //[Callback = FunctionOnly, NoInterfaceObject]
  type SQLStatementErrorCallback = js.Function2[/* transaction */ SQLTransaction, /* error */ SQLError, scala.Boolean]
  //[Callback = FunctionOnly, NoInterfaceObject]
  type SQLTransactionCallback = js.Function1[/* transaction */ SQLTransaction, scala.Unit]
  //[Callback = FunctionOnly, NoInterfaceObject]
  type SQLTransactionErrorCallback = js.Function1[/* error */ SQLError, scala.Unit]
  //[Callback = FunctionOnly, NoInterfaceObject]
  type SQLTransactionSyncCallback = js.Function1[/* transaction */ SQLTransactionSync, scala.Unit]
  //[Callback = FunctionOnly, NoInterfaceObject]
  type SQLVoidCallback = js.Function0[scala.Unit]
  type Window = WindowDatabase
  type WorkerUtils = WorkerUtilsDatabase
}
