package typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** ToneAnalysis. */
trait ToneAnalysis extends js.Object {
  /** An object of type `DocumentAnalysis` that provides the results of the analysis for the full input document. */
  var document_tone: DocumentAnalysis
  /** An array of `SentenceAnalysis` objects that provides the results of the analysis for the individual sentences of the input content. The service returns results only for the first 100 sentences of the input. The field is omitted if the `sentences` parameter of the request is set to `false`. */
  var sentences_tone: js.UndefOr[js.Array[SentenceAnalysis]] = js.undefined
}

object ToneAnalysis {
  @scala.inline
  def apply(document_tone: DocumentAnalysis, sentences_tone: js.Array[SentenceAnalysis] = null): ToneAnalysis = {
    val __obj = js.Dynamic.literal(document_tone = document_tone.asInstanceOf[js.Any])
    if (sentences_tone != null) __obj.updateDynamic("sentences_tone")(sentences_tone.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToneAnalysis]
  }
}

