package typings.winrtUwp.Windows.Media.SpeechRecognition

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains event data for the SpeechRecognizer.HypothesisGenerated event. */
@JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognitionHypothesisGeneratedEventArgs")
@js.native
abstract class SpeechRecognitionHypothesisGeneratedEventArgs () extends js.Object {
  /** Gets a recognition result fragment returned by the speech recognizer during an ongoing dictation session. */
  var hypothesis: SpeechRecognitionHypothesis = js.native
}

