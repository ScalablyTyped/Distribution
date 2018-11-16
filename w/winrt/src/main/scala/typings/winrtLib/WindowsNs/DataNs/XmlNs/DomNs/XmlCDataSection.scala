package typings
package winrtLib.WindowsNs.DataNs.XmlNs.DomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Data.Xml.Dom.XmlCDataSection")
@js.native
class XmlCDataSection () extends IXmlCDataSection {
  /* CompleteClass */
  override var attributes: XmlNamedNodeMap = js.native
  /* CompleteClass */
  override var childNodes: XmlNodeList = js.native
  /* CompleteClass */
  override var data: java.lang.String = js.native
  /* CompleteClass */
  override var firstChild: IXmlNode = js.native
  /* CompleteClass */
  override var innerText: java.lang.String = js.native
  /* CompleteClass */
  override var lastChild: IXmlNode = js.native
  /* CompleteClass */
  override var length: scala.Double = js.native
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
  override def appendChild(newChild: IXmlNode): IXmlNode = js.native
  /* CompleteClass */
  override def appendData(data: java.lang.String): scala.Unit = js.native
  /* CompleteClass */
  override def cloneNode(deep: scala.Boolean): IXmlNode = js.native
  /* CompleteClass */
  override def deleteData(offset: scala.Double, count: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def getXml(): java.lang.String = js.native
  /* CompleteClass */
  override def hasChildNodes(): scala.Boolean = js.native
  /* CompleteClass */
  override def insertBefore(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
  /* CompleteClass */
  override def insertData(offset: scala.Double, data: java.lang.String): scala.Unit = js.native
  /* CompleteClass */
  override def normalize(): scala.Unit = js.native
  /* CompleteClass */
  override def removeChild(childNode: IXmlNode): IXmlNode = js.native
  /* CompleteClass */
  override def replaceChild(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
  /* CompleteClass */
  override def replaceData(offset: scala.Double, count: scala.Double, data: java.lang.String): scala.Unit = js.native
  /* CompleteClass */
  override def selectNodes(xpath: java.lang.String): XmlNodeList = js.native
  /* CompleteClass */
  override def selectNodesNS(xpath: java.lang.String, namespaces: js.Any): XmlNodeList = js.native
  /* CompleteClass */
  override def selectSingleNode(xpath: java.lang.String): IXmlNode = js.native
  /* CompleteClass */
  override def selectSingleNodeNS(xpath: java.lang.String, namespaces: js.Any): IXmlNode = js.native
  /* CompleteClass */
  override def splitText(offset: scala.Double): IXmlText = js.native
  /* CompleteClass */
  override def substringData(offset: scala.Double, count: scala.Double): java.lang.String = js.native
}

