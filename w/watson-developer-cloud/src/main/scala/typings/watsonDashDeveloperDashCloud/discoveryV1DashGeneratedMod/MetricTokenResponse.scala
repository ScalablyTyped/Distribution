package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The response generated from a call to a **metrics** method that evaluates tokens. */
trait MetricTokenResponse extends js.Object {
  /** Array of metric token aggregations. */
  var aggregations: js.UndefOr[js.Array[MetricTokenAggregation]] = js.undefined
}

object MetricTokenResponse {
  @scala.inline
  def apply(aggregations: js.Array[MetricTokenAggregation] = null): MetricTokenResponse = {
    val __obj = js.Dynamic.literal()
    if (aggregations != null) __obj.updateDynamic("aggregations")(aggregations)
    __obj.asInstanceOf[MetricTokenResponse]
  }
}

