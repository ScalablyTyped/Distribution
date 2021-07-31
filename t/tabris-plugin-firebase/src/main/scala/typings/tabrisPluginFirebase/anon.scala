package typings.tabrisPluginFirebase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ClearAll extends StObject {
    
    def clearAll(): Unit
    
    def getAll(): js.Array[js.Object]
  }
  object ClearAll {
    
    @scala.inline
    def apply(clearAll: () => Unit, getAll: () => js.Array[js.Object]): ClearAll = {
      val __obj = js.Dynamic.literal(clearAll = js.Any.fromFunction0(clearAll), getAll = js.Any.fromFunction0(getAll))
      __obj.asInstanceOf[ClearAll]
    }
    
    @scala.inline
    implicit class ClearAllMutableBuilder[Self <: ClearAll] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClearAll(value: () => Unit): Self = StObject.set(x, "clearAll", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetAll(value: () => js.Array[js.Object]): Self = StObject.set(x, "getAll", js.Any.fromFunction0(value))
    }
  }
}
