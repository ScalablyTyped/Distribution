package typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** UtteranceAnalyses. */
@js.native
trait UtteranceAnalyses extends js.Object {
  /** An array of `UtteranceAnalysis` objects that provides the results for each utterance of the input. */
  var utterances_tone: js.Array[UtteranceAnalysis] = js.native
  /** **`2017-09-21`:** A warning message if the content contains more than 50 utterances. The service analyzes only the first 50 utterances. **`2016-05-19`:** Not returned. */
  var warning: js.UndefOr[String] = js.native
}

object UtteranceAnalyses {
  @scala.inline
  def apply(utterances_tone: js.Array[UtteranceAnalysis]): UtteranceAnalyses = {
    val __obj = js.Dynamic.literal(utterances_tone = utterances_tone.asInstanceOf[js.Any])
    __obj.asInstanceOf[UtteranceAnalyses]
  }
  @scala.inline
  implicit class UtteranceAnalysesOps[Self <: UtteranceAnalyses] (val x: Self) extends AnyVal {
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
    def setUtterances_toneVarargs(value: UtteranceAnalysis*): Self = this.set("utterances_tone", js.Array(value :_*))
    @scala.inline
    def setUtterances_tone(value: js.Array[UtteranceAnalysis]): Self = this.set("utterances_tone", value.asInstanceOf[js.Any])
    @scala.inline
    def setWarning(value: String): Self = this.set("warning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarning: Self = this.set("warning", js.undefined)
  }
  
}

