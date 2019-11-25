package typings.watsonDashDeveloperDashCloud.naturalDashLanguageDashUnderstandingV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The sentiment of the content. */
trait SentimentResult extends js.Object {
  /** The document level sentiment. */
  var document: js.UndefOr[DocumentSentimentResults] = js.undefined
  /** The targeted sentiment to analyze. */
  var targets: js.UndefOr[js.Array[TargetedSentimentResults]] = js.undefined
}

object SentimentResult {
  @scala.inline
  def apply(document: DocumentSentimentResults = null, targets: js.Array[TargetedSentimentResults] = null): SentimentResult = {
    val __obj = js.Dynamic.literal()
    if (document != null) __obj.updateDynamic("document")(document.asInstanceOf[js.Any])
    if (targets != null) __obj.updateDynamic("targets")(targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[SentimentResult]
  }
}

