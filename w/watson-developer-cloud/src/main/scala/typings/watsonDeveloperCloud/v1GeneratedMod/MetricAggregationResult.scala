package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Aggregation result data for the requested metric. */
trait MetricAggregationResult extends js.Object {
  /** The number of queries with associated events divided by the total number of queries for the interval. Only returned with **event_rate** metrics. */
  var event_rate: js.UndefOr[Double] = js.undefined
  /** Unix epoch time equivalent of the **key_as_string**, that represents the start of this interval. */
  var key: js.UndefOr[Double] = js.undefined
  /** Date in string form representing the start of this interval. */
  var key_as_string: js.UndefOr[String] = js.undefined
  /** Number of matching results. */
  var matching_results: js.UndefOr[Double] = js.undefined
}

object MetricAggregationResult {
  @scala.inline
  def apply(
    event_rate: Int | Double = null,
    key: Int | Double = null,
    key_as_string: String = null,
    matching_results: Int | Double = null
  ): MetricAggregationResult = {
    val __obj = js.Dynamic.literal()
    if (event_rate != null) __obj.updateDynamic("event_rate")(event_rate.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (key_as_string != null) __obj.updateDynamic("key_as_string")(key_as_string.asInstanceOf[js.Any])
    if (matching_results != null) __obj.updateDynamic("matching_results")(matching_results.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricAggregationResult]
  }
}

