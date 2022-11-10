package typings.webix.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfirmMessage extends StObject {
  
  var confirmMessage: String
  
  var edit: String
  
  var moreComments: String
  
  var placeholder: String
  
  var remove: String
  
  var send: String
}
object ConfirmMessage {
  
  inline def apply(
    confirmMessage: String,
    edit: String,
    moreComments: String,
    placeholder: String,
    remove: String,
    send: String
  ): ConfirmMessage = {
    val __obj = js.Dynamic.literal(confirmMessage = confirmMessage.asInstanceOf[js.Any], edit = edit.asInstanceOf[js.Any], moreComments = moreComments.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any], send = send.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfirmMessage]
  }
  
  extension [Self <: ConfirmMessage](x: Self) {
    
    inline def setConfirmMessage(value: String): Self = StObject.set(x, "confirmMessage", value.asInstanceOf[js.Any])
    
    inline def setEdit(value: String): Self = StObject.set(x, "edit", value.asInstanceOf[js.Any])
    
    inline def setMoreComments(value: String): Self = StObject.set(x, "moreComments", value.asInstanceOf[js.Any])
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setRemove(value: String): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
    
    inline def setSend(value: String): Self = StObject.set(x, "send", value.asInstanceOf[js.Any])
  }
}
