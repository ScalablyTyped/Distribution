package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Object containing results that match the requested **logs** query. */
trait LogQueryResponse extends js.Object {
  /** Number of matching results. */
  var matching_results: js.UndefOr[Double] = js.undefined
  /** Array of log query response results. */
  var results: js.UndefOr[js.Array[LogQueryResponseResult]] = js.undefined
}

object LogQueryResponse {
  @scala.inline
  def apply(
    matching_results: js.UndefOr[Double] = js.undefined,
    results: js.Array[LogQueryResponseResult] = null
  ): LogQueryResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(matching_results)) __obj.updateDynamic("matching_results")(matching_results.get.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogQueryResponse]
  }
}

