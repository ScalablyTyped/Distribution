package typings.winrt.global.Windows.Data.Xml

import typings.winrt.Windows.Data.Xml.Dom.IXmlNode
import typings.winrt.Windows.Data.Xml.Dom.IXmlText
import typings.winrt.Windows.Data.Xml.Dom.NodeType
import typings.winrt.Windows.Foundation.Collections.IIterator
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.Storage.IStorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Data.Xml.Dom")
@js.native
object Dom extends js.Object {
  @js.native
  class DtdEntity ()
    extends typings.winrt.Windows.Data.Xml.Dom.DtdEntity {
    /* CompleteClass */
    override var attributes: typings.winrt.Windows.Data.Xml.Dom.XmlNamedNodeMap = js.native
    /* CompleteClass */
    override var childNodes: typings.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
    /* CompleteClass */
    override var firstChild: IXmlNode = js.native
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
    override var notationName: js.Any = js.native
    /* CompleteClass */
    override var ownerDocument: typings.winrt.Windows.Data.Xml.Dom.XmlDocument = js.native
    /* CompleteClass */
    override var parentNode: IXmlNode = js.native
    /* CompleteClass */
    override var prefix: js.Any = js.native
    /* CompleteClass */
    override var previousSibling: IXmlNode = js.native
    /* CompleteClass */
    override var publicId: js.Any = js.native
    /* CompleteClass */
    override var systemId: js.Any = js.native
    /* CompleteClass */
    override def appendChild(newChild: IXmlNode): IXmlNode = js.native
    /* CompleteClass */
    override def cloneNode(deep: Boolean): IXmlNode = js.native
    /* CompleteClass */
    override def getXml(): String = js.native
    /* CompleteClass */
    override def hasChildNodes(): Boolean = js.native
    /* CompleteClass */
    override def insertBefore(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
    /* CompleteClass */
    override def normalize(): Unit = js.native
    /* CompleteClass */
    override def removeChild(childNode: IXmlNode): IXmlNode = js.native
    /* CompleteClass */
    override def replaceChild(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
    /* CompleteClass */
    override def selectNodes(xpath: String): typings.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
    /* CompleteClass */
    override def selectNodesNS(xpath: String, namespaces: js.Any): typings.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
    /* CompleteClass */
    override def selectSingleNode(xpath: String): IXmlNode = js.native
    /* CompleteClass */
    override def selectSingleNodeNS(xpath: String, namespaces: js.Any): IXmlNode = js.native
  }
  
  @js.native
  class DtdNotation ()
    extends typings.winrt.Windows.Data.Xml.Dom.DtdNotation {
    /* CompleteClass */
    override var attributes: typings.winrt.Windows.Data.Xml.Dom.XmlNamedNodeMap = js.native
    /* CompleteClass */
    override var childNodes: typings.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
    /* CompleteClass */
    override var firstChild: IXmlNode = js.native
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
    override var ownerDocument: typings.winrt.Windows.Data.Xml.Dom.XmlDocument = js.native
    /* CompleteClass */
    override var parentNode: IXmlNode = js.native
    /* CompleteClass */
    override var prefix: js.Any = js.native
    /* CompleteClass */
    override var previousSibling: IXmlNode = js.native
    /* CompleteClass */
    override var publicId: js.Any = js.native
    /* CompleteClass */
    override var systemId: js.Any = js.native
    /* CompleteClass */
    override def appendChild(newChild: IXmlNode): IXmlNode = js.native
    /* CompleteClass */
    override def cloneNode(deep: Boolean): IXmlNode = js.native
    /* CompleteClass */
    override def getXml(): String = js.native
    /* CompleteClass */
    override def hasChildNodes(): Boolean = js.native
    /* CompleteClass */
    override def insertBefore(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
    /* CompleteClass */
    override def normalize(): Unit = js.native
    /* CompleteClass */
    override def removeChild(childNode: IXmlNode): IXmlNode = js.native
    /* CompleteClass */
    override def replaceChild(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
    /* CompleteClass */
    override def selectNodes(xpath: String): typings.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
    /* CompleteClass */
    override def selectNodesNS(xpath: String, namespaces: js.Any): typings.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
    /* CompleteClass */
    override def selectSingleNode(xpath: String): IXmlNode = js.native
    /* CompleteClass */
    override def selectSingleNodeNS(xpath: String, namespaces: js.Any): IXmlNode = js.native
  }
  
  @js.native
  class XmlAttribute ()
    extends typings.winrt.Windows.Data.Xml.Dom.XmlAttribute {
    /* CompleteClass */
    override var attributes: typings.winrt.Windows.Data.Xml.Dom.XmlNamedNodeMap = js.native
    /* CompleteClass */
    override var childNodes: typings.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
    /* CompleteClass */
    override var firstChild: IXmlNode = js.native
    /* CompleteClass */
    override var innerText: String = js.native
    /* CompleteClass */
    override var lastChild: IXmlNode = js.native
    /* CompleteClass */
    override var localName: js.Any = js.native
    /* CompleteClass */
    override var name: String = js.native
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
    override var ownerDocument: typings.winrt.Windows.Data.Xml.Dom.XmlDocument = js.native
    /* CompleteClass */
    override var parentNode: IXmlNode = js.native
    /* CompleteClass */
    override var prefix: js.Any = js.native
    /* CompleteClass */
    override var previousSibling: IXmlNode = js.native
    /* CompleteClass */
    override var specified: Boolean = js.native
    /* CompleteClass */
    override var value: String = js.native
    /* CompleteClass */
    override def appendChild(newChild: IXmlNode): IXmlNode = js.native
    /* CompleteClass */
    override def cloneNode(deep: Boolean): IXmlNode = js.native
    /* CompleteClass */
    override def getXml(): String = js.native
    /* CompleteClass */
    override def hasChildNodes(): Boolean = js.native
    /* CompleteClass */
    override def insertBefore(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
    /* CompleteClass */
    override def normalize(): Unit = js.native
    /* CompleteClass */
    override def removeChild(childNode: IXmlNode): IXmlNode = js.native
    /* CompleteClass */
    override def replaceChild(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
    /* CompleteClass */
    override def selectNodes(xpath: String): typings.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
    /* CompleteClass */
    override def selectNodesNS(xpath: String, namespaces: js.Any): typings.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
    /* CompleteClass */
    override def selectSingleNode(xpath: String): IXmlNode = js.native
    /* CompleteClass */
    override def selectSingleNodeNS(xpath: String, namespaces: js.Any): IXmlNode = js.native
  }
  
  @js.native
  class XmlCDataSection ()
    extends typings.winrt.Windows.Data.Xml.Dom.XmlCDataSection {
    /* CompleteClass */
    override var attributes: typings.winrt.Windows.Data.Xml.Dom.XmlNamedNodeMap = js.native
    /* CompleteClass */
    override var childNodes: typings.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
    /* CompleteClass */
    override var data: String = js.native
    /* CompleteClass */
    override var firstChild: IXmlNode = js.native
    /* CompleteClass */
    override var innerText: String = js.native
    /* CompleteClass */
    override var lastChild: IXmlNode = js.native
    /* CompleteClass */
    override var length: Double = js.native
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
    override var ownerDocument: typings.winrt.Windows.Data.Xml.Dom.XmlDocument = js.native
    /* CompleteClass */
    override var parentNode: IXmlNode = js.native
    /* CompleteClass */
    override var prefix: js.Any = js.native
    /* CompleteClass */
    override var previousSibling: IXmlNode = js.native
    /* CompleteClass */
    override def appendChild(newChild: IXmlNode): IXmlNode = js.native
    /* CompleteClass */
    override def appendData(data: String): Unit = js.native
    /* CompleteClass */
    override def cloneNode(deep: Boolean): IXmlNode = js.native
    /* CompleteClass */
    override def deleteData(offset: Double, count: Double): Unit = js.native
    /* CompleteClass */
    override def getXml(): String = js.native
    /* CompleteClass */
    override def hasChildNodes(): Boolean = js.native
    /* CompleteClass */
    override def insertBefore(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
    /* CompleteClass */
    override def insertData(offset: Double, data: String): Unit = js.native
    /* CompleteClass */
    override def normalize(): Unit = js.native
    /* CompleteClass */
    override def removeChild(childNode: IXmlNode): IXmlNode = js.native
    /* CompleteClass */
    override def replaceChild(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
    /* CompleteClass */
    override def replaceData(offset: Double, count: Double, data: String): Unit = js.native
    /* CompleteClass */
    override def selectNodes(xpath: String): typings.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
    /* CompleteClass */
    override def selectNodesNS(xpath: String, namespaces: js.Any): typings.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
    /* CompleteClass */
    override def selectSingleNode(xpath: String): IXmlNode = js.native
    /* CompleteClass */
    override def selectSingleNodeNS(xpath: String, namespaces: js.Any): IXmlNode = js.native
    /* CompleteClass */
    override def splitText(offset: Double): IXmlText = js.native
    /* CompleteClass */
    override def substringData(offset: Double, count: Double): String = js.native
  }
  
  @js.native
  class XmlComment ()
    extends typings.winrt.Windows.Data.Xml.Dom.XmlComment {
    /* CompleteClass */
    override var attributes: typings.winrt.Windows.Data.Xml.Dom.XmlNamedNodeMap = js.native
    /* CompleteClass */
    override var childNodes: typings.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
    /* CompleteClass */
    override var data: String = js.native
    /* CompleteClass */
    override var firstChild: IXmlNode = js.native
    /* CompleteClass */
    override var innerText: String = js.native
    /* CompleteClass */
    override var lastChild: IXmlNode = js.native
    /* CompleteClass */
    override var length: Double = js.native
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
    override var ownerDocument: typings.winrt.Windows.Data.Xml.Dom.XmlDocument = js.native
    /* CompleteClass */
    override var parentNode: IXmlNode = js.native
    /* CompleteClass */
    override var prefix: js.Any = js.native
    /* CompleteClass */
    override var previousSibling: IXmlNode = js.native
    /* CompleteClass */
    override def appendChild(newChild: IXmlNode): IXmlNode = js.native
    /* CompleteClass */
    override def appendData(data: String): Unit = js.native
    /* CompleteClass */
    override def cloneNode(deep: Boolean): IXmlNode = js.native
    /* CompleteClass */
    override def deleteData(offset: Double, count: Double): Unit = js.native
    /* CompleteClass */
    override def getXml(): String = js.native
    /* CompleteClass */
    override def hasChildNodes(): Boolean = js.native
    /* CompleteClass */
    override def insertBefore(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
    /* CompleteClass */
    override def insertData(offset: Double, data: String): Unit = js.native
    /* CompleteClass */
    override def normalize(): Unit = js.native
    /* CompleteClass */
    override def removeChild(childNode: IXmlNode): IXmlNode = js.native
    /* CompleteClass */
    override def replaceChild(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
    /* CompleteClass */
    override def replaceData(offset: Double, count: Double, data: String): Unit = js.native
    /* CompleteClass */
    override def selectNodes(xpath: String): typings.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
    /* CompleteClass */
    override def selectNodesNS(xpath: String, namespaces: js.Any): typings.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
    /* CompleteClass */
    override def selectSingleNode(xpath: String): IXmlNode = js.native
    /* CompleteClass */
    override def selectSingleNodeNS(xpath: String, namespaces: js.Any): IXmlNode = js.native
    /* CompleteClass */
    override def substringData(offset: Double, count: Double): String = js.native
  }
  
  @js.native
  class XmlDocument ()
    extends typings.winrt.Windows.Data.Xml.Dom.XmlDocument {
    /* CompleteClass */
    override var attributes: typings.winrt.Windows.Data.Xml.Dom.XmlNamedNodeMap = js.native
    /* CompleteClass */
    override var childNodes: typings.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
    /* CompleteClass */
    override var doctype: typings.winrt.Windows.Data.Xml.Dom.XmlDocumentType = js.native
    /* CompleteClass */
    override var documentElement: typings.winrt.Windows.Data.Xml.Dom.XmlElement = js.native
    /* CompleteClass */
    override var documentUri: String = js.native
    /* CompleteClass */
    override var firstChild: IXmlNode = js.native
    /* CompleteClass */
    override var implementation: typings.winrt.Windows.Data.Xml.Dom.XmlDomImplementation = js.native
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
    override var ownerDocument: typings.winrt.Windows.Data.Xml.Dom.XmlDocument = js.native
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
    override def createAttribute(name: String): typings.winrt.Windows.Data.Xml.Dom.XmlAttribute = js.native
    /* CompleteClass */
    override def createAttributeNS(namespaceUri: js.Any, qualifiedName: String): typings.winrt.Windows.Data.Xml.Dom.XmlAttribute = js.native
    /* CompleteClass */
    override def createCDataSection(data: String): typings.winrt.Windows.Data.Xml.Dom.XmlCDataSection = js.native
    /* CompleteClass */
    override def createComment(data: String): typings.winrt.Windows.Data.Xml.Dom.XmlComment = js.native
    /* CompleteClass */
    override def createDocumentFragment(): typings.winrt.Windows.Data.Xml.Dom.XmlDocumentFragment = js.native
    /* CompleteClass */
    override def createElement(tagName: String): typings.winrt.Windows.Data.Xml.Dom.XmlElement = js.native
    /* CompleteClass */
    override def createElementNS(namespaceUri: js.Any, qualifiedName: String): typings.winrt.Windows.Data.Xml.Dom.XmlElement = js.native
    /* CompleteClass */
    override def createEntityReference(name: String): typings.winrt.Windows.Data.Xml.Dom.XmlEntityReference = js.native
    /* CompleteClass */
    override def createProcessingInstruction(target: String, data: String): typings.winrt.Windows.Data.Xml.Dom.XmlProcessingInstruction = js.native
    /* CompleteClass */
    override def createTextNode(data: String): typings.winrt.Windows.Data.Xml.Dom.XmlText = js.native
    /* CompleteClass */
    override def getElementById(elementId: String): typings.winrt.Windows.Data.Xml.Dom.XmlElement = js.native
    /* CompleteClass */
    override def getElementsByTagName(tagName: String): typings.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
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
    override def selectNodes(xpath: String): typings.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
    /* CompleteClass */
    override def selectNodesNS(xpath: String, namespaces: js.Any): typings.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
    /* CompleteClass */
    override def selectSingleNode(xpath: String): IXmlNode = js.native
    /* CompleteClass */
    override def selectSingleNodeNS(xpath: String, namespaces: js.Any): IXmlNode = js.native
  }
  
  @js.native
  class XmlDocumentFragment ()
    extends typings.winrt.Windows.Data.Xml.Dom.XmlDocumentFragment {
    /* CompleteClass */
    override var attributes: typings.winrt.Windows.Data.Xml.Dom.XmlNamedNodeMap = js.native
    /* CompleteClass */
    override var childNodes: typings.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
    /* CompleteClass */
    override var firstChild: IXmlNode = js.native
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
    override var ownerDocument: typings.winrt.Windows.Data.Xml.Dom.XmlDocument = js.native
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
    override def getXml(): String = js.native
    /* CompleteClass */
    override def hasChildNodes(): Boolean = js.native
    /* CompleteClass */
    override def insertBefore(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
    /* CompleteClass */
    override def normalize(): Unit = js.native
    /* CompleteClass */
    override def removeChild(childNode: IXmlNode): IXmlNode = js.native
    /* CompleteClass */
    override def replaceChild(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
    /* CompleteClass */
    override def selectNodes(xpath: String): typings.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
    /* CompleteClass */
    override def selectNodesNS(xpath: String, namespaces: js.Any): typings.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
    /* CompleteClass */
    override def selectSingleNode(xpath: String): IXmlNode = js.native
    /* CompleteClass */
    override def selectSingleNodeNS(xpath: String, namespaces: js.Any): IXmlNode = js.native
  }
  
  @js.native
  class XmlDocumentType ()
    extends typings.winrt.Windows.Data.Xml.Dom.XmlDocumentType {
    /* CompleteClass */
    override var attributes: typings.winrt.Windows.Data.Xml.Dom.XmlNamedNodeMap = js.native
    /* CompleteClass */
    override var childNodes: typings.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
    /* CompleteClass */
    override var entities: typings.winrt.Windows.Data.Xml.Dom.XmlNamedNodeMap = js.native
    /* CompleteClass */
    override var firstChild: IXmlNode = js.native
    /* CompleteClass */
    override var innerText: String = js.native
    /* CompleteClass */
    override var lastChild: IXmlNode = js.native
    /* CompleteClass */
    override var localName: js.Any = js.native
    /* CompleteClass */
    override var name: String = js.native
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
    override var notations: typings.winrt.Windows.Data.Xml.Dom.XmlNamedNodeMap = js.native
    /* CompleteClass */
    override var ownerDocument: typings.winrt.Windows.Data.Xml.Dom.XmlDocument = js.native
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
    override def getXml(): String = js.native
    /* CompleteClass */
    override def hasChildNodes(): Boolean = js.native
    /* CompleteClass */
    override def insertBefore(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
    /* CompleteClass */
    override def normalize(): Unit = js.native
    /* CompleteClass */
    override def removeChild(childNode: IXmlNode): IXmlNode = js.native
    /* CompleteClass */
    override def replaceChild(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
    /* CompleteClass */
    override def selectNodes(xpath: String): typings.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
    /* CompleteClass */
    override def selectNodesNS(xpath: String, namespaces: js.Any): typings.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
    /* CompleteClass */
    override def selectSingleNode(xpath: String): IXmlNode = js.native
    /* CompleteClass */
    override def selectSingleNodeNS(xpath: String, namespaces: js.Any): IXmlNode = js.native
  }
  
  @js.native
  class XmlDomImplementation ()
    extends typings.winrt.Windows.Data.Xml.Dom.XmlDomImplementation {
    /* CompleteClass */
    override def hasFeature(feature: String, version: js.Any): Boolean = js.native
  }
  
  @js.native
  class XmlElement ()
    extends typings.winrt.Windows.Data.Xml.Dom.XmlElement {
    /* CompleteClass */
    override var attributes: typings.winrt.Windows.Data.Xml.Dom.XmlNamedNodeMap = js.native
    /* CompleteClass */
    override var childNodes: typings.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
    /* CompleteClass */
    override var firstChild: IXmlNode = js.native
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
    override var ownerDocument: typings.winrt.Windows.Data.Xml.Dom.XmlDocument = js.native
    /* CompleteClass */
    override var parentNode: IXmlNode = js.native
    /* CompleteClass */
    override var prefix: js.Any = js.native
    /* CompleteClass */
    override var previousSibling: IXmlNode = js.native
    /* CompleteClass */
    override var tagName: String = js.native
    /* CompleteClass */
    override def appendChild(newChild: IXmlNode): IXmlNode = js.native
    /* CompleteClass */
    override def cloneNode(deep: Boolean): IXmlNode = js.native
    /* CompleteClass */
    override def getAttribute(attributeName: String): String = js.native
    /* CompleteClass */
    override def getAttributeNS(namespaceUri: js.Any, localName: String): String = js.native
    /* CompleteClass */
    override def getAttributeNode(attributeName: String): typings.winrt.Windows.Data.Xml.Dom.XmlAttribute = js.native
    /* CompleteClass */
    override def getAttributeNodeNS(namespaceUri: js.Any, localName: String): typings.winrt.Windows.Data.Xml.Dom.XmlAttribute = js.native
    /* CompleteClass */
    override def getElementsByTagName(tagName: String): typings.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
    /* CompleteClass */
    override def getXml(): String = js.native
    /* CompleteClass */
    override def hasChildNodes(): Boolean = js.native
    /* CompleteClass */
    override def insertBefore(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
    /* CompleteClass */
    override def normalize(): Unit = js.native
    /* CompleteClass */
    override def removeAttribute(attributeName: String): Unit = js.native
    /* CompleteClass */
    override def removeAttributeNS(namespaceUri: js.Any, localName: String): Unit = js.native
    /* CompleteClass */
    override def removeAttributeNode(attributeNode: typings.winrt.Windows.Data.Xml.Dom.XmlAttribute): typings.winrt.Windows.Data.Xml.Dom.XmlAttribute = js.native
    /* CompleteClass */
    override def removeChild(childNode: IXmlNode): IXmlNode = js.native
    /* CompleteClass */
    override def replaceChild(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
    /* CompleteClass */
    override def selectNodes(xpath: String): typings.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
    /* CompleteClass */
    override def selectNodesNS(xpath: String, namespaces: js.Any): typings.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
    /* CompleteClass */
    override def selectSingleNode(xpath: String): IXmlNode = js.native
    /* CompleteClass */
    override def selectSingleNodeNS(xpath: String, namespaces: js.Any): IXmlNode = js.native
    /* CompleteClass */
    override def setAttribute(attributeName: String, attributeValue: String): Unit = js.native
    /* CompleteClass */
    override def setAttributeNS(namespaceUri: js.Any, qualifiedName: String, value: String): Unit = js.native
    /* CompleteClass */
    override def setAttributeNode(newAttribute: typings.winrt.Windows.Data.Xml.Dom.XmlAttribute): typings.winrt.Windows.Data.Xml.Dom.XmlAttribute = js.native
    /* CompleteClass */
    override def setAttributeNodeNS(newAttribute: typings.winrt.Windows.Data.Xml.Dom.XmlAttribute): typings.winrt.Windows.Data.Xml.Dom.XmlAttribute = js.native
  }
  
  @js.native
  class XmlEntityReference ()
    extends typings.winrt.Windows.Data.Xml.Dom.XmlEntityReference {
    /* CompleteClass */
    override var attributes: typings.winrt.Windows.Data.Xml.Dom.XmlNamedNodeMap = js.native
    /* CompleteClass */
    override var childNodes: typings.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
    /* CompleteClass */
    override var firstChild: IXmlNode = js.native
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
    override var ownerDocument: typings.winrt.Windows.Data.Xml.Dom.XmlDocument = js.native
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
    override def getXml(): String = js.native
    /* CompleteClass */
    override def hasChildNodes(): Boolean = js.native
    /* CompleteClass */
    override def insertBefore(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
    /* CompleteClass */
    override def normalize(): Unit = js.native
    /* CompleteClass */
    override def removeChild(childNode: IXmlNode): IXmlNode = js.native
    /* CompleteClass */
    override def replaceChild(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
    /* CompleteClass */
    override def selectNodes(xpath: String): typings.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
    /* CompleteClass */
    override def selectNodesNS(xpath: String, namespaces: js.Any): typings.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
    /* CompleteClass */
    override def selectSingleNode(xpath: String): IXmlNode = js.native
    /* CompleteClass */
    override def selectSingleNodeNS(xpath: String, namespaces: js.Any): IXmlNode = js.native
  }
  
  @js.native
  class XmlLoadSettings ()
    extends typings.winrt.Windows.Data.Xml.Dom.XmlLoadSettings {
    /* CompleteClass */
    override var elementContentWhiteSpace: Boolean = js.native
    /* CompleteClass */
    override var maxElementDepth: Double = js.native
    /* CompleteClass */
    override var prohibitDtd: Boolean = js.native
    /* CompleteClass */
    override var resolveExternals: Boolean = js.native
    /* CompleteClass */
    override var validateOnParse: Boolean = js.native
  }
  
  @js.native
  class XmlNamedNodeMap ()
    extends typings.winrt.Windows.Data.Xml.Dom.XmlNamedNodeMap {
    /* CompleteClass */
    override def first(): IIterator[IXmlNode] = js.native
  }
  
  @js.native
  class XmlNodeList ()
    extends typings.winrt.Windows.Data.Xml.Dom.XmlNodeList {
    /* CompleteClass */
    override def first(): IIterator[IXmlNode] = js.native
  }
  
  @js.native
  class XmlProcessingInstruction ()
    extends typings.winrt.Windows.Data.Xml.Dom.XmlProcessingInstruction {
    /* CompleteClass */
    override var attributes: typings.winrt.Windows.Data.Xml.Dom.XmlNamedNodeMap = js.native
    /* CompleteClass */
    override var childNodes: typings.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
    /* CompleteClass */
    override var data: String = js.native
    /* CompleteClass */
    override var firstChild: IXmlNode = js.native
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
    override var ownerDocument: typings.winrt.Windows.Data.Xml.Dom.XmlDocument = js.native
    /* CompleteClass */
    override var parentNode: IXmlNode = js.native
    /* CompleteClass */
    override var prefix: js.Any = js.native
    /* CompleteClass */
    override var previousSibling: IXmlNode = js.native
    /* CompleteClass */
    override var target: String = js.native
    /* CompleteClass */
    override def appendChild(newChild: IXmlNode): IXmlNode = js.native
    /* CompleteClass */
    override def cloneNode(deep: Boolean): IXmlNode = js.native
    /* CompleteClass */
    override def getXml(): String = js.native
    /* CompleteClass */
    override def hasChildNodes(): Boolean = js.native
    /* CompleteClass */
    override def insertBefore(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
    /* CompleteClass */
    override def normalize(): Unit = js.native
    /* CompleteClass */
    override def removeChild(childNode: IXmlNode): IXmlNode = js.native
    /* CompleteClass */
    override def replaceChild(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
    /* CompleteClass */
    override def selectNodes(xpath: String): typings.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
    /* CompleteClass */
    override def selectNodesNS(xpath: String, namespaces: js.Any): typings.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
    /* CompleteClass */
    override def selectSingleNode(xpath: String): IXmlNode = js.native
    /* CompleteClass */
    override def selectSingleNodeNS(xpath: String, namespaces: js.Any): IXmlNode = js.native
  }
  
  @js.native
  class XmlText ()
    extends typings.winrt.Windows.Data.Xml.Dom.XmlText {
    /* CompleteClass */
    override var attributes: typings.winrt.Windows.Data.Xml.Dom.XmlNamedNodeMap = js.native
    /* CompleteClass */
    override var childNodes: typings.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
    /* CompleteClass */
    override var data: String = js.native
    /* CompleteClass */
    override var firstChild: IXmlNode = js.native
    /* CompleteClass */
    override var innerText: String = js.native
    /* CompleteClass */
    override var lastChild: IXmlNode = js.native
    /* CompleteClass */
    override var length: Double = js.native
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
    override var ownerDocument: typings.winrt.Windows.Data.Xml.Dom.XmlDocument = js.native
    /* CompleteClass */
    override var parentNode: IXmlNode = js.native
    /* CompleteClass */
    override var prefix: js.Any = js.native
    /* CompleteClass */
    override var previousSibling: IXmlNode = js.native
    /* CompleteClass */
    override def appendChild(newChild: IXmlNode): IXmlNode = js.native
    /* CompleteClass */
    override def appendData(data: String): Unit = js.native
    /* CompleteClass */
    override def cloneNode(deep: Boolean): IXmlNode = js.native
    /* CompleteClass */
    override def deleteData(offset: Double, count: Double): Unit = js.native
    /* CompleteClass */
    override def getXml(): String = js.native
    /* CompleteClass */
    override def hasChildNodes(): Boolean = js.native
    /* CompleteClass */
    override def insertBefore(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
    /* CompleteClass */
    override def insertData(offset: Double, data: String): Unit = js.native
    /* CompleteClass */
    override def normalize(): Unit = js.native
    /* CompleteClass */
    override def removeChild(childNode: IXmlNode): IXmlNode = js.native
    /* CompleteClass */
    override def replaceChild(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
    /* CompleteClass */
    override def replaceData(offset: Double, count: Double, data: String): Unit = js.native
    /* CompleteClass */
    override def selectNodes(xpath: String): typings.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
    /* CompleteClass */
    override def selectNodesNS(xpath: String, namespaces: js.Any): typings.winrt.Windows.Data.Xml.Dom.XmlNodeList = js.native
    /* CompleteClass */
    override def selectSingleNode(xpath: String): IXmlNode = js.native
    /* CompleteClass */
    override def selectSingleNodeNS(xpath: String, namespaces: js.Any): IXmlNode = js.native
    /* CompleteClass */
    override def splitText(offset: Double): IXmlText = js.native
    /* CompleteClass */
    override def substringData(offset: Double, count: Double): String = js.native
  }
  
  @js.native
  object NodeType extends js.Object {
    /* 2 */ val attributeNode: typings.winrt.Windows.Data.Xml.Dom.NodeType.attributeNode with Double = js.native
    /* 8 */ val commentNode: typings.winrt.Windows.Data.Xml.Dom.NodeType.commentNode with Double = js.native
    /* 4 */ val dataSectionNode: typings.winrt.Windows.Data.Xml.Dom.NodeType.dataSectionNode with Double = js.native
    /* 11 */ val documentFragmentNode: typings.winrt.Windows.Data.Xml.Dom.NodeType.documentFragmentNode with Double = js.native
    /* 9 */ val documentNode: typings.winrt.Windows.Data.Xml.Dom.NodeType.documentNode with Double = js.native
    /* 10 */ val documentTypeNode: typings.winrt.Windows.Data.Xml.Dom.NodeType.documentTypeNode with Double = js.native
    /* 1 */ val elementNode: typings.winrt.Windows.Data.Xml.Dom.NodeType.elementNode with Double = js.native
    /* 6 */ val entityNode: typings.winrt.Windows.Data.Xml.Dom.NodeType.entityNode with Double = js.native
    /* 5 */ val entityReferenceNode: typings.winrt.Windows.Data.Xml.Dom.NodeType.entityReferenceNode with Double = js.native
    /* 0 */ val invalid: typings.winrt.Windows.Data.Xml.Dom.NodeType.invalid with Double = js.native
    /* 12 */ val notationNode: typings.winrt.Windows.Data.Xml.Dom.NodeType.notationNode with Double = js.native
    /* 7 */ val processingInstructionNode: typings.winrt.Windows.Data.Xml.Dom.NodeType.processingInstructionNode with Double = js.native
    /* 3 */ val textNode: typings.winrt.Windows.Data.Xml.Dom.NodeType.textNode with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Data.Xml.Dom.NodeType with Double] = js.native
  }
  
  /* static members */
  @js.native
  object XmlDocument extends js.Object {
    def loadFromFileAsync(file: IStorageFile): IAsyncOperation[typings.winrt.Windows.Data.Xml.Dom.XmlDocument] = js.native
    def loadFromFileAsync(file: IStorageFile, loadSettings: typings.winrt.Windows.Data.Xml.Dom.XmlLoadSettings): IAsyncOperation[typings.winrt.Windows.Data.Xml.Dom.XmlDocument] = js.native
    def loadFromUriAsync(uri: Uri): IAsyncOperation[typings.winrt.Windows.Data.Xml.Dom.XmlDocument] = js.native
    def loadFromUriAsync(uri: Uri, loadSettings: typings.winrt.Windows.Data.Xml.Dom.XmlLoadSettings): IAsyncOperation[typings.winrt.Windows.Data.Xml.Dom.XmlDocument] = js.native
  }
  
}

