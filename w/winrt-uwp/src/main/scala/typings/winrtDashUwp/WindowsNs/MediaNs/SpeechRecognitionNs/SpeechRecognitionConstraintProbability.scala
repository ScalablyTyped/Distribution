package typings.winrtDashUwp.WindowsNs.MediaNs.SpeechRecognitionNs

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
  sealed trait default extends SpeechRecognitionConstraintProbability
  
  /** The constraint has a high weighted value. */
  @js.native
  sealed trait max extends SpeechRecognitionConstraintProbability
  
  /** The constraint has a medium weighted value. */
  @js.native
  sealed trait min extends SpeechRecognitionConstraintProbability
  
  /* 0 */ val default: typings.winrtDashUwp.WindowsNs.MediaNs.SpeechRecognitionNs.SpeechRecognitionConstraintProbability.default with Double = js.native
  /* 2 */ val max: typings.winrtDashUwp.WindowsNs.MediaNs.SpeechRecognitionNs.SpeechRecognitionConstraintProbability.max with Double = js.native
  /* 1 */ val min: typings.winrtDashUwp.WindowsNs.MediaNs.SpeechRecognitionNs.SpeechRecognitionConstraintProbability.min with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SpeechRecognitionConstraintProbability with Double] = js.native
}

