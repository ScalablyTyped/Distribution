package typings
package winrtLib.WindowsNs.DataNs.XmlNs.DomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IXmlDocumentType extends IXmlNode {
  var entities: XmlNamedNodeMap
  var name: java.lang.String
  var notations: XmlNamedNodeMap
}

object IXmlDocumentType {
  @scala.inline
  def apply(
    appendChild: js.Function1[IXmlNode, IXmlNode],
    attributes: XmlNamedNodeMap,
    childNodes: XmlNodeList,
    cloneNode: js.Function1[scala.Boolean, IXmlNode],
    entities: XmlNamedNodeMap,
    firstChild: IXmlNode,
    getXml: js.Function0[java.lang.String],
    hasChildNodes: js.Function0[scala.Boolean],
    innerText: java.lang.String,
    insertBefore: js.Function2[IXmlNode, IXmlNode, IXmlNode],
    lastChild: IXmlNode,
    localName: js.Any,
    name: java.lang.String,
    namespaceUri: js.Any,
    nextSibling: IXmlNode,
    nodeName: java.lang.String,
    nodeType: NodeType,
    nodeValue: js.Any,
    normalize: js.Function0[scala.Unit],
    notations: XmlNamedNodeMap,
    ownerDocument: XmlDocument,
    parentNode: IXmlNode,
    prefix: js.Any,
    previousSibling: IXmlNode,
    removeChild: js.Function1[IXmlNode, IXmlNode],
    replaceChild: js.Function2[IXmlNode, IXmlNode, IXmlNode],
    selectNodes: js.Function1[java.lang.String, XmlNodeList],
    selectNodesNS: js.Function2[java.lang.String, js.Any, XmlNodeList],
    selectSingleNode: js.Function1[java.lang.String, IXmlNode],
    selectSingleNodeNS: js.Function2[java.lang.String, js.Any, IXmlNode]
  ): IXmlDocumentType = {
    val __obj = js.Dynamic.literal(appendChild = appendChild, attributes = attributes, childNodes = childNodes, cloneNode = cloneNode, entities = entities, firstChild = firstChild, getXml = getXml, hasChildNodes = hasChildNodes, innerText = innerText, insertBefore = insertBefore, lastChild = lastChild, localName = localName, name = name, namespaceUri = namespaceUri, nextSibling = nextSibling, nodeName = nodeName, nodeType = nodeType, nodeValue = nodeValue, normalize = normalize, notations = notations, ownerDocument = ownerDocument, parentNode = parentNode, prefix = prefix, previousSibling = previousSibling, removeChild = removeChild, replaceChild = replaceChild, selectNodes = selectNodes, selectNodesNS = selectNodesNS, selectSingleNode = selectSingleNode, selectSingleNodeNS = selectSingleNodeNS)
  
    __obj.asInstanceOf[IXmlDocumentType]
  }
}

