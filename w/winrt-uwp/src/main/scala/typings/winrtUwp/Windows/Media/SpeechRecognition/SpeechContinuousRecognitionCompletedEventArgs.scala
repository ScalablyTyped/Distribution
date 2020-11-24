package typings.winrtUwp.Windows.Media.SpeechRecognition

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains event data for the SpeechContinuousRecognitionSession.Completed event. */
@js.native
trait SpeechContinuousRecognitionCompletedEventArgs extends js.Object {
  
  /** Gets the result of a speech recognition session, or the result of a grammar constraint compilation. */
  var status: SpeechRecognitionResultStatus = js.native
}
object SpeechContinuousRecognitionCompletedEventArgs {
  
  @scala.inline
  def apply(status: SpeechRecognitionResultStatus): SpeechContinuousRecognitionCompletedEventArgs = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechContinuousRecognitionCompletedEventArgs]
  }
  
  @scala.inline
  implicit class SpeechContinuousRecognitionCompletedEventArgsOps[Self <: SpeechContinuousRecognitionCompletedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setStatus(value: SpeechRecognitionResultStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
