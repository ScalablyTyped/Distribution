package typings.watsonDeveloperCloud.discoveryV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** QueryNoticesResponse. */
trait QueryNoticesResponse extends StObject {
  
  /** Array of aggregation results that match the query. */
  var aggregations: js.UndefOr[js.Array[QueryAggregation]] = js.undefined
  
  /** The number of duplicates removed from this notices query. */
  var duplicates_removed: js.UndefOr[Double] = js.undefined
  
  /** The number of matching results. */
  var matching_results: js.UndefOr[Double] = js.undefined
  
  /** Array of passage results that match the query. */
  var passages: js.UndefOr[js.Array[QueryPassages]] = js.undefined
  
  /** Array of document results that match the query. */
  var results: js.UndefOr[js.Array[QueryNoticesResult]] = js.undefined
}
object QueryNoticesResponse {
  
  inline def apply(): QueryNoticesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryNoticesResponse]
  }
  
  extension [Self <: QueryNoticesResponse](x: Self) {
    
    inline def setAggregations(value: js.Array[QueryAggregation]): Self = StObject.set(x, "aggregations", value.asInstanceOf[js.Any])
    
    inline def setAggregationsUndefined: Self = StObject.set(x, "aggregations", js.undefined)
    
    inline def setAggregationsVarargs(value: QueryAggregation*): Self = StObject.set(x, "aggregations", js.Array(value*))
    
    inline def setDuplicates_removed(value: Double): Self = StObject.set(x, "duplicates_removed", value.asInstanceOf[js.Any])
    
    inline def setDuplicates_removedUndefined: Self = StObject.set(x, "duplicates_removed", js.undefined)
    
    inline def setMatching_results(value: Double): Self = StObject.set(x, "matching_results", value.asInstanceOf[js.Any])
    
    inline def setMatching_resultsUndefined: Self = StObject.set(x, "matching_results", js.undefined)
    
    inline def setPassages(value: js.Array[QueryPassages]): Self = StObject.set(x, "passages", value.asInstanceOf[js.Any])
    
    inline def setPassagesUndefined: Self = StObject.set(x, "passages", js.undefined)
    
    inline def setPassagesVarargs(value: QueryPassages*): Self = StObject.set(x, "passages", js.Array(value*))
    
    inline def setResults(value: js.Array[QueryNoticesResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    inline def setResultsVarargs(value: QueryNoticesResult*): Self = StObject.set(x, "results", js.Array(value*))
  }
}
