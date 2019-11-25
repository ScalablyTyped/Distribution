package typings.watsonDashDeveloperDashCloud.toneDashAnalyzerV3DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** ToneChatScore. */
trait ToneChatScore extends js.Object {
  /** The score for the tone in the range of 0.5 to 1. A score greater than 0.75 indicates a high likelihood that the tone is perceived in the utterance. */
  var score: Double
  /** The unique, non-localized identifier of the tone for the results. The service returns results only for tones whose scores meet a minimum threshold of 0.5. */
  var tone_id: String
  /** The user-visible, localized name of the tone. */
  var tone_name: String
}

object ToneChatScore {
  @scala.inline
  def apply(score: Double, tone_id: String, tone_name: String): ToneChatScore = {
    val __obj = js.Dynamic.literal(score = score.asInstanceOf[js.Any], tone_id = tone_id.asInstanceOf[js.Any], tone_name = tone_name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ToneChatScore]
  }
}

