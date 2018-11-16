package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.SerialCommunicationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the object that is passed as a parameter to the event handler that is invoked when the state of a signal line changes on the serial port. */
@JSGlobal("Windows.Devices.SerialCommunication.PinChangedEventArgs")
@js.native
abstract class PinChangedEventArgs () extends js.Object {
  /** Gets the type of signal change that caused the event on the serial port. */
  var pinChange: SerialPinChange = js.native
}

