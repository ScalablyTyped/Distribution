package typings.winrt.Windows.UI.Input.Inking

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InkManipulationMode extends StObject
@JSGlobal("Windows.UI.Input.Inking.InkManipulationMode")
@js.native
object InkManipulationMode extends StObject {
  
  @js.native
  sealed trait erasing extends InkManipulationMode
  
  @js.native
  sealed trait inking extends InkManipulationMode
  
  @js.native
  sealed trait selecting extends InkManipulationMode
}
