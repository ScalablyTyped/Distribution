package typings
package winrtLib.WindowsNs.DataNs.XmlNs.DomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IXmlElement extends IXmlNode {
  var tagName: java.lang.String
  def getAttribute(attributeName: java.lang.String): java.lang.String
  def getAttributeNS(namespaceUri: js.Any, localName: java.lang.String): java.lang.String
  def getAttributeNode(attributeName: java.lang.String): XmlAttribute
  def getAttributeNodeNS(namespaceUri: js.Any, localName: java.lang.String): XmlAttribute
  def getElementsByTagName(tagName: java.lang.String): XmlNodeList
  def removeAttribute(attributeName: java.lang.String): scala.Unit
  def removeAttributeNS(namespaceUri: js.Any, localName: java.lang.String): scala.Unit
  def removeAttributeNode(attributeNode: XmlAttribute): XmlAttribute
  def setAttribute(attributeName: java.lang.String, attributeValue: java.lang.String): scala.Unit
  def setAttributeNS(namespaceUri: js.Any, qualifiedName: java.lang.String, value: java.lang.String): scala.Unit
  def setAttributeNode(newAttribute: XmlAttribute): XmlAttribute
  def setAttributeNodeNS(newAttribute: XmlAttribute): XmlAttribute
}

object IXmlElement {
  @scala.inline
  def apply(
    appendChild: IXmlNode => IXmlNode,
    attributes: XmlNamedNodeMap,
    childNodes: XmlNodeList,
    cloneNode: scala.Boolean => IXmlNode,
    firstChild: IXmlNode,
    getAttribute: java.lang.String => java.lang.String,
    getAttributeNS: (js.Any, java.lang.String) => java.lang.String,
    getAttributeNode: java.lang.String => XmlAttribute,
    getAttributeNodeNS: (js.Any, java.lang.String) => XmlAttribute,
    getElementsByTagName: java.lang.String => XmlNodeList,
    getXml: () => java.lang.String,
    hasChildNodes: () => scala.Boolean,
    innerText: java.lang.String,
    insertBefore: (IXmlNode, IXmlNode) => IXmlNode,
    lastChild: IXmlNode,
    localName: js.Any,
    namespaceUri: js.Any,
    nextSibling: IXmlNode,
    nodeName: java.lang.String,
    nodeType: NodeType,
    nodeValue: js.Any,
    normalize: () => scala.Unit,
    ownerDocument: XmlDocument,
    parentNode: IXmlNode,
    prefix: js.Any,
    previousSibling: IXmlNode,
    removeAttribute: java.lang.String => scala.Unit,
    removeAttributeNS: (js.Any, java.lang.String) => scala.Unit,
    removeAttributeNode: XmlAttribute => XmlAttribute,
    removeChild: IXmlNode => IXmlNode,
    replaceChild: (IXmlNode, IXmlNode) => IXmlNode,
    selectNodes: java.lang.String => XmlNodeList,
    selectNodesNS: (java.lang.String, js.Any) => XmlNodeList,
    selectSingleNode: java.lang.String => IXmlNode,
    selectSingleNodeNS: (java.lang.String, js.Any) => IXmlNode,
    setAttribute: (java.lang.String, java.lang.String) => scala.Unit,
    setAttributeNS: (js.Any, java.lang.String, java.lang.String) => scala.Unit,
    setAttributeNode: XmlAttribute => XmlAttribute,
    setAttributeNodeNS: XmlAttribute => XmlAttribute,
    tagName: java.lang.String
  ): IXmlElement = {
    val __obj = js.Dynamic.literal(appendChild = js.Any.fromFunction1(appendChild), attributes = attributes, childNodes = childNodes, cloneNode = js.Any.fromFunction1(cloneNode), firstChild = firstChild, getAttribute = js.Any.fromFunction1(getAttribute), getAttributeNS = js.Any.fromFunction2(getAttributeNS), getAttributeNode = js.Any.fromFunction1(getAttributeNode), getAttributeNodeNS = js.Any.fromFunction2(getAttributeNodeNS), getElementsByTagName = js.Any.fromFunction1(getElementsByTagName), getXml = js.Any.fromFunction0(getXml), hasChildNodes = js.Any.fromFunction0(hasChildNodes), innerText = innerText, insertBefore = js.Any.fromFunction2(insertBefore), lastChild = lastChild, localName = localName, namespaceUri = namespaceUri, nextSibling = nextSibling, nodeName = nodeName, nodeType = nodeType, nodeValue = nodeValue, normalize = js.Any.fromFunction0(normalize), ownerDocument = ownerDocument, parentNode = parentNode, prefix = prefix, previousSibling = previousSibling, removeAttribute = js.Any.fromFunction1(removeAttribute), removeAttributeNS = js.Any.fromFunction2(removeAttributeNS), removeAttributeNode = js.Any.fromFunction1(removeAttributeNode), removeChild = js.Any.fromFunction1(removeChild), replaceChild = js.Any.fromFunction2(replaceChild), selectNodes = js.Any.fromFunction1(selectNodes), selectNodesNS = js.Any.fromFunction2(selectNodesNS), selectSingleNode = js.Any.fromFunction1(selectSingleNode), selectSingleNodeNS = js.Any.fromFunction2(selectSingleNodeNS), setAttribute = js.Any.fromFunction2(setAttribute), setAttributeNS = js.Any.fromFunction3(setAttributeNS), setAttributeNode = js.Any.fromFunction1(setAttributeNode), setAttributeNodeNS = js.Any.fromFunction1(setAttributeNodeNS), tagName = tagName)
  
    __obj.asInstanceOf[IXmlElement]
  }
}

