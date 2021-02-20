package typings.winrtUwp.Windows.UI.Input.Inking

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InkRecognitionTarget extends StObject
/** Indicates which strokes you want to include in handwriting recognition. */
@JSGlobal("Windows.UI.Input.Inking.InkRecognitionTarget")
@js.native
object InkRecognitionTarget extends StObject {
  
  /** All strokes in the stroke collection are passed to the recognizer. */
  @js.native
  sealed trait all extends InkRecognitionTarget
  
  /** All strokes added after the last recognition pass ( Recognized is false) are passed to the recognizer. */
  @js.native
  sealed trait recent extends InkRecognitionTarget
  
  /** Selected ( Selected ) strokes are passed to the recognizer. */
  @js.native
  sealed trait selected extends InkRecognitionTarget
}
