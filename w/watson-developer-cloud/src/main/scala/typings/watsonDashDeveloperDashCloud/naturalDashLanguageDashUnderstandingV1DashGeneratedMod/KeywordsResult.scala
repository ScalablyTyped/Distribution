package typings.watsonDashDeveloperDashCloud.naturalDashLanguageDashUnderstandingV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The important keywords in the content, organized by relevance. */
trait KeywordsResult extends js.Object {
  /** Number of times the keyword appears in the analyzed text. */
  var count: js.UndefOr[Double] = js.undefined
  /** Emotion analysis results for the keyword, enabled with the `emotion` option. */
  var emotion: js.UndefOr[EmotionScores] = js.undefined
  /** Relevance score from 0 to 1. Higher values indicate greater relevance. */
  var relevance: js.UndefOr[Double] = js.undefined
  /** Sentiment analysis results for the keyword, enabled with the `sentiment` option. */
  var sentiment: js.UndefOr[FeatureSentimentResults] = js.undefined
  /** The keyword text. */
  var text: js.UndefOr[String] = js.undefined
}

object KeywordsResult {
  @scala.inline
  def apply(
    count: Int | Double = null,
    emotion: EmotionScores = null,
    relevance: Int | Double = null,
    sentiment: FeatureSentimentResults = null,
    text: String = null
  ): KeywordsResult = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (emotion != null) __obj.updateDynamic("emotion")(emotion)
    if (relevance != null) __obj.updateDynamic("relevance")(relevance.asInstanceOf[js.Any])
    if (sentiment != null) __obj.updateDynamic("sentiment")(sentiment)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[KeywordsResult]
  }
}

