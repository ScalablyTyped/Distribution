package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Object containing result information that was returned by the query used to create this log entry. Only returned with logs of type `query`. */
@js.native
trait LogQueryResponseResultDocuments extends StObject {
  
  /** The number of results returned in the query associate with this log. */
  var count: js.UndefOr[Double] = js.native
  
  /** Array of log query response results. */
  var results: js.UndefOr[js.Array[LogQueryResponseResultDocumentsResult]] = js.native
}
object LogQueryResponseResultDocuments {
  
  @scala.inline
  def apply(): LogQueryResponseResultDocuments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogQueryResponseResultDocuments]
  }
  
  @scala.inline
  implicit class LogQueryResponseResultDocumentsMutableBuilder[Self <: LogQueryResponseResultDocuments] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setResults(value: js.Array[LogQueryResponseResultDocumentsResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    @scala.inline
    def setResultsVarargs(value: LogQueryResponseResultDocumentsResult*): Self = StObject.set(x, "results", js.Array(value :_*))
  }
}
