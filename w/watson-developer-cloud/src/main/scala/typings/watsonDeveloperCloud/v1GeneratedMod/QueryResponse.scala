package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A response containing the documents and aggregations for the query. */
@js.native
trait QueryResponse extends StObject {
  
  /** Array of aggregation results for the query. */
  var aggregations: js.UndefOr[js.Array[QueryAggregation]] = js.native
  
  /** The number of duplicate results removed. */
  var duplicates_removed: js.UndefOr[Double] = js.native
  
  /** The number of matching results for the query. */
  var matching_results: js.UndefOr[Double] = js.native
  
  /** Array of passage results for the query. */
  var passages: js.UndefOr[js.Array[QueryPassages]] = js.native
  
  /** Array of document results for the query. */
  var results: js.UndefOr[js.Array[QueryResult]] = js.native
  
  /** An object contain retrieval type information. */
  var retrieval_details: js.UndefOr[RetrievalDetails] = js.native
  
  /** The session token for this query. The session token can be used to add events associated with this query to the query and event log. **Important:** Session tokens are case sensitive. */
  var session_token: js.UndefOr[String] = js.native
}
object QueryResponse {
  
  @scala.inline
  def apply(): QueryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryResponse]
  }
  
  @scala.inline
  implicit class QueryResponseMutableBuilder[Self <: QueryResponse] (val x: Self) extends AnyVal {
    
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
    def setResults(value: js.Array[QueryResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    @scala.inline
    def setResultsVarargs(value: QueryResult*): Self = StObject.set(x, "results", js.Array(value :_*))
    
    @scala.inline
    def setRetrieval_details(value: RetrievalDetails): Self = StObject.set(x, "retrieval_details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetrieval_detailsUndefined: Self = StObject.set(x, "retrieval_details", js.undefined)
    
    @scala.inline
    def setSession_token(value: String): Self = StObject.set(x, "session_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession_tokenUndefined: Self = StObject.set(x, "session_token", js.undefined)
  }
}
