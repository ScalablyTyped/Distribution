package typings.watsonDeveloperCloud.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A response from the Watson Assistant service. */
trait MessageResponse extends StObject {
  
  /** State information for the conversation. The context is stored by the assistant on a per-session basis. You can use this property to access context variables. **Note:** The context is included in message responses only if **return_context**=`true` in the message request. */
  var context: js.UndefOr[MessageContext] = js.undefined
  
  /** Assistant output to be rendered or processed by the client. */
  var output: MessageOutput
}
object MessageResponse {
  
  inline def apply(output: MessageOutput): MessageResponse = {
    val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageResponse]
  }
  
  extension [Self <: MessageResponse](x: Self) {
    
    inline def setContext(value: MessageContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setOutput(value: MessageOutput): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
  }
}
