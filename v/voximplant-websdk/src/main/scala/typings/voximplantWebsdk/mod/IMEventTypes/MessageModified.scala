package typings.voximplantWebsdk.mod.IMEventTypes

import typings.voximplantWebsdk.mod.VoxImplantIMEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *    Event dispatched when instant message was modified by user
  */
trait MessageModified
  extends StObject
     with VoxImplantIMEvent {
  
  /**
    *    Message new content
    */
  var content: String
  
  /**
    *    User id (of the user who sent the message)
    */
  var id: String
  
  /**
    *    Message id
    */
  var message_id: String
  
  /**
    *    User id (of the user to whom the message was sent)
    */
  var to: String
}
object MessageModified {
  
  inline def apply(content: String, id: String, message_id: String, to: String): MessageModified = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], message_id = message_id.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageModified]
  }
  
  extension [Self <: MessageModified](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMessage_id(value: String): Self = StObject.set(x, "message_id", value.asInstanceOf[js.Any])
    
    inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
