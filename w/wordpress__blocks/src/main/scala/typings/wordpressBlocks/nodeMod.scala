package typings.wordpressBlocks

import typings.react.mod.ReactChild
import typings.react.mod.global.JSX.Element
import typings.std.Node
import typings.std.ParentNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeMod {
  
  /**
    * Object of utility functions used in managing block attribute values of
    * source `node`.
    *
    * @see https://github.com/WordPress/gutenberg/pull/10439
    *
    * @deprecated since 4.0. The `node` source should not be used, and can be
    *             replaced by the `html` source.
    */
  object default {
    
    @JSImport("@wordpress/blocks/api/node", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Given a DOM Element or Text node, returns an equivalent block node. Throws
      * if passed any node type other than element or text.
      *
      * @throws {TypeError} If non-element/text node is passed.
      *
      * @param domNode - DOM node to convert.
      */
    inline def fromDOM(domNode: Node): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDOM")(domNode.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    /**
      * Given a single node and a node type (e.g. `'br'`), returns `true` if the node
      * corresponds to that type, `false` otherwise.
      *
      * @param node - Block node to test
      * @param type - Node to type to test against.
      */
    inline def isNodeOfType_type(
      node: Element,
      `type`: /* import warning: importer.ImportType#apply Failed type conversion: react.react.ReactElement['type'] */ js.Any
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNodeOfType")(node.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Given a selector, returns an hpq matcher generating a WPBlockChildren value
      * matching the selector result.
      *
      * @param selector - DOM selector.
      */
    /* was `typeof children.matcher` */
    inline def matcher(selector: String): js.Function1[/* domNode */ Node & ParentNode, js.Array[ReactChild]] = ^.asInstanceOf[js.Dynamic].applyDynamic("matcher")(selector.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* domNode */ Node & ParentNode, js.Array[ReactChild]]]
    
    /**
      * Given a block node, returns its HTML string representation.
      *
      * @param node - Block node to convert to string.
      */
    inline def toHTML(node: ReactChild): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toHTML")(node.asInstanceOf[js.Any]).asInstanceOf[String]
  }
}
