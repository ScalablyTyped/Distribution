package typings.typedQuerySelector

import typings.std.NodeListOf
import typings.typedQuerySelector.parserMod.ParseSelector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object global {
    
    trait Element extends StObject {
      
      def closest[S /* <: String */](selector: S): (ParseSelector[S, typings.typedQuerySelector.strictMod.global.Element]) | Null
    }
    object Element {
      
      inline def apply(closest: Any => (ParseSelector[Any, typings.typedQuerySelector.strictMod.global.Element]) | Null): Element = {
        val __obj = js.Dynamic.literal(closest = js.Any.fromFunction1(closest))
        __obj.asInstanceOf[Element]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Element] (val x: Self) extends AnyVal {
        
        inline def setClosest(value: Any => (ParseSelector[Any, typings.typedQuerySelector.strictMod.global.Element]) | Null): Self = StObject.set(x, "closest", js.Any.fromFunction1(value))
      }
    }
    
    trait ParentNode extends StObject {
      
      def querySelector[S /* <: String */](selector: S): (ParseSelector[S, typings.typedQuerySelector.strictMod.global.Element]) | Null
      
      def querySelectorAll[S /* <: String */](selector: S): NodeListOf[ParseSelector[S, typings.typedQuerySelector.strictMod.global.Element]]
    }
    object ParentNode {
      
      inline def apply(
        querySelector: Any => (ParseSelector[Any, typings.typedQuerySelector.strictMod.global.Element]) | Null,
        querySelectorAll: Any => NodeListOf[ParseSelector[Any, typings.typedQuerySelector.strictMod.global.Element]]
      ): ParentNode = {
        val __obj = js.Dynamic.literal(querySelector = js.Any.fromFunction1(querySelector), querySelectorAll = js.Any.fromFunction1(querySelectorAll))
        __obj.asInstanceOf[ParentNode]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ParentNode] (val x: Self) extends AnyVal {
        
        inline def setQuerySelector(value: Any => (ParseSelector[Any, typings.typedQuerySelector.strictMod.global.Element]) | Null): Self = StObject.set(x, "querySelector", js.Any.fromFunction1(value))
        
        inline def setQuerySelectorAll(value: Any => NodeListOf[ParseSelector[Any, typings.typedQuerySelector.strictMod.global.Element]]): Self = StObject.set(x, "querySelectorAll", js.Any.fromFunction1(value))
      }
    }
  }
}
