package typings.winrt.WindowsNs.UINs.InputNs.InkingNs

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
  
  /* 1 */ val erasing: typings.winrt.WindowsNs.UINs.InputNs.InkingNs.InkManipulationMode.erasing with Double = js.native
  /* 0 */ val inking: typings.winrt.WindowsNs.UINs.InputNs.InkingNs.InkManipulationMode.inking with Double = js.native
  /* 2 */ val selecting: typings.winrt.WindowsNs.UINs.InputNs.InkingNs.InkManipulationMode.selecting with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InkManipulationMode with Double] = js.native
}

