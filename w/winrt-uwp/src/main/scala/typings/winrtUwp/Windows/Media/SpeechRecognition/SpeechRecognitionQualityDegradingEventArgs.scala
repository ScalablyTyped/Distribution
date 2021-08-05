package typings.winrtUwp.Windows.Media.SpeechRecognition

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the SpeechRecognitionQualityDegradingEvent event. */
trait SpeechRecognitionQualityDegradingEventArgs extends StObject {
  
  /** Gets the audio problem that occurred. */
  var problem: SpeechRecognitionAudioProblem
}
object SpeechRecognitionQualityDegradingEventArgs {
  
  inline def apply(problem: SpeechRecognitionAudioProblem): SpeechRecognitionQualityDegradingEventArgs = {
    val __obj = js.Dynamic.literal(problem = problem.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechRecognitionQualityDegradingEventArgs]
  }
  
  extension [Self <: SpeechRecognitionQualityDegradingEventArgs](x: Self) {
    
    inline def setProblem(value: SpeechRecognitionAudioProblem): Self = StObject.set(x, "problem", value.asInstanceOf[js.Any])
  }
}
