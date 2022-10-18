package typings.watsonDeveloperCloud.discoveryV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Individual result object for a **logs** query. Each object represents either a query to a Discovery collection or an event that is associated with a query. */
trait LogQueryResponseResult extends StObject {
  
  /** Date specified by the user when recording an event. Returned in `YYYY-MM-DDThh:mm:ssZ` format. Only returned with logs of type **event**. */
  var client_timestamp: js.UndefOr[String] = js.undefined
  
  /** The collection ID of the document associated with this event. Only returned with logs of type `event`. */
  var collection_id: js.UndefOr[String] = js.undefined
  
  /** Date that the log result was created. Returned in `YYYY-MM-DDThh:mm:ssZ` format. */
  var created_timestamp: js.UndefOr[String] = js.undefined
  
  /** The **customer_id** label that was specified in the header of the query or event API call that corresponds to this log entry. */
  var customer_id: js.UndefOr[String] = js.undefined
  
  /** The original display rank of the document associated with this event. Only returned with logs of type `event`. */
  var display_rank: js.UndefOr[Double] = js.undefined
  
  /** The document ID of the document associated with this event. Only returned with logs of type `event`. */
  var document_id: js.UndefOr[String] = js.undefined
  
  /** Object containing result information that was returned by the query used to create this log entry. Only returned with logs of type `query`. */
  var document_results: js.UndefOr[LogQueryResponseResultDocuments] = js.undefined
  
  /** The type of log entry returned. **query** indicates that the log represents the results of a call to the single collection **query** method. **event** indicates that the log represents  a call to the **events** API. */
  var document_type: js.UndefOr[String] = js.undefined
  
  /** The environment ID that is associated with this log entry. */
  var environment_id: js.UndefOr[String] = js.undefined
  
  /** The type of event that this object respresents. Possible values are -  `query` the log of a query to a collection -  `click` the result of a call to the **events** endpoint. */
  var event_type: js.UndefOr[String] = js.undefined
  
  /** The value of the **natural_language_query** query parameter that was used to create these results. Only returned with logs of type **query**. **Note:** Other query parameters (such as **filter** or **deduplicate**) might  have been used with this query, but are not recorded. */
  var natural_language_query: js.UndefOr[String] = js.undefined
  
  /** Identifier that corresponds to the **natural_language_query** string used in the original or associated query. All **event** and **query** log entries that have the same original **natural_language_query** string also have them same **query_id**. This field can be used to recall all **event** and **query** log results that have the same original query (**event** logs do not contain the original **natural_language_query** field). */
  var query_id: js.UndefOr[String] = js.undefined
  
  /** The type of result that this **event** is associated with. Only returned with logs of type `event`. */
  var result_type: js.UndefOr[String] = js.undefined
  
  /** Unique identifier (within a 24-hour period) that identifies a single `query` log and any `event` logs that were created for it. **Note:** If the exact same query is run at the exact same time on different days, the **session_token** for those queries might be identical. However, the **created_timestamp** differs. **Note:** Session tokens are case sensitive. To avoid matching on session tokens that are identical except for case, use the exact match operator (`::`) when you query for a specific session token. */
  var session_token: js.UndefOr[String] = js.undefined
}
object LogQueryResponseResult {
  
  inline def apply(): LogQueryResponseResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogQueryResponseResult]
  }
  
  extension [Self <: LogQueryResponseResult](x: Self) {
    
    inline def setClient_timestamp(value: String): Self = StObject.set(x, "client_timestamp", value.asInstanceOf[js.Any])
    
    inline def setClient_timestampUndefined: Self = StObject.set(x, "client_timestamp", js.undefined)
    
    inline def setCollection_id(value: String): Self = StObject.set(x, "collection_id", value.asInstanceOf[js.Any])
    
    inline def setCollection_idUndefined: Self = StObject.set(x, "collection_id", js.undefined)
    
    inline def setCreated_timestamp(value: String): Self = StObject.set(x, "created_timestamp", value.asInstanceOf[js.Any])
    
    inline def setCreated_timestampUndefined: Self = StObject.set(x, "created_timestamp", js.undefined)
    
    inline def setCustomer_id(value: String): Self = StObject.set(x, "customer_id", value.asInstanceOf[js.Any])
    
    inline def setCustomer_idUndefined: Self = StObject.set(x, "customer_id", js.undefined)
    
    inline def setDisplay_rank(value: Double): Self = StObject.set(x, "display_rank", value.asInstanceOf[js.Any])
    
    inline def setDisplay_rankUndefined: Self = StObject.set(x, "display_rank", js.undefined)
    
    inline def setDocument_id(value: String): Self = StObject.set(x, "document_id", value.asInstanceOf[js.Any])
    
    inline def setDocument_idUndefined: Self = StObject.set(x, "document_id", js.undefined)
    
    inline def setDocument_results(value: LogQueryResponseResultDocuments): Self = StObject.set(x, "document_results", value.asInstanceOf[js.Any])
    
    inline def setDocument_resultsUndefined: Self = StObject.set(x, "document_results", js.undefined)
    
    inline def setDocument_type(value: String): Self = StObject.set(x, "document_type", value.asInstanceOf[js.Any])
    
    inline def setDocument_typeUndefined: Self = StObject.set(x, "document_type", js.undefined)
    
    inline def setEnvironment_id(value: String): Self = StObject.set(x, "environment_id", value.asInstanceOf[js.Any])
    
    inline def setEnvironment_idUndefined: Self = StObject.set(x, "environment_id", js.undefined)
    
    inline def setEvent_type(value: String): Self = StObject.set(x, "event_type", value.asInstanceOf[js.Any])
    
    inline def setEvent_typeUndefined: Self = StObject.set(x, "event_type", js.undefined)
    
    inline def setNatural_language_query(value: String): Self = StObject.set(x, "natural_language_query", value.asInstanceOf[js.Any])
    
    inline def setNatural_language_queryUndefined: Self = StObject.set(x, "natural_language_query", js.undefined)
    
    inline def setQuery_id(value: String): Self = StObject.set(x, "query_id", value.asInstanceOf[js.Any])
    
    inline def setQuery_idUndefined: Self = StObject.set(x, "query_id", js.undefined)
    
    inline def setResult_type(value: String): Self = StObject.set(x, "result_type", value.asInstanceOf[js.Any])
    
    inline def setResult_typeUndefined: Self = StObject.set(x, "result_type", js.undefined)
    
    inline def setSession_token(value: String): Self = StObject.set(x, "session_token", value.asInstanceOf[js.Any])
    
    inline def setSession_tokenUndefined: Self = StObject.set(x, "session_token", js.undefined)
  }
}
