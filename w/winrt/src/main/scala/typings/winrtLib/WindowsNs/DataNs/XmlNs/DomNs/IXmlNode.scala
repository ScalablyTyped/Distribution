package typings
package winrtLib.WindowsNs.DataNs.XmlNs.DomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IXmlNode
  extends IXmlNodeSelector
     with IXmlNodeSerializer {
  var attributes: XmlNamedNodeMap
  var childNodes: XmlNodeList
  var firstChild: IXmlNode
  var lastChild: IXmlNode
  var localName: js.Any
  var namespaceUri: js.Any
  var nextSibling: IXmlNode
  var nodeName: java.lang.String
  var nodeType: NodeType
  var nodeValue: js.Any
  var ownerDocument: XmlDocument
  var parentNode: IXmlNode
  var prefix: js.Any
  var previousSibling: IXmlNode
  def appendChild(newChild: IXmlNode): IXmlNode
  def cloneNode(deep: scala.Boolean): IXmlNode
  def hasChildNodes(): scala.Boolean
  def insertBefore(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode
  def normalize(): scala.Unit
  def removeChild(childNode: IXmlNode): IXmlNode
  def replaceChild(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode
}

object IXmlNode {
  @scala.inline
  def apply(
    appendChild: IXmlNode => IXmlNode,
    attributes: XmlNamedNodeMap,
    childNodes: XmlNodeList,
    cloneNode: scala.Boolean => IXmlNode,
    firstChild: IXmlNode,
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
    removeChild: IXmlNode => IXmlNode,
    replaceChild: (IXmlNode, IXmlNode) => IXmlNode,
    selectNodes: java.lang.String => XmlNodeList,
    selectNodesNS: (java.lang.String, js.Any) => XmlNodeList,
    selectSingleNode: java.lang.String => IXmlNode,
    selectSingleNodeNS: (java.lang.String, js.Any) => IXmlNode
  ): IXmlNode = {
    val __obj = js.Dynamic.literal(appendChild = js.Any.fromFunction1(appendChild), attributes = attributes, childNodes = childNodes, cloneNode = js.Any.fromFunction1(cloneNode), firstChild = firstChild, getXml = js.Any.fromFunction0(getXml), hasChildNodes = js.Any.fromFunction0(hasChildNodes), innerText = innerText, insertBefore = js.Any.fromFunction2(insertBefore), lastChild = lastChild, localName = localName, namespaceUri = namespaceUri, nextSibling = nextSibling, nodeName = nodeName, nodeType = nodeType, nodeValue = nodeValue, normalize = js.Any.fromFunction0(normalize), ownerDocument = ownerDocument, parentNode = parentNode, prefix = prefix, previousSibling = previousSibling, removeChild = js.Any.fromFunction1(removeChild), replaceChild = js.Any.fromFunction2(replaceChild), selectNodes = js.Any.fromFunction1(selectNodes), selectNodesNS = js.Any.fromFunction2(selectNodesNS), selectSingleNode = js.Any.fromFunction1(selectSingleNode), selectSingleNodeNS = js.Any.fromFunction2(selectSingleNodeNS))
  
    __obj.asInstanceOf[IXmlNode]
  }
}

