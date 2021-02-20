package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** WordAlternativeResult. */
@js.native
trait WordAlternativeResult extends StObject {
  
  /** A confidence score for the word alternative hypothesis in the range of 0.0 to 1.0. */
  var confidence: Double = js.native
  
  /** An alternative hypothesis for a word from the input audio. */
  var word: String = js.native
}
object WordAlternativeResult {
  
  @scala.inline
  def apply(confidence: Double, word: String): WordAlternativeResult = {
    val __obj = js.Dynamic.literal(confidence = confidence.asInstanceOf[js.Any], word = word.asInstanceOf[js.Any])
    __obj.asInstanceOf[WordAlternativeResult]
  }
  
  @scala.inline
  implicit class WordAlternativeResultMutableBuilder[Self <: WordAlternativeResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWord(value: String): Self = StObject.set(x, "word", value.asInstanceOf[js.Any])
  }
}
