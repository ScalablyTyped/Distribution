package typings.webidl2js

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Get extends StObject {
    
    var get: String
    
    var set: String
  }
  object Get {
    
    inline def apply(get: String, set: String): Get = {
      val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any])
      __obj.asInstanceOf[Get]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Get] (val x: Self) extends AnyVal {
      
      inline def setGet(value: String): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
      
      inline def setSet(value: String): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
    }
  }
}
