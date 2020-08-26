package typings.tedious.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InfoObject extends js.Object {
  /**
    * The class (severity) of the error. A class of less than 10 indicates an informational message.
    */
  var `class`: Double = js.native
  /**
    * The line number in the SQL batch or stored procedure that caused the error. Line numbers begin at 1; therefore, if the line number is not applicable to the message, the value of LineNumber will be 0.
    */
  var lineNumber: Double = js.native
  /**
    * The message text.
    */
  var message: String = js.native
  /**
    * Error number
    */
  var number: Double = js.native
  /**
    * The stored procedure name (if a stored procedure generated the message).
    */
  var procName: String = js.native
  /**
    * The error state, used as a modifier to the error number.
    */
  var state: js.Any = js.native
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
    val __obj = js.Dynamic.literal(lineNumber = lineNumber.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], procName = procName.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InfoObject]
  }
  @scala.inline
  implicit class InfoObjectOps[Self <: InfoObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClass(value: Double): Self = this.set("class", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineNumber(value: Double): Self = this.set("lineNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumber(value: Double): Self = this.set("number", value.asInstanceOf[js.Any])
    @scala.inline
    def setProcName(value: String): Self = this.set("procName", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: js.Any): Self = this.set("state", value.asInstanceOf[js.Any])
  }
  
}

