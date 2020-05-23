package typings.winrtUwp.global.Windows.Devices.Enumeration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the DeviceSelected event on the DevicePicker object. */
@JSGlobal("Windows.Devices.Enumeration.DeviceSelectedEventArgs")
@js.native
abstract class DeviceSelectedEventArgs ()
  extends typings.winrtUwp.Windows.Devices.Enumeration.DeviceSelectedEventArgs {
  /** The device selected by the user in the picker. */
  /* CompleteClass */
  override var selectedDevice: typings.winrtUwp.Windows.Devices.Enumeration.DeviceInformation = js.native
}

