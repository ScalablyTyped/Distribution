package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs

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
  sealed trait allowed
    extends winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DeviceAccessStatus
  
  /** Access to the device has been disallowed by the system. */
  @js.native
  sealed trait deniedBySystem
    extends winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DeviceAccessStatus
  
  /** Access to the device has been disallowed by the user. */
  @js.native
  sealed trait deniedByUser
    extends winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DeviceAccessStatus
  
  /** The device access is not specified. */
  @js.native
  sealed trait unspecified
    extends winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DeviceAccessStatus
  
  /* 1 */ val allowed: allowed with scala.Double = js.native
  /* 3 */ val deniedBySystem: deniedBySystem with scala.Double = js.native
  /* 2 */ val deniedByUser: deniedByUser with scala.Double = js.native
  /* 0 */ val unspecified: unspecified with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DeviceAccessStatus with scala.Double
  ] = js.native
}

