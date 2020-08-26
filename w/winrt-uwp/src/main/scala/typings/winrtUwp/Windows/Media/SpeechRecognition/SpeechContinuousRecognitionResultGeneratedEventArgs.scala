package typings.winrtUwp.Windows.Media.SpeechRecognition

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains event data for the SpeechContinuousRecognitionSession.ResultGenerated event. */
@js.native
trait SpeechContinuousRecognitionResultGeneratedEventArgs extends js.Object {
  /** Gets the complete recognition result returned by the speech recognizer at the end of a dictation session ( SpeechRecognitionResultStatus is set to Success). */
  var result: SpeechRecognitionResult = js.native
}

object SpeechContinuousRecognitionResultGeneratedEventArgs {
  @scala.inline
  def apply(result: SpeechRecognitionResult): SpeechContinuousRecognitionResultGeneratedEventArgs = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechContinuousRecognitionResultGeneratedEventArgs]
  }
  @scala.inline
  implicit class SpeechContinuousRecognitionResultGeneratedEventArgsOps[Self <: SpeechContinuousRecognitionResultGeneratedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setResult(value: SpeechRecognitionResult): Self = this.set("result", value.asInstanceOf[js.Any])
  }
  
}

