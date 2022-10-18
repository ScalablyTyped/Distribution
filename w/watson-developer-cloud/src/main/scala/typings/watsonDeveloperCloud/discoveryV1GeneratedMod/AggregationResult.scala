package typings.watsonDeveloperCloud.discoveryV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*************************
  * model interfaces
  ************************/
/** AggregationResult. */
trait AggregationResult extends StObject {
  
  /** Aggregations returned in the case of chained aggregations. */
  var aggregations: js.UndefOr[js.Array[QueryAggregation]] = js.undefined
  
  /** Key that matched the aggregation type. */
  var key: js.UndefOr[String] = js.undefined
  
  /** Number of matching results. */
  var matching_results: js.UndefOr[Double] = js.undefined
}
object AggregationResult {
  
  inline def apply(): AggregationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationResult]
  }
  
  extension [Self <: AggregationResult](x: Self) {
    
    inline def setAggregations(value: js.Array[QueryAggregation]): Self = StObject.set(x, "aggregations", value.asInstanceOf[js.Any])
    
    inline def setAggregationsUndefined: Self = StObject.set(x, "aggregations", js.undefined)
    
    inline def setAggregationsVarargs(value: QueryAggregation*): Self = StObject.set(x, "aggregations", js.Array(value*))
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setMatching_results(value: Double): Self = StObject.set(x, "matching_results", value.asInstanceOf[js.Any])
    
    inline def setMatching_resultsUndefined: Self = StObject.set(x, "matching_results", js.undefined)
  }
}
