package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Query event data object. */
trait EventData extends StObject {
  
  /** The optional timestamp for the event that was created. If not provided, the time that the event was created in the log was used. */
  var client_timestamp: js.UndefOr[String] = js.undefined
  
  /** The **collection_id** of the document that this event is associated with. */
  var collection_id: String
  
  /** The rank of the result item which the event is associated with. */
  var display_rank: js.UndefOr[Double] = js.undefined
  
  /** The **document_id** of the document that this event is associated with. */
  var document_id: String
  
  /** The **environment_id** associated with the query that the event is associated with. */
  var environment_id: String
  
  /** The query identifier stored in the log. The query and any events associated with that query are stored with the same **query_id**. */
  var query_id: js.UndefOr[String] = js.undefined
  
  /** The session token that was returned as part of the query results that this event is associated with. */
  var session_token: String
}
object EventData {
  
  @scala.inline
  def apply(collection_id: String, document_id: String, environment_id: String, session_token: String): EventData = {
    val __obj = js.Dynamic.literal(collection_id = collection_id.asInstanceOf[js.Any], document_id = document_id.asInstanceOf[js.Any], environment_id = environment_id.asInstanceOf[js.Any], session_token = session_token.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventData]
  }
  
  @scala.inline
  implicit class EventDataMutableBuilder[Self <: EventData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClient_timestamp(value: String): Self = StObject.set(x, "client_timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClient_timestampUndefined: Self = StObject.set(x, "client_timestamp", js.undefined)
    
    @scala.inline
    def setCollection_id(value: String): Self = StObject.set(x, "collection_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplay_rank(value: Double): Self = StObject.set(x, "display_rank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplay_rankUndefined: Self = StObject.set(x, "display_rank", js.undefined)
    
    @scala.inline
    def setDocument_id(value: String): Self = StObject.set(x, "document_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironment_id(value: String): Self = StObject.set(x, "environment_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery_id(value: String): Self = StObject.set(x, "query_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery_idUndefined: Self = StObject.set(x, "query_id", js.undefined)
    
    @scala.inline
    def setSession_token(value: String): Self = StObject.set(x, "session_token", value.asInstanceOf[js.Any])
  }
}
