package typings.whatwgMimetype

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AllowParameters extends StObject {
    
    var allowParameters: js.UndefOr[Boolean] = js.undefined
  }
  object AllowParameters {
    
    inline def apply(): AllowParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AllowParameters]
    }
    
    extension [Self <: AllowParameters](x: Self) {
      
      inline def setAllowParameters(value: Boolean): Self = StObject.set(x, "allowParameters", value.asInstanceOf[js.Any])
      
      inline def setAllowParametersUndefined: Self = StObject.set(x, "allowParameters", js.undefined)
    }
  }
}
