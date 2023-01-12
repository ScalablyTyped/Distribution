package typings.xummSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesXAppXAppPushResponseMod {
  
  trait xAppPushResponse extends StObject {
    
    var pushed: Boolean
  }
  object xAppPushResponse {
    
    inline def apply(pushed: Boolean): xAppPushResponse = {
      val __obj = js.Dynamic.literal(pushed = pushed.asInstanceOf[js.Any])
      __obj.asInstanceOf[xAppPushResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: xAppPushResponse] (val x: Self) extends AnyVal {
      
      inline def setPushed(value: Boolean): Self = StObject.set(x, "pushed", value.asInstanceOf[js.Any])
    }
  }
}
