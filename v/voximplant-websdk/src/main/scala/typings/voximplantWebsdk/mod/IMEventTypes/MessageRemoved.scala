package typings.voximplantWebsdk.mod.IMEventTypes

import typings.voximplantWebsdk.mod.VoxImplantIMEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *    Event dispatched when instant message was removed by user
  */
trait MessageRemoved
  extends StObject
     with VoxImplantIMEvent {
  
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
object MessageRemoved {
  
  inline def apply(id: String, message_id: String, to: String): MessageRemoved = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], message_id = message_id.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageRemoved]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MessageRemoved] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMessage_id(value: String): Self = StObject.set(x, "message_id", value.asInstanceOf[js.Any])
    
    inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
