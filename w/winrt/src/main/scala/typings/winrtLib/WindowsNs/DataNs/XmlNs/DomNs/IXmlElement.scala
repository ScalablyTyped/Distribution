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
    appendChild: js.Function1[IXmlNode, IXmlNode],
    attributes: XmlNamedNodeMap,
    childNodes: XmlNodeList,
    cloneNode: js.Function1[scala.Boolean, IXmlNode],
    firstChild: IXmlNode,
    getAttribute: js.Function1[java.lang.String, java.lang.String],
    getAttributeNS: js.Function2[js.Any, java.lang.String, java.lang.String],
    getAttributeNode: js.Function1[java.lang.String, XmlAttribute],
    getAttributeNodeNS: js.Function2[js.Any, java.lang.String, XmlAttribute],
    getElementsByTagName: js.Function1[java.lang.String, XmlNodeList],
    getXml: js.Function0[java.lang.String],
    hasChildNodes: js.Function0[scala.Boolean],
    innerText: java.lang.String,
    insertBefore: js.Function2[IXmlNode, IXmlNode, IXmlNode],
    lastChild: IXmlNode,
    localName: js.Any,
    namespaceUri: js.Any,
    nextSibling: IXmlNode,
    nodeName: java.lang.String,
    nodeType: NodeType,
    nodeValue: js.Any,
    normalize: js.Function0[scala.Unit],
    ownerDocument: XmlDocument,
    parentNode: IXmlNode,
    prefix: js.Any,
    previousSibling: IXmlNode,
    removeAttribute: js.Function1[java.lang.String, scala.Unit],
    removeAttributeNS: js.Function2[js.Any, java.lang.String, scala.Unit],
    removeAttributeNode: js.Function1[XmlAttribute, XmlAttribute],
    removeChild: js.Function1[IXmlNode, IXmlNode],
    replaceChild: js.Function2[IXmlNode, IXmlNode, IXmlNode],
    selectNodes: js.Function1[java.lang.String, XmlNodeList],
    selectNodesNS: js.Function2[java.lang.String, js.Any, XmlNodeList],
    selectSingleNode: js.Function1[java.lang.String, IXmlNode],
    selectSingleNodeNS: js.Function2[java.lang.String, js.Any, IXmlNode],
    setAttribute: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    setAttributeNS: js.Function3[js.Any, java.lang.String, java.lang.String, scala.Unit],
    setAttributeNode: js.Function1[XmlAttribute, XmlAttribute],
    setAttributeNodeNS: js.Function1[XmlAttribute, XmlAttribute],
    tagName: java.lang.String
  ): IXmlElement = {
    val __obj = js.Dynamic.literal(appendChild = appendChild, attributes = attributes, childNodes = childNodes, cloneNode = cloneNode, firstChild = firstChild, getAttribute = getAttribute, getAttributeNS = getAttributeNS, getAttributeNode = getAttributeNode, getAttributeNodeNS = getAttributeNodeNS, getElementsByTagName = getElementsByTagName, getXml = getXml, hasChildNodes = hasChildNodes, innerText = innerText, insertBefore = insertBefore, lastChild = lastChild, localName = localName, namespaceUri = namespaceUri, nextSibling = nextSibling, nodeName = nodeName, nodeType = nodeType, nodeValue = nodeValue, normalize = normalize, ownerDocument = ownerDocument, parentNode = parentNode, prefix = prefix, previousSibling = previousSibling, removeAttribute = removeAttribute, removeAttributeNS = removeAttributeNS, removeAttributeNode = removeAttributeNode, removeChild = removeChild, replaceChild = replaceChild, selectNodes = selectNodes, selectNodesNS = selectNodesNS, selectSingleNode = selectSingleNode, selectSingleNodeNS = selectSingleNodeNS, setAttribute = setAttribute, setAttributeNS = setAttributeNS, setAttributeNode = setAttributeNode, setAttributeNodeNS = setAttributeNodeNS, tagName = tagName)
  
    __obj.asInstanceOf[IXmlElement]
  }
}

