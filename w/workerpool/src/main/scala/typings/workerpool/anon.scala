package typings.workerpool

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait On extends StObject {
    
    def on(payload: Any): Unit
  }
  object On {
    
    inline def apply(on: Any => Unit): On = {
      val __obj = js.Dynamic.literal(on = js.Any.fromFunction1(on))
      __obj.asInstanceOf[On]
    }
    
    extension [Self <: On](x: Self) {
      
      inline def setOn(value: Any => Unit): Self = StObject.set(x, "on", js.Any.fromFunction1(value))
    }
  }
}
