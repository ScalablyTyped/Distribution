package typings.xpath

import org.scalablytyped.runtime.StringDictionary
import typings.std.Attr
import typings.std.Node
import typings.std.XPathNSResolver
import typings.std.XPathResult
import typings.xpath.xpathBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("xpath", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("xpath", "evaluate")
  @js.native
  def evaluate(
    expression: String,
    contextNode: Node,
    resolver: XPathNSResolver,
    `type`: Double,
    result: XPathResult
  ): XPathResult = js.native
  
  @JSImport("xpath", "select")
  @js.native
  def select: XPathSelect = js.native
  
  @JSImport("xpath", "select1")
  @js.native
  def select1(expression: String): SelectedValue = js.native
  @JSImport("xpath", "select1")
  @js.native
  def select1(expression: String, node: Node): SelectedValue = js.native
  
  @scala.inline
  def select_=(x: XPathSelect): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("select")(x.asInstanceOf[js.Any])
  
  @JSImport("xpath", "useNamespaces")
  @js.native
  def useNamespaces(namespaceMap: StringDictionary[String]): XPathSelect = js.native
  
  type SelectedValue = Node | Attr | String | Double | Boolean
  
  @js.native
  trait XPathSelect extends StObject {
    
    def apply(expression: String): js.Array[SelectedValue] = js.native
    def apply(expression: String, node: Node): js.Array[SelectedValue] = js.native
    def apply(expression: String, node: Node, single: `true`): SelectedValue = js.native
  }
}
