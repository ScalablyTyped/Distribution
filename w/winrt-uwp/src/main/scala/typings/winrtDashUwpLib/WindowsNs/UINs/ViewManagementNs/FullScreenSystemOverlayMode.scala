package typings
package winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FullScreenSystemOverlayMode extends js.Object

/** Defines constants that specify how the app responds to edge gestures when in full-screen mode. */
@JSGlobal("Windows.UI.ViewManagement.FullScreenSystemOverlayMode")
@js.native
object FullScreenSystemOverlayMode extends js.Object {
  /** Edge gestures call up a temporary UI, which in turn can be used to call up system overlays corresponding to that edge. */
  @js.native
  sealed trait minimal
    extends winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs.FullScreenSystemOverlayMode
  
  /** Edge gestures call up system overlays, like the taskbar and title bar. */
  @js.native
  sealed trait standard
    extends winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs.FullScreenSystemOverlayMode
  
  /* 1 */ val minimal: minimal with scala.Double = js.native
  /* 0 */ val standard: standard with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs.FullScreenSystemOverlayMode with scala.Double
  ] = js.native
}

