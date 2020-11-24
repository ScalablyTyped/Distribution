package typings.winrt.Windows.UI.Input.Inking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
