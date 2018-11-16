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
  
  val keyboard: keyboard with java.lang.String = js.native
  val mouse: mouse with java.lang.String = js.native
  val touch: touch with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.UINs.InputNs.EdgeGestureKind with java.lang.String] = js.native
}

