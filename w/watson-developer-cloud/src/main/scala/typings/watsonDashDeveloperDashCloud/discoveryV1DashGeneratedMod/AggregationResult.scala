package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*************************
  * model interfaces
  ************************/
/** AggregationResult. */
trait AggregationResult extends js.Object {
  /** Aggregations returned in the case of chained aggregations. */
  var aggregations: js.UndefOr[js.Array[QueryAggregation]] = js.undefined
  /** Key that matched the aggregation type. */
  var key: js.UndefOr[String] = js.undefined
  /** Number of matching results. */
  var matching_results: js.UndefOr[Double] = js.undefined
}

object AggregationResult {
  @scala.inline
  def apply(
    aggregations: js.Array[QueryAggregation] = null,
    key: String = null,
    matching_results: Int | Double = null
  ): AggregationResult = {
    val __obj = js.Dynamic.literal()
    if (aggregations != null) __obj.updateDynamic("aggregations")(aggregations.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (matching_results != null) __obj.updateDynamic("matching_results")(matching_results.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationResult]
  }
}

