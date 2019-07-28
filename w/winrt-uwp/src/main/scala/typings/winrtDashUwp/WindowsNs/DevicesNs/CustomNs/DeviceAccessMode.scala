package typings.winrtDashUwp.WindowsNs.DevicesNs.CustomNs

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
  sealed trait read extends DeviceAccessMode
  
  /** Read/write access. */
  @js.native
  sealed trait readWrite extends DeviceAccessMode
  
  /** Write access. */
  @js.native
  sealed trait write extends DeviceAccessMode
  
  /* 0 */ val read: typings.winrtDashUwp.WindowsNs.DevicesNs.CustomNs.DeviceAccessMode.read with Double = js.native
  /* 2 */ val readWrite: typings.winrtDashUwp.WindowsNs.DevicesNs.CustomNs.DeviceAccessMode.readWrite with Double = js.native
  /* 1 */ val write: typings.winrtDashUwp.WindowsNs.DevicesNs.CustomNs.DeviceAccessMode.write with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeviceAccessMode with Double] = js.native
}

