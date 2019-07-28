package typings.winrtDashUwp.WindowsNs.UINs.ViewManagementNs

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
  sealed trait mouse extends UserInteractionMode
  
  /** The device UI is optimized for touch input. */
  @js.native
  sealed trait touch extends UserInteractionMode
  
  /* 0 */ val mouse: typings.winrtDashUwp.WindowsNs.UINs.ViewManagementNs.UserInteractionMode.mouse with Double = js.native
  /* 1 */ val touch: typings.winrtDashUwp.WindowsNs.UINs.ViewManagementNs.UserInteractionMode.touch with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UserInteractionMode with Double] = js.native
}

