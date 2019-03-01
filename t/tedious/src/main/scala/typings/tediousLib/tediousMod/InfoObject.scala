package typings
package tediousLib.tediousMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InfoObject extends js.Object {
  /**
    * The class (severity) of the error. A class of less than 10 indicates an informational message.
    */
  var `class`: scala.Double
  /**
    * The line number in the SQL batch or stored procedure that caused the error. Line numbers begin at 1; therefore, if the line number is not applicable to the message, the value of LineNumber will be 0.
    */
  var lineNumber: scala.Double
  /**
    * The message text.
    */
  var message: java.lang.String
  /**
    * Error number
    */
  var number: scala.Double
  /**
    * The stored procedure name (if a stored procedure generated the message).
    */
  var procName: java.lang.String
  /**
    * The error state, used as a modifier to the error number.
    */
  var state: js.Any
}

object InfoObject {
  @scala.inline
  def apply(
    `class`: scala.Double,
    lineNumber: scala.Double,
    message: java.lang.String,
    number: scala.Double,
    procName: java.lang.String,
    state: js.Any
  ): InfoObject = {
    val __obj = js.Dynamic.literal(`class` = `class`)
    __obj.updateDynamic("lineNumber")(lineNumber)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("number")(number)
    __obj.updateDynamic("procName")(procName)
    __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[InfoObject]
  }
}

