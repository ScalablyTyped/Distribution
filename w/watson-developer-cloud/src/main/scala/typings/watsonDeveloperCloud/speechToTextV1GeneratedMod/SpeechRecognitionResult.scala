package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** SpeechRecognitionResult. */
trait SpeechRecognitionResult extends StObject {
  
  /** An array of alternative transcripts. The `alternatives` array can include additional requested output such as word confidence or timestamps. */
  var alternatives: js.Array[SpeechRecognitionAlternative]
  
  /** An indication of whether the transcription results are final. If `true`, the results for this utterance are not updated further; no additional results are sent for a `result_index` once its results are indicated as final. */
  var final_results: Boolean
  
  /** A dictionary (or associative array) whose keys are the strings specified for `keywords` if both that parameter and `keywords_threshold` are specified. The value for each key is an array of matches spotted in the audio for that keyword. Each match is described by a `KeywordResult` object. A keyword for which no matches are found is omitted from the dictionary. The dictionary is omitted entirely if no matches are found for any keywords. */
  var keywords_result: js.UndefOr[js.Object] = js.undefined
  
  /** An array of alternative hypotheses found for words of the input audio if a `word_alternatives_threshold` is specified. */
  var word_alternatives: js.UndefOr[js.Array[WordAlternativeResults]] = js.undefined
}
object SpeechRecognitionResult {
  
  inline def apply(alternatives: js.Array[SpeechRecognitionAlternative], final_results: Boolean): SpeechRecognitionResult = {
    val __obj = js.Dynamic.literal(alternatives = alternatives.asInstanceOf[js.Any], final_results = final_results.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechRecognitionResult]
  }
  
  extension [Self <: SpeechRecognitionResult](x: Self) {
    
    inline def setAlternatives(value: js.Array[SpeechRecognitionAlternative]): Self = StObject.set(x, "alternatives", value.asInstanceOf[js.Any])
    
    inline def setAlternativesVarargs(value: SpeechRecognitionAlternative*): Self = StObject.set(x, "alternatives", js.Array(value :_*))
    
    inline def setFinal_results(value: Boolean): Self = StObject.set(x, "final_results", value.asInstanceOf[js.Any])
    
    inline def setKeywords_result(value: js.Object): Self = StObject.set(x, "keywords_result", value.asInstanceOf[js.Any])
    
    inline def setKeywords_resultUndefined: Self = StObject.set(x, "keywords_result", js.undefined)
    
    inline def setWord_alternatives(value: js.Array[WordAlternativeResults]): Self = StObject.set(x, "word_alternatives", value.asInstanceOf[js.Any])
    
    inline def setWord_alternativesUndefined: Self = StObject.set(x, "word_alternatives", js.undefined)
    
    inline def setWord_alternativesVarargs(value: WordAlternativeResults*): Self = StObject.set(x, "word_alternatives", js.Array(value :_*))
  }
}
