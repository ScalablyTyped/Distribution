package typings.winrtDashUwp.Windows.Media.SpeechRecognition

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Media.SpeechRecognition.SpeechRecognitionConstraintProbability.default
import typings.winrtDashUwp.Windows.Media.SpeechRecognition.SpeechRecognitionConstraintProbability.max
import typings.winrtDashUwp.Windows.Media.SpeechRecognition.SpeechRecognitionConstraintProbability.min
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SpeechRecognitionConstraintProbability with Double] = js.native
  /* 0 */ @js.native
  object default extends TopLevel[default with Double]
  
  /* 2 */ @js.native
  object max extends TopLevel[max with Double]
  
  /* 1 */ @js.native
  object min extends TopLevel[min with Double]
  
}

