package typings.`type`

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AllowString extends StObject {
    
    var allowString: js.UndefOr[Boolean] = js.undefined
  }
  object AllowString {
    
    inline def apply(): AllowString = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AllowString]
    }
    
    extension [Self <: AllowString](x: Self) {
      
      inline def setAllowString(value: Boolean): Self = StObject.set(x, "allowString", value.asInstanceOf[js.Any])
      
      inline def setAllowStringUndefined: Self = StObject.set(x, "allowString", js.undefined)
    }
  }
  
  trait DenyEmpty extends StObject {
    
    var allowString: js.UndefOr[Boolean] = js.undefined
    
    var denyEmpty: js.UndefOr[Boolean] = js.undefined
  }
  object DenyEmpty {
    
    inline def apply(): DenyEmpty = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DenyEmpty]
    }
    
    extension [Self <: DenyEmpty](x: Self) {
      
      inline def setAllowString(value: Boolean): Self = StObject.set(x, "allowString", value.asInstanceOf[js.Any])
      
      inline def setAllowStringUndefined: Self = StObject.set(x, "allowString", js.undefined)
      
      inline def setDenyEmpty(value: Boolean): Self = StObject.set(x, "denyEmpty", value.asInstanceOf[js.Any])
      
      inline def setDenyEmptyUndefined: Self = StObject.set(x, "denyEmpty", js.undefined)
    }
  }
}
