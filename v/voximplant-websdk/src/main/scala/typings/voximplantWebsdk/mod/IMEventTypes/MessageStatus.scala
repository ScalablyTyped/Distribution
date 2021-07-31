package typings.voximplantWebsdk.mod.IMEventTypes

import typings.voximplantWebsdk.mod.MessageEventType
import typings.voximplantWebsdk.mod.VoxImplantIMEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *    Event dispatched when sent message status changed
  */
trait MessageStatus
  extends StObject
     with VoxImplantIMEvent {
  
  /**
    *    User id
    */
  var id: String
  
  /**
    *    Message id
    */
  var message_id: String
  
  /**
    *    Resource name
    */
  var resource: js.UndefOr[String] = js.undefined
  
  /**
    *    Message event type. See VoxImplant.MessageEventType enum
    */
  var `type`: MessageEventType
}
object MessageStatus {
  
  @scala.inline
  def apply(id: String, message_id: String, `type`: MessageEventType): MessageStatus = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], message_id = message_id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageStatus]
  }
  
  @scala.inline
  implicit class MessageStatusMutableBuilder[Self <: MessageStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage_id(value: String): Self = StObject.set(x, "message_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    @scala.inline
    def setType(value: MessageEventType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
