package typings.winrtDashUwp.Windows.Media.SpeechRecognition

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The timespan that a speech recognizer ignores silence or unrecognizable sounds (babble) and continues listening for speech input. */
@JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognizerTimeouts")
@js.native
abstract class SpeechRecognizerTimeouts () extends js.Object {
  /** Gets and sets the length of time that a SpeechRecognizer continues to listen while receiving unrecognizable sounds (babble) before it assumes speech input has ended and finalizes the recognition operation. */
  var babbleTimeout: Double = js.native
  /** Gets and sets the length of time, after recognition results have been generated, that a SpeechRecognizer detects silence and assumes speech input has ended. */
  var endSilenceTimeout: Double = js.native
  /** Gets and sets the length of time, before any recognition results have been generated, that a SpeechRecognizer detects silence and assumes speech input has ended. */
  var initialSilenceTimeout: Double = js.native
}

