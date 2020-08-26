package typings.watsonDeveloperCloud.toneAnalyzerV3GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** ToneScore. */
@js.native
trait ToneScore extends js.Object {
  /** The score for the tone. * **`2017-09-21`:** The score that is returned lies in the range of 0.5 to 1. A score greater than 0.75 indicates a high likelihood that the tone is perceived in the content. * **`2016-05-19`:** The score that is returned lies in the range of 0 to 1. A score less than 0.5 indicates that the tone is unlikely to be perceived in the content; a score greater than 0.75 indicates a high likelihood that the tone is perceived. */
  var score: Double = js.native
  /** The unique, non-localized identifier of the tone. * **`2017-09-21`:** The service can return results for the following tone IDs: `anger`, `fear`, `joy`, and `sadness` (emotional tones); `analytical`, `confident`, and `tentative` (language tones). The service returns results only for tones whose scores meet a minimum threshold of 0.5. * **`2016-05-19`:** The service can return results for the following tone IDs of the different categories: for the `emotion` category: `anger`, `disgust`, `fear`, `joy`, and `sadness`; for the `language` category: `analytical`, `confident`, and `tentative`; for the `social` category: `openness_big5`, `conscientiousness_big5`, `extraversion_big5`, `agreeableness_big5`, and `emotional_range_big5`. The service returns scores for all tones of a category, regardless of their values. */
  var tone_id: String = js.native
  /** The user-visible, localized name of the tone. */
  var tone_name: String = js.native
}

object ToneScore {
  @scala.inline
  def apply(score: Double, tone_id: String, tone_name: String): ToneScore = {
    val __obj = js.Dynamic.literal(score = score.asInstanceOf[js.Any], tone_id = tone_id.asInstanceOf[js.Any], tone_name = tone_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToneScore]
  }
  @scala.inline
  implicit class ToneScoreOps[Self <: ToneScore] (val x: Self) extends AnyVal {
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
    def setScore(value: Double): Self = this.set("score", value.asInstanceOf[js.Any])
    @scala.inline
    def setTone_id(value: String): Self = this.set("tone_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setTone_name(value: String): Self = this.set("tone_name", value.asInstanceOf[js.Any])
  }
  
}

