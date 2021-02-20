package typings.xmlCore

import typings.std.Document
import typings.std.Element
import typings.std.Node
import typings.xmlCore.typesMod.AssocArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("xml-core/dist/types/utils", "Parse")
  @js.native
  def Parse(xmlString: String): Document = js.native
  
  @JSImport("xml-core/dist/types/utils", "Select")
  @js.native
  val Select: SelectNodes = js.native
  
  @JSImport("xml-core/dist/types/utils", "SelectNamespaces")
  @js.native
  def SelectNamespaces(node: Element): AssocArray[String] = js.native
  
  @JSImport("xml-core/dist/types/utils", "SelectSingleNode")
  @js.native
  def SelectSingleNode(node: Node, path: String): Node | Null = js.native
  
  @JSImport("xml-core/dist/types/utils", "Stringify")
  @js.native
  def Stringify(target: Node): String = js.native
  
  @JSImport("xml-core/dist/types/utils", "assign")
  @js.native
  def assign(target: js.Any, sources: js.Any*): js.Any = js.native
  
  @JSImport("xml-core/dist/types/utils", "isDocument")
  @js.native
  def isDocument(obj: js.Any): /* is std.Document */ Boolean = js.native
  
  @JSImport("xml-core/dist/types/utils", "isElement")
  @js.native
  def isElement(obj: js.Any): /* is std.Element */ Boolean = js.native
  
  type SelectNodes = js.Function2[/* node */ Node, /* xPath */ String, js.Array[Node]]
}
