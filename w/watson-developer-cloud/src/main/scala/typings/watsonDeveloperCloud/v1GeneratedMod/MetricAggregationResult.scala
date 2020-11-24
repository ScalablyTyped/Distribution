package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Aggregation result data for the requested metric. */
@js.native
trait MetricAggregationResult extends js.Object {
  
  /** The number of queries with associated events divided by the total number of queries for the interval. Only returned with **event_rate** metrics. */
  var event_rate: js.UndefOr[Double] = js.native
  
  /** Unix epoch time equivalent of the **key_as_string**, that represents the start of this interval. */
  var key: js.UndefOr[Double] = js.native
  
  /** Date in string form representing the start of this interval. */
  var key_as_string: js.UndefOr[String] = js.native
  
  /** Number of matching results. */
  var matching_results: js.UndefOr[Double] = js.native
}
object MetricAggregationResult {
  
  @scala.inline
  def apply(): MetricAggregationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricAggregationResult]
  }
  
  @scala.inline
  implicit class MetricAggregationResultOps[Self <: MetricAggregationResult] (val x: Self) extends AnyVal {
    
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
    def setEvent_rate(value: Double): Self = this.set("event_rate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvent_rate: Self = this.set("event_rate", js.undefined)
    
    @scala.inline
    def setKey(value: Double): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setKey_as_string(value: String): Self = this.set("key_as_string", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey_as_string: Self = this.set("key_as_string", js.undefined)
    
    @scala.inline
    def setMatching_results(value: Double): Self = this.set("matching_results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatching_results: Self = this.set("matching_results", js.undefined)
  }
}
