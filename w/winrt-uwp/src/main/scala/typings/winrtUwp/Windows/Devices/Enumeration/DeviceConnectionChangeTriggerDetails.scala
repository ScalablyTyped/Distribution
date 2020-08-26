package typings.winrtUwp.Windows.Devices.Enumeration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the device that caused this trigger to fire. */
@js.native
trait DeviceConnectionChangeTriggerDetails extends js.Object {
  /** Gets the device Id of the device that caused this trigger to fire. */
  var deviceId: String = js.native
}

object DeviceConnectionChangeTriggerDetails {
  @scala.inline
  def apply(deviceId: String): DeviceConnectionChangeTriggerDetails = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceConnectionChangeTriggerDetails]
  }
  @scala.inline
  implicit class DeviceConnectionChangeTriggerDetailsOps[Self <: DeviceConnectionChangeTriggerDetails] (val x: Self) extends AnyVal {
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
    def setDeviceId(value: String): Self = this.set("deviceId", value.asInstanceOf[js.Any])
  }
  
}

