package typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** ToneAnalysis. */
@js.native
trait ToneAnalysis extends js.Object {
  /** An object of type `DocumentAnalysis` that provides the results of the analysis for the full input document. */
  var document_tone: DocumentAnalysis = js.native
  /** An array of `SentenceAnalysis` objects that provides the results of the analysis for the individual sentences of the input content. The service returns results only for the first 100 sentences of the input. The field is omitted if the `sentences` parameter of the request is set to `false`. */
  var sentences_tone: js.UndefOr[js.Array[SentenceAnalysis]] = js.native
}

object ToneAnalysis {
  @scala.inline
  def apply(document_tone: DocumentAnalysis): ToneAnalysis = {
    val __obj = js.Dynamic.literal(document_tone = document_tone.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToneAnalysis]
  }
  @scala.inline
  implicit class ToneAnalysisOps[Self <: ToneAnalysis] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDocument_tone(value: DocumentAnalysis): Self = this.set("document_tone", value.asInstanceOf[js.Any])
    @scala.inline
    def setSentences_toneVarargs(value: SentenceAnalysis*): Self = this.set("sentences_tone", js.Array(value :_*))
    @scala.inline
    def setSentences_tone(value: js.Array[SentenceAnalysis]): Self = this.set("sentences_tone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSentences_tone: Self = this.set("sentences_tone", js.undefined)
  }
  
}

