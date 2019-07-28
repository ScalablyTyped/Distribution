package typings.winrt.WindowsNs.UINs.InputNs

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
  
  /* 1 */ val keyboard: typings.winrt.WindowsNs.UINs.InputNs.EdgeGestureKind.keyboard with Double = js.native
  /* 2 */ val mouse: typings.winrt.WindowsNs.UINs.InputNs.EdgeGestureKind.mouse with Double = js.native
  /* 0 */ val touch: typings.winrt.WindowsNs.UINs.InputNs.EdgeGestureKind.touch with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EdgeGestureKind with Double] = js.native
}

