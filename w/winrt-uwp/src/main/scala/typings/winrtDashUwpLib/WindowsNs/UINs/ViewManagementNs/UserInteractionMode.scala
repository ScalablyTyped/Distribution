package typings
package winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UserInteractionMode extends js.Object

/** Specifies the UI view, optimized for input device type. */
@JSGlobal("Windows.UI.ViewManagement.UserInteractionMode")
@js.native
object UserInteractionMode extends js.Object {
  /** The device UI is optimized for mouse input. */
  @js.native
  sealed trait mouse
    extends winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs.UserInteractionMode
  
  /** The device UI is optimized for touch input. */
  @js.native
  sealed trait touch
    extends winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs.UserInteractionMode
  
  /* 0 */ val mouse: mouse with scala.Double = js.native
  /* 1 */ val touch: touch with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs.UserInteractionMode with scala.Double
  ] = js.native
}

