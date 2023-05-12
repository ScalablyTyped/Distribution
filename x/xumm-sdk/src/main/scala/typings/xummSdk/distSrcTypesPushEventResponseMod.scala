package typings.xummSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesPushEventResponseMod {
  
  trait EventResponse extends StObject {
    
    var pushed: Boolean
    
    var uuid: String
  }
  object EventResponse {
    
    inline def apply(pushed: Boolean, uuid: String): EventResponse = {
      val __obj = js.Dynamic.literal(pushed = pushed.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventResponse] (val x: Self) extends AnyVal {
      
      inline def setPushed(value: Boolean): Self = StObject.set(x, "pushed", value.asInstanceOf[js.Any])
      
      inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    }
  }
}
