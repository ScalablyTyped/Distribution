package typings.voximplantWebsdk.mod.IMEventTypes

import typings.voximplantWebsdk.mod.UserStatuses
import typings.voximplantWebsdk.mod.VoxImplantIMEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *    Event dispatched when self presence updated
  */
@js.native
trait PresenceUpdate extends VoxImplantIMEvent {
  
  /**
    * User id
    */
  var id: String = js.native
  
  /**
    *    Status message
    */
  var message: String = js.native
  
  /**
    *    Current presence status
    */
  var presence: UserStatuses = js.native
  
  /**
    *    Resource name
    */
  var resource: js.UndefOr[String] = js.native
}
object PresenceUpdate {
  
  @scala.inline
  def apply(id: String, message: String, presence: UserStatuses): PresenceUpdate = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], presence = presence.asInstanceOf[js.Any])
    __obj.asInstanceOf[PresenceUpdate]
  }
  
  @scala.inline
  implicit class PresenceUpdateMutableBuilder[Self <: PresenceUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPresence(value: UserStatuses): Self = StObject.set(x, "presence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}
