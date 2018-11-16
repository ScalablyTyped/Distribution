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
  
  val read: read with java.lang.String = js.native
  val readWrite: readWrite with java.lang.String = js.native
  val write: write with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.CustomNs.DeviceAccessMode with java.lang.String
  ] = js.native
}

