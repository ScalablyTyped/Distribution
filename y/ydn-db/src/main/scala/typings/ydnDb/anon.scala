package typings.ydnDb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Push extends StObject {
    
    def push(value: js.Any): Unit
  }
  object Push {
    
    inline def apply(push: js.Any => Unit): Push = {
      val __obj = js.Dynamic.literal(push = js.Any.fromFunction1(push))
      __obj.asInstanceOf[Push]
    }
    
    extension [Self <: Push](x: Self) {
      
      inline def setPush(value: js.Any => Unit): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
    }
  }
}
