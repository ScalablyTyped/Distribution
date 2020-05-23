package typings.winrtUwp.Windows.UI.Input.Inking

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
  
}

