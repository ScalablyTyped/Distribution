package typings.winrtUwp.Windows.Devices.Enumeration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Triggered when the list of devices is updated after the initial enumeration is complete. */
trait DeviceWatcherEvent extends js.Object {
  /** Gets the information for the device associated with the DeviceWatcherEvent . */
  var deviceInformation: DeviceInformation
  /** Gets updated information for a device updated by the DeviceWatcherEvent . */
  var deviceInformationUpdate: DeviceInformationUpdate
  /** Gets the type for the device indicated by the DeviceWatcherEvent . */
  var kind: DeviceWatcherEventKind
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
}

