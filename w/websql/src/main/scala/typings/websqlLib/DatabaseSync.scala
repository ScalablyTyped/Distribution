package typings
package websqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 4.4 Synchronous database API
 */

trait DatabaseSync extends js.Object {
  /*readonly/const*/var version: DOMString
  def changeVersion(oldVersion: DOMString, newVersion: DOMString, callback: SQLTransactionSyncCallback): scala.Unit
  def readTransaction(callback: SQLTransactionSyncCallback): scala.Unit
  def transaction(callback: SQLTransactionSyncCallback): scala.Unit
}

