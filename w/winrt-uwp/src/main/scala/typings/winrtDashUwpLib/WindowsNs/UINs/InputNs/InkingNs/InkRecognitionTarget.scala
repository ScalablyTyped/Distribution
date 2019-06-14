package typings
package winrtDashUwpLib.WindowsNs.UINs.InputNs.InkingNs

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
  sealed trait all
    extends winrtDashUwpLib.WindowsNs.UINs.InputNs.InkingNs.InkRecognitionTarget
  
  /** All strokes added after the last recognition pass ( Recognized is false) are passed to the recognizer. */
  @js.native
  sealed trait recent
    extends winrtDashUwpLib.WindowsNs.UINs.InputNs.InkingNs.InkRecognitionTarget
  
  /** Selected ( Selected ) strokes are passed to the recognizer. */
  @js.native
  sealed trait selected
    extends winrtDashUwpLib.WindowsNs.UINs.InputNs.InkingNs.InkRecognitionTarget
  
  /* 0 */ val all: all with scala.Double = js.native
  /* 2 */ val recent: recent with scala.Double = js.native
  /* 1 */ val selected: selected with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.UINs.InputNs.InkingNs.InkRecognitionTarget with scala.Double
  ] = js.native
}

