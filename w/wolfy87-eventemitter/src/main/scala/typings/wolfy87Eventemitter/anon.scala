package typings.wolfy87Eventemitter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Listener extends StObject {
    
    var listener: js.Function
  }
  object Listener {
    
    inline def apply(listener: js.Function): Listener = {
      val __obj = js.Dynamic.literal(listener = listener.asInstanceOf[js.Any])
      __obj.asInstanceOf[Listener]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Listener] (val x: Self) extends AnyVal {
      
      inline def setListener(value: js.Function): Self = StObject.set(x, "listener", value.asInstanceOf[js.Any])
    }
  }
}
