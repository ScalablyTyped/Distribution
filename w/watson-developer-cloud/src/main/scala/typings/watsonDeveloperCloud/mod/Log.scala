package typings.watsonDeveloperCloud.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Log. */
@js.native
trait Log extends StObject {
  
  /** The language of the workspace where the message request was made. */
  var language: String = js.native
  
  /** A unique identifier for the logged event. */
  var log_id: String = js.native
  
  /** A request sent to the workspace, including the user input and context. */
  var request: MessageRequest = js.native
  
  /** The timestamp for receipt of the message. */
  var request_timestamp: String = js.native
  
  /** The response sent by the workspace, including the output text, detected intents and entities, and context. */
  var response: MessageResponse = js.native
  
  /** The timestamp for the system response to the message. */
  var response_timestamp: String = js.native
  
  /** The unique identifier of the workspace where the request was made. */
  var workspace_id: String = js.native
}
object Log {
  
  @scala.inline
  def apply(
    language: String,
    log_id: String,
    request: MessageRequest,
    request_timestamp: String,
    response: MessageResponse,
    response_timestamp: String,
    workspace_id: String
  ): Log = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], log_id = log_id.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], request_timestamp = request_timestamp.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], response_timestamp = response_timestamp.asInstanceOf[js.Any], workspace_id = workspace_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Log]
  }
  
  @scala.inline
  implicit class LogMutableBuilder[Self <: Log] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLog_id(value: String): Self = StObject.set(x, "log_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: MessageRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest_timestamp(value: String): Self = StObject.set(x, "request_timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: MessageResponse): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse_timestamp(value: String): Self = StObject.set(x, "response_timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkspace_id(value: String): Self = StObject.set(x, "workspace_id", value.asInstanceOf[js.Any])
  }
}
