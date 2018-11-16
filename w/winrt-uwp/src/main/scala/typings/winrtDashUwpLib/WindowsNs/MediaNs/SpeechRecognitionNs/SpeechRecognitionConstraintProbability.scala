package typings
package winrtDashUwpLib.WindowsNs.MediaNs.SpeechRecognitionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SpeechRecognitionConstraintProbability extends js.Object

/** Specifies the weighted value of a constraint for speech recognition. */
@JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognitionConstraintProbability")
@js.native
object SpeechRecognitionConstraintProbability extends js.Object {
  /** The constraint has a low weighted value. */
  @js.native
  sealed trait default
    extends winrtDashUwpLib.WindowsNs.MediaNs.SpeechRecognitionNs.SpeechRecognitionConstraintProbability
  
  /** The constraint has a high weighted value. */
  @js.native
  sealed trait max
    extends winrtDashUwpLib.WindowsNs.MediaNs.SpeechRecognitionNs.SpeechRecognitionConstraintProbability
  
  /** The constraint has a medium weighted value. */
  @js.native
  sealed trait min
    extends winrtDashUwpLib.WindowsNs.MediaNs.SpeechRecognitionNs.SpeechRecognitionConstraintProbability
  
  val default: default with java.lang.String = js.native
  val max: max with java.lang.String = js.native
  val min: min with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.SpeechRecognitionNs.SpeechRecognitionConstraintProbability with java.lang.String
  ] = js.native
}

