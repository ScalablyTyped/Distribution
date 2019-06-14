package typings
package winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HdrVideoMode extends js.Object

/** Defines the High Dynamic Range (HDR) video modes. */
@JSGlobal("Windows.Media.Devices.HdrVideoMode")
@js.native
object HdrVideoMode extends js.Object {
  /** The system dynamically enables HDR video capture when appropriate. */
  @js.native
  sealed trait auto
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.HdrVideoMode
  
  /** HDR video capture is disabled. */
  @js.native
  sealed trait off
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.HdrVideoMode
  
  /** HDR video capture is enabled. */
  @js.native
  sealed trait on
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.HdrVideoMode
  
  /* 2 */ val auto: auto with scala.Double = js.native
  /* 0 */ val off: off with scala.Double = js.native
  /* 1 */ val on: on with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.HdrVideoMode with scala.Double] = js.native
}

