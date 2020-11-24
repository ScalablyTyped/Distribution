package typings.winrt.Windows.Data.Xml.Dom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IXmlDocument extends IXmlNode {
  
  def createAttribute(name: String): XmlAttribute = js.native
  
  def createAttributeNS(namespaceUri: js.Any, qualifiedName: String): XmlAttribute = js.native
  
  def createCDataSection(data: String): XmlCDataSection = js.native
  
  def createComment(data: String): XmlComment = js.native
  
  def createDocumentFragment(): XmlDocumentFragment = js.native
  
  def createElement(tagName: String): XmlElement = js.native
  
  def createElementNS(namespaceUri: js.Any, qualifiedName: String): XmlElement = js.native
  
  def createEntityReference(name: String): XmlEntityReference = js.native
  
  def createProcessingInstruction(target: String, data: String): XmlProcessingInstruction = js.native
  
  def createTextNode(data: String): XmlText = js.native
  
  var doctype: XmlDocumentType = js.native
  
  var documentElement: XmlElement = js.native
  
  var documentUri: String = js.native
  
  def getElementById(elementId: String): XmlElement = js.native
  
  def getElementsByTagName(tagName: String): XmlNodeList = js.native
  
  var implementation: XmlDomImplementation = js.native
  
  def importNode(node: IXmlNode, deep: Boolean): IXmlNode = js.native
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
  implicit class IXmlDocumentOps[Self <: IXmlDocument] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreateAttribute(value: String => XmlAttribute): Self = this.set("createAttribute", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateAttributeNS(value: (js.Any, String) => XmlAttribute): Self = this.set("createAttributeNS", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateCDataSection(value: String => XmlCDataSection): Self = this.set("createCDataSection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateComment(value: String => XmlComment): Self = this.set("createComment", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateDocumentFragment(value: () => XmlDocumentFragment): Self = this.set("createDocumentFragment", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateElement(value: String => XmlElement): Self = this.set("createElement", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateElementNS(value: (js.Any, String) => XmlElement): Self = this.set("createElementNS", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateEntityReference(value: String => XmlEntityReference): Self = this.set("createEntityReference", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateProcessingInstruction(value: (String, String) => XmlProcessingInstruction): Self = this.set("createProcessingInstruction", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateTextNode(value: String => XmlText): Self = this.set("createTextNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDoctype(value: XmlDocumentType): Self = this.set("doctype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentElement(value: XmlElement): Self = this.set("documentElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentUri(value: String): Self = this.set("documentUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetElementById(value: String => XmlElement): Self = this.set("getElementById", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetElementsByTagName(value: String => XmlNodeList): Self = this.set("getElementsByTagName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setImplementation(value: XmlDomImplementation): Self = this.set("implementation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportNode(value: (IXmlNode, Boolean) => IXmlNode): Self = this.set("importNode", js.Any.fromFunction2(value))
  }
}
