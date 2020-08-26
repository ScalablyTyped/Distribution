package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** DocumentSentimentResults. */
@js.native
trait DocumentSentimentResults extends js.Object {
  /** Indicates whether the sentiment is positive, neutral, or negative. */
  var label: js.UndefOr[String] = js.native
  /** Sentiment score from -1 (negative) to 1 (positive). */
  var score: js.UndefOr[Double] = js.native
}

object DocumentSentimentResults {
  @scala.inline
  def apply(): DocumentSentimentResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentSentimentResults]
  }
  @scala.inline
  implicit class DocumentSentimentResultsOps[Self <: DocumentSentimentResults] (val x: Self) extends AnyVal {
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
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setScore(value: Double): Self = this.set("score", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScore: Self = this.set("score", js.undefined)
  }
  
}

