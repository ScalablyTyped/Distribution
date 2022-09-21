package typings.twilsock.mod.Messages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Close
  extends StObject
     with AbstractMessage {
  
  val method: MessageType
}
object Close {
  
  inline def apply(id: String, method: MessageType): Close = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[Close]
  }
  
  extension [Self <: Close](x: Self) {
    
    inline def setMethod(value: MessageType): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
  }
}
