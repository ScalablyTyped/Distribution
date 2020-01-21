package typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** UtteranceAnalysis. */
trait UtteranceAnalysis extends js.Object {
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
  @scala.inline
  def apply(tones: js.Array[ToneChatScore], utterance_id: Double, utterance_text: String, error: String = null): UtteranceAnalysis = {
    val __obj = js.Dynamic.literal(tones = tones.asInstanceOf[js.Any], utterance_id = utterance_id.asInstanceOf[js.Any], utterance_text = utterance_text.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[UtteranceAnalysis]
  }
}

