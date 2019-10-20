package typings.watsonDashDeveloperDashCloud.naturalDashLanguageDashUnderstandingV1DashGeneratedMod

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
  def apply(label: String = null, score: Int | Double = null): DocumentSentimentResults = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label)
    if (score != null) __obj.updateDynamic("score")(score.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentSentimentResults]
  }
}

