package typings.voximplantWebsdk.mod.IMEventTypes

import typings.voximplantWebsdk.mod.UserStatuses
import typings.voximplantWebsdk.mod.VoxImplantIMEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *    Event dispatched when self presence updated
  */
trait PresenceUpdate
  extends StObject
     with VoxImplantIMEvent {
  
  /**
    * User id
    */
  var id: String
  
  /**
    *    Status message
    */
  var message: String
  
  /**
    *    Current presence status
    */
  var presence: UserStatuses
  
  /**
    *    Resource name
    */
  var resource: js.UndefOr[String] = js.undefined
}
object PresenceUpdate {
  
  inline def apply(id: String, message: String, presence: UserStatuses): PresenceUpdate = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], presence = presence.asInstanceOf[js.Any])
    __obj.asInstanceOf[PresenceUpdate]
  }
  
  extension [Self <: PresenceUpdate](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setPresence(value: UserStatuses): Self = StObject.set(x, "presence", value.asInstanceOf[js.Any])
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}
