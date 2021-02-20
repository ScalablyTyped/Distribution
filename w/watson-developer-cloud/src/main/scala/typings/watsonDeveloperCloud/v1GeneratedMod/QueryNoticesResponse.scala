package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** QueryNoticesResponse. */
@js.native
trait QueryNoticesResponse extends StObject {
  
  /** Array of aggregation results that match the query. */
  var aggregations: js.UndefOr[js.Array[QueryAggregation]] = js.native
  
  /** The number of duplicates removed from this notices query. */
  var duplicates_removed: js.UndefOr[Double] = js.native
  
  /** The number of matching results. */
  var matching_results: js.UndefOr[Double] = js.native
  
  /** Array of passage results that match the query. */
  var passages: js.UndefOr[js.Array[QueryPassages]] = js.native
  
  /** Array of document results that match the query. */
  var results: js.UndefOr[js.Array[QueryNoticesResult]] = js.native
}
object QueryNoticesResponse {
  
  @scala.inline
  def apply(): QueryNoticesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryNoticesResponse]
  }
  
  @scala.inline
  implicit class QueryNoticesResponseMutableBuilder[Self <: QueryNoticesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAggregations(value: js.Array[QueryAggregation]): Self = StObject.set(x, "aggregations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregationsUndefined: Self = StObject.set(x, "aggregations", js.undefined)
    
    @scala.inline
    def setAggregationsVarargs(value: QueryAggregation*): Self = StObject.set(x, "aggregations", js.Array(value :_*))
    
    @scala.inline
    def setDuplicates_removed(value: Double): Self = StObject.set(x, "duplicates_removed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuplicates_removedUndefined: Self = StObject.set(x, "duplicates_removed", js.undefined)
    
    @scala.inline
    def setMatching_results(value: Double): Self = StObject.set(x, "matching_results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatching_resultsUndefined: Self = StObject.set(x, "matching_results", js.undefined)
    
    @scala.inline
    def setPassages(value: js.Array[QueryPassages]): Self = StObject.set(x, "passages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassagesUndefined: Self = StObject.set(x, "passages", js.undefined)
    
    @scala.inline
    def setPassagesVarargs(value: QueryPassages*): Self = StObject.set(x, "passages", js.Array(value :_*))
    
    @scala.inline
    def setResults(value: js.Array[QueryNoticesResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    @scala.inline
    def setResultsVarargs(value: QueryNoticesResult*): Self = StObject.set(x, "results", js.Array(value :_*))
  }
}
