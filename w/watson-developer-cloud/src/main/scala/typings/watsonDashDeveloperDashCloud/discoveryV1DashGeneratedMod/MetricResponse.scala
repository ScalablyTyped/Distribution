package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The response generated from a call to a **metrics** method. */
trait MetricResponse extends js.Object {
  /** Array of metric aggregations. */
  var aggregations: js.UndefOr[js.Array[MetricAggregation]] = js.undefined
}

object MetricResponse {
  @scala.inline
  def apply(aggregations: js.Array[MetricAggregation] = null): MetricResponse = {
    val __obj = js.Dynamic.literal()
    if (aggregations != null) __obj.updateDynamic("aggregations")(aggregations)
    __obj.asInstanceOf[MetricResponse]
  }
}

