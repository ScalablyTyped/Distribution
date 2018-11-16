package typings
package winrtDashUwpLib.WindowsNs.MediaNs.SpeechRecognitionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A recognition result fragment returned by the speech recognizer during an ongoing dictation session. */
@JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognitionHypothesis")
@js.native
abstract class SpeechRecognitionHypothesis () extends js.Object {
  /** Gets the text of the hypothesis, or recognition result fragment, returned by the speech recognizer during an ongoing dictation session. */
  var text: java.lang.String = js.native
}

