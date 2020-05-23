package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Object containing result information that was returned by the query used to create this log entry. Only returned with logs of type `query`. */
trait LogQueryResponseResultDocuments extends js.Object {
  /** The number of results returned in the query associate with this log. */
  var count: js.UndefOr[Double] = js.undefined
  /** Array of log query response results. */
  var results: js.UndefOr[js.Array[LogQueryResponseResultDocumentsResult]] = js.undefined
}

object LogQueryResponseResultDocuments {
  @scala.inline
  def apply(
    count: js.UndefOr[Double] = js.undefined,
    results: js.Array[LogQueryResponseResultDocumentsResult] = null
  ): LogQueryResponseResultDocuments = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.get.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogQueryResponseResultDocuments]
  }
}

