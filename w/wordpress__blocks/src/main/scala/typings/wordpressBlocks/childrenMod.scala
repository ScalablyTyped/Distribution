package typings.wordpressBlocks

import typings.react.mod.ReactChild
import typings.std.ArrayLike
import typings.std.Node
import typings.std.ParentNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object childrenMod {
  
  object default {
    
    @JSImport("@wordpress/blocks/api/children", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Given two or more block nodes, returns a new block node representing a
      * concatenation of its values.
      *
      * @param blockNodes - Block nodes to concatenate.
      */
    inline def concat(blockNodes: ReactChild*): js.Array[ReactChild] = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(blockNodes.asInstanceOf[js.Any]).asInstanceOf[js.Array[ReactChild]]
    
    /**
      * Given an iterable set of DOM nodes, returns equivalent block children.
      * Ignores any non-element/text nodes included in set.
      *
      * @param domNodes - list of DOM nodes to convert.
      */
    inline def fromDOM(domNodes: ArrayLike[Node]): js.Array[ReactChild] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDOM")(domNodes.asInstanceOf[js.Any]).asInstanceOf[js.Array[ReactChild]]
    
    /**
      * Given block children, returns an array of block nodes.
      *
      * @param children - Block children object to convert.
      */
    inline def getChildrenArray(children: js.Array[ReactChild]): js.Array[ReactChild] = ^.asInstanceOf[js.Dynamic].applyDynamic("getChildrenArray")(children.asInstanceOf[js.Any]).asInstanceOf[js.Array[ReactChild]]
    
    /**
      * Given a selector, returns an hpq matcher generating a WPBlockChildren value
      * matching the selector result.
      *
      * @param selector - DOM selector.
      */
    inline def matcher(selector: String): js.Function1[/* domNode */ Node & ParentNode, js.Array[ReactChild]] = ^.asInstanceOf[js.Dynamic].applyDynamic("matcher")(selector.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* domNode */ Node & ParentNode, js.Array[ReactChild]]]
    
    /**
      * Given a block node, returns its HTML string representation.
      *
      * @param children - Block node(s) to convert to string.
      */
    inline def toHTML(children: js.Array[ReactChild]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toHTML")(children.asInstanceOf[js.Any]).asInstanceOf[String]
  }
}
