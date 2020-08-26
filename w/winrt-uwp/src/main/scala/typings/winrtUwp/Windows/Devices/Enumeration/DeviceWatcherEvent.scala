package typings.winrtUwp.Windows.Devices.Enumeration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Triggered when the list of devices is updated after the initial enumeration is complete. */
@js.native
trait DeviceWatcherEvent extends js.Object {
  /** Gets the information for the device associated with the DeviceWatcherEvent . */
  var deviceInformation: DeviceInformation = js.native
  /** Gets updated information for a device updated by the DeviceWatcherEvent . */
  var deviceInformationUpdate: DeviceInformationUpdate = js.native
  /** Gets the type for the device indicated by the DeviceWatcherEvent . */
  var kind: DeviceWatcherEventKind = js.native
}

object DeviceWatcherEvent {
  @scala.inline
  def apply(
    deviceInformation: DeviceInformation,
    deviceInformationUpdate: DeviceInformationUpdate,
    kind: DeviceWatcherEventKind
  ): DeviceWatcherEvent = {
    val __obj = js.Dynamic.literal(deviceInformation = deviceInformation.asInstanceOf[js.Any], deviceInformationUpdate = deviceInformationUpdate.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceWatcherEvent]
  }
  @scala.inline
  implicit class DeviceWatcherEventOps[Self <: DeviceWatcherEvent] (val x: Self) extends AnyVal {
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
    def setDeviceInformation(value: DeviceInformation): Self = this.set("deviceInformation", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeviceInformationUpdate(value: DeviceInformationUpdate): Self = this.set("deviceInformationUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: DeviceWatcherEventKind): Self = this.set("kind", value.asInstanceOf[js.Any])
  }
  
}

