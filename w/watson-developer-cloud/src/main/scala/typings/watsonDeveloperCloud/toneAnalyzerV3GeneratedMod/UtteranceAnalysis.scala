package typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** UtteranceAnalysis. */
@js.native
trait UtteranceAnalysis extends js.Object {
  /** **`2017-09-21`:** An error message if the utterance contains more than 500 characters. The service does not analyze the utterance. **`2016-05-19`:** Not returned. */
  var error: js.UndefOr[String] = js.native
  /** An array of `ToneChatScore` objects that provides results for the most prevalent tones of the utterance. The array includes results for any tone whose score is at least 0.5. The array is empty if no tone has a score that meets this threshold. */
  var tones: js.Array[ToneChatScore] = js.native
  /** The unique identifier of the utterance. The first utterance has ID 0, and the ID of each subsequent utterance is incremented by one. */
  var utterance_id: Double = js.native
  /** The text of the utterance. */
  var utterance_text: String = js.native
}

object UtteranceAnalysis {
  @scala.inline
  def apply(tones: js.Array[ToneChatScore], utterance_id: Double, utterance_text: String): UtteranceAnalysis = {
    val __obj = js.Dynamic.literal(tones = tones.asInstanceOf[js.Any], utterance_id = utterance_id.asInstanceOf[js.Any], utterance_text = utterance_text.asInstanceOf[js.Any])
    __obj.asInstanceOf[UtteranceAnalysis]
  }
  @scala.inline
  implicit class UtteranceAnalysisOps[Self <: UtteranceAnalysis] (val x: Self) extends AnyVal {
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
    def setTonesVarargs(value: ToneChatScore*): Self = this.set("tones", js.Array(value :_*))
    @scala.inline
    def setTones(value: js.Array[ToneChatScore]): Self = this.set("tones", value.asInstanceOf[js.Any])
    @scala.inline
    def setUtterance_id(value: Double): Self = this.set("utterance_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setUtterance_text(value: String): Self = this.set("utterance_text", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
  }
  
}

