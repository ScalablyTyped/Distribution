package typings.tabris

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessagePortEventMap extends StObject {
  
  var message: MessageEvent
}
object MessagePortEventMap {
  
  inline def apply(message: MessageEvent): MessagePortEventMap = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagePortEventMap]
  }
  
  extension [Self <: MessagePortEventMap](x: Self) {
    
    inline def setMessage(value: MessageEvent): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
