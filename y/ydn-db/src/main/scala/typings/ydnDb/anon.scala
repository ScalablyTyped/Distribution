package typings.ydnDb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Push extends StObject {
    
    def push(value: Any): Unit
  }
  object Push {
    
    inline def apply(push: Any => Unit): Push = {
      val __obj = js.Dynamic.literal(push = js.Any.fromFunction1(push))
      __obj.asInstanceOf[Push]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Push] (val x: Self) extends AnyVal {
      
      inline def setPush(value: Any => Unit): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
    }
  }
}
