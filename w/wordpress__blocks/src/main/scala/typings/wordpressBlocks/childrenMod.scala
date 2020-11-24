package typings.wordpressBlocks

import typings.react.mod.ReactChild
import typings.std.ArrayLike
import typings.std.Node
import typings.std.ParentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/blocks/api/children", JSImport.Namespace)
@js.native
object childrenMod extends js.Object {
  
  @js.native
  object default extends js.Object {
    
    /**
      * Given two or more block nodes, returns a new block node representing a
      * concatenation of its values.
      *
      * @param blockNodes - Block nodes to concatenate.
      */
    def concat(blockNodes: ReactChild*): js.Array[ReactChild] = js.native
    
    /**
      * Given an iterable set of DOM nodes, returns equivalent block children.
      * Ignores any non-element/text nodes included in set.
      *
      * @param domNodes - list of DOM nodes to convert.
      */
    def fromDOM(domNodes: ArrayLike[Node]): js.Array[ReactChild] = js.native
    
    /**
      * Given block children, returns an array of block nodes.
      *
      * @param children - Block children object to convert.
      */
    def getChildrenArray(children: js.Array[ReactChild]): js.Array[ReactChild] = js.native
    
    /**
      * Given a selector, returns an hpq matcher generating a WPBlockChildren value
      * matching the selector result.
      *
      * @param selector - DOM selector.
      */
    def matcher(selector: String): js.Function1[/* domNode */ Node with ParentNode, js.Array[ReactChild]] = js.native
    
    /**
      * Given a block node, returns its HTML string representation.
      *
      * @param children - Block node(s) to convert to string.
      */
    def toHTML(children: js.Array[ReactChild]): String = js.native
  }
}
