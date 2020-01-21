package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An aggregation analyzing log information for queries and events. */
trait MetricAggregation extends js.Object {
  /** The event type associated with this metric result. This field, when present, will always be `click`. */
  var event_type: js.UndefOr[String] = js.undefined
  /** The measurement interval for this metric. Metric intervals are always 1 day (`1d`). */
  var interval: js.UndefOr[String] = js.undefined
  /** Array of metric aggregation query results. */
  var results: js.UndefOr[js.Array[MetricAggregationResult]] = js.undefined
}

object MetricAggregation {
  @scala.inline
  def apply(
    event_type: String = null,
    interval: String = null,
    results: js.Array[MetricAggregationResult] = null
  ): MetricAggregation = {
    val __obj = js.Dynamic.literal()
    if (event_type != null) __obj.updateDynamic("event_type")(event_type.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricAggregation]
  }
}

