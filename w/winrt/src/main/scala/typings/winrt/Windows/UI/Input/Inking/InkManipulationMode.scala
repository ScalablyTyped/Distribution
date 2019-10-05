package typings.winrt.Windows.UI.Input.Inking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait InkManipulationMode extends js.Object

@JSGlobal("Windows.UI.Input.Inking.InkManipulationMode")
@js.native
object InkManipulationMode extends js.Object {
  @js.native
  sealed trait erasing extends InkManipulationMode
  
  @js.native
  sealed trait inking extends InkManipulationMode
  
  @js.native
  sealed trait selecting extends InkManipulationMode
  
  /* 1 */ val erasing: typings.winrt.Windows.UI.Input.Inking.InkManipulationMode.erasing with Double = js.native
  /* 0 */ val inking: typings.winrt.Windows.UI.Input.Inking.InkManipulationMode.inking with Double = js.native
  /* 2 */ val selecting: typings.winrt.Windows.UI.Input.Inking.InkManipulationMode.selecting with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InkManipulationMode with Double] = js.native
}

