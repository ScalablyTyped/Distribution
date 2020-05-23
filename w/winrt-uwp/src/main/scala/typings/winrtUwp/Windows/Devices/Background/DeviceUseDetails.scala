package typings.winrtUwp.Windows.Devices.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used to provide the DeviceInformation.ID and arguments given by the app that triggered the background sync task. */
trait DeviceUseDetails extends js.Object {
  /** Gets the arguments string provided by the app when it called RequestAsync on the DeviceUseTrigger . This allows the app to easily pass parameters to the task when it invokes it. */
  var arguments: String
  /** Gets the DeviceInformation.ID of the device the task is targeting. The background task can provide this to the FromIdAsync method of the appropriate device access class to open the device. For example, call UsbDevice.FromIdAsync in the Windows.Devices.Usb namespace to open a USB device. */
  var deviceId: String
}

object DeviceUseDetails {
  @scala.inline
  def apply(arguments: String, deviceId: String): DeviceUseDetails = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceUseDetails]
  }
}

