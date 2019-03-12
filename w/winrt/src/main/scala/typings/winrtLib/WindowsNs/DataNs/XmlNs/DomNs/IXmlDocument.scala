package typings
package winrtLib.WindowsNs.DataNs.XmlNs.DomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IXmlDocument extends IXmlNode {
  var doctype: XmlDocumentType
  var documentElement: XmlElement
  var documentUri: java.lang.String
  var implementation: XmlDomImplementation
  def createAttribute(name: java.lang.String): XmlAttribute
  def createAttributeNS(namespaceUri: js.Any, qualifiedName: java.lang.String): XmlAttribute
  def createCDataSection(data: java.lang.String): XmlCDataSection
  def createComment(data: java.lang.String): XmlComment
  def createDocumentFragment(): XmlDocumentFragment
  def createElement(tagName: java.lang.String): XmlElement
  def createElementNS(namespaceUri: js.Any, qualifiedName: java.lang.String): XmlElement
  def createEntityReference(name: java.lang.String): XmlEntityReference
  def createProcessingInstruction(target: java.lang.String, data: java.lang.String): XmlProcessingInstruction
  def createTextNode(data: java.lang.String): XmlText
  def getElementById(elementId: java.lang.String): XmlElement
  def getElementsByTagName(tagName: java.lang.String): XmlNodeList
  def importNode(node: IXmlNode, deep: scala.Boolean): IXmlNode
}

object IXmlDocument {
  @scala.inline
  def apply(
    appendChild: IXmlNode => IXmlNode,
    attributes: XmlNamedNodeMap,
    childNodes: XmlNodeList,
    cloneNode: scala.Boolean => IXmlNode,
    createAttribute: java.lang.String => XmlAttribute,
    createAttributeNS: (js.Any, java.lang.String) => XmlAttribute,
    createCDataSection: java.lang.String => XmlCDataSection,
    createComment: java.lang.String => XmlComment,
    createDocumentFragment: () => XmlDocumentFragment,
    createElement: java.lang.String => XmlElement,
    createElementNS: (js.Any, java.lang.String) => XmlElement,
    createEntityReference: java.lang.String => XmlEntityReference,
    createProcessingInstruction: (java.lang.String, java.lang.String) => XmlProcessingInstruction,
    createTextNode: java.lang.String => XmlText,
    doctype: XmlDocumentType,
    documentElement: XmlElement,
    documentUri: java.lang.String,
    firstChild: IXmlNode,
    getElementById: java.lang.String => XmlElement,
    getElementsByTagName: java.lang.String => XmlNodeList,
    getXml: () => java.lang.String,
    hasChildNodes: () => scala.Boolean,
    implementation: XmlDomImplementation,
    importNode: (IXmlNode, scala.Boolean) => IXmlNode,
    innerText: java.lang.String,
    insertBefore: (IXmlNode, IXmlNode) => IXmlNode,
    lastChild: IXmlNode,
    localName: js.Any,
    namespaceUri: js.Any,
    nextSibling: IXmlNode,
    nodeName: java.lang.String,
    nodeType: NodeType,
    nodeValue: js.Any,
    normalize: () => scala.Unit,
    ownerDocument: XmlDocument,
    parentNode: IXmlNode,
    prefix: js.Any,
    previousSibling: IXmlNode,
    removeChild: IXmlNode => IXmlNode,
    replaceChild: (IXmlNode, IXmlNode) => IXmlNode,
    selectNodes: java.lang.String => XmlNodeList,
    selectNodesNS: (java.lang.String, js.Any) => XmlNodeList,
    selectSingleNode: java.lang.String => IXmlNode,
    selectSingleNodeNS: (java.lang.String, js.Any) => IXmlNode
  ): IXmlDocument = {
    val __obj = js.Dynamic.literal(appendChild = js.Any.fromFunction1(appendChild), attributes = attributes, childNodes = childNodes, cloneNode = js.Any.fromFunction1(cloneNode), createAttribute = js.Any.fromFunction1(createAttribute), createAttributeNS = js.Any.fromFunction2(createAttributeNS), createCDataSection = js.Any.fromFunction1(createCDataSection), createComment = js.Any.fromFunction1(createComment), createDocumentFragment = js.Any.fromFunction0(createDocumentFragment), createElement = js.Any.fromFunction1(createElement), createElementNS = js.Any.fromFunction2(createElementNS), createEntityReference = js.Any.fromFunction1(createEntityReference), createProcessingInstruction = js.Any.fromFunction2(createProcessingInstruction), createTextNode = js.Any.fromFunction1(createTextNode), doctype = doctype, documentElement = documentElement, documentUri = documentUri, firstChild = firstChild, getElementById = js.Any.fromFunction1(getElementById), getElementsByTagName = js.Any.fromFunction1(getElementsByTagName), getXml = js.Any.fromFunction0(getXml), hasChildNodes = js.Any.fromFunction0(hasChildNodes), implementation = implementation, importNode = js.Any.fromFunction2(importNode), innerText = innerText, insertBefore = js.Any.fromFunction2(insertBefore), lastChild = lastChild, localName = localName, namespaceUri = namespaceUri, nextSibling = nextSibling, nodeName = nodeName, nodeType = nodeType, nodeValue = nodeValue, normalize = js.Any.fromFunction0(normalize), ownerDocument = ownerDocument, parentNode = parentNode, prefix = prefix, previousSibling = previousSibling, removeChild = js.Any.fromFunction1(removeChild), replaceChild = js.Any.fromFunction2(replaceChild), selectNodes = js.Any.fromFunction1(selectNodes), selectNodesNS = js.Any.fromFunction2(selectNodesNS), selectSingleNode = js.Any.fromFunction1(selectSingleNode), selectSingleNodeNS = js.Any.fromFunction2(selectSingleNodeNS))
  
    __obj.asInstanceOf[IXmlDocument]
  }
}

