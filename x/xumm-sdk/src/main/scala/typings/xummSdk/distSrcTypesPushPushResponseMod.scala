package typings.xummSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesPushPushResponseMod {
  
  trait PushResponse extends StObject {
    
    var pushed: Boolean
  }
  object PushResponse {
    
    inline def apply(pushed: Boolean): PushResponse = {
      val __obj = js.Dynamic.literal(pushed = pushed.asInstanceOf[js.Any])
      __obj.asInstanceOf[PushResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PushResponse] (val x: Self) extends AnyVal {
      
      inline def setPushed(value: Boolean): Self = StObject.set(x, "pushed", value.asInstanceOf[js.Any])
    }
  }
}
