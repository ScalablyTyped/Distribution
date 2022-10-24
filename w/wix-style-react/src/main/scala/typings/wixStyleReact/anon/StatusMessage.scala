package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatusMessage extends StObject {
  
  var inputValue: String
  
  var statusMessage: Unit
  
  var validationType: String
}
object StatusMessage {
  
  inline def apply(inputValue: String, statusMessage: Unit, validationType: String): StatusMessage = {
    val __obj = js.Dynamic.literal(inputValue = inputValue.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any], validationType = validationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusMessage]
  }
  
  extension [Self <: StatusMessage](x: Self) {
    
    inline def setInputValue(value: String): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: Unit): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setValidationType(value: String): Self = StObject.set(x, "validationType", value.asInstanceOf[js.Any])
  }
}
