package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An aggregation analyzing log information for queries and events. */
trait MetricAggregation extends StObject {
  
  /** The event type associated with this metric result. This field, when present, will always be `click`. */
  var event_type: js.UndefOr[String] = js.undefined
  
  /** The measurement interval for this metric. Metric intervals are always 1 day (`1d`). */
  var interval: js.UndefOr[String] = js.undefined
  
  /** Array of metric aggregation query results. */
  var results: js.UndefOr[js.Array[MetricAggregationResult]] = js.undefined
}
object MetricAggregation {
  
  @scala.inline
  def apply(): MetricAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricAggregation]
  }
  
  @scala.inline
  implicit class MetricAggregationMutableBuilder[Self <: MetricAggregation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvent_type(value: String): Self = StObject.set(x, "event_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent_typeUndefined: Self = StObject.set(x, "event_type", js.undefined)
    
    @scala.inline
    def setInterval(value: String): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    @scala.inline
    def setResults(value: js.Array[MetricAggregationResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    @scala.inline
    def setResultsVarargs(value: MetricAggregationResult*): Self = StObject.set(x, "results", js.Array(value :_*))
  }
}
