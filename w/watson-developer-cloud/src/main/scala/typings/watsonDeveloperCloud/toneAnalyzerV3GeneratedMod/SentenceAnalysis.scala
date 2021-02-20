package typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** SentenceAnalysis. */
@js.native
trait SentenceAnalysis extends StObject {
  
  /** **`2017-09-21`:** Not returned. **`2016-05-19`:** The offset of the first character of the sentence in the overall input content. */
  var input_from: js.UndefOr[Double] = js.native
  
  /** **`2017-09-21`:** Not returned. **`2016-05-19`:** The offset of the last character of the sentence in the overall input content. */
  var input_to: js.UndefOr[Double] = js.native
  
  /** The unique identifier of a sentence of the input content. The first sentence has ID 0, and the ID of each subsequent sentence is incremented by one. */
  var sentence_id: Double = js.native
  
  /** The text of the input sentence. */
  var text: String = js.native
  
  /** **`2017-09-21`:** Not returned. **`2016-05-19`:** An array of `ToneCategory` objects that provides the results of the tone analysis for the sentence. The service returns results only for the tones specified with the `tones` parameter of the request. */
  var tone_categories: js.UndefOr[js.Array[ToneCategory]] = js.native
  
  /** **`2017-09-21`:** An array of `ToneScore` objects that provides the results of the analysis for each qualifying tone of the sentence. The array includes results for any tone whose score is at least 0.5. The array is empty if no tone has a score that meets this threshold. **`2016-05-19`:** Not returned. */
  var tones: js.UndefOr[js.Array[ToneScore]] = js.native
}
object SentenceAnalysis {
  
  @scala.inline
  def apply(sentence_id: Double, text: String): SentenceAnalysis = {
    val __obj = js.Dynamic.literal(sentence_id = sentence_id.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SentenceAnalysis]
  }
  
  @scala.inline
  implicit class SentenceAnalysisMutableBuilder[Self <: SentenceAnalysis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInput_from(value: Double): Self = StObject.set(x, "input_from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInput_fromUndefined: Self = StObject.set(x, "input_from", js.undefined)
    
    @scala.inline
    def setInput_to(value: Double): Self = StObject.set(x, "input_to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInput_toUndefined: Self = StObject.set(x, "input_to", js.undefined)
    
    @scala.inline
    def setSentence_id(value: Double): Self = StObject.set(x, "sentence_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTone_categories(value: js.Array[ToneCategory]): Self = StObject.set(x, "tone_categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTone_categoriesUndefined: Self = StObject.set(x, "tone_categories", js.undefined)
    
    @scala.inline
    def setTone_categoriesVarargs(value: ToneCategory*): Self = StObject.set(x, "tone_categories", js.Array(value :_*))
    
    @scala.inline
    def setTones(value: js.Array[ToneScore]): Self = StObject.set(x, "tones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTonesUndefined: Self = StObject.set(x, "tones", js.undefined)
    
    @scala.inline
    def setTonesVarargs(value: ToneScore*): Self = StObject.set(x, "tones", js.Array(value :_*))
  }
}
