package typings.winrtUwp.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a trigger that launches a background task when the connection status of a device changes. */
@js.native
trait DeviceConnectionChangeTrigger extends js.Object {
  /** Gets whether the system can maintain a connection to the specified device. */
  var canMaintainConnection: Boolean = js.native
  /** Gets the device Id associated with the device. */
  var deviceId: String = js.native
  /** Gets or sets whether the system should automatically attempt to keep the referenced device connected. */
  var maintainConnection: Boolean = js.native
}

object DeviceConnectionChangeTrigger {
  @scala.inline
  def apply(canMaintainConnection: Boolean, deviceId: String, maintainConnection: Boolean): DeviceConnectionChangeTrigger = {
    val __obj = js.Dynamic.literal(canMaintainConnection = canMaintainConnection.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], maintainConnection = maintainConnection.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceConnectionChangeTrigger]
  }
  @scala.inline
  implicit class DeviceConnectionChangeTriggerOps[Self <: DeviceConnectionChangeTrigger] (val x: Self) extends AnyVal {
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
    def setCanMaintainConnection(value: Boolean): Self = this.set("canMaintainConnection", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeviceId(value: String): Self = this.set("deviceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaintainConnection(value: Boolean): Self = this.set("maintainConnection", value.asInstanceOf[js.Any])
  }
  
}

