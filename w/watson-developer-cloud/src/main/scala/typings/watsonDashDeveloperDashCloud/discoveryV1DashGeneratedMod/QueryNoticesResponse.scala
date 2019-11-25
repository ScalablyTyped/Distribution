package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** QueryNoticesResponse. */
trait QueryNoticesResponse extends js.Object {
  /** Array of aggregation results that match the query. */
  var aggregations: js.UndefOr[js.Array[QueryAggregation]] = js.undefined
  /** The number of duplicates removed from this notices query. */
  var duplicates_removed: js.UndefOr[Double] = js.undefined
  /** The number of matching results. */
  var matching_results: js.UndefOr[Double] = js.undefined
  /** Array of passage results that match the query. */
  var passages: js.UndefOr[js.Array[QueryPassages]] = js.undefined
  /** Array of document results that match the query. */
  var results: js.UndefOr[js.Array[QueryNoticesResult]] = js.undefined
}

object QueryNoticesResponse {
  @scala.inline
  def apply(
    aggregations: js.Array[QueryAggregation] = null,
    duplicates_removed: Int | Double = null,
    matching_results: Int | Double = null,
    passages: js.Array[QueryPassages] = null,
    results: js.Array[QueryNoticesResult] = null
  ): QueryNoticesResponse = {
    val __obj = js.Dynamic.literal()
    if (aggregations != null) __obj.updateDynamic("aggregations")(aggregations.asInstanceOf[js.Any])
    if (duplicates_removed != null) __obj.updateDynamic("duplicates_removed")(duplicates_removed.asInstanceOf[js.Any])
    if (matching_results != null) __obj.updateDynamic("matching_results")(matching_results.asInstanceOf[js.Any])
    if (passages != null) __obj.updateDynamic("passages")(passages.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryNoticesResponse]
  }
}

