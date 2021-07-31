package typings.winrt.Windows.Data.Xml.Dom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IXmlDocument
  extends StObject
     with IXmlNode {
  
  def createAttribute(name: String): XmlAttribute
  
  def createAttributeNS(namespaceUri: js.Any, qualifiedName: String): XmlAttribute
  
  def createCDataSection(data: String): XmlCDataSection
  
  def createComment(data: String): XmlComment
  
  def createDocumentFragment(): XmlDocumentFragment
  
  def createElement(tagName: String): XmlElement
  
  def createElementNS(namespaceUri: js.Any, qualifiedName: String): XmlElement
  
  def createEntityReference(name: String): XmlEntityReference
  
  def createProcessingInstruction(target: String, data: String): XmlProcessingInstruction
  
  def createTextNode(data: String): XmlText
  
  var doctype: XmlDocumentType
  
  var documentElement: XmlElement
  
  var documentUri: String
  
  def getElementById(elementId: String): XmlElement
  
  def getElementsByTagName(tagName: String): XmlNodeList
  
  var implementation: XmlDomImplementation
  
  def importNode(node: IXmlNode, deep: Boolean): IXmlNode
}
object IXmlDocument {
  
  @scala.inline
  def apply(
    appendChild: IXmlNode => IXmlNode,
    attributes: XmlNamedNodeMap,
    childNodes: XmlNodeList,
    cloneNode: Boolean => IXmlNode,
    createAttribute: String => XmlAttribute,
    createAttributeNS: (js.Any, String) => XmlAttribute,
    createCDataSection: String => XmlCDataSection,
    createComment: String => XmlComment,
    createDocumentFragment: () => XmlDocumentFragment,
    createElement: String => XmlElement,
    createElementNS: (js.Any, String) => XmlElement,
    createEntityReference: String => XmlEntityReference,
    createProcessingInstruction: (String, String) => XmlProcessingInstruction,
    createTextNode: String => XmlText,
    doctype: XmlDocumentType,
    documentElement: XmlElement,
    documentUri: String,
    firstChild: IXmlNode,
    getElementById: String => XmlElement,
    getElementsByTagName: String => XmlNodeList,
    getXml: () => String,
    hasChildNodes: () => Boolean,
    implementation: XmlDomImplementation,
    importNode: (IXmlNode, Boolean) => IXmlNode,
    innerText: String,
    insertBefore: (IXmlNode, IXmlNode) => IXmlNode,
    lastChild: IXmlNode,
    localName: js.Any,
    namespaceUri: js.Any,
    nextSibling: IXmlNode,
    nodeName: String,
    nodeType: NodeType,
    nodeValue: js.Any,
    normalize: () => Unit,
    ownerDocument: XmlDocument,
    parentNode: IXmlNode,
    prefix: js.Any,
    previousSibling: IXmlNode,
    removeChild: IXmlNode => IXmlNode,
    replaceChild: (IXmlNode, IXmlNode) => IXmlNode,
    selectNodes: String => XmlNodeList,
    selectNodesNS: (String, js.Any) => XmlNodeList,
    selectSingleNode: String => IXmlNode,
    selectSingleNodeNS: (String, js.Any) => IXmlNode
  ): IXmlDocument = {
    val __obj = js.Dynamic.literal(appendChild = js.Any.fromFunction1(appendChild), attributes = attributes.asInstanceOf[js.Any], childNodes = childNodes.asInstanceOf[js.Any], cloneNode = js.Any.fromFunction1(cloneNode), createAttribute = js.Any.fromFunction1(createAttribute), createAttributeNS = js.Any.fromFunction2(createAttributeNS), createCDataSection = js.Any.fromFunction1(createCDataSection), createComment = js.Any.fromFunction1(createComment), createDocumentFragment = js.Any.fromFunction0(createDocumentFragment), createElement = js.Any.fromFunction1(createElement), createElementNS = js.Any.fromFunction2(createElementNS), createEntityReference = js.Any.fromFunction1(createEntityReference), createProcessingInstruction = js.Any.fromFunction2(createProcessingInstruction), createTextNode = js.Any.fromFunction1(createTextNode), doctype = doctype.asInstanceOf[js.Any], documentElement = documentElement.asInstanceOf[js.Any], documentUri = documentUri.asInstanceOf[js.Any], firstChild = firstChild.asInstanceOf[js.Any], getElementById = js.Any.fromFunction1(getElementById), getElementsByTagName = js.Any.fromFunction1(getElementsByTagName), getXml = js.Any.fromFunction0(getXml), hasChildNodes = js.Any.fromFunction0(hasChildNodes), implementation = implementation.asInstanceOf[js.Any], importNode = js.Any.fromFunction2(importNode), innerText = innerText.asInstanceOf[js.Any], insertBefore = js.Any.fromFunction2(insertBefore), lastChild = lastChild.asInstanceOf[js.Any], localName = localName.asInstanceOf[js.Any], namespaceUri = namespaceUri.asInstanceOf[js.Any], nextSibling = nextSibling.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], nodeValue = nodeValue.asInstanceOf[js.Any], normalize = js.Any.fromFunction0(normalize), ownerDocument = ownerDocument.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], previousSibling = previousSibling.asInstanceOf[js.Any], removeChild = js.Any.fromFunction1(removeChild), replaceChild = js.Any.fromFunction2(replaceChild), selectNodes = js.Any.fromFunction1(selectNodes), selectNodesNS = js.Any.fromFunction2(selectNodesNS), selectSingleNode = js.Any.fromFunction1(selectSingleNode), selectSingleNodeNS = js.Any.fromFunction2(selectSingleNodeNS))
    __obj.asInstanceOf[IXmlDocument]
  }
  
  @scala.inline
  implicit class IXmlDocumentMutableBuilder[Self <: IXmlDocument] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateAttribute(value: String => XmlAttribute): Self = StObject.set(x, "createAttribute", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateAttributeNS(value: (js.Any, String) => XmlAttribute): Self = StObject.set(x, "createAttributeNS", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateCDataSection(value: String => XmlCDataSection): Self = StObject.set(x, "createCDataSection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateComment(value: String => XmlComment): Self = StObject.set(x, "createComment", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateDocumentFragment(value: () => XmlDocumentFragment): Self = StObject.set(x, "createDocumentFragment", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateElement(value: String => XmlElement): Self = StObject.set(x, "createElement", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateElementNS(value: (js.Any, String) => XmlElement): Self = StObject.set(x, "createElementNS", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateEntityReference(value: String => XmlEntityReference): Self = StObject.set(x, "createEntityReference", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateProcessingInstruction(value: (String, String) => XmlProcessingInstruction): Self = StObject.set(x, "createProcessingInstruction", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateTextNode(value: String => XmlText): Self = StObject.set(x, "createTextNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDoctype(value: XmlDocumentType): Self = StObject.set(x, "doctype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentElement(value: XmlElement): Self = StObject.set(x, "documentElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentUri(value: String): Self = StObject.set(x, "documentUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetElementById(value: String => XmlElement): Self = StObject.set(x, "getElementById", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetElementsByTagName(value: String => XmlNodeList): Self = StObject.set(x, "getElementsByTagName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setImplementation(value: XmlDomImplementation): Self = StObject.set(x, "implementation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportNode(value: (IXmlNode, Boolean) => IXmlNode): Self = StObject.set(x, "importNode", js.Any.fromFunction2(value))
  }
}
