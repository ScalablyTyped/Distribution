package typings
package winrtLib.WindowsNs.UINs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EdgeGestureKind extends js.Object

@JSGlobal("Windows.UI.Input.EdgeGestureKind")
@js.native
object EdgeGestureKind extends js.Object {
  @js.native
  sealed trait keyboard
    extends winrtLib.WindowsNs.UINs.InputNs.EdgeGestureKind
  
  @js.native
  sealed trait mouse
    extends winrtLib.WindowsNs.UINs.InputNs.EdgeGestureKind
  
  @js.native
  sealed trait touch
    extends winrtLib.WindowsNs.UINs.InputNs.EdgeGestureKind
  
  /* 1 */ val keyboard: keyboard with scala.Double = js.native
  /* 2 */ val mouse: mouse with scala.Double = js.native
  /* 0 */ val touch: touch with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.UINs.InputNs.EdgeGestureKind with scala.Double] = js.native
}

