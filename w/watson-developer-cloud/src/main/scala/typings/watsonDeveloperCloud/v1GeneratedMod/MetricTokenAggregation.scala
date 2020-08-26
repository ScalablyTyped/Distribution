package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An aggregation analyzing log information for queries and events. */
@js.native
trait MetricTokenAggregation extends js.Object {
  /** The event type associated with this metric result. This field, when present, will always be `click`. */
  var event_type: js.UndefOr[String] = js.native
  /** Array of results for the metric token aggregation. */
  var results: js.UndefOr[js.Array[MetricTokenAggregationResult]] = js.native
}

object MetricTokenAggregation {
  @scala.inline
  def apply(): MetricTokenAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricTokenAggregation]
  }
  @scala.inline
  implicit class MetricTokenAggregationOps[Self <: MetricTokenAggregation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEvent_type(value: String): Self = this.set("event_type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvent_type: Self = this.set("event_type", js.undefined)
    @scala.inline
    def setResultsVarargs(value: MetricTokenAggregationResult*): Self = this.set("results", js.Array(value :_*))
    @scala.inline
    def setResults(value: js.Array[MetricTokenAggregationResult]): Self = this.set("results", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResults: Self = this.set("results", js.undefined)
  }
  
}

