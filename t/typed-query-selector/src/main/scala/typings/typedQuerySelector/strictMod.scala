package typings.typedQuerySelector

import typings.typedQuerySelector.parserMod.StrictlyParseSelector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object strictMod {
  
  object global {
    
    trait Element extends StObject {
      
      def closest[S /* <: String */, E /* <: StrictlyParseSelector[S, Element] */](selector: S): /* import warning: importer.ImportType#apply Failed type conversion: [E] extends [never] ? never : E | null */ js.Any
    }
    object Element {
      
      inline def apply(
        closest: Any => /* import warning: importer.ImportType#apply Failed type conversion: [E] extends [never] ? never : E | null */ js.Any
      ): Element = {
        val __obj = js.Dynamic.literal(closest = js.Any.fromFunction1(closest))
        __obj.asInstanceOf[Element]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Element] (val x: Self) extends AnyVal {
        
        inline def setClosest(
          value: Any => /* import warning: importer.ImportType#apply Failed type conversion: [E] extends [never] ? never : E | null */ js.Any
        ): Self = StObject.set(x, "closest", js.Any.fromFunction1(value))
      }
    }
    
    trait ParentNode extends StObject {
      
      def querySelector[S /* <: String */, E /* <: StrictlyParseSelector[S, Element] */](selector: S): /* import warning: importer.ImportType#apply Failed type conversion: [E] extends [never] ? never : E | null */ js.Any
      
      def querySelectorAll[S /* <: String */, E /* <: StrictlyParseSelector[S, Element] */](selector: S): /* import warning: importer.ImportType#apply Failed type conversion: [E] extends [never] ? never : std.NodeListOf<E> */ js.Any
    }
    object ParentNode {
      
      inline def apply(
        querySelector: Any => /* import warning: importer.ImportType#apply Failed type conversion: [E] extends [never] ? never : E | null */ js.Any,
        querySelectorAll: Any => /* import warning: importer.ImportType#apply Failed type conversion: [E] extends [never] ? never : std.NodeListOf<E> */ js.Any
      ): ParentNode = {
        val __obj = js.Dynamic.literal(querySelector = js.Any.fromFunction1(querySelector), querySelectorAll = js.Any.fromFunction1(querySelectorAll))
        __obj.asInstanceOf[ParentNode]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ParentNode] (val x: Self) extends AnyVal {
        
        inline def setQuerySelector(
          value: Any => /* import warning: importer.ImportType#apply Failed type conversion: [E] extends [never] ? never : E | null */ js.Any
        ): Self = StObject.set(x, "querySelector", js.Any.fromFunction1(value))
        
        inline def setQuerySelectorAll(
          value: Any => /* import warning: importer.ImportType#apply Failed type conversion: [E] extends [never] ? never : std.NodeListOf<E> */ js.Any
        ): Self = StObject.set(x, "querySelectorAll", js.Any.fromFunction1(value))
      }
    }
  }
}
