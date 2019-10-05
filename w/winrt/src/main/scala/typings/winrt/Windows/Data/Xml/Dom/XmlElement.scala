package typings.winrt.Windows.Data.Xml.Dom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Data.Xml.Dom.XmlElement")
@js.native
class XmlElement () extends IXmlElement {
  /* CompleteClass */
  override var attributes: XmlNamedNodeMap = js.native
  /* CompleteClass */
  override var childNodes: XmlNodeList = js.native
  /* CompleteClass */
  override var firstChild: IXmlNode = js.native
  /* CompleteClass */
  override var innerText: String = js.native
  /* CompleteClass */
  override var lastChild: IXmlNode = js.native
  /* CompleteClass */
  override var localName: js.Any = js.native
  /* CompleteClass */
  override var namespaceUri: js.Any = js.native
  /* CompleteClass */
  override var nextSibling: IXmlNode = js.native
  /* CompleteClass */
  override var nodeName: String = js.native
  /* CompleteClass */
  override var nodeType: NodeType = js.native
  /* CompleteClass */
  override var nodeValue: js.Any = js.native
  /* CompleteClass */
  override var ownerDocument: XmlDocument = js.native
  /* CompleteClass */
  override var parentNode: IXmlNode = js.native
  /* CompleteClass */
  override var prefix: js.Any = js.native
  /* CompleteClass */
  override var previousSibling: IXmlNode = js.native
  /* CompleteClass */
  override var tagName: String = js.native
  /* CompleteClass */
  override def appendChild(newChild: IXmlNode): IXmlNode = js.native
  /* CompleteClass */
  override def cloneNode(deep: Boolean): IXmlNode = js.native
  /* CompleteClass */
  override def getAttribute(attributeName: String): String = js.native
  /* CompleteClass */
  override def getAttributeNS(namespaceUri: js.Any, localName: String): String = js.native
  /* CompleteClass */
  override def getAttributeNode(attributeName: String): XmlAttribute = js.native
  /* CompleteClass */
  override def getAttributeNodeNS(namespaceUri: js.Any, localName: String): XmlAttribute = js.native
  /* CompleteClass */
  override def getElementsByTagName(tagName: String): XmlNodeList = js.native
  /* CompleteClass */
  override def getXml(): String = js.native
  /* CompleteClass */
  override def hasChildNodes(): Boolean = js.native
  /* CompleteClass */
  override def insertBefore(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
  /* CompleteClass */
  override def normalize(): Unit = js.native
  /* CompleteClass */
  override def removeAttribute(attributeName: String): Unit = js.native
  /* CompleteClass */
  override def removeAttributeNS(namespaceUri: js.Any, localName: String): Unit = js.native
  /* CompleteClass */
  override def removeAttributeNode(attributeNode: XmlAttribute): XmlAttribute = js.native
  /* CompleteClass */
  override def removeChild(childNode: IXmlNode): IXmlNode = js.native
  /* CompleteClass */
  override def replaceChild(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
  /* CompleteClass */
  override def selectNodes(xpath: String): XmlNodeList = js.native
  /* CompleteClass */
  override def selectNodesNS(xpath: String, namespaces: js.Any): XmlNodeList = js.native
  /* CompleteClass */
  override def selectSingleNode(xpath: String): IXmlNode = js.native
  /* CompleteClass */
  override def selectSingleNodeNS(xpath: String, namespaces: js.Any): IXmlNode = js.native
  /* CompleteClass */
  override def setAttribute(attributeName: String, attributeValue: String): Unit = js.native
  /* CompleteClass */
  override def setAttributeNS(namespaceUri: js.Any, qualifiedName: String, value: String): Unit = js.native
  /* CompleteClass */
  override def setAttributeNode(newAttribute: XmlAttribute): XmlAttribute = js.native
  /* CompleteClass */
  override def setAttributeNodeNS(newAttribute: XmlAttribute): XmlAttribute = js.native
}

