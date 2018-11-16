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
  
  val exclusive: exclusive with java.lang.String = js.native
  val shared: shared with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.CustomNs.DeviceSharingMode with java.lang.String
  ] = js.native
}

