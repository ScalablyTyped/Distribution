package typings.watsonDeveloperCloud.discoveryV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Object containing result information that was returned by the query used to create this log entry. Only returned with logs of type `query`. */
trait LogQueryResponseResultDocuments extends StObject {
  
  /** The number of results returned in the query associate with this log. */
  var count: js.UndefOr[Double] = js.undefined
  
  /** Array of log query response results. */
  var results: js.UndefOr[js.Array[LogQueryResponseResultDocumentsResult]] = js.undefined
}
object LogQueryResponseResultDocuments {
  
  inline def apply(): LogQueryResponseResultDocuments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogQueryResponseResultDocuments]
  }
  
  extension [Self <: LogQueryResponseResultDocuments](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setResults(value: js.Array[LogQueryResponseResultDocumentsResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    inline def setResultsVarargs(value: LogQueryResponseResultDocumentsResult*): Self = StObject.set(x, "results", js.Array(value*))
  }
}
