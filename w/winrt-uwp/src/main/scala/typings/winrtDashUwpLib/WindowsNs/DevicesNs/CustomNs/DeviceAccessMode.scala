package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.CustomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DeviceAccessMode extends js.Object

/** The device access mode. */
@JSGlobal("Windows.Devices.Custom.DeviceAccessMode")
@js.native
object DeviceAccessMode extends js.Object {
  /** Read access. */
  @js.native
  sealed trait read
    extends winrtDashUwpLib.WindowsNs.DevicesNs.CustomNs.DeviceAccessMode
  
  /** Read/write access. */
  @js.native
  sealed trait readWrite
    extends winrtDashUwpLib.WindowsNs.DevicesNs.CustomNs.DeviceAccessMode
  
  /** Write access. */
  @js.native
  sealed trait write
    extends winrtDashUwpLib.WindowsNs.DevicesNs.CustomNs.DeviceAccessMode
  
  /* 0 */ val read: read with scala.Double = js.native
  /* 2 */ val readWrite: readWrite with scala.Double = js.native
  /* 1 */ val write: write with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.DevicesNs.CustomNs.DeviceAccessMode with scala.Double] = js.native
}

