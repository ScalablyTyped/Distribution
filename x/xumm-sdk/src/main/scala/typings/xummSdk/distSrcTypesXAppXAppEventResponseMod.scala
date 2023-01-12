package typings.xummSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesXAppXAppEventResponseMod {
  
  trait xAppEventResponse extends StObject {
    
    var pushed: Boolean
    
    var uuid: String
  }
  object xAppEventResponse {
    
    inline def apply(pushed: Boolean, uuid: String): xAppEventResponse = {
      val __obj = js.Dynamic.literal(pushed = pushed.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[xAppEventResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: xAppEventResponse] (val x: Self) extends AnyVal {
      
      inline def setPushed(value: Boolean): Self = StObject.set(x, "pushed", value.asInstanceOf[js.Any])
      
      inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    }
  }
}
