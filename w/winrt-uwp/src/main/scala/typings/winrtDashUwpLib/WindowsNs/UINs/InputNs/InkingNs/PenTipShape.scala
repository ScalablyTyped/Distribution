package typings
package winrtDashUwpLib.WindowsNs.UINs.InputNs.InkingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PenTipShape extends js.Object

/** Identifies the shape of the PenTip . */
@JSGlobal("Windows.UI.Input.Inking.PenTipShape")
@js.native
object PenTipShape extends js.Object {
  /** Circular or elliptical pen tip. Use Size to specify the dimensions. */
  @js.native
  sealed trait circle
    extends winrtDashUwpLib.WindowsNs.UINs.InputNs.InkingNs.PenTipShape
  
  /** Square or rectangular pen tip. Use Size to specify the dimensions. */
  @js.native
  sealed trait rectangle
    extends winrtDashUwpLib.WindowsNs.UINs.InputNs.InkingNs.PenTipShape
  
  /* 0 */ val circle: circle with scala.Double = js.native
  /* 1 */ val rectangle: rectangle with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.UINs.InputNs.InkingNs.PenTipShape with scala.Double] = js.native
}

