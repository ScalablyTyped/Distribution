package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.CustomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DeviceSharingMode extends js.Object

/** The device sharing mode. */
@JSGlobal("Windows.Devices.Custom.DeviceSharingMode")
@js.native
object DeviceSharingMode extends js.Object {
  /** The device is exclusive. */
  @js.native
  sealed trait exclusive
    extends winrtDashUwpLib.WindowsNs.DevicesNs.CustomNs.DeviceSharingMode
  
  /** The device is shared. */
  @js.native
  sealed trait shared
    extends winrtDashUwpLib.WindowsNs.DevicesNs.CustomNs.DeviceSharingMode
  
  /* 1 */ val exclusive: exclusive with scala.Double = js.native
  /* 0 */ val shared: shared with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.DevicesNs.CustomNs.DeviceSharingMode with scala.Double] = js.native
}

