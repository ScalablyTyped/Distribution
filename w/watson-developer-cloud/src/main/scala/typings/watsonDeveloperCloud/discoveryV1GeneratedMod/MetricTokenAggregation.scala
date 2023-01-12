package typings.watsonDeveloperCloud.discoveryV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An aggregation analyzing log information for queries and events. */
trait MetricTokenAggregation extends StObject {
  
  /** The event type associated with this metric result. This field, when present, will always be `click`. */
  var event_type: js.UndefOr[String] = js.undefined
  
  /** Array of results for the metric token aggregation. */
  var results: js.UndefOr[js.Array[MetricTokenAggregationResult]] = js.undefined
}
object MetricTokenAggregation {
  
  inline def apply(): MetricTokenAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricTokenAggregation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MetricTokenAggregation] (val x: Self) extends AnyVal {
    
    inline def setEvent_type(value: String): Self = StObject.set(x, "event_type", value.asInstanceOf[js.Any])
    
    inline def setEvent_typeUndefined: Self = StObject.set(x, "event_type", js.undefined)
    
    inline def setResults(value: js.Array[MetricTokenAggregationResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    inline def setResultsVarargs(value: MetricTokenAggregationResult*): Self = StObject.set(x, "results", js.Array(value*))
  }
}
