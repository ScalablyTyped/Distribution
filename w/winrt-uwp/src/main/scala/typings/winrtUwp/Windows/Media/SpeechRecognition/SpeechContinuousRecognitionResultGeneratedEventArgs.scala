package typings.winrtUwp.Windows.Media.SpeechRecognition

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains event data for the SpeechContinuousRecognitionSession.ResultGenerated event. */
@js.native
trait SpeechContinuousRecognitionResultGeneratedEventArgs extends StObject {
  
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
  implicit class SpeechContinuousRecognitionResultGeneratedEventArgsMutableBuilder[Self <: SpeechContinuousRecognitionResultGeneratedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResult(value: SpeechRecognitionResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
