package typings.winrt.Windows.UI.Input.Inking

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.UI.Input.Inking.InkManipulationMode.erasing
import typings.winrt.Windows.UI.Input.Inking.InkManipulationMode.inking
import typings.winrt.Windows.UI.Input.Inking.InkManipulationMode.selecting
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InkManipulationMode with Double] = js.native
  /* 1 */ @js.native
  object erasing extends TopLevel[erasing with Double]
  
  /* 0 */ @js.native
  object inking extends TopLevel[inking with Double]
  
  /* 2 */ @js.native
  object selecting extends TopLevel[selecting with Double]
  
}

