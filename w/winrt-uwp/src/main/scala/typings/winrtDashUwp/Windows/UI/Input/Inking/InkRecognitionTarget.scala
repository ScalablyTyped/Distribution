package typings.winrtDashUwp.Windows.UI.Input.Inking

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait InkRecognitionTarget extends js.Object

/** Indicates which strokes you want to include in handwriting recognition. */
@JSGlobal("Windows.UI.Input.Inking.InkRecognitionTarget")
@js.native
object InkRecognitionTarget extends js.Object {
  /** All strokes in the stroke collection are passed to the recognizer. */
  @js.native
  sealed trait all extends InkRecognitionTarget
  
  /** All strokes added after the last recognition pass ( Recognized is false) are passed to the recognizer. */
  @js.native
  sealed trait recent extends InkRecognitionTarget
  
  /** Selected ( Selected ) strokes are passed to the recognizer. */
  @js.native
  sealed trait selected extends InkRecognitionTarget
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InkRecognitionTarget with Double] = js.native
  /* 0 */ @js.native
  object all extends TopLevel[all with Double]
  
  /* 2 */ @js.native
  object recent extends TopLevel[recent with Double]
  
  /* 1 */ @js.native
  object selected extends TopLevel[selected with Double]
  
}

