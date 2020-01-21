package typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** SentenceAnalysis. */
trait SentenceAnalysis extends js.Object {
  /** **`2017-09-21`:** Not returned. **`2016-05-19`:** The offset of the first character of the sentence in the overall input content. */
  var input_from: js.UndefOr[Double] = js.undefined
  /** **`2017-09-21`:** Not returned. **`2016-05-19`:** The offset of the last character of the sentence in the overall input content. */
  var input_to: js.UndefOr[Double] = js.undefined
  /** The unique identifier of a sentence of the input content. The first sentence has ID 0, and the ID of each subsequent sentence is incremented by one. */
  var sentence_id: Double
  /** The text of the input sentence. */
  var text: String
  /** **`2017-09-21`:** Not returned. **`2016-05-19`:** An array of `ToneCategory` objects that provides the results of the tone analysis for the sentence. The service returns results only for the tones specified with the `tones` parameter of the request. */
  var tone_categories: js.UndefOr[js.Array[ToneCategory]] = js.undefined
  /** **`2017-09-21`:** An array of `ToneScore` objects that provides the results of the analysis for each qualifying tone of the sentence. The array includes results for any tone whose score is at least 0.5. The array is empty if no tone has a score that meets this threshold. **`2016-05-19`:** Not returned. */
  var tones: js.UndefOr[js.Array[ToneScore]] = js.undefined
}

object SentenceAnalysis {
  @scala.inline
  def apply(
    sentence_id: Double,
    text: String,
    input_from: Int | Double = null,
    input_to: Int | Double = null,
    tone_categories: js.Array[ToneCategory] = null,
    tones: js.Array[ToneScore] = null
  ): SentenceAnalysis = {
    val __obj = js.Dynamic.literal(sentence_id = sentence_id.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    if (input_from != null) __obj.updateDynamic("input_from")(input_from.asInstanceOf[js.Any])
    if (input_to != null) __obj.updateDynamic("input_to")(input_to.asInstanceOf[js.Any])
    if (tone_categories != null) __obj.updateDynamic("tone_categories")(tone_categories.asInstanceOf[js.Any])
    if (tones != null) __obj.updateDynamic("tones")(tones.asInstanceOf[js.Any])
    __obj.asInstanceOf[SentenceAnalysis]
  }
}

