package typings.winrtUwp.Windows.Devices.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used to provide the DeviceInformation.ID , expected duration, and arguments given by the app that triggered the background servicing task. */
@js.native
trait DeviceServicingDetails extends js.Object {
  /** Gets the arguments string provided by the app when it called RequestAsync on the DeviceServicingTrigger . This allows the app to easily pass parameters to the task when it invokes it. */
  var arguments: String = js.native
  /** Gets the DeviceInformation.ID of the device the task is targeting. The background task can provide this to the FromIdAsync method of the appropriate device access class to open the device. For example, call UsbDevice.FromIdAsync in the Windows.Devices.Usb namespace to open a USB device. */
  var deviceId: String = js.native
  /** Gets the estimated duration provided by the app when it called RequestAsync on the DeviceServicingTrigger . */
  var expectedDuration: Double = js.native
}

object DeviceServicingDetails {
  @scala.inline
  def apply(arguments: String, deviceId: String, expectedDuration: Double): DeviceServicingDetails = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], expectedDuration = expectedDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceServicingDetails]
  }
  @scala.inline
  implicit class DeviceServicingDetailsOps[Self <: DeviceServicingDetails] (val x: Self) extends AnyVal {
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
    def setArguments(value: String): Self = this.set("arguments", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeviceId(value: String): Self = this.set("deviceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpectedDuration(value: Double): Self = this.set("expectedDuration", value.asInstanceOf[js.Any])
  }
  
}

