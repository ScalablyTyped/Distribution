package typings.watsonDashDeveloperDashCloud.naturalDashLanguageDashUnderstandingV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** TargetedSentimentResults. */
trait TargetedSentimentResults extends js.Object {
  /** Sentiment score from -1 (negative) to 1 (positive). */
  var score: js.UndefOr[Double] = js.undefined
  /** Targeted text. */
  var text: js.UndefOr[String] = js.undefined
}

object TargetedSentimentResults {
  @scala.inline
  def apply(score: Int | Double = null, text: String = null): TargetedSentimentResults = {
    val __obj = js.Dynamic.literal()
    if (score != null) __obj.updateDynamic("score")(score.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[TargetedSentimentResults]
  }
}

