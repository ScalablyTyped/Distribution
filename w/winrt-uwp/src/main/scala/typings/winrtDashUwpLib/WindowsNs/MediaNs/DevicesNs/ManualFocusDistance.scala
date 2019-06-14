package typings
package winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ManualFocusDistance extends js.Object

/** Defines the options for manual focus distance. */
@JSGlobal("Windows.Media.Devices.ManualFocusDistance")
@js.native
object ManualFocusDistance extends js.Object {
  /** Focus to the hyperfocal distance. */
  @js.native
  sealed trait hyperfocal
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.ManualFocusDistance
  
  /** Focus to infinity. */
  @js.native
  sealed trait infinity
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.ManualFocusDistance
  
  /** Focus to the nearest distance. */
  @js.native
  sealed trait nearest
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.ManualFocusDistance
  
  /* 1 */ val hyperfocal: hyperfocal with scala.Double = js.native
  /* 0 */ val infinity: infinity with scala.Double = js.native
  /* 2 */ val nearest: nearest with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.ManualFocusDistance with scala.Double
  ] = js.native
}

