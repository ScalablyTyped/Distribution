package typings.winrtUwp.Windows.Media.DialProtocol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the event arguments for the DisconnectButtonClicked event on the DialDevicePicker object. */
trait DialDisconnectButtonClickedEventArgs extends js.Object {
  /** Gets the DialDevice object that represents the remote device that the user wants to disconnect. */
  var device: DialDevice
}

object DialDisconnectButtonClickedEventArgs {
  @scala.inline
  def apply(device: DialDevice): DialDisconnectButtonClickedEventArgs = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialDisconnectButtonClickedEventArgs]
  }
}

