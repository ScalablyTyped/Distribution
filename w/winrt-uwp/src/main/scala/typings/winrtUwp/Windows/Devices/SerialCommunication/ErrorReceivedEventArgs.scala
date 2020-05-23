package typings.winrtUwp.Windows.Devices.SerialCommunication

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the object that is passed as a parameter to the event handler that is invoked when error occurs on the serial port. */
trait ErrorReceivedEventArgs extends js.Object {
  /** Gets the character type received that caused the event on the serial port. */
  var error: SerialError
}

object ErrorReceivedEventArgs {
  @scala.inline
  def apply(error: SerialError): ErrorReceivedEventArgs = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorReceivedEventArgs]
  }
}

