package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The important keywords in the content, organized by relevance. */
@js.native
trait KeywordsResult extends js.Object {
  /** Number of times the keyword appears in the analyzed text. */
  var count: js.UndefOr[Double] = js.native
  /** Emotion analysis results for the keyword, enabled with the `emotion` option. */
  var emotion: js.UndefOr[EmotionScores] = js.native
  /** Relevance score from 0 to 1. Higher values indicate greater relevance. */
  var relevance: js.UndefOr[Double] = js.native
  /** Sentiment analysis results for the keyword, enabled with the `sentiment` option. */
  var sentiment: js.UndefOr[FeatureSentimentResults] = js.native
  /** The keyword text. */
  var text: js.UndefOr[String] = js.native
}

object KeywordsResult {
  @scala.inline
  def apply(): KeywordsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeywordsResult]
  }
  @scala.inline
  implicit class KeywordsResultOps[Self <: KeywordsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setEmotion(value: EmotionScores): Self = this.set("emotion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmotion: Self = this.set("emotion", js.undefined)
    @scala.inline
    def setRelevance(value: Double): Self = this.set("relevance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelevance: Self = this.set("relevance", js.undefined)
    @scala.inline
    def setSentiment(value: FeatureSentimentResults): Self = this.set("sentiment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSentiment: Self = this.set("sentiment", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

