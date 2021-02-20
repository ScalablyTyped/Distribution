package typings.winrt.Windows.UI.Input.Inking

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InkRecognitionTarget extends StObject
@JSGlobal("Windows.UI.Input.Inking.InkRecognitionTarget")
@js.native
object InkRecognitionTarget extends StObject {
  
  @js.native
  sealed trait all extends InkRecognitionTarget
  
  @js.native
  sealed trait recent extends InkRecognitionTarget
  
  @js.native
  sealed trait selected extends InkRecognitionTarget
}
