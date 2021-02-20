package typings.winrtUwp.Windows.Media.SpeechRecognition

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains event data for the SpeechRecognizer.HypothesisGenerated event. */
@js.native
trait SpeechRecognitionHypothesisGeneratedEventArgs extends StObject {
  
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
  implicit class SpeechRecognitionHypothesisGeneratedEventArgsMutableBuilder[Self <: SpeechRecognitionHypothesisGeneratedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHypothesis(value: SpeechRecognitionHypothesis): Self = StObject.set(x, "hypothesis", value.asInstanceOf[js.Any])
  }
}
