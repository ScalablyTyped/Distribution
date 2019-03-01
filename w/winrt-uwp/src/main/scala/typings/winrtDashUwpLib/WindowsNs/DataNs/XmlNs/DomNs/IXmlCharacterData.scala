package typings
package winrtDashUwpLib.WindowsNs.DataNs.XmlNs.DomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides text manipulation methods that are used by several objects. */
trait IXmlCharacterData extends IXmlNode {
  /** Gets or sets the node data depending on the node type. */
  var data: java.lang.String
  /** Gets the length of the data, in Unicode characters. */
  var length: scala.Double
  /**
    * Appends the supplied string to the existing string data.
    * @param data The data to be appended to the existing string.
    */
  def appendData(data: java.lang.String): scala.Unit
  /**
    * Deletes specified data.
    * @param offset The offset, in characters, at which to start deleting the string data.
    * @param count The number of characters to delete.
    */
  def deleteData(offset: scala.Double, count: scala.Double): scala.Unit
  /**
    * Inserts a string at the specified offset.
    * @param offset The offset, in characters, at which to insert the supplied string data.
    * @param data The data to be inserted into the existing string.
    */
  def insertData(offset: scala.Double, data: java.lang.String): scala.Unit
  /**
    * Replaces the specified number of characters with the supplied string.
    * @param offset The offset, in characters, at which to start replacing string data.
    * @param count The number of characters to replace.
    * @param data The new data that replaces the old string data.
    */
  def replaceData(offset: scala.Double, count: scala.Double, data: java.lang.String): scala.Unit
  /**
    * Retrieves a substring of the full string from the specified range.
    * @param offset Specifies the offset, in characters, from the beginning of the string. An offset of zero indicates copying from the start of the data.
    * @param count Specifies the number of characters to retrieve from the specified offset.
    * @return The returned substring.
    */
  def substringData(offset: scala.Double, count: scala.Double): java.lang.String
}

object IXmlCharacterData {
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
    substringData: js.Function2[scala.Double, scala.Double, java.lang.String]
  ): IXmlCharacterData = {
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
    __obj.updateDynamic("substringData")(substringData)
    __obj.asInstanceOf[IXmlCharacterData]
  }
}

