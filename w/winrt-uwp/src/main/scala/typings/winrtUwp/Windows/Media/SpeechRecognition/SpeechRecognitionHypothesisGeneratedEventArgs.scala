package typings.winrtUwp.Windows.Media.SpeechRecognition

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains event data for the SpeechRecognizer.HypothesisGenerated event. */
@js.native
trait SpeechRecognitionHypothesisGeneratedEventArgs extends js.Object {
  
  /** Gets a recognition result fragment returned by the speech recognizer during an ongoing dictation session. */
  var hypothesis: SpeechRecognitionHypothesis = js.native
}
object SpeechRecognitionHypothesisGeneratedEventArgs {
  
  @scala.inline
  def apply(hypothesis: SpeechRecognitionHypothesis): SpeechRecognitionHypothesisGeneratedEventArgs = {
    val __obj = js.Dynamic.literal(hypothesis = hypothesis.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechRecognitionHypothesisGeneratedEventArgs]
  }
  
  @scala.inline
  implicit class SpeechRecognitionHypothesisGeneratedEventArgsOps[Self <: SpeechRecognitionHypothesisGeneratedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setHypothesis(value: SpeechRecognitionHypothesis): Self = this.set("hypothesis", value.asInstanceOf[js.Any])
  }
}
