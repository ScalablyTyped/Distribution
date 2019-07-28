package typings.xmlDashCore.xmlDashCoreMod

import typings.std.Document
import typings.std.Element
import typings.std.Node
import typings.xmlDashCore.Anon_T
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xml-core", "XmlObject")
@js.native
class XmlObject () extends IXmlSerializable {
  val Element: js.UndefOr[typings.std.Element | Null] = js.native
  val LocalName: String = js.native
  val NamespaceURI: String | Null = js.native
  var Prefix: String | Null = js.native
  var element: js.UndefOr[typings.std.Element | Null] = js.native
  var localName: js.UndefOr[String] = js.native
  var prefix: String | Null = js.native
  /* protected */ def CreateDocument(): Document = js.native
  /* protected */ def CreateElement(): typings.std.Element = js.native
  /* protected */ def CreateElement(document: Document): typings.std.Element = js.native
  /* protected */ def CreateElement(document: Document, localName: String): typings.std.Element = js.native
  /* protected */ def CreateElement(document: Document, localName: String, namespaceUri: String): typings.std.Element = js.native
  /* protected */ def CreateElement(document: Document, localName: String, namespaceUri: String, prefix: String): typings.std.Element = js.native
  /* protected */ def CreateElement(document: Document, localName: String, namespaceUri: Null, prefix: String): typings.std.Element = js.native
  def GetAttribute(name: String): String | Null = js.native
  def GetAttribute(name: String, defaultValue: String): String | Null = js.native
  def GetAttribute(name: String, defaultValue: String, required: Boolean): String | Null = js.native
  def GetAttribute(name: String, defaultValue: Null, required: Boolean): String | Null = js.native
  def GetChild(localName: String): typings.std.Element | Null = js.native
  def GetChild(localName: String, required: Boolean): typings.std.Element | Null = js.native
  def GetChildren(localName: String): js.Array[typings.std.Element] = js.native
  def GetChildren(localName: String, nameSpace: String): js.Array[typings.std.Element] = js.native
  def GetElement(name: String): typings.std.Element = js.native
  def GetElement(name: String, required: Boolean): typings.std.Element = js.native
  def GetFirstChild(localName: String): typings.std.Element | Null = js.native
  def GetFirstChild(localName: String, namespace: String): typings.std.Element | Null = js.native
  /* protected */ def GetPrefix(): String = js.native
  /* protected */ def GetStatic(): XmlSchema = js.native
  def GetXml(hard: Boolean): typings.std.Element | Null = js.native
  def HasChanged(): Boolean = js.native
  def IsEmpty(): Boolean = js.native
  def LoadXml(param: typings.std.Element): Unit = js.native
  /* protected */ def OnGetXml(element: typings.std.Element): Unit = js.native
  /* protected */ def OnLoadXml(element: typings.std.Element): Unit = js.native
}

/* static members */
@JSImport("xml-core", "XmlObject")
@js.native
object XmlObject extends js.Object {
  var attributes: AssocArray[XmlAttributeType[_]] = js.native
  var elements: AssocArray[XmlChildElementType[_]] = js.native
  var localName: String = js.native
  var namespaceURI: String | Null = js.native
  var prefix: String | Null = js.native
  def CreateDocument(): Document = js.native
  def CreateDocument(root: String): Document = js.native
  def CreateDocument(root: String, namespaceUri: String): Document = js.native
  def CreateDocument(root: String, namespaceUri: String, prefix: String): Document = js.native
  def CreateDocument(root: String, namespaceUri: Null, prefix: String): Document = js.native
  def GetAttribute(element: Element, attrName: String): String | Null = js.native
  def GetAttribute(element: Element, attrName: String, defaultValue: String): String | Null = js.native
  def GetAttribute(element: Element, attrName: String, defaultValue: String, required: Boolean): String | Null = js.native
  def GetAttribute(element: Element, attrName: String, defaultValue: Null, required: Boolean): String | Null = js.native
  def GetChild(node: Element, localName: String): Element | Null = js.native
  def GetChild(node: Element, localName: String, nameSpace: String): Element | Null = js.native
  def GetChild(node: Element, localName: String, nameSpace: String, required: Boolean): Element | Null = js.native
  def GetChildren(node: Node, localName: String): js.Array[Element] = js.native
  def GetChildren(node: Node, localName: String, nameSpace: String): js.Array[Element] = js.native
  def GetElement(element: Element, name: String): Element = js.native
  def GetElement(element: Element, name: String, required: Boolean): Element = js.native
  def GetElementById(document: Document, idValue: String): Element | Null = js.native
  def GetElementById(element: Element, idValue: String): Element | Null = js.native
  def GetFirstChild(node: Node, localName: String): Element | Null = js.native
  def GetFirstChild(node: Node, localName: String, nameSpace: String): Element | Null = js.native
  def LoadXml[T /* <: XmlObject */](`this`: Anon_T[T], param: String): T = js.native
  def LoadXml[T /* <: XmlObject */](`this`: Anon_T[T], param: Element): T = js.native
}

