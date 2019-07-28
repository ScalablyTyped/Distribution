package typings.websql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 4.4 Synchronous database API
  */
trait DatabaseSync extends js.Object {
  /*readonly/const*/ var version: DOMString
  def changeVersion(oldVersion: DOMString, newVersion: DOMString, callback: SQLTransactionSyncCallback): Unit
  def readTransaction(callback: SQLTransactionSyncCallback): Unit
  def transaction(callback: SQLTransactionSyncCallback): Unit
}

object DatabaseSync {
  @scala.inline
  def apply(
    changeVersion: (DOMString, DOMString, SQLTransactionSyncCallback) => Unit,
    readTransaction: SQLTransactionSyncCallback => Unit,
    transaction: SQLTransactionSyncCallback => Unit,
    version: DOMString
  ): DatabaseSync = {
    val __obj = js.Dynamic.literal(changeVersion = js.Any.fromFunction3(changeVersion), readTransaction = js.Any.fromFunction1(readTransaction), transaction = js.Any.fromFunction1(transaction), version = version)
  
    __obj.asInstanceOf[DatabaseSync]
  }
}

