package typings.vueChartkick

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Adapter extends StObject {
    
    var adapter: js.Any
  }
  object Adapter {
    
    inline def apply(adapter: js.Any): Adapter = {
      val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any])
      __obj.asInstanceOf[Adapter]
    }
    
    extension [Self <: Adapter](x: Self) {
      
      inline def setAdapter(value: js.Any): Self = StObject.set(x, "adapter", value.asInstanceOf[js.Any])
    }
  }
}
