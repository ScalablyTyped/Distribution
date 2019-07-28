package typings.winrtDashUwp.WindowsNs.DevicesNs.BackgroundNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used to provide the DeviceInformation.ID , expected duration, and arguments given by the app that triggered the background servicing task. */
@JSGlobal("Windows.Devices.Background.DeviceServicingDetails")
@js.native
abstract class DeviceServicingDetails () extends js.Object {
  /** Gets the arguments string provided by the app when it called RequestAsync on the DeviceServicingTrigger . This allows the app to easily pass parameters to the task when it invokes it. */
  var arguments: String = js.native
  /** Gets the DeviceInformation.ID of the device the task is targeting. The background task can provide this to the FromIdAsync method of the appropriate device access class to open the device. For example, call UsbDevice.FromIdAsync in the Windows.Devices.Usb namespace to open a USB device. */
  var deviceId: String = js.native
  /** Gets the estimated duration provided by the app when it called RequestAsync on the DeviceServicingTrigger . */
  var expectedDuration: Double = js.native
}

