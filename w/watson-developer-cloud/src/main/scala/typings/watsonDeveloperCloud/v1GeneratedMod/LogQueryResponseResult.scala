package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Individual result object for a **logs** query. Each object represents either a query to a Discovery collection or an event that is associated with a query. */
@js.native
trait LogQueryResponseResult extends js.Object {
  
  /** Date specified by the user when recording an event. Returned in `YYYY-MM-DDThh:mm:ssZ` format. Only returned with logs of type **event**. */
  var client_timestamp: js.UndefOr[String] = js.native
  
  /** The collection ID of the document associated with this event. Only returned with logs of type `event`. */
  var collection_id: js.UndefOr[String] = js.native
  
  /** Date that the log result was created. Returned in `YYYY-MM-DDThh:mm:ssZ` format. */
  var created_timestamp: js.UndefOr[String] = js.native
  
  /** The **customer_id** label that was specified in the header of the query or event API call that corresponds to this log entry. */
  var customer_id: js.UndefOr[String] = js.native
  
  /** The original display rank of the document associated with this event. Only returned with logs of type `event`. */
  var display_rank: js.UndefOr[Double] = js.native
  
  /** The document ID of the document associated with this event. Only returned with logs of type `event`. */
  var document_id: js.UndefOr[String] = js.native
  
  /** Object containing result information that was returned by the query used to create this log entry. Only returned with logs of type `query`. */
  var document_results: js.UndefOr[LogQueryResponseResultDocuments] = js.native
  
  /** The type of log entry returned. **query** indicates that the log represents the results of a call to the single collection **query** method. **event** indicates that the log represents  a call to the **events** API. */
  var document_type: js.UndefOr[String] = js.native
  
  /** The environment ID that is associated with this log entry. */
  var environment_id: js.UndefOr[String] = js.native
  
  /** The type of event that this object respresents. Possible values are -  `query` the log of a query to a collection -  `click` the result of a call to the **events** endpoint. */
  var event_type: js.UndefOr[String] = js.native
  
  /** The value of the **natural_language_query** query parameter that was used to create these results. Only returned with logs of type **query**. **Note:** Other query parameters (such as **filter** or **deduplicate**) might  have been used with this query, but are not recorded. */
  var natural_language_query: js.UndefOr[String] = js.native
  
  /** Identifier that corresponds to the **natural_language_query** string used in the original or associated query. All **event** and **query** log entries that have the same original **natural_language_query** string also have them same **query_id**. This field can be used to recall all **event** and **query** log results that have the same original query (**event** logs do not contain the original **natural_language_query** field). */
  var query_id: js.UndefOr[String] = js.native
  
  /** The type of result that this **event** is associated with. Only returned with logs of type `event`. */
  var result_type: js.UndefOr[String] = js.native
  
  /** Unique identifier (within a 24-hour period) that identifies a single `query` log and any `event` logs that were created for it. **Note:** If the exact same query is run at the exact same time on different days, the **session_token** for those queries might be identical. However, the **created_timestamp** differs. **Note:** Session tokens are case sensitive. To avoid matching on session tokens that are identical except for case, use the exact match operator (`::`) when you query for a specific session token. */
  var session_token: js.UndefOr[String] = js.native
}
object LogQueryResponseResult {
  
  @scala.inline
  def apply(): LogQueryResponseResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogQueryResponseResult]
  }
  
  @scala.inline
  implicit class LogQueryResponseResultOps[Self <: LogQueryResponseResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClient_timestamp(value: String): Self = this.set("client_timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClient_timestamp: Self = this.set("client_timestamp", js.undefined)
    
    @scala.inline
    def setCollection_id(value: String): Self = this.set("collection_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollection_id: Self = this.set("collection_id", js.undefined)
    
    @scala.inline
    def setCreated_timestamp(value: String): Self = this.set("created_timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreated_timestamp: Self = this.set("created_timestamp", js.undefined)
    
    @scala.inline
    def setCustomer_id(value: String): Self = this.set("customer_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomer_id: Self = this.set("customer_id", js.undefined)
    
    @scala.inline
    def setDisplay_rank(value: Double): Self = this.set("display_rank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplay_rank: Self = this.set("display_rank", js.undefined)
    
    @scala.inline
    def setDocument_id(value: String): Self = this.set("document_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocument_id: Self = this.set("document_id", js.undefined)
    
    @scala.inline
    def setDocument_results(value: LogQueryResponseResultDocuments): Self = this.set("document_results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocument_results: Self = this.set("document_results", js.undefined)
    
    @scala.inline
    def setDocument_type(value: String): Self = this.set("document_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocument_type: Self = this.set("document_type", js.undefined)
    
    @scala.inline
    def setEnvironment_id(value: String): Self = this.set("environment_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvironment_id: Self = this.set("environment_id", js.undefined)
    
    @scala.inline
    def setEvent_type(value: String): Self = this.set("event_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvent_type: Self = this.set("event_type", js.undefined)
    
    @scala.inline
    def setNatural_language_query(value: String): Self = this.set("natural_language_query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNatural_language_query: Self = this.set("natural_language_query", js.undefined)
    
    @scala.inline
    def setQuery_id(value: String): Self = this.set("query_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery_id: Self = this.set("query_id", js.undefined)
    
    @scala.inline
    def setResult_type(value: String): Self = this.set("result_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResult_type: Self = this.set("result_type", js.undefined)
    
    @scala.inline
    def setSession_token(value: String): Self = this.set("session_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSession_token: Self = this.set("session_token", js.undefined)
  }
}
