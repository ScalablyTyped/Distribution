package typings.winrt.Windows.Data.Xml.Dom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IXmlDocument extends IXmlNode {
  var doctype: XmlDocumentType
  var documentElement: XmlElement
  var documentUri: String
  var implementation: XmlDomImplementation
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
  def getElementById(elementId: String): XmlElement
  def getElementsByTagName(tagName: String): XmlNodeList
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
    val __obj = js.Dynamic.literal(appendChild = js.Any.fromFunction1(appendChild), attributes = attributes, childNodes = childNodes, cloneNode = js.Any.fromFunction1(cloneNode), createAttribute = js.Any.fromFunction1(createAttribute), createAttributeNS = js.Any.fromFunction2(createAttributeNS), createCDataSection = js.Any.fromFunction1(createCDataSection), createComment = js.Any.fromFunction1(createComment), createDocumentFragment = js.Any.fromFunction0(createDocumentFragment), createElement = js.Any.fromFunction1(createElement), createElementNS = js.Any.fromFunction2(createElementNS), createEntityReference = js.Any.fromFunction1(createEntityReference), createProcessingInstruction = js.Any.fromFunction2(createProcessingInstruction), createTextNode = js.Any.fromFunction1(createTextNode), doctype = doctype, documentElement = documentElement, documentUri = documentUri, firstChild = firstChild, getElementById = js.Any.fromFunction1(getElementById), getElementsByTagName = js.Any.fromFunction1(getElementsByTagName), getXml = js.Any.fromFunction0(getXml), hasChildNodes = js.Any.fromFunction0(hasChildNodes), implementation = implementation, importNode = js.Any.fromFunction2(importNode), innerText = innerText, insertBefore = js.Any.fromFunction2(insertBefore), lastChild = lastChild, localName = localName, namespaceUri = namespaceUri, nextSibling = nextSibling, nodeName = nodeName, nodeType = nodeType, nodeValue = nodeValue, normalize = js.Any.fromFunction0(normalize), ownerDocument = ownerDocument, parentNode = parentNode, prefix = prefix, previousSibling = previousSibling, removeChild = js.Any.fromFunction1(removeChild), replaceChild = js.Any.fromFunction2(replaceChild), selectNodes = js.Any.fromFunction1(selectNodes), selectNodesNS = js.Any.fromFunction2(selectNodesNS), selectSingleNode = js.Any.fromFunction1(selectSingleNode), selectSingleNodeNS = js.Any.fromFunction2(selectSingleNodeNS))
  
    __obj.asInstanceOf[IXmlDocument]
  }
}

