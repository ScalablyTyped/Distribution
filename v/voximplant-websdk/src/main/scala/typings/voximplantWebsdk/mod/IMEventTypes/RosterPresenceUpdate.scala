package typings.voximplantWebsdk.mod.IMEventTypes

import typings.voximplantWebsdk.mod.UserStatuses
import typings.voximplantWebsdk.mod.VoxImplantIMEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *    Event dispatched when roster item presence update happened
  */
trait RosterPresenceUpdate
  extends StObject
     with VoxImplantIMEvent {
  
  /**
    *    User id
    */
  var id: String
  
  /**
    *    Status message
    */
  var message: js.UndefOr[String] = js.undefined
  
  /**
    *    Current presence status
    */
  var presence: UserStatuses
  
  /**
    *    Resource name
    */
  var resource: js.UndefOr[String] = js.undefined
}
object RosterPresenceUpdate {
  
  inline def apply(id: String, presence: UserStatuses): RosterPresenceUpdate = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], presence = presence.asInstanceOf[js.Any])
    __obj.asInstanceOf[RosterPresenceUpdate]
  }
  
  extension [Self <: RosterPresenceUpdate](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setPresence(value: UserStatuses): Self = StObject.set(x, "presence", value.asInstanceOf[js.Any])
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}
