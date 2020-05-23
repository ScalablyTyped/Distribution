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
    event_rate: js.UndefOr[Double] = js.undefined,
    key: js.UndefOr[Double] = js.undefined,
    key_as_string: String = null,
    matching_results: js.UndefOr[Double] = js.undefined
  ): MetricAggregationResult = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(event_rate)) __obj.updateDynamic("event_rate")(event_rate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(key)) __obj.updateDynamic("key")(key.get.asInstanceOf[js.Any])
    if (key_as_string != null) __obj.updateDynamic("key_as_string")(key_as_string.asInstanceOf[js.Any])
    if (!js.isUndefined(matching_results)) __obj.updateDynamic("matching_results")(matching_results.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricAggregationResult]
  }
}

