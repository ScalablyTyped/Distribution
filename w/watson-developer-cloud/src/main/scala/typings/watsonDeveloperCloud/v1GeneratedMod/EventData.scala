package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Query event data object. */
@js.native
trait EventData extends js.Object {
  
  /** The optional timestamp for the event that was created. If not provided, the time that the event was created in the log was used. */
  var client_timestamp: js.UndefOr[String] = js.native
  
  /** The **collection_id** of the document that this event is associated with. */
  var collection_id: String = js.native
  
  /** The rank of the result item which the event is associated with. */
  var display_rank: js.UndefOr[Double] = js.native
  
  /** The **document_id** of the document that this event is associated with. */
  var document_id: String = js.native
  
  /** The **environment_id** associated with the query that the event is associated with. */
  var environment_id: String = js.native
  
  /** The query identifier stored in the log. The query and any events associated with that query are stored with the same **query_id**. */
  var query_id: js.UndefOr[String] = js.native
  
  /** The session token that was returned as part of the query results that this event is associated with. */
  var session_token: String = js.native
}
object EventData {
  
  @scala.inline
  def apply(collection_id: String, document_id: String, environment_id: String, session_token: String): EventData = {
    val __obj = js.Dynamic.literal(collection_id = collection_id.asInstanceOf[js.Any], document_id = document_id.asInstanceOf[js.Any], environment_id = environment_id.asInstanceOf[js.Any], session_token = session_token.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventData]
  }
  
  @scala.inline
  implicit class EventDataOps[Self <: EventData] (val x: Self) extends AnyVal {
    
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
    def setCollection_id(value: String): Self = this.set("collection_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocument_id(value: String): Self = this.set("document_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironment_id(value: String): Self = this.set("environment_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession_token(value: String): Self = this.set("session_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClient_timestamp(value: String): Self = this.set("client_timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClient_timestamp: Self = this.set("client_timestamp", js.undefined)
    
    @scala.inline
    def setDisplay_rank(value: Double): Self = this.set("display_rank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplay_rank: Self = this.set("display_rank", js.undefined)
    
    @scala.inline
    def setQuery_id(value: String): Self = this.set("query_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery_id: Self = this.set("query_id", js.undefined)
  }
}
