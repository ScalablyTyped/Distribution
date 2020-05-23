package typings.winrtUwp.Windows.Media.SpeechRecognition

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains event data for the SpeechContinuousRecognitionSession.Completed event. */
trait SpeechContinuousRecognitionCompletedEventArgs extends js.Object {
  /** Gets the result of a speech recognition session, or the result of a grammar constraint compilation. */
  var status: SpeechRecognitionResultStatus
}

object SpeechContinuousRecognitionCompletedEventArgs {
  @scala.inline
  def apply(status: SpeechRecognitionResultStatus): SpeechContinuousRecognitionCompletedEventArgs = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechContinuousRecognitionCompletedEventArgs]
  }
}

