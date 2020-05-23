package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** DocumentSentimentResults. */
trait DocumentSentimentResults extends js.Object {
  /** Indicates whether the sentiment is positive, neutral, or negative. */
  var label: js.UndefOr[String] = js.undefined
  /** Sentiment score from -1 (negative) to 1 (positive). */
  var score: js.UndefOr[Double] = js.undefined
}

object DocumentSentimentResults {
  @scala.inline
  def apply(label: String = null, score: js.UndefOr[Double] = js.undefined): DocumentSentimentResults = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(score)) __obj.updateDynamic("score")(score.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentSentimentResults]
  }
}

