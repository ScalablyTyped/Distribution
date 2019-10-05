package typings.winrtDashUwp.Windows.UI.ViewManagement

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
  sealed trait minimal extends FullScreenSystemOverlayMode
  
  /** Edge gestures call up system overlays, like the taskbar and title bar. */
  @js.native
  sealed trait standard extends FullScreenSystemOverlayMode
  
  /* 1 */ val minimal: typings.winrtDashUwp.Windows.UI.ViewManagement.FullScreenSystemOverlayMode.minimal with Double = js.native
  /* 0 */ val standard: typings.winrtDashUwp.Windows.UI.ViewManagement.FullScreenSystemOverlayMode.standard with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FullScreenSystemOverlayMode with Double] = js.native
}

