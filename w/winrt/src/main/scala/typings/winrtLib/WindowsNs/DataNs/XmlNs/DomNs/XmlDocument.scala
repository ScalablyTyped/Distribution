package typings
package winrtLib.WindowsNs.DataNs.XmlNs.DomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Data.Xml.Dom.XmlDocument")
@js.native
class XmlDocument ()
  extends IXmlDocument
     with IXmlDocumentIO {
  /* CompleteClass */
  override var attributes: XmlNamedNodeMap = js.native
  /* CompleteClass */
  override var childNodes: XmlNodeList = js.native
  /* CompleteClass */
  override var doctype: XmlDocumentType = js.native
  /* CompleteClass */
  override var documentElement: XmlElement = js.native
  /* CompleteClass */
  override var documentUri: java.lang.String = js.native
  /* CompleteClass */
  override var firstChild: IXmlNode = js.native
  /* CompleteClass */
  override var implementation: XmlDomImplementation = js.native
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
  override def appendChild(newChild: IXmlNode): IXmlNode = js.native
  /* CompleteClass */
  override def cloneNode(deep: scala.Boolean): IXmlNode = js.native
  /* CompleteClass */
  override def createAttribute(name: java.lang.String): XmlAttribute = js.native
  /* CompleteClass */
  override def createAttributeNS(namespaceUri: js.Any, qualifiedName: java.lang.String): XmlAttribute = js.native
  /* CompleteClass */
  override def createCDataSection(data: java.lang.String): XmlCDataSection = js.native
  /* CompleteClass */
  override def createComment(data: java.lang.String): XmlComment = js.native
  /* CompleteClass */
  override def createDocumentFragment(): XmlDocumentFragment = js.native
  /* CompleteClass */
  override def createElement(tagName: java.lang.String): XmlElement = js.native
  /* CompleteClass */
  override def createElementNS(namespaceUri: js.Any, qualifiedName: java.lang.String): XmlElement = js.native
  /* CompleteClass */
  override def createEntityReference(name: java.lang.String): XmlEntityReference = js.native
  /* CompleteClass */
  override def createProcessingInstruction(target: java.lang.String, data: java.lang.String): XmlProcessingInstruction = js.native
  /* CompleteClass */
  override def createTextNode(data: java.lang.String): XmlText = js.native
  /* CompleteClass */
  override def getElementById(elementId: java.lang.String): XmlElement = js.native
  /* CompleteClass */
  override def getElementsByTagName(tagName: java.lang.String): XmlNodeList = js.native
  /* CompleteClass */
  override def getXml(): java.lang.String = js.native
  /* CompleteClass */
  override def hasChildNodes(): scala.Boolean = js.native
  /* CompleteClass */
  override def importNode(node: IXmlNode, deep: scala.Boolean): IXmlNode = js.native
  /* CompleteClass */
  override def insertBefore(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
  /* CompleteClass */
  override def normalize(): scala.Unit = js.native
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
}

/* static members */
@JSGlobal("Windows.Data.Xml.Dom.XmlDocument")
@js.native
object XmlDocument extends js.Object {
  def loadFromFileAsync(file: winrtLib.WindowsNs.StorageNs.IStorageFile): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument] = js.native
  def loadFromFileAsync(
    file: winrtLib.WindowsNs.StorageNs.IStorageFile,
    loadSettings: winrtLib.WindowsNs.DataNs.XmlNs.DomNs.XmlLoadSettings
  ): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument] = js.native
  def loadFromUriAsync(uri: winrtLib.WindowsNs.FoundationNs.Uri): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument] = js.native
  def loadFromUriAsync(
    uri: winrtLib.WindowsNs.FoundationNs.Uri,
    loadSettings: winrtLib.WindowsNs.DataNs.XmlNs.DomNs.XmlLoadSettings
  ): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument] = js.native
}

