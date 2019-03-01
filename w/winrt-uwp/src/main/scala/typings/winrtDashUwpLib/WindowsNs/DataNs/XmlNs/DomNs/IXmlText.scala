package typings
package winrtDashUwpLib.WindowsNs.DataNs.XmlNs.DomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the text content of an element or attribute. */
trait IXmlText extends IXmlCharacterData {
  /**
    * Splits this text node into two text nodes at the specified offset and inserts the new text node into the tree as a sibling that immediately follows this node.
    * @param offset The number of characters at which to split this text node into two nodes, starting from zero.
    * @return The new text node.
    */
  def splitText(offset: scala.Double): IXmlText
}

object IXmlText {
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
  ): IXmlText = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("appendChild")(appendChild)
    __obj.updateDynamic("appendData")(appendData)
    __obj.updateDynamic("attributes")(attributes)
    __obj.updateDynamic("childNodes")(childNodes)
    __obj.updateDynamic("cloneNode")(cloneNode)
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("deleteData")(deleteData)
    __obj.updateDynamic("firstChild")(firstChild)
    __obj.updateDynamic("getXml")(getXml)
    __obj.updateDynamic("hasChildNodes")(hasChildNodes)
    __obj.updateDynamic("innerText")(innerText)
    __obj.updateDynamic("insertBefore")(insertBefore)
    __obj.updateDynamic("insertData")(insertData)
    __obj.updateDynamic("lastChild")(lastChild)
    __obj.updateDynamic("length")(length)
    __obj.updateDynamic("localName")(localName)
    __obj.updateDynamic("namespaceUri")(namespaceUri)
    __obj.updateDynamic("nextSibling")(nextSibling)
    __obj.updateDynamic("nodeName")(nodeName)
    __obj.updateDynamic("nodeType")(nodeType)
    __obj.updateDynamic("nodeValue")(nodeValue)
    __obj.updateDynamic("normalize")(normalize)
    __obj.updateDynamic("ownerDocument")(ownerDocument)
    __obj.updateDynamic("parentNode")(parentNode)
    __obj.updateDynamic("prefix")(prefix)
    __obj.updateDynamic("previousSibling")(previousSibling)
    __obj.updateDynamic("removeChild")(removeChild)
    __obj.updateDynamic("replaceChild")(replaceChild)
    __obj.updateDynamic("replaceData")(replaceData)
    __obj.updateDynamic("selectNodes")(selectNodes)
    __obj.updateDynamic("selectNodesNS")(selectNodesNS)
    __obj.updateDynamic("selectSingleNode")(selectSingleNode)
    __obj.updateDynamic("selectSingleNodeNS")(selectSingleNodeNS)
    __obj.updateDynamic("splitText")(splitText)
    __obj.updateDynamic("substringData")(substringData)
    __obj.asInstanceOf[IXmlText]
  }
}

