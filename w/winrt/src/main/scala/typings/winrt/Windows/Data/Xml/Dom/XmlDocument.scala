package typings.winrt.Windows.Data.Xml.Dom

import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.Storage.IStorageFile
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
  override var documentUri: String = js.native
  /* CompleteClass */
  override var firstChild: IXmlNode = js.native
  /* CompleteClass */
  override var implementation: XmlDomImplementation = js.native
  /* CompleteClass */
  override var innerText: String = js.native
  /* CompleteClass */
  override var lastChild: IXmlNode = js.native
  /* CompleteClass */
  override var localName: js.Any = js.native
  /* CompleteClass */
  override var namespaceUri: js.Any = js.native
  /* CompleteClass */
  override var nextSibling: IXmlNode = js.native
  /* CompleteClass */
  override var nodeName: String = js.native
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
  override def cloneNode(deep: Boolean): IXmlNode = js.native
  /* CompleteClass */
  override def createAttribute(name: String): XmlAttribute = js.native
  /* CompleteClass */
  override def createAttributeNS(namespaceUri: js.Any, qualifiedName: String): XmlAttribute = js.native
  /* CompleteClass */
  override def createCDataSection(data: String): XmlCDataSection = js.native
  /* CompleteClass */
  override def createComment(data: String): XmlComment = js.native
  /* CompleteClass */
  override def createDocumentFragment(): XmlDocumentFragment = js.native
  /* CompleteClass */
  override def createElement(tagName: String): XmlElement = js.native
  /* CompleteClass */
  override def createElementNS(namespaceUri: js.Any, qualifiedName: String): XmlElement = js.native
  /* CompleteClass */
  override def createEntityReference(name: String): XmlEntityReference = js.native
  /* CompleteClass */
  override def createProcessingInstruction(target: String, data: String): XmlProcessingInstruction = js.native
  /* CompleteClass */
  override def createTextNode(data: String): XmlText = js.native
  /* CompleteClass */
  override def getElementById(elementId: String): XmlElement = js.native
  /* CompleteClass */
  override def getElementsByTagName(tagName: String): XmlNodeList = js.native
  /* CompleteClass */
  override def getXml(): String = js.native
  /* CompleteClass */
  override def hasChildNodes(): Boolean = js.native
  /* CompleteClass */
  override def importNode(node: IXmlNode, deep: Boolean): IXmlNode = js.native
  /* CompleteClass */
  override def insertBefore(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
  /* CompleteClass */
  override def normalize(): Unit = js.native
  /* CompleteClass */
  override def removeChild(childNode: IXmlNode): IXmlNode = js.native
  /* CompleteClass */
  override def replaceChild(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
  /* CompleteClass */
  override def selectNodes(xpath: String): XmlNodeList = js.native
  /* CompleteClass */
  override def selectNodesNS(xpath: String, namespaces: js.Any): XmlNodeList = js.native
  /* CompleteClass */
  override def selectSingleNode(xpath: String): IXmlNode = js.native
  /* CompleteClass */
  override def selectSingleNodeNS(xpath: String, namespaces: js.Any): IXmlNode = js.native
}

/* static members */
@JSGlobal("Windows.Data.Xml.Dom.XmlDocument")
@js.native
object XmlDocument extends js.Object {
  def loadFromFileAsync(file: IStorageFile): IAsyncOperation[XmlDocument] = js.native
  def loadFromFileAsync(file: IStorageFile, loadSettings: XmlLoadSettings): IAsyncOperation[XmlDocument] = js.native
  def loadFromUriAsync(uri: Uri): IAsyncOperation[XmlDocument] = js.native
  def loadFromUriAsync(uri: Uri, loadSettings: XmlLoadSettings): IAsyncOperation[XmlDocument] = js.native
}

