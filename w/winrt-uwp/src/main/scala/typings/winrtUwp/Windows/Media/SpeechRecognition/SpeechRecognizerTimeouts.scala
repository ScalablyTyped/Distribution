package typings.winrtUwp.Windows.Media.SpeechRecognition

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The timespan that a speech recognizer ignores silence or unrecognizable sounds (babble) and continues listening for speech input. */
trait SpeechRecognizerTimeouts extends js.Object {
  /** Gets and sets the length of time that a SpeechRecognizer continues to listen while receiving unrecognizable sounds (babble) before it assumes speech input has ended and finalizes the recognition operation. */
  var babbleTimeout: Double
  /** Gets and sets the length of time, after recognition results have been generated, that a SpeechRecognizer detects silence and assumes speech input has ended. */
  var endSilenceTimeout: Double
  /** Gets and sets the length of time, before any recognition results have been generated, that a SpeechRecognizer detects silence and assumes speech input has ended. */
  var initialSilenceTimeout: Double
}

object SpeechRecognizerTimeouts {
  @scala.inline
  def apply(babbleTimeout: Double, endSilenceTimeout: Double, initialSilenceTimeout: Double): SpeechRecognizerTimeouts = {
    val __obj = js.Dynamic.literal(babbleTimeout = babbleTimeout.asInstanceOf[js.Any], endSilenceTimeout = endSilenceTimeout.asInstanceOf[js.Any], initialSilenceTimeout = initialSilenceTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechRecognizerTimeouts]
  }
}

