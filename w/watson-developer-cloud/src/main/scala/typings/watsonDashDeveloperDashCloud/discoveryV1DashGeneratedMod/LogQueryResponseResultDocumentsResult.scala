package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Each object in the **results** array corresponds to an individual document returned by the original query. */
trait LogQueryResponseResultDocumentsResult extends js.Object {
  /** The **collection_id** of the document represented by this result. */
  var collection_id: js.UndefOr[String] = js.undefined
  /** The confidence score of the result's analysis. A higher score indicating greater confidence. */
  var confidence: js.UndefOr[Double] = js.undefined
  /** The **document_id** of the document that this result represents. */
  var document_id: js.UndefOr[String] = js.undefined
  /** The result rank of this document. A position of `1` indicates that it was the first returned result. */
  var position: js.UndefOr[Double] = js.undefined
  /** The raw score of this result. A higher score indicates a greater match to the query parameters. */
  var score: js.UndefOr[Double] = js.undefined
}

object LogQueryResponseResultDocumentsResult {
  @scala.inline
  def apply(
    collection_id: String = null,
    confidence: Int | Double = null,
    document_id: String = null,
    position: Int | Double = null,
    score: Int | Double = null
  ): LogQueryResponseResultDocumentsResult = {
    val __obj = js.Dynamic.literal()
    if (collection_id != null) __obj.updateDynamic("collection_id")(collection_id.asInstanceOf[js.Any])
    if (confidence != null) __obj.updateDynamic("confidence")(confidence.asInstanceOf[js.Any])
    if (document_id != null) __obj.updateDynamic("document_id")(document_id.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (score != null) __obj.updateDynamic("score")(score.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogQueryResponseResultDocumentsResult]
  }
}

