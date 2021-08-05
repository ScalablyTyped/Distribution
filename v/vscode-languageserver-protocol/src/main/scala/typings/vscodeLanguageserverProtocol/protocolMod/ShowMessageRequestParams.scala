package typings.vscodeLanguageserverProtocol.protocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShowMessageRequestParams extends StObject {
  
  /**
    * The message action items to present.
    */
  var actions: js.UndefOr[js.Array[MessageActionItem]] = js.undefined
  
  /**
    * The actual message
    */
  var message: String
  
  /**
    * The message type. See {@link MessageType}
    */
  var `type`: MessageType
}
object ShowMessageRequestParams {
  
  inline def apply(message: String, `type`: MessageType): ShowMessageRequestParams = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowMessageRequestParams]
  }
  
  extension [Self <: ShowMessageRequestParams](x: Self) {
    
    inline def setActions(value: js.Array[MessageActionItem]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setActionsVarargs(value: MessageActionItem*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setType(value: MessageType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
