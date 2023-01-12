package typings.whatwgMimetype

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ProhibitParameters extends StObject {
    
    var prohibitParameters: js.UndefOr[Boolean] = js.undefined
  }
  object ProhibitParameters {
    
    inline def apply(): ProhibitParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProhibitParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProhibitParameters] (val x: Self) extends AnyVal {
      
      inline def setProhibitParameters(value: Boolean): Self = StObject.set(x, "prohibitParameters", value.asInstanceOf[js.Any])
      
      inline def setProhibitParametersUndefined: Self = StObject.set(x, "prohibitParameters", js.undefined)
    }
  }
}
