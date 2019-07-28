package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object websql {
  // util interfaces
  type DOMString = String
  //[Callback = FunctionOnly, NoInterfaceObject]
  type DatabaseCallback = js.Function1[/* database */ Database, Unit]
  type ObjectArray = js.Array[js.Any]
  //[Callback = FunctionOnly, NoInterfaceObject]
  type SQLStatementCallback = js.Function2[/* transaction */ SQLTransaction, /* resultSet */ SQLResultSet, Unit]
  //[Callback = FunctionOnly, NoInterfaceObject]
  type SQLStatementErrorCallback = js.Function2[/* transaction */ SQLTransaction, /* error */ SQLError, Boolean]
  //[Callback = FunctionOnly, NoInterfaceObject]
  type SQLTransactionCallback = js.Function1[/* transaction */ SQLTransaction, Unit]
  //[Callback = FunctionOnly, NoInterfaceObject]
  type SQLTransactionErrorCallback = js.Function1[/* error */ SQLError, Unit]
  //[Callback = FunctionOnly, NoInterfaceObject]
  type SQLTransactionSyncCallback = js.Function1[/* transaction */ SQLTransactionSync, Unit]
  //[Callback = FunctionOnly, NoInterfaceObject]
  type SQLVoidCallback = js.Function0[Unit]
  type Window = WindowDatabase
  type WorkerUtils = WorkerUtilsDatabase
}
