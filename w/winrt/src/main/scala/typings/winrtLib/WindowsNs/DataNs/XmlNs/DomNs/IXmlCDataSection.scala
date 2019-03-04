package typings
package winrtLib.WindowsNs.DataNs.XmlNs.DomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IXmlCDataSection extends IXmlText

object IXmlCDataSection {
  @scala.inline
  def apply(
    appendChild: js.Function1[IXmlNode, IXmlNode],
    appendData: js.Function1[java.lang.String, scala.Unit],
    attributes: XmlNamedNodeMap,
    childNodes: XmlNodeList,
    cloneNode: js.Function1[scala.Boolean, IXmlNode],
    data: java.lang.String,
    deleteData: js.Function2[scala.Double, scala.Double, scala.Unit],
    firstChild: IXmlNode,
    getXml: js.Function0[java.lang.String],
    hasChildNodes: js.Function0[scala.Boolean],
    innerText: java.lang.String,
    insertBefore: js.Function2[IXmlNode, IXmlNode, IXmlNode],
    insertData: js.Function2[scala.Double, java.lang.String, scala.Unit],
    lastChild: IXmlNode,
    length: scala.Double,
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
    replaceData: js.Function3[scala.Double, scala.Double, java.lang.String, scala.Unit],
    selectNodes: js.Function1[java.lang.String, XmlNodeList],
    selectNodesNS: js.Function2[java.lang.String, js.Any, XmlNodeList],
    selectSingleNode: js.Function1[java.lang.String, IXmlNode],
    selectSingleNodeNS: js.Function2[java.lang.String, js.Any, IXmlNode],
    splitText: js.Function1[scala.Double, IXmlText],
    substringData: js.Function2[scala.Double, scala.Double, java.lang.String]
  ): IXmlCDataSection = {
    val __obj = js.Dynamic.literal(appendChild = appendChild, appendData = appendData, attributes = attributes, childNodes = childNodes, cloneNode = cloneNode, data = data, deleteData = deleteData, firstChild = firstChild, getXml = getXml, hasChildNodes = hasChildNodes, innerText = innerText, insertBefore = insertBefore, insertData = insertData, lastChild = lastChild, length = length, localName = localName, namespaceUri = namespaceUri, nextSibling = nextSibling, nodeName = nodeName, nodeType = nodeType, nodeValue = nodeValue, normalize = normalize, ownerDocument = ownerDocument, parentNode = parentNode, prefix = prefix, previousSibling = previousSibling, removeChild = removeChild, replaceChild = replaceChild, replaceData = replaceData, selectNodes = selectNodes, selectNodesNS = selectNodesNS, selectSingleNode = selectSingleNode, selectSingleNodeNS = selectSingleNodeNS, splitText = splitText, substringData = substringData)
  
    __obj.asInstanceOf[IXmlCDataSection]
  }
}

