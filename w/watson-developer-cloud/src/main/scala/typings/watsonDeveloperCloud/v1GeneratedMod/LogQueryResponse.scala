package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Object containing results that match the requested **logs** query. */
@js.native
trait LogQueryResponse extends StObject {
  
  /** Number of matching results. */
  var matching_results: js.UndefOr[Double] = js.native
  
  /** Array of log query response results. */
  var results: js.UndefOr[js.Array[LogQueryResponseResult]] = js.native
}
object LogQueryResponse {
  
  @scala.inline
  def apply(): LogQueryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogQueryResponse]
  }
  
  @scala.inline
  implicit class LogQueryResponseMutableBuilder[Self <: LogQueryResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMatching_results(value: Double): Self = StObject.set(x, "matching_results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatching_resultsUndefined: Self = StObject.set(x, "matching_results", js.undefined)
    
    @scala.inline
    def setResults(value: js.Array[LogQueryResponseResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    @scala.inline
    def setResultsVarargs(value: LogQueryResponseResult*): Self = StObject.set(x, "results", js.Array(value :_*))
  }
}
