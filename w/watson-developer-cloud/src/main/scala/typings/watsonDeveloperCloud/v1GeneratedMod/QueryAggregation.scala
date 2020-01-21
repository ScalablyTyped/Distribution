package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An aggregation produced by the Discovery service to analyze the input provided. */
trait QueryAggregation extends js.Object {
  /** Aggregations returned by the Discovery service. */
  var aggregations: js.UndefOr[js.Array[QueryAggregation]] = js.undefined
  /** Number of matching results. */
  var matching_results: js.UndefOr[Double] = js.undefined
  /** Array of aggregation results. */
  var results: js.UndefOr[js.Array[AggregationResult]] = js.undefined
  /** The type of aggregation command used. For example: term, filter, max, min, etc. */
  var `type`: js.UndefOr[String] = js.undefined
}

object QueryAggregation {
  @scala.inline
  def apply(
    aggregations: js.Array[QueryAggregation] = null,
    matching_results: Int | Double = null,
    results: js.Array[AggregationResult] = null,
    `type`: String = null
  ): QueryAggregation = {
    val __obj = js.Dynamic.literal()
    if (aggregations != null) __obj.updateDynamic("aggregations")(aggregations.asInstanceOf[js.Any])
    if (matching_results != null) __obj.updateDynamic("matching_results")(matching_results.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryAggregation]
  }
}

