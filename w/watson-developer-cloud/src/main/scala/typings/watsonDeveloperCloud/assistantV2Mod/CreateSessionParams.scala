package typings.watsonDeveloperCloud.assistantV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*************************
  * request interfaces
  ************************/
/** Parameters for the `createSession` operation. */
trait CreateSessionParams extends StObject {
  
  /** Unique identifier of the assistant. You can find the assistant ID of an assistant on the **Assistants** tab of the Watson Assistant tool. For information about creating assistants, see the [documentation](https://console.bluemix.net/docs/services/assistant/assistant-add.html#assistant-add-task). **Note:** Currently, the v2 API does not support creating assistants. */
  var assistant_id: String
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  var return_response: js.UndefOr[Boolean] = js.undefined
}
object CreateSessionParams {
  
  inline def apply(assistant_id: String): CreateSessionParams = {
    val __obj = js.Dynamic.literal(assistant_id = assistant_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSessionParams]
  }
  
  extension [Self <: CreateSessionParams](x: Self) {
    
    inline def setAssistant_id(value: String): Self = StObject.set(x, "assistant_id", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    inline def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
  }
}
