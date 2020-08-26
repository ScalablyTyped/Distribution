package typings.winrtUwp.Windows.Devices.SerialCommunication

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the object that is passed as a parameter to the event handler that is invoked when error occurs on the serial port. */
@js.native
trait ErrorReceivedEventArgs extends js.Object {
  /** Gets the character type received that caused the event on the serial port. */
  var error: SerialError = js.native
}

object ErrorReceivedEventArgs {
  @scala.inline
  def apply(error: SerialError): ErrorReceivedEventArgs = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorReceivedEventArgs]
  }
  @scala.inline
  implicit class ErrorReceivedEventArgsOps[Self <: ErrorReceivedEventArgs] (val x: Self) extends AnyVal {
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
    def setError(value: SerialError): Self = this.set("error", value.asInstanceOf[js.Any])
  }
  
}

