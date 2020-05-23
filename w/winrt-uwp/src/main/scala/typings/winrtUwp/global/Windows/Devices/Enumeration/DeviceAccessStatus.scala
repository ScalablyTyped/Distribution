package typings.winrtUwp.global.Windows.Devices.Enumeration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Indicates the status of the access to a device. */
@JSGlobal("Windows.Devices.Enumeration.DeviceAccessStatus")
@js.native
object DeviceAccessStatus extends js.Object {
  /* 1 */ val allowed: typings.winrtUwp.Windows.Devices.Enumeration.DeviceAccessStatus.allowed with Double = js.native
  /* 3 */ val deniedBySystem: typings.winrtUwp.Windows.Devices.Enumeration.DeviceAccessStatus.deniedBySystem with Double = js.native
  /* 2 */ val deniedByUser: typings.winrtUwp.Windows.Devices.Enumeration.DeviceAccessStatus.deniedByUser with Double = js.native
  /* 0 */ val unspecified: typings.winrtUwp.Windows.Devices.Enumeration.DeviceAccessStatus.unspecified with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Enumeration.DeviceAccessStatus with Double] = js.native
}

