package typings.xmlCore

import typings.std.Document_
import typings.std.Element
import typings.std.Node
import typings.xmlCore.typesMod.AssocArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xml-core/dist/types/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  val Select: SelectNodes = js.native
  def Parse(xmlString: String): Document_ = js.native
  def SelectNamespaces(node: Element): AssocArray[String] = js.native
  def SelectSingleNode(node: Node, path: String): Node | Null = js.native
  def Stringify(target: Node): String = js.native
  def assign(target: js.Any, sources: js.Any*): js.Any = js.native
  def isDocument(obj: js.Any): /* is std.Document */ Boolean = js.native
  def isElement(obj: js.Any): /* is std.Element */ Boolean = js.native
  type SelectNodes = js.Function2[/* node */ Node, /* xPath */ String, js.Array[Node]]
}

