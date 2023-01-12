package typings.symbolTree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Filter[THIS, T /* <: js.Object */] extends StObject {
    
    def filter(`object`: T): Any
    
    var thisArg: THIS
  }
  object Filter {
    
    inline def apply[THIS, T /* <: js.Object */](filter: T => Any, thisArg: THIS): Filter[THIS, T] = {
      val __obj = js.Dynamic.literal(filter = js.Any.fromFunction1(filter), thisArg = thisArg.asInstanceOf[js.Any])
      __obj.asInstanceOf[Filter[THIS, T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Filter[?, ?], THIS, T /* <: js.Object */] (val x: Self & (Filter[THIS, T])) extends AnyVal {
      
      inline def setFilter(value: T => Any): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setThisArg(value: THIS): Self = StObject.set(x, "thisArg", value.asInstanceOf[js.Any])
    }
  }
}
