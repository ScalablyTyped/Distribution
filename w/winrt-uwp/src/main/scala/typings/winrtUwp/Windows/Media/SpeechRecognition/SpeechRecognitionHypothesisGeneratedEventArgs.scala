package typings.winrtUwp.Windows.Media.SpeechRecognition

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains event data for the SpeechRecognizer.HypothesisGenerated event. */
trait SpeechRecognitionHypothesisGeneratedEventArgs extends js.Object {
  /** Gets a recognition result fragment returned by the speech recognizer during an ongoing dictation session. */
  var hypothesis: SpeechRecognitionHypothesis
}

object SpeechRecognitionHypothesisGeneratedEventArgs {
  @scala.inline
  def apply(hypothesis: SpeechRecognitionHypothesis): SpeechRecognitionHypothesisGeneratedEventArgs = {
    val __obj = js.Dynamic.literal(hypothesis = hypothesis.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechRecognitionHypothesisGeneratedEventArgs]
  }
}

