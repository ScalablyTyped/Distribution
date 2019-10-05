package typings.winrtDashUwp.Windows.Devices.Enumeration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DeviceAccessStatus extends js.Object

/** Indicates the status of the access to a device. */
@JSGlobal("Windows.Devices.Enumeration.DeviceAccessStatus")
@js.native
object DeviceAccessStatus extends js.Object {
  /** Access to the device is allowed. */
  @js.native
  sealed trait allowed extends DeviceAccessStatus
  
  /** Access to the device has been disallowed by the system. */
  @js.native
  sealed trait deniedBySystem extends DeviceAccessStatus
  
  /** Access to the device has been disallowed by the user. */
  @js.native
  sealed trait deniedByUser extends DeviceAccessStatus
  
  /** The device access is not specified. */
  @js.native
  sealed trait unspecified extends DeviceAccessStatus
  
  /* 1 */ val allowed: typings.winrtDashUwp.Windows.Devices.Enumeration.DeviceAccessStatus.allowed with Double = js.native
  /* 3 */ val deniedBySystem: typings.winrtDashUwp.Windows.Devices.Enumeration.DeviceAccessStatus.deniedBySystem with Double = js.native
  /* 2 */ val deniedByUser: typings.winrtDashUwp.Windows.Devices.Enumeration.DeviceAccessStatus.deniedByUser with Double = js.native
  /* 0 */ val unspecified: typings.winrtDashUwp.Windows.Devices.Enumeration.DeviceAccessStatus.unspecified with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeviceAccessStatus with Double] = js.native
}

