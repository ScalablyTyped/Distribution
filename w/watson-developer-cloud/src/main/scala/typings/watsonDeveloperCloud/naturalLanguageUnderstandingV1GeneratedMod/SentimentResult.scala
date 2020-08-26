package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The sentiment of the content. */
@js.native
trait SentimentResult extends js.Object {
  /** The document level sentiment. */
  var document: js.UndefOr[DocumentSentimentResults] = js.native
  /** The targeted sentiment to analyze. */
  var targets: js.UndefOr[js.Array[TargetedSentimentResults]] = js.native
}

object SentimentResult {
  @scala.inline
  def apply(): SentimentResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SentimentResult]
  }
  @scala.inline
  implicit class SentimentResultOps[Self <: SentimentResult] (val x: Self) extends AnyVal {
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
    def setDocument(value: DocumentSentimentResults): Self = this.set("document", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocument: Self = this.set("document", js.undefined)
    @scala.inline
    def setTargetsVarargs(value: TargetedSentimentResults*): Self = this.set("targets", js.Array(value :_*))
    @scala.inline
    def setTargets(value: js.Array[TargetedSentimentResults]): Self = this.set("targets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargets: Self = this.set("targets", js.undefined)
  }
  
}

