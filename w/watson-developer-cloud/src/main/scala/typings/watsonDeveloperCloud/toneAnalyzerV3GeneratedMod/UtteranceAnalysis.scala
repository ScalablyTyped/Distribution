package typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** UtteranceAnalysis. */
trait UtteranceAnalysis extends StObject {
  
  /** **`2017-09-21`:** An error message if the utterance contains more than 500 characters. The service does not analyze the utterance. **`2016-05-19`:** Not returned. */
  var error: js.UndefOr[String] = js.undefined
  
  /** An array of `ToneChatScore` objects that provides results for the most prevalent tones of the utterance. The array includes results for any tone whose score is at least 0.5. The array is empty if no tone has a score that meets this threshold. */
  var tones: js.Array[ToneChatScore]
  
  /** The unique identifier of the utterance. The first utterance has ID 0, and the ID of each subsequent utterance is incremented by one. */
  var utterance_id: Double
  
  /** The text of the utterance. */
  var utterance_text: String
}
object UtteranceAnalysis {
  
  inline def apply(tones: js.Array[ToneChatScore], utterance_id: Double, utterance_text: String): UtteranceAnalysis = {
    val __obj = js.Dynamic.literal(tones = tones.asInstanceOf[js.Any], utterance_id = utterance_id.asInstanceOf[js.Any], utterance_text = utterance_text.asInstanceOf[js.Any])
    __obj.asInstanceOf[UtteranceAnalysis]
  }
  
  extension [Self <: UtteranceAnalysis](x: Self) {
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setTones(value: js.Array[ToneChatScore]): Self = StObject.set(x, "tones", value.asInstanceOf[js.Any])
    
    inline def setTonesVarargs(value: ToneChatScore*): Self = StObject.set(x, "tones", js.Array(value*))
    
    inline def setUtterance_id(value: Double): Self = StObject.set(x, "utterance_id", value.asInstanceOf[js.Any])
    
    inline def setUtterance_text(value: String): Self = StObject.set(x, "utterance_text", value.asInstanceOf[js.Any])
  }
}
