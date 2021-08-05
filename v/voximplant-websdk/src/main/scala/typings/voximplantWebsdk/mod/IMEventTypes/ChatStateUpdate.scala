package typings.voximplantWebsdk.mod.IMEventTypes

import typings.voximplantWebsdk.mod.ChatStateType
import typings.voximplantWebsdk.mod.VoxImplantIMEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *    Event dispatched when chat session state updated
  */
trait ChatStateUpdate
  extends StObject
     with VoxImplantIMEvent {
  
  /**
    *    User id
    */
  var id: String
  
  /**
    *    Resource name
    */
  var resource: js.UndefOr[String] = js.undefined
  
  /**
    *    Current chat session state. See VoxImplant.ChatStateType enum
    */
  var state: ChatStateType
}
object ChatStateUpdate {
  
  inline def apply(id: String, state: ChatStateType): ChatStateUpdate = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatStateUpdate]
  }
  
  extension [Self <: ChatStateUpdate](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setState(value: ChatStateType): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
