package typings.xmlCore.mod

import typings.std.Document_
import typings.std.Element
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xml-core", "XmlObject")
@js.native
class XmlObject () extends IXmlSerializable {
  /**
    * XmlElement
    * undefined - class initialized
    * null - has some changes
    * element - has cached element
    *
    * @protected
    * @type {(Element | null | undefined)}
    * @memberOf XmlObject
    */
  var element: js.UndefOr[Element | Null] = js.native
  var localName: js.UndefOr[String] = js.native
  var namespaceURI: js.UndefOr[String | Null] = js.native
  var prefix: String | Null = js.native
  /* protected */ def CreateDocument(): Document_ = js.native
  /* protected */ def CreateElement(): Element = js.native
  /* protected */ def CreateElement(document: Document_): Element = js.native
  /* protected */ def CreateElement(document: Document_, localName: String): Element = js.native
  /* protected */ def CreateElement(document: Document_, localName: String, namespaceUri: String): Element = js.native
  /* protected */ def CreateElement(document: Document_, localName: String, namespaceUri: String, prefix: String): Element = js.native
  /* protected */ def CreateElement(document: Document_, localName: String, namespaceUri: Null, prefix: String): Element = js.native
  def Element(): js.UndefOr[typings.std.Element | Null] = js.native
  def GetAttribute(name: String): String | Null = js.native
  def GetAttribute(name: String, defaultValue: String): String | Null = js.native
  def GetAttribute(name: String, defaultValue: String, required: Boolean): String | Null = js.native
  def GetAttribute(name: String, defaultValue: Null, required: Boolean): String | Null = js.native
  def GetChild(localName: String): Element | Null = js.native
  def GetChild(localName: String, required: Boolean): Element | Null = js.native
  def GetChildren(localName: String): js.Array[Element] = js.native
  def GetChildren(localName: String, nameSpace: String): js.Array[Element] = js.native
  def GetElement(name: String): Element = js.native
  def GetElement(name: String, required: Boolean): Element = js.native
  def GetFirstChild(localName: String): Element | Null = js.native
  def GetFirstChild(localName: String, namespace: String): Element | Null = js.native
  /* protected */ def GetPrefix(): String = js.native
  /* protected */ def GetStatic(): XmlSchema = js.native
  def GetXml(hard: Boolean): Element | Null = js.native
  def HasChanged(): Boolean = js.native
  def IsEmpty(): Boolean = js.native
  def LoadXml(param: Element): Unit = js.native
  def LocalName(): String = js.native
  def NamespaceURI(): String | Null = js.native
  /* protected */ def OnGetXml(element: Element): Unit = js.native
  /* protected */ def OnLoadXml(element: Element): Unit = js.native
  def Prefix(): js.Any = js.native
  def Prefix(value: String): js.Any = js.native
  @JSName("Prefix")
  def Prefix_Union(): String | Null = js.native
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
  /**
    * Creates new instance of XmlDocument with given name of root element
    * @param  {string} root Name of root element
    * @param  {string} namespaceUri
    * @param  {string} prefix
    * @returns Document
    */
  def CreateDocument(): Document_ = js.native
  def CreateDocument(root: String): Document_ = js.native
  def CreateDocument(root: String, namespaceUri: String): Document_ = js.native
  def CreateDocument(root: String, namespaceUri: String, prefix: String): Document_ = js.native
  def CreateDocument(root: String, namespaceUri: Null, prefix: String): Document_ = js.native
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
  def GetElementById(element: Document_, idValue: String): Element | Null = js.native
  def GetElementById(element: Element, idValue: String): Element | Null = js.native
  def GetFirstChild(node: Node, localName: String): Element | Null = js.native
  def GetFirstChild(node: Node, localName: String, nameSpace: String): Element | Null = js.native
  def LoadXml[T /* <: XmlObject */](param: String): T = js.native
  def LoadXml[T /* <: XmlObject */](param: Element): T = js.native
}

