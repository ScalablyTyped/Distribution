package typings.winrt.Windows.UI.Input

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.UI.Input.EdgeGestureKind.keyboard
import typings.winrt.Windows.UI.Input.EdgeGestureKind.mouse
import typings.winrt.Windows.UI.Input.EdgeGestureKind.touch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EdgeGestureKind extends js.Object

@JSGlobal("Windows.UI.Input.EdgeGestureKind")
@js.native
object EdgeGestureKind extends js.Object {
  @js.native
  sealed trait keyboard extends EdgeGestureKind
  
  @js.native
  sealed trait mouse extends EdgeGestureKind
  
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

