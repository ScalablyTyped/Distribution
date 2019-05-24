package typings
package xpathLib.xpathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xpath", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var select: XPathSelect = js.native
  def evaluate(
    expression: java.lang.String,
    contextNode: stdLib.Node,
    resolver: stdLib.XPathNSResolver,
    `type`: scala.Double,
    result: stdLib.XPathResult
  ): stdLib.XPathResult = js.native
  def select1(expression: java.lang.String): SelectedValue = js.native
  def select1(expression: java.lang.String, node: stdLib.Node): SelectedValue = js.native
  def useNamespaces(namespaceMap: org.scalablytyped.runtime.StringDictionary[java.lang.String]): XPathSelect = js.native
}

