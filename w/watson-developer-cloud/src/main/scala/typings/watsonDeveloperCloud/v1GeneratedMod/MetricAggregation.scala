package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An aggregation analyzing log information for queries and events. */
@js.native
trait MetricAggregation extends js.Object {
  
  /** The event type associated with this metric result. This field, when present, will always be `click`. */
  var event_type: js.UndefOr[String] = js.native
  
  /** The measurement interval for this metric. Metric intervals are always 1 day (`1d`). */
  var interval: js.UndefOr[String] = js.native
  
  /** Array of metric aggregation query results. */
  var results: js.UndefOr[js.Array[MetricAggregationResult]] = js.native
}
object MetricAggregation {
  
  @scala.inline
  def apply(): MetricAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricAggregation]
  }
  
  @scala.inline
  implicit class MetricAggregationOps[Self <: MetricAggregation] (val x: Self) extends AnyVal {
    
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
    def setInterval(value: String): Self = this.set("interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    
    @scala.inline
    def setResultsVarargs(value: MetricAggregationResult*): Self = this.set("results", js.Array(value :_*))
    
    @scala.inline
    def setResults(value: js.Array[MetricAggregationResult]): Self = this.set("results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResults: Self = this.set("results", js.undefined)
  }
}
