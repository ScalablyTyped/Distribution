package typings
package winrtLib.WindowsNs.UINs.InputNs.InkingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PenTipShape extends js.Object

@JSGlobal("Windows.UI.Input.Inking.PenTipShape")
@js.native
object PenTipShape extends js.Object {
  @js.native
  sealed trait circle
    extends winrtLib.WindowsNs.UINs.InputNs.InkingNs.PenTipShape
  
  @js.native
  sealed trait rectangle
    extends winrtLib.WindowsNs.UINs.InputNs.InkingNs.PenTipShape
  
  /* 0 */ val circle: circle with scala.Double = js.native
  /* 1 */ val rectangle: rectangle with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.UINs.InputNs.InkingNs.PenTipShape with scala.Double] = js.native
}

