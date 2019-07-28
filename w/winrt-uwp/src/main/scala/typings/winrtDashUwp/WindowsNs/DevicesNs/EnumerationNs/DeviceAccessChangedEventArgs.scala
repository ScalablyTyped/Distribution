package typings.winrtDashUwp.WindowsNs.DevicesNs.EnumerationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the AccessChanged event. */
@JSGlobal("Windows.Devices.Enumeration.DeviceAccessChangedEventArgs")
@js.native
abstract class DeviceAccessChangedEventArgs () extends js.Object {
  /** The new status of access to a device. */
  var status: DeviceAccessStatus = js.native
}

