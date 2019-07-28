package typings.winrtDashUwp.WindowsNs.UINs.InputNs.InkingNs

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
  
  /* 0 */ val all: typings.winrtDashUwp.WindowsNs.UINs.InputNs.InkingNs.InkRecognitionTarget.all with Double = js.native
  /* 2 */ val recent: typings.winrtDashUwp.WindowsNs.UINs.InputNs.InkingNs.InkRecognitionTarget.recent with Double = js.native
  /* 1 */ val selected: typings.winrtDashUwp.WindowsNs.UINs.InputNs.InkingNs.InkRecognitionTarget.selected with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InkRecognitionTarget with Double] = js.native
}

