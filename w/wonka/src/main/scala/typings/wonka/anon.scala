package typings.wonka

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Unsubscribe extends StObject {
    
    def unsubscribe(): Unit
  }
  object Unsubscribe {
    
    inline def apply(unsubscribe: () => Unit): Unsubscribe = {
      val __obj = js.Dynamic.literal(unsubscribe = js.Any.fromFunction0(unsubscribe))
      __obj.asInstanceOf[Unsubscribe]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Unsubscribe] (val x: Self) extends AnyVal {
      
      inline def setUnsubscribe(value: () => Unit): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction0(value))
    }
  }
}
