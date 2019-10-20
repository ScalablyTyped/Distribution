package typings.watsonDashDeveloperDashCloud.naturalDashLanguageDashUnderstandingV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Emotion results for a specified target. */
trait TargetedEmotionResults extends js.Object {
  /** The emotion results for the target. */
  var emotion: js.UndefOr[EmotionScores] = js.undefined
  /** Targeted text. */
  var text: js.UndefOr[String] = js.undefined
}

object TargetedEmotionResults {
  @scala.inline
  def apply(emotion: EmotionScores = null, text: String = null): TargetedEmotionResults = {
    val __obj = js.Dynamic.literal()
    if (emotion != null) __obj.updateDynamic("emotion")(emotion)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[TargetedEmotionResults]
  }
}

