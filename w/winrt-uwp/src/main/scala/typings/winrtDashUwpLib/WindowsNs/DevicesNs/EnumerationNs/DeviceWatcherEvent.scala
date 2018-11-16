package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Triggered when the list of devices is updated after the initial enumeration is complete. */
@JSGlobal("Windows.Devices.Enumeration.DeviceWatcherEvent")
@js.native
abstract class DeviceWatcherEvent () extends js.Object {
  /** Gets the information for the device associated with the DeviceWatcherEvent . */
  var deviceInformation: DeviceInformation = js.native
  /** Gets updated information for a device updated by the DeviceWatcherEvent . */
  var deviceInformationUpdate: DeviceInformationUpdate = js.native
  /** Gets the type for the device indicated by the DeviceWatcherEvent . */
  var kind: DeviceWatcherEventKind = js.native
}

