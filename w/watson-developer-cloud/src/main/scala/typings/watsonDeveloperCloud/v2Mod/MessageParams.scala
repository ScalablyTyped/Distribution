package typings.watsonDeveloperCloud.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `message` operation. */
trait MessageParams extends StObject {
  
  /** Unique identifier of the assistant. You can find the assistant ID of an assistant on the **Assistants** tab of the Watson Assistant tool. For information about creating assistants, see the [documentation](https://console.bluemix.net/docs/services/assistant/assistant-add.html#assistant-add-task). **Note:** Currently, the v2 API does not support creating assistants. */
  var assistant_id: String
  
  /** State information for the conversation. The context is stored by the assistant on a per-session basis. You can use this property to set or modify context variables, which can also be accessed by dialog nodes. */
  var context: js.UndefOr[MessageContext] = js.undefined
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  /** An input object that includes the input text. */
  var input: js.UndefOr[MessageInput] = js.undefined
  
  var return_response: js.UndefOr[Boolean] = js.undefined
  
  /** Unique identifier of the session. */
  var session_id: String
}
object MessageParams {
  
  inline def apply(assistant_id: String, session_id: String): MessageParams = {
    val __obj = js.Dynamic.literal(assistant_id = assistant_id.asInstanceOf[js.Any], session_id = session_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageParams]
  }
  
  extension [Self <: MessageParams](x: Self) {
    
    inline def setAssistant_id(value: String): Self = StObject.set(x, "assistant_id", value.asInstanceOf[js.Any])
    
    inline def setContext(value: MessageContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setInput(value: MessageInput): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    inline def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
    
    inline def setSession_id(value: String): Self = StObject.set(x, "session_id", value.asInstanceOf[js.Any])
  }
}
