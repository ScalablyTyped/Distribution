package typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*************************
  * model interfaces
  ************************/
/** An object of type `DocumentAnalysis` that provides the results of the analysis for the full input document. */
@js.native
trait DocumentAnalysis extends StObject {
  
  /** **`2017-09-21`:** Not returned. **`2016-05-19`:** An array of `ToneCategory` objects that provides the results of the tone analysis for the full document of the input content. The service returns results only for the tones specified with the `tones` parameter of the request. */
  var tone_categories: js.UndefOr[js.Array[ToneCategory]] = js.native
  
  /** **`2017-09-21`:** An array of `ToneScore` objects that provides the results of the analysis for each qualifying tone of the document. The array includes results for any tone whose score is at least 0.5. The array is empty if no tone has a score that meets this threshold. **`2016-05-19`:** Not returned. */
  var tones: js.UndefOr[js.Array[ToneScore]] = js.native
  
  /** **`2017-09-21`:** A warning message if the overall content exceeds 128 KB or contains more than 1000 sentences. The service analyzes only the first 1000 sentences for document-level analysis and the first 100 sentences for sentence-level analysis. **`2016-05-19`:** Not returned. */
  var warning: js.UndefOr[String] = js.native
}
object DocumentAnalysis {
  
  @scala.inline
  def apply(): DocumentAnalysis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentAnalysis]
  }
  
  @scala.inline
  implicit class DocumentAnalysisMutableBuilder[Self <: DocumentAnalysis] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setWarning(value: String): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
