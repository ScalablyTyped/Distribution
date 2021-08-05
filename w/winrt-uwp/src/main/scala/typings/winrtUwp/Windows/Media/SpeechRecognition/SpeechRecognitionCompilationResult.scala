package typings.winrtUwp.Windows.Media.SpeechRecognition

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The result of compiling the constraints set for a SpeechRecognizer object. */
trait SpeechRecognitionCompilationResult extends StObject {
  
  /** Gets the result state ( SpeechRecognitionResultStatus ) from the compiling of grammar constraints. */
  var status: SpeechRecognitionResultStatus
}
object SpeechRecognitionCompilationResult {
  
  inline def apply(status: SpeechRecognitionResultStatus): SpeechRecognitionCompilationResult = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechRecognitionCompilationResult]
  }
  
  extension [Self <: SpeechRecognitionCompilationResult](x: Self) {
    
    inline def setStatus(value: SpeechRecognitionResultStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
