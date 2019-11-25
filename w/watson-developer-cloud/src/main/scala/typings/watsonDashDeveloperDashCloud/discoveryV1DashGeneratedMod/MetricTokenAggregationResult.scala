package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Aggregation result data for the requested metric. */
trait MetricTokenAggregationResult extends js.Object {
  /** The number of queries with associated events divided by the total number of queries currently stored (queries and events are stored in the log for 30 days). */
  var event_rate: js.UndefOr[Double] = js.undefined
  /** The content of the **natural_language_query** parameter used in the query that this result represents. */
  var key: js.UndefOr[String] = js.undefined
  /** Number of matching results. */
  var matching_results: js.UndefOr[Double] = js.undefined
}

object MetricTokenAggregationResult {
  @scala.inline
  def apply(event_rate: Int | Double = null, key: String = null, matching_results: Int | Double = null): MetricTokenAggregationResult = {
    val __obj = js.Dynamic.literal()
    if (event_rate != null) __obj.updateDynamic("event_rate")(event_rate.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (matching_results != null) __obj.updateDynamic("matching_results")(matching_results.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricTokenAggregationResult]
  }
}

