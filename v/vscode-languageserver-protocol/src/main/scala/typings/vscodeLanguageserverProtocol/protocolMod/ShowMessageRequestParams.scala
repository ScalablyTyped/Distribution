package typings.vscodeLanguageserverProtocol.protocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShowMessageRequestParams extends StObject {
  
  /**
    * The message action items to present.
    */
  var actions: js.UndefOr[js.Array[MessageActionItem]] = js.native
  
  /**
    * The actual message
    */
  var message: String = js.native
  
  /**
    * The message type. See {@link MessageType}
    */
  var `type`: MessageType = js.native
}
object ShowMessageRequestParams {
  
  @scala.inline
  def apply(message: String, `type`: MessageType): ShowMessageRequestParams = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowMessageRequestParams]
  }
  
  @scala.inline
  implicit class ShowMessageRequestParamsMutableBuilder[Self <: ShowMessageRequestParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActions(value: js.Array[MessageActionItem]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    @scala.inline
    def setActionsVarargs(value: MessageActionItem*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: MessageType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
