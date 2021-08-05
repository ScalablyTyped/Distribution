package typings.urlToolkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AlwaysNormalize extends StObject {
    
    var alwaysNormalize: js.UndefOr[Boolean] = js.undefined
  }
  object AlwaysNormalize {
    
    inline def apply(): AlwaysNormalize = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlwaysNormalize]
    }
    
    extension [Self <: AlwaysNormalize](x: Self) {
      
      inline def setAlwaysNormalize(value: Boolean): Self = StObject.set(x, "alwaysNormalize", value.asInstanceOf[js.Any])
      
      inline def setAlwaysNormalizeUndefined: Self = StObject.set(x, "alwaysNormalize", js.undefined)
    }
  }
}
