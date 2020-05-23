package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

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
    anger: js.UndefOr[Double] = js.undefined,
    disgust: js.UndefOr[Double] = js.undefined,
    fear: js.UndefOr[Double] = js.undefined,
    joy: js.UndefOr[Double] = js.undefined,
    sadness: js.UndefOr[Double] = js.undefined
  ): EmotionScores = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(anger)) __obj.updateDynamic("anger")(anger.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disgust)) __obj.updateDynamic("disgust")(disgust.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fear)) __obj.updateDynamic("fear")(fear.get.asInstanceOf[js.Any])
    if (!js.isUndefined(joy)) __obj.updateDynamic("joy")(joy.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sadness)) __obj.updateDynamic("sadness")(sadness.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmotionScores]
  }
}

