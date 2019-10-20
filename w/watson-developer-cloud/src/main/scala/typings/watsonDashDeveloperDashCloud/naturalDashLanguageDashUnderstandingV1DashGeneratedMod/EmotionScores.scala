package typings.watsonDashDeveloperDashCloud.naturalDashLanguageDashUnderstandingV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** EmotionScores. */
trait EmotionScores extends js.Object {
  /** Anger score from 0 to 1. A higher score means that the text is more likely to convey anger. */
  var anger: js.UndefOr[Double] = js.undefined
  /** Disgust score from 0 to 1. A higher score means that the text is more likely to convey disgust. */
  var disgust: js.UndefOr[Double] = js.undefined
  /** Fear score from 0 to 1. A higher score means that the text is more likely to convey fear. */
  var fear: js.UndefOr[Double] = js.undefined
  /** Joy score from 0 to 1. A higher score means that the text is more likely to convey joy. */
  var joy: js.UndefOr[Double] = js.undefined
  /** Sadness score from 0 to 1. A higher score means that the text is more likely to convey sadness. */
  var sadness: js.UndefOr[Double] = js.undefined
}

object EmotionScores {
  @scala.inline
  def apply(
    anger: Int | Double = null,
    disgust: Int | Double = null,
    fear: Int | Double = null,
    joy: Int | Double = null,
    sadness: Int | Double = null
  ): EmotionScores = {
    val __obj = js.Dynamic.literal()
    if (anger != null) __obj.updateDynamic("anger")(anger.asInstanceOf[js.Any])
    if (disgust != null) __obj.updateDynamic("disgust")(disgust.asInstanceOf[js.Any])
    if (fear != null) __obj.updateDynamic("fear")(fear.asInstanceOf[js.Any])
    if (joy != null) __obj.updateDynamic("joy")(joy.asInstanceOf[js.Any])
    if (sadness != null) __obj.updateDynamic("sadness")(sadness.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmotionScores]
  }
}

