package typings.wordpressViewport

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait TypeofimportedActions extends StObject {
    
    def setIsMatching(values: Record[String, Boolean]): Unit
  }
  object TypeofimportedActions {
    
    inline def apply(setIsMatching: Record[String, Boolean] => Unit): TypeofimportedActions = {
      val __obj = js.Dynamic.literal(setIsMatching = js.Any.fromFunction1(setIsMatching))
      __obj.asInstanceOf[TypeofimportedActions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypeofimportedActions] (val x: Self) extends AnyVal {
      
      inline def setSetIsMatching(value: Record[String, Boolean] => Unit): Self = StObject.set(x, "setIsMatching", js.Any.fromFunction1(value))
    }
  }
  
  trait TypeofimportedSelectors extends StObject {
    
    def isViewportMatch(query: String): Boolean
  }
  object TypeofimportedSelectors {
    
    inline def apply(isViewportMatch: String => Boolean): TypeofimportedSelectors = {
      val __obj = js.Dynamic.literal(isViewportMatch = js.Any.fromFunction1(isViewportMatch))
      __obj.asInstanceOf[TypeofimportedSelectors]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypeofimportedSelectors] (val x: Self) extends AnyVal {
      
      inline def setIsViewportMatch(value: String => Boolean): Self = StObject.set(x, "isViewportMatch", js.Any.fromFunction1(value))
    }
  }
}
