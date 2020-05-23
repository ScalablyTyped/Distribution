package typings.winrtUwp.global.Windows.Devices.Enumeration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Triggered when the list of devices is updated after the initial enumeration is complete. */
@JSGlobal("Windows.Devices.Enumeration.DeviceWatcherEvent")
@js.native
abstract class DeviceWatcherEvent ()
  extends typings.winrtUwp.Windows.Devices.Enumeration.DeviceWatcherEvent {
  /** Gets the information for the device associated with the DeviceWatcherEvent . */
  /* CompleteClass */
  override var deviceInformation: typings.winrtUwp.Windows.Devices.Enumeration.DeviceInformation = js.native
  /** Gets updated information for a device updated by the DeviceWatcherEvent . */
  /* CompleteClass */
  override var deviceInformationUpdate: typings.winrtUwp.Windows.Devices.Enumeration.DeviceInformationUpdate = js.native
  /** Gets the type for the device indicated by the DeviceWatcherEvent . */
  /* CompleteClass */
  override var kind: typings.winrtUwp.Windows.Devices.Enumeration.DeviceWatcherEventKind = js.native
}

