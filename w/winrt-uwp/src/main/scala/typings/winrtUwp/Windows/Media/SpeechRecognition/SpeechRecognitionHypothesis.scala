package typings.winrtUwp.Windows.Media.SpeechRecognition

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A recognition result fragment returned by the speech recognizer during an ongoing dictation session. */
trait SpeechRecognitionHypothesis extends js.Object {
  /** Gets the text of the hypothesis, or recognition result fragment, returned by the speech recognizer during an ongoing dictation session. */
  var text: String
}

object SpeechRecognitionHypothesis {
  @scala.inline
  def apply(text: String): SpeechRecognitionHypothesis = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechRecognitionHypothesis]
  }
}

