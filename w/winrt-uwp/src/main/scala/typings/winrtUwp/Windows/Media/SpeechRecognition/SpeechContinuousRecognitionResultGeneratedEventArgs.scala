package typings.winrtUwp.Windows.Media.SpeechRecognition

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains event data for the SpeechContinuousRecognitionSession.ResultGenerated event. */
trait SpeechContinuousRecognitionResultGeneratedEventArgs extends js.Object {
  /** Gets the complete recognition result returned by the speech recognizer at the end of a dictation session ( SpeechRecognitionResultStatus is set to Success). */
  var result: SpeechRecognitionResult
}

object SpeechContinuousRecognitionResultGeneratedEventArgs {
  @scala.inline
  def apply(result: SpeechRecognitionResult): SpeechContinuousRecognitionResultGeneratedEventArgs = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechContinuousRecognitionResultGeneratedEventArgs]
  }
}

