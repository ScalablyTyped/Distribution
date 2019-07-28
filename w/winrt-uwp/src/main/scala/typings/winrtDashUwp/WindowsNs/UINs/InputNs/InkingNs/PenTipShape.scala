package typings.winrtDashUwp.WindowsNs.UINs.InputNs.InkingNs

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
  sealed trait circle extends PenTipShape
  
  /** Square or rectangular pen tip. Use Size to specify the dimensions. */
  @js.native
  sealed trait rectangle extends PenTipShape
  
  /* 0 */ val circle: typings.winrtDashUwp.WindowsNs.UINs.InputNs.InkingNs.PenTipShape.circle with Double = js.native
  /* 1 */ val rectangle: typings.winrtDashUwp.WindowsNs.UINs.InputNs.InkingNs.PenTipShape.rectangle with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PenTipShape with Double] = js.native
}

