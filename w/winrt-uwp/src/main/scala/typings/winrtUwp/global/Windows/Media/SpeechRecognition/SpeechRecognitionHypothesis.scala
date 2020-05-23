package typings.winrtUwp.global.Windows.Media.SpeechRecognition

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A recognition result fragment returned by the speech recognizer during an ongoing dictation session. */
@JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognitionHypothesis")
@js.native
abstract class SpeechRecognitionHypothesis ()
  extends typings.winrtUwp.Windows.Media.SpeechRecognition.SpeechRecognitionHypothesis {
  /** Gets the text of the hypothesis, or recognition result fragment, returned by the speech recognizer during an ongoing dictation session. */
  /* CompleteClass */
  override var text: String = js.native
}

