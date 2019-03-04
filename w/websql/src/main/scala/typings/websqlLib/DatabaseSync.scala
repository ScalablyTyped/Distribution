package typings
package websqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 4.4 Synchronous database API
  */
trait DatabaseSync extends js.Object {
  /*readonly/const*/ var version: DOMString
  def changeVersion(oldVersion: DOMString, newVersion: DOMString, callback: SQLTransactionSyncCallback): scala.Unit
  def readTransaction(callback: SQLTransactionSyncCallback): scala.Unit
  def transaction(callback: SQLTransactionSyncCallback): scala.Unit
}

object DatabaseSync {
  @scala.inline
  def apply(
    changeVersion: js.Function3[DOMString, DOMString, SQLTransactionSyncCallback, scala.Unit],
    readTransaction: js.Function1[SQLTransactionSyncCallback, scala.Unit],
    transaction: js.Function1[SQLTransactionSyncCallback, scala.Unit],
    version: DOMString
  ): DatabaseSync = {
    val __obj = js.Dynamic.literal(changeVersion = changeVersion, readTransaction = readTransaction, transaction = transaction, version = version)
  
    __obj.asInstanceOf[DatabaseSync]
  }
}

