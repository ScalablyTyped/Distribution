package typings.xpath

import org.scalablytyped.runtime.StringDictionary
import typings.std.Attr
import typings.std.Node
import typings.std.XPathNSResolver
import typings.std.XPathResult
import typings.xpath.xpathBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("xpath", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def evaluate(expression: String, contextNode: Node, resolver: Null, `type`: Double): XPathResult = (^.asInstanceOf[js.Dynamic].applyDynamic("evaluate")(expression.asInstanceOf[js.Any], contextNode.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[XPathResult]
  inline def evaluate(expression: String, contextNode: Node, resolver: Null, `type`: Double, result: XPathResult): XPathResult = (^.asInstanceOf[js.Dynamic].applyDynamic("evaluate")(expression.asInstanceOf[js.Any], contextNode.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[XPathResult]
  inline def evaluate(expression: String, contextNode: Node, resolver: XPathNSResolver, `type`: Double): XPathResult = (^.asInstanceOf[js.Dynamic].applyDynamic("evaluate")(expression.asInstanceOf[js.Any], contextNode.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[XPathResult]
  inline def evaluate(
    expression: String,
    contextNode: Node,
    resolver: XPathNSResolver,
    `type`: Double,
    result: XPathResult
  ): XPathResult = (^.asInstanceOf[js.Dynamic].applyDynamic("evaluate")(expression.asInstanceOf[js.Any], contextNode.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[XPathResult]
  
  @JSImport("xpath", "select")
  @js.native
  def select: XPathSelect = js.native
  
  inline def select1(expression: String): js.UndefOr[SelectedValue] = ^.asInstanceOf[js.Dynamic].applyDynamic("select1")(expression.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[SelectedValue]]
  inline def select1(expression: String, node: Node): js.UndefOr[SelectedValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("select1")(expression.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[SelectedValue]]
  
  inline def select_=(x: XPathSelect): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("select")(x.asInstanceOf[js.Any])
  
  inline def useNamespaces(namespaceMap: StringDictionary[String]): XPathSelect = ^.asInstanceOf[js.Dynamic].applyDynamic("useNamespaces")(namespaceMap.asInstanceOf[js.Any]).asInstanceOf[XPathSelect]
  
  type SelectedValue = Node | Attr | String | Double | Boolean
  
  @js.native
  trait XPathSelect extends StObject {
    
    def apply(expression: String): js.Array[SelectedValue] = js.native
    def apply(expression: String, node: Node): js.Array[SelectedValue] = js.native
    def apply(expression: String, node: Node, single: `true`): js.UndefOr[SelectedValue] = js.native
  }
}
