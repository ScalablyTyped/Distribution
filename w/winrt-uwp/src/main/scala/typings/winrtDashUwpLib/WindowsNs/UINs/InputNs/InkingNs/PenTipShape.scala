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
  
  val circle: circle with java.lang.String = js.native
  val rectangle: rectangle with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.UINs.InputNs.InkingNs.PenTipShape with java.lang.String
  ] = js.native
}

