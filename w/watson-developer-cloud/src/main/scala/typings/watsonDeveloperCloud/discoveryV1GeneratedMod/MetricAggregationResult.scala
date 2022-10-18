package typings.watsonDeveloperCloud.discoveryV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Aggregation result data for the requested metric. */
trait MetricAggregationResult extends StObject {
  
  /** The number of queries with associated events divided by the total number of queries for the interval. Only returned with **event_rate** metrics. */
  var event_rate: js.UndefOr[Double] = js.undefined
  
  /** Unix epoch time equivalent of the **key_as_string**, that represents the start of this interval. */
  var key: js.UndefOr[Double] = js.undefined
  
  /** Date in string form representing the start of this interval. */
  var key_as_string: js.UndefOr[String] = js.undefined
  
  /** Number of matching results. */
  var matching_results: js.UndefOr[Double] = js.undefined
}
object MetricAggregationResult {
  
  inline def apply(): MetricAggregationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricAggregationResult]
  }
  
  extension [Self <: MetricAggregationResult](x: Self) {
    
    inline def setEvent_rate(value: Double): Self = StObject.set(x, "event_rate", value.asInstanceOf[js.Any])
    
    inline def setEvent_rateUndefined: Self = StObject.set(x, "event_rate", js.undefined)
    
    inline def setKey(value: Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setKey_as_string(value: String): Self = StObject.set(x, "key_as_string", value.asInstanceOf[js.Any])
    
    inline def setKey_as_stringUndefined: Self = StObject.set(x, "key_as_string", js.undefined)
    
    inline def setMatching_results(value: Double): Self = StObject.set(x, "matching_results", value.asInstanceOf[js.Any])
    
    inline def setMatching_resultsUndefined: Self = StObject.set(x, "matching_results", js.undefined)
  }
}
