package typings.tedious.tediousMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InfoObject extends js.Object {
  /**
    * The class (severity) of the error. A class of less than 10 indicates an informational message.
    */
  var `class`: Double
  /**
    * The line number in the SQL batch or stored procedure that caused the error. Line numbers begin at 1; therefore, if the line number is not applicable to the message, the value of LineNumber will be 0.
    */
  var lineNumber: Double
  /**
    * The message text.
    */
  var message: String
  /**
    * Error number
    */
  var number: Double
  /**
    * The stored procedure name (if a stored procedure generated the message).
    */
  var procName: String
  /**
    * The error state, used as a modifier to the error number.
    */
  var state: js.Any
}

object InfoObject {
  @scala.inline
  def apply(
    `class`: Double,
    lineNumber: Double,
    message: String,
    number: Double,
    procName: String,
    state: js.Any
  ): InfoObject = {
    val __obj = js.Dynamic.literal(lineNumber = lineNumber, message = message, number = number, procName = procName, state = state)
    __obj.updateDynamic("class")(`class`)
    __obj.asInstanceOf[InfoObject]
  }
}

