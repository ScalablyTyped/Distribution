package typings
package websqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 4.3.1 Executing SQL statements
 */
@js.native
trait SQLTransaction extends js.Object {
  def executeSql(sqlStatement: DOMString): scala.Unit = js.native
  def executeSql(sqlStatement: DOMString, arguments: ObjectArray): scala.Unit = js.native
  def executeSql(sqlStatement: DOMString, arguments: ObjectArray, callback: SQLStatementCallback): scala.Unit = js.native
  def executeSql(
    sqlStatement: DOMString,
    arguments: ObjectArray,
    callback: SQLStatementCallback,
    errorCallback: SQLStatementErrorCallback
  ): scala.Unit = js.native
}

