package typings.symbolTree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Filter[THIS, T /* <: js.Object */] extends StObject {
    
    def filter(`object`: T): js.Any = js.native
    
    var thisArg: THIS = js.native
  }
  object Filter {
    
    @scala.inline
    def apply[THIS, T /* <: js.Object */](filter: T => js.Any, thisArg: THIS): Filter[THIS, T] = {
      val __obj = js.Dynamic.literal(filter = js.Any.fromFunction1(filter), thisArg = thisArg.asInstanceOf[js.Any])
      __obj.asInstanceOf[Filter[THIS, T]]
    }
    
    @scala.inline
    implicit class FilterMutableBuilder[Self <: Filter[_, _], THIS, T /* <: js.Object */] (val x: Self with (Filter[THIS, T])) extends AnyVal {
      
      @scala.inline
      def setFilter(value: T => js.Any): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setThisArg(value: THIS): Self = StObject.set(x, "thisArg", value.asInstanceOf[js.Any])
    }
  }
}
