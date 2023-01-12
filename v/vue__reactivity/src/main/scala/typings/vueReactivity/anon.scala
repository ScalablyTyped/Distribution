package typings.vueReactivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Get[T] extends StObject {
    
    def get(): T
    
    def set(value: T): Unit
  }
  object Get {
    
    inline def apply[T](get: () => T, set: T => Unit): Get[T] = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), set = js.Any.fromFunction1(set))
      __obj.asInstanceOf[Get[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Get[?], T] (val x: Self & Get[T]) extends AnyVal {
      
      inline def setGet(value: () => T): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
      
      inline def setSet(value: T => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait RawSymbol extends StObject
  
  @js.native
  trait ShallowReactiveMarker extends StObject
}
