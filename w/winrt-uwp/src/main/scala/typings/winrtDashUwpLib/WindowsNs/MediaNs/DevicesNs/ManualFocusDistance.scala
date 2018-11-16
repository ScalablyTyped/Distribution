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
  
  val hyperfocal: hyperfocal with java.lang.String = js.native
  val infinity: infinity with java.lang.String = js.native
  val nearest: nearest with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.ManualFocusDistance with java.lang.String
  ] = js.native
}

