package typings.voximplantWebsdk.mod.IMEventTypes

import typings.voximplantWebsdk.mod.VoxImplantIMEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *    Event dispatched if error happened during instant message modification
  */
trait MessageNotModified
  extends StObject
     with VoxImplantIMEvent {
  
  /**
    *    Message new content
    */
  var code: Double
  
  /**
    *    Message id
    */
  var message_id: String
  
  /**
    *    User id (of the user to whom the message was sent)
    */
  var to: String
}
object MessageNotModified {
  
  inline def apply(code: Double, message_id: String, to: String): MessageNotModified = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message_id = message_id.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageNotModified]
  }
  
  extension [Self <: MessageNotModified](x: Self) {
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setMessage_id(value: String): Self = StObject.set(x, "message_id", value.asInstanceOf[js.Any])
    
    inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
