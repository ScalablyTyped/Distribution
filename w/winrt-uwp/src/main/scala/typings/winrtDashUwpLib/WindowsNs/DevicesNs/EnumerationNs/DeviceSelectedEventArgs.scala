package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the DeviceSelected event on the DevicePicker object. */
@JSGlobal("Windows.Devices.Enumeration.DeviceSelectedEventArgs")
@js.native
abstract class DeviceSelectedEventArgs () extends js.Object {
  /** The device selected by the user in the picker. */
  var selectedDevice: DeviceInformation = js.native
}

