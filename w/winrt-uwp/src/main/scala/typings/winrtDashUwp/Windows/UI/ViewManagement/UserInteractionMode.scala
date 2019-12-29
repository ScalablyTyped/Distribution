package typings.winrtDashUwp.Windows.UI.ViewManagement

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UserInteractionMode with Double] = js.native
  /* 0 */ @js.native
  object mouse extends TopLevel[mouse with Double]
  
  /* 1 */ @js.native
  object touch extends TopLevel[touch with Double]
  
}

