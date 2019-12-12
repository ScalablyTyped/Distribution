package typings.winrtDashUwp.Windows.UI.Input

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.UI.Input.EdgeGestureKind.keyboard
import typings.winrtDashUwp.Windows.UI.Input.EdgeGestureKind.mouse
import typings.winrtDashUwp.Windows.UI.Input.EdgeGestureKind.touch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EdgeGestureKind extends js.Object

/** Specifies the type of user input that triggered the edge gesture event. */
@JSGlobal("Windows.UI.Input.EdgeGestureKind")
@js.native
object EdgeGestureKind extends js.Object {
  /** The user entered the Win+Z key sequence on the keyboard. */
  @js.native
  sealed trait keyboard extends EdgeGestureKind
  
  /** The user performed a right mouse click. */
  @js.native
  sealed trait mouse extends EdgeGestureKind
  
  /** The user made a swipe gesture on a touch-enabled screen. */
  @js.native
  sealed trait touch extends EdgeGestureKind
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EdgeGestureKind with Double] = js.native
  /* 1 */ @js.native
  object keyboard extends TopLevel[keyboard with Double]
  
  /* 2 */ @js.native
  object mouse extends TopLevel[mouse with Double]
  
  /* 0 */ @js.native
  object touch extends TopLevel[touch with Double]
  
}

