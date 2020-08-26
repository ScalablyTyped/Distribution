package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FeatureSentimentResults. */
@js.native
trait FeatureSentimentResults extends js.Object {
  /** Sentiment score from -1 (negative) to 1 (positive). */
  var score: js.UndefOr[Double] = js.native
}

object FeatureSentimentResults {
  @scala.inline
  def apply(): FeatureSentimentResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureSentimentResults]
  }
  @scala.inline
  implicit class FeatureSentimentResultsOps[Self <: FeatureSentimentResults] (val x: Self) extends AnyVal {
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
    def setScore(value: Double): Self = this.set("score", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScore: Self = this.set("score", js.undefined)
  }
  
}

