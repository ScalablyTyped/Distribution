package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

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
  def apply(score: js.UndefOr[Double] = js.undefined, text: String = null): TargetedSentimentResults = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(score)) __obj.updateDynamic("score")(score.get.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetedSentimentResults]
  }
}

