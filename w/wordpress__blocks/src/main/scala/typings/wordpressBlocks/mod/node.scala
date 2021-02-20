package typings.wordpressBlocks.mod

import typings.react.mod.ReactChild
import typings.react.mod.global.JSX.Element
import typings.std.Node
import typings.std.ParentNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Object of utility functions used in managing block attribute values of
  * source `node`.
  *
  * @see https://github.com/WordPress/gutenberg/pull/10439
  *
  * @deprecated since 4.0. The `node` source should not be used, and can be
  *             replaced by the `html` source.
  */
object node {
  
  /**
    * Given a DOM Element or Text node, returns an equivalent block node. Throws
    * if passed any node type other than element or text.
    *
    * @throws {TypeError} If non-element/text node is passed.
    *
    * @param domNode - DOM node to convert.
    */
  @JSImport("@wordpress/blocks", "node.fromDOM")
  @js.native
  def fromDOM(domNode: Node): Element = js.native
  
  /**
    * Given a single node and a node type (e.g. `'br'`), returns `true` if the node
    * corresponds to that type, `false` otherwise.
    *
    * @param node - Block node to test
    * @param type - Node to type to test against.
    */
  @JSImport("@wordpress/blocks", "node.isNodeOfType")
  @js.native
  def isNodeOfType_type(
    node: Element,
    `type`: /* import warning: importer.ImportType#apply Failed type conversion: react.react.ReactElement['type'] */ js.Any
  ): Boolean = js.native
  
  /**
    * Given a selector, returns an hpq matcher generating a WPBlockChildren value
    * matching the selector result.
    *
    * @param selector - DOM selector.
    */
  /* was `typeof children.matcher` */
  @JSImport("@wordpress/blocks", "node.matcher")
  @js.native
  def matcher(selector: String): js.Function1[/* domNode */ Node with ParentNode, js.Array[ReactChild]] = js.native
  
  /**
    * Given a block node, returns its HTML string representation.
    *
    * @param node - Block node to convert to string.
    */
  @JSImport("@wordpress/blocks", "node.toHTML")
  @js.native
  def toHTML(node: ReactChild): String = js.native
}
