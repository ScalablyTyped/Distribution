package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** WordAlternativeResult. */
trait WordAlternativeResult extends StObject {
  
  /** A confidence score for the word alternative hypothesis in the range of 0.0 to 1.0. */
  var confidence: Double
  
  /** An alternative hypothesis for a word from the input audio. */
  var word: String
}
object WordAlternativeResult {
  
  inline def apply(confidence: Double, word: String): WordAlternativeResult = {
    val __obj = js.Dynamic.literal(confidence = confidence.asInstanceOf[js.Any], word = word.asInstanceOf[js.Any])
    __obj.asInstanceOf[WordAlternativeResult]
  }
  
  extension [Self <: WordAlternativeResult](x: Self) {
    
    inline def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    inline def setWord(value: String): Self = StObject.set(x, "word", value.asInstanceOf[js.Any])
  }
}
