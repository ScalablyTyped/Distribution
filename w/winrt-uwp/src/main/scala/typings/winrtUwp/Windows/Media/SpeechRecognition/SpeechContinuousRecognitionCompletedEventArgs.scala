package typings.winrtUwp.Windows.Media.SpeechRecognition

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains event data for the SpeechContinuousRecognitionSession.Completed event. */
trait SpeechContinuousRecognitionCompletedEventArgs extends StObject {
  
  /** Gets the result of a speech recognition session, or the result of a grammar constraint compilation. */
  var status: SpeechRecognitionResultStatus
}
object SpeechContinuousRecognitionCompletedEventArgs {
  
  inline def apply(status: SpeechRecognitionResultStatus): SpeechContinuousRecognitionCompletedEventArgs = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechContinuousRecognitionCompletedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpeechContinuousRecognitionCompletedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setStatus(value: SpeechRecognitionResultStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
