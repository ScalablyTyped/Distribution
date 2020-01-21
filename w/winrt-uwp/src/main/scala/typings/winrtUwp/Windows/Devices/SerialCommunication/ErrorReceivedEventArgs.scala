package typings.winrtUwp.Windows.Devices.SerialCommunication

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the object that is passed as a parameter to the event handler that is invoked when error occurs on the serial port. */
@JSGlobal("Windows.Devices.SerialCommunication.ErrorReceivedEventArgs")
@js.native
abstract class ErrorReceivedEventArgs () extends js.Object {
  /** Gets the character type received that caused the event on the serial port. */
  var error: SerialError = js.native
}

