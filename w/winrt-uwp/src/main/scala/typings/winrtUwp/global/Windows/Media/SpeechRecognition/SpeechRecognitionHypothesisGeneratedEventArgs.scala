package typings.winrtUwp.global.Windows.Media.SpeechRecognition

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains event data for the SpeechRecognizer.HypothesisGenerated event. */
@JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognitionHypothesisGeneratedEventArgs")
@js.native
abstract class SpeechRecognitionHypothesisGeneratedEventArgs ()
  extends typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionHypothesisGeneratedEventArgs {
  /** Gets a recognition result fragment returned by the speech recognizer during an ongoing dictation session. */
  /* CompleteClass */
  override var hypothesis: typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionHypothesis = js.native
}

