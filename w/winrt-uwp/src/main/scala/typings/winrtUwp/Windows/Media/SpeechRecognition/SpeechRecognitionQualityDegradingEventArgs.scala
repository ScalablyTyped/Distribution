package typings.winrtUwp.Windows.Media.SpeechRecognition

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the SpeechRecognitionQualityDegradingEvent event. */
trait SpeechRecognitionQualityDegradingEventArgs extends js.Object {
  /** Gets the audio problem that occurred. */
  var problem: SpeechRecognitionAudioProblem
}

object SpeechRecognitionQualityDegradingEventArgs {
  @scala.inline
  def apply(problem: SpeechRecognitionAudioProblem): SpeechRecognitionQualityDegradingEventArgs = {
    val __obj = js.Dynamic.literal(problem = problem.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechRecognitionQualityDegradingEventArgs]
  }
}

