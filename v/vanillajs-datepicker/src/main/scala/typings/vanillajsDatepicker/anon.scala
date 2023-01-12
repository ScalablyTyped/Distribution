package typings.vanillajsDatepicker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Clear extends StObject {
    
    var clear: Boolean
    
    var render: Boolean
  }
  object Clear {
    
    inline def apply(clear: Boolean, render: Boolean): Clear = {
      val __obj = js.Dynamic.literal(clear = clear.asInstanceOf[js.Any], render = render.asInstanceOf[js.Any])
      __obj.asInstanceOf[Clear]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Clear] (val x: Self) extends AnyVal {
      
      inline def setClear(value: Boolean): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
      
      inline def setRender(value: Boolean): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
    }
  }
}
