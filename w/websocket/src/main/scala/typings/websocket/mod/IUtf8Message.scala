package typings.websocket.mod

import typings.websocket.websocketStrings.utf8
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IUtf8Message
  extends StObject
     with Message {
  
  var `type`: utf8
  
  var utf8Data: String
}
object IUtf8Message {
  
  inline def apply(utf8Data: String): IUtf8Message = {
    val __obj = js.Dynamic.literal(utf8Data = utf8Data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("utf8")
    __obj.asInstanceOf[IUtf8Message]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IUtf8Message] (val x: Self) extends AnyVal {
    
    inline def setType(value: utf8): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUtf8Data(value: String): Self = StObject.set(x, "utf8Data", value.asInstanceOf[js.Any])
  }
}
