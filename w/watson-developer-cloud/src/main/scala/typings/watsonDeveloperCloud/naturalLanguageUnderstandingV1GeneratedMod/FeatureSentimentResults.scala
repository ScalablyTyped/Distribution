package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FeatureSentimentResults. */
trait FeatureSentimentResults extends js.Object {
  /** Sentiment score from -1 (negative) to 1 (positive). */
  var score: js.UndefOr[Double] = js.undefined
}

object FeatureSentimentResults {
  @scala.inline
  def apply(score: js.UndefOr[Double] = js.undefined): FeatureSentimentResults = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(score)) __obj.updateDynamic("score")(score.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureSentimentResults]
  }
}

