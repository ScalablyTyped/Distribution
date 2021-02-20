package typings.winrtUwp.Windows.Media.SpeechRecognition

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A recognition result fragment returned by the speech recognizer during an ongoing dictation session. */
@js.native
trait SpeechRecognitionHypothesis extends StObject {
  
  /** Gets the text of the hypothesis, or recognition result fragment, returned by the speech recognizer during an ongoing dictation session. */
  var text: String = js.native
}
object SpeechRecognitionHypothesis {
  
  @scala.inline
  def apply(text: String): SpeechRecognitionHypothesis = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechRecognitionHypothesis]
  }
  
  @scala.inline
  implicit class SpeechRecognitionHypothesisMutableBuilder[Self <: SpeechRecognitionHypothesis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
