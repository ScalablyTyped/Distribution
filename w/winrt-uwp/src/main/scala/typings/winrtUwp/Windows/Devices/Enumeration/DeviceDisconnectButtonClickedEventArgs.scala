package typings.winrtUwp.Windows.Devices.Enumeration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the DisconnectButtonClicked event on the DevicePicker object. */
trait DeviceDisconnectButtonClickedEventArgs extends js.Object {
  /** The device that the user clicked the disconnect button for. */
  var device: DeviceInformation
}

object DeviceDisconnectButtonClickedEventArgs {
  @scala.inline
  def apply(device: DeviceInformation): DeviceDisconnectButtonClickedEventArgs = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceDisconnectButtonClickedEventArgs]
  }
}

