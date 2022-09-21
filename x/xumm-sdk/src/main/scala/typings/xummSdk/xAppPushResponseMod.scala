package typings.xummSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xAppPushResponseMod {
  
  trait xAppPushResponse extends StObject {
    
    var pushed: Boolean
  }
  object xAppPushResponse {
    
    inline def apply(pushed: Boolean): xAppPushResponse = {
      val __obj = js.Dynamic.literal(pushed = pushed.asInstanceOf[js.Any])
      __obj.asInstanceOf[xAppPushResponse]
    }
    
    extension [Self <: xAppPushResponse](x: Self) {
      
      inline def setPushed(value: Boolean): Self = StObject.set(x, "pushed", value.asInstanceOf[js.Any])
    }
  }
}
