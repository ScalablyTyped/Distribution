package typings
package winrtLib.WindowsNs.DataNs.XmlNs.DomNs

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
  override var innerText: java.lang.String = js.native
  /* CompleteClass */
  override var lastChild: IXmlNode = js.native
  /* CompleteClass */
  override var localName: js.Any = js.native
  /* CompleteClass */
  override var namespaceUri: js.Any = js.native
  /* CompleteClass */
  override var nextSibling: IXmlNode = js.native
  /* CompleteClass */
  override var nodeName: java.lang.String = js.native
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
  override var tagName: java.lang.String = js.native
  /* CompleteClass */
  override def appendChild(newChild: IXmlNode): IXmlNode = js.native
  /* CompleteClass */
  override def cloneNode(deep: scala.Boolean): IXmlNode = js.native
  /* CompleteClass */
  override def getAttribute(attributeName: java.lang.String): java.lang.String = js.native
  /* CompleteClass */
  override def getAttributeNS(namespaceUri: js.Any, localName: java.lang.String): java.lang.String = js.native
  /* CompleteClass */
  override def getAttributeNode(attributeName: java.lang.String): XmlAttribute = js.native
  /* CompleteClass */
  override def getAttributeNodeNS(namespaceUri: js.Any, localName: java.lang.String): XmlAttribute = js.native
  /* CompleteClass */
  override def getElementsByTagName(tagName: java.lang.String): XmlNodeList = js.native
  /* CompleteClass */
  override def getXml(): java.lang.String = js.native
  /* CompleteClass */
  override def hasChildNodes(): scala.Boolean = js.native
  /* CompleteClass */
  override def insertBefore(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
  /* CompleteClass */
  override def normalize(): scala.Unit = js.native
  /* CompleteClass */
  override def removeAttribute(attributeName: java.lang.String): scala.Unit = js.native
  /* CompleteClass */
  override def removeAttributeNS(namespaceUri: js.Any, localName: java.lang.String): scala.Unit = js.native
  /* CompleteClass */
  override def removeAttributeNode(attributeNode: XmlAttribute): XmlAttribute = js.native
  /* CompleteClass */
  override def removeChild(childNode: IXmlNode): IXmlNode = js.native
  /* CompleteClass */
  override def replaceChild(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
  /* CompleteClass */
  override def selectNodes(xpath: java.lang.String): XmlNodeList = js.native
  /* CompleteClass */
  override def selectNodesNS(xpath: java.lang.String, namespaces: js.Any): XmlNodeList = js.native
  /* CompleteClass */
  override def selectSingleNode(xpath: java.lang.String): IXmlNode = js.native
  /* CompleteClass */
  override def selectSingleNodeNS(xpath: java.lang.String, namespaces: js.Any): IXmlNode = js.native
  /* CompleteClass */
  override def setAttribute(attributeName: java.lang.String, attributeValue: java.lang.String): scala.Unit = js.native
  /* CompleteClass */
  override def setAttributeNS(namespaceUri: js.Any, qualifiedName: java.lang.String, value: java.lang.String): scala.Unit = js.native
  /* CompleteClass */
  override def setAttributeNode(newAttribute: XmlAttribute): XmlAttribute = js.native
  /* CompleteClass */
  override def setAttributeNodeNS(newAttribute: XmlAttribute): XmlAttribute = js.native
}

