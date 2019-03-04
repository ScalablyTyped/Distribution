package typings
package winrtLib.WindowsNs.DataNs.XmlNs.DomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IXmlProcessingInstruction extends IXmlNode {
  var data: java.lang.String
  var target: java.lang.String
}

object IXmlProcessingInstruction {
  @scala.inline
  def apply(
    appendChild: js.Function1[IXmlNode, IXmlNode],
    attributes: XmlNamedNodeMap,
    childNodes: XmlNodeList,
    cloneNode: js.Function1[scala.Boolean, IXmlNode],
    data: java.lang.String,
    firstChild: IXmlNode,
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
    removeChild: js.Function1[IXmlNode, IXmlNode],
    replaceChild: js.Function2[IXmlNode, IXmlNode, IXmlNode],
    selectNodes: js.Function1[java.lang.String, XmlNodeList],
    selectNodesNS: js.Function2[java.lang.String, js.Any, XmlNodeList],
    selectSingleNode: js.Function1[java.lang.String, IXmlNode],
    selectSingleNodeNS: js.Function2[java.lang.String, js.Any, IXmlNode],
    target: java.lang.String
  ): IXmlProcessingInstruction = {
    val __obj = js.Dynamic.literal(appendChild = appendChild, attributes = attributes, childNodes = childNodes, cloneNode = cloneNode, data = data, firstChild = firstChild, getXml = getXml, hasChildNodes = hasChildNodes, innerText = innerText, insertBefore = insertBefore, lastChild = lastChild, localName = localName, namespaceUri = namespaceUri, nextSibling = nextSibling, nodeName = nodeName, nodeType = nodeType, nodeValue = nodeValue, normalize = normalize, ownerDocument = ownerDocument, parentNode = parentNode, prefix = prefix, previousSibling = previousSibling, removeChild = removeChild, replaceChild = replaceChild, selectNodes = selectNodes, selectNodesNS = selectNodesNS, selectSingleNode = selectSingleNode, selectSingleNodeNS = selectSingleNodeNS, target = target)
  
    __obj.asInstanceOf[IXmlProcessingInstruction]
  }
}

