package typings.xpath.xpathMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Node
import typings.std.XPathNSResolver
import typings.std.XPathResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xpath", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var select: XPathSelect = js.native
  def evaluate(
    expression: String,
    contextNode: Node,
    resolver: XPathNSResolver,
    `type`: Double,
    result: XPathResult
  ): XPathResult = js.native
  def select1(expression: String): SelectedValue = js.native
  def select1(expression: String, node: Node): SelectedValue = js.native
  def useNamespaces(namespaceMap: StringDictionary[String]): XPathSelect = js.native
}

