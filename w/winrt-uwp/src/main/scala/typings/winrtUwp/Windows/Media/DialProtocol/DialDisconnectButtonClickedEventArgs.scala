package typings.winrtUwp.Windows.Media.DialProtocol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the event arguments for the DisconnectButtonClicked event on the DialDevicePicker object. */
@JSGlobal("Windows.Media.DialProtocol.DialDisconnectButtonClickedEventArgs")
@js.native
abstract class DialDisconnectButtonClickedEventArgs () extends js.Object {
  /** Gets the DialDevice object that represents the remote device that the user wants to disconnect. */
  var device: DialDevice = js.native
}

