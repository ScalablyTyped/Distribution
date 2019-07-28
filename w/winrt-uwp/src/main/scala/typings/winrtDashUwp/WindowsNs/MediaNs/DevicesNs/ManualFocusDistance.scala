package typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs

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
  sealed trait hyperfocal extends ManualFocusDistance
  
  /** Focus to infinity. */
  @js.native
  sealed trait infinity extends ManualFocusDistance
  
  /** Focus to the nearest distance. */
  @js.native
  sealed trait nearest extends ManualFocusDistance
  
  /* 1 */ val hyperfocal: typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs.ManualFocusDistance.hyperfocal with Double = js.native
  /* 0 */ val infinity: typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs.ManualFocusDistance.infinity with Double = js.native
  /* 2 */ val nearest: typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs.ManualFocusDistance.nearest with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ManualFocusDistance with Double] = js.native
}

