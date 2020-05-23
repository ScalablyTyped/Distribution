package typings.winrtUwp.Windows.Devices.Enumeration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the DeviceSelected event on the DevicePicker object. */
trait DeviceSelectedEventArgs extends js.Object {
  /** The device selected by the user in the picker. */
  var selectedDevice: DeviceInformation
}

object DeviceSelectedEventArgs {
  @scala.inline
  def apply(selectedDevice: DeviceInformation): DeviceSelectedEventArgs = {
    val __obj = js.Dynamic.literal(selectedDevice = selectedDevice.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceSelectedEventArgs]
  }
}

