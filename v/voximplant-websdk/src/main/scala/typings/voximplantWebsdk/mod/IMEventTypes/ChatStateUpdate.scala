package typings.voximplantWebsdk.mod.IMEventTypes

import typings.voximplantWebsdk.mod.ChatStateType
import typings.voximplantWebsdk.mod.VoxImplantIMEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *    Event dispatched when chat session state updated
  */
@js.native
trait ChatStateUpdate extends VoxImplantIMEvent {
  
  /**
    *    User id
    */
  var id: String = js.native
  
  /**
    *    Resource name
    */
  var resource: js.UndefOr[String] = js.native
  
  /**
    *    Current chat session state. See VoxImplant.ChatStateType enum
    */
  var state: ChatStateType = js.native
}
object ChatStateUpdate {
  
  @scala.inline
  def apply(id: String, state: ChatStateType): ChatStateUpdate = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatStateUpdate]
  }
  
  @scala.inline
  implicit class ChatStateUpdateMutableBuilder[Self <: ChatStateUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    @scala.inline
    def setState(value: ChatStateType): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
