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
    appendChild: js.Function1[IXmlNode, IXmlNode],
    attributes: XmlNamedNodeMap,
    childNodes: XmlNodeList,
    cloneNode: js.Function1[scala.Boolean, IXmlNode],
    createAttribute: js.Function1[java.lang.String, XmlAttribute],
    createAttributeNS: js.Function2[js.Any, java.lang.String, XmlAttribute],
    createCDataSection: js.Function1[java.lang.String, XmlCDataSection],
    createComment: js.Function1[java.lang.String, XmlComment],
    createDocumentFragment: js.Function0[XmlDocumentFragment],
    createElement: js.Function1[java.lang.String, XmlElement],
    createElementNS: js.Function2[js.Any, java.lang.String, XmlElement],
    createEntityReference: js.Function1[java.lang.String, XmlEntityReference],
    createProcessingInstruction: js.Function2[java.lang.String, java.lang.String, XmlProcessingInstruction],
    createTextNode: js.Function1[java.lang.String, XmlText],
    doctype: XmlDocumentType,
    documentElement: XmlElement,
    documentUri: java.lang.String,
    firstChild: IXmlNode,
    getElementById: js.Function1[java.lang.String, XmlElement],
    getElementsByTagName: js.Function1[java.lang.String, XmlNodeList],
    getXml: js.Function0[java.lang.String],
    hasChildNodes: js.Function0[scala.Boolean],
    implementation: XmlDomImplementation,
    importNode: js.Function2[IXmlNode, scala.Boolean, IXmlNode],
    innerText: java.lang.String,
    insertBefore: js.Function2[IXmlNode, IXmlNode, IXmlNode],
    lastChild: IXmlNode,
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
    selectNodes: js.Function1[java.lang.String, XmlNodeList],
    selectNodesNS: js.Function2[java.lang.String, js.Any, XmlNodeList],
    selectSingleNode: js.Function1[java.lang.String, IXmlNode],
    selectSingleNodeNS: js.Function2[java.lang.String, js.Any, IXmlNode]
  ): IXmlDocument = {
    val __obj = js.Dynamic.literal(appendChild = appendChild, attributes = attributes, childNodes = childNodes, cloneNode = cloneNode, createAttribute = createAttribute, createAttributeNS = createAttributeNS, createCDataSection = createCDataSection, createComment = createComment, createDocumentFragment = createDocumentFragment, createElement = createElement, createElementNS = createElementNS, createEntityReference = createEntityReference, createProcessingInstruction = createProcessingInstruction, createTextNode = createTextNode, doctype = doctype, documentElement = documentElement, documentUri = documentUri, firstChild = firstChild, getElementById = getElementById, getElementsByTagName = getElementsByTagName, getXml = getXml, hasChildNodes = hasChildNodes, implementation = implementation, importNode = importNode, innerText = innerText, insertBefore = insertBefore, lastChild = lastChild, localName = localName, namespaceUri = namespaceUri, nextSibling = nextSibling, nodeName = nodeName, nodeType = nodeType, nodeValue = nodeValue, normalize = normalize, ownerDocument = ownerDocument, parentNode = parentNode, prefix = prefix, previousSibling = previousSibling, removeChild = removeChild, replaceChild = replaceChild, selectNodes = selectNodes, selectNodesNS = selectNodesNS, selectSingleNode = selectSingleNode, selectSingleNodeNS = selectSingleNodeNS)
  
    __obj.asInstanceOf[IXmlDocument]
  }
}

