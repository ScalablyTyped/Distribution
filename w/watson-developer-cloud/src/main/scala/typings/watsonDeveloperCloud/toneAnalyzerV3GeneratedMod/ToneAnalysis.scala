package typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** ToneAnalysis. */
trait ToneAnalysis extends StObject {
  
  /** An object of type `DocumentAnalysis` that provides the results of the analysis for the full input document. */
  var document_tone: DocumentAnalysis
  
  /** An array of `SentenceAnalysis` objects that provides the results of the analysis for the individual sentences of the input content. The service returns results only for the first 100 sentences of the input. The field is omitted if the `sentences` parameter of the request is set to `false`. */
  var sentences_tone: js.UndefOr[js.Array[SentenceAnalysis]] = js.undefined
}
object ToneAnalysis {
  
  @scala.inline
  def apply(document_tone: DocumentAnalysis): ToneAnalysis = {
    val __obj = js.Dynamic.literal(document_tone = document_tone.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToneAnalysis]
  }
  
  @scala.inline
  implicit class ToneAnalysisMutableBuilder[Self <: ToneAnalysis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocument_tone(value: DocumentAnalysis): Self = StObject.set(x, "document_tone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSentences_tone(value: js.Array[SentenceAnalysis]): Self = StObject.set(x, "sentences_tone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSentences_toneUndefined: Self = StObject.set(x, "sentences_tone", js.undefined)
    
    @scala.inline
    def setSentences_toneVarargs(value: SentenceAnalysis*): Self = StObject.set(x, "sentences_tone", js.Array(value :_*))
  }
}
