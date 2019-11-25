package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Metadata of a query result. */
trait QueryResultMetadata extends js.Object {
  /** The confidence score for the given result. Calculated based on how relevant the result is estimated to be. confidence can range from `0.0` to `1.0`. The higher the number, the more relevant the document. The `confidence` value for a result was calculated using the model specified in the `document_retrieval_strategy` field of the result set. */
  var confidence: js.UndefOr[Double] = js.undefined
  /** An unbounded measure of the relevance of a particular result, dependent on the query and matching document. A higher score indicates a greater match to the query parameters. */
  var score: Double
}

object QueryResultMetadata {
  @scala.inline
  def apply(score: Double, confidence: Int | Double = null): QueryResultMetadata = {
    val __obj = js.Dynamic.literal(score = score.asInstanceOf[js.Any])
    if (confidence != null) __obj.updateDynamic("confidence")(confidence.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryResultMetadata]
  }
}

