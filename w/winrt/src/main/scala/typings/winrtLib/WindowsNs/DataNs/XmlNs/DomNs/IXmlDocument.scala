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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("appendChild")(appendChild)
    __obj.updateDynamic("attributes")(attributes)
    __obj.updateDynamic("childNodes")(childNodes)
    __obj.updateDynamic("cloneNode")(cloneNode)
    __obj.updateDynamic("createAttribute")(createAttribute)
    __obj.updateDynamic("createAttributeNS")(createAttributeNS)
    __obj.updateDynamic("createCDataSection")(createCDataSection)
    __obj.updateDynamic("createComment")(createComment)
    __obj.updateDynamic("createDocumentFragment")(createDocumentFragment)
    __obj.updateDynamic("createElement")(createElement)
    __obj.updateDynamic("createElementNS")(createElementNS)
    __obj.updateDynamic("createEntityReference")(createEntityReference)
    __obj.updateDynamic("createProcessingInstruction")(createProcessingInstruction)
    __obj.updateDynamic("createTextNode")(createTextNode)
    __obj.updateDynamic("doctype")(doctype)
    __obj.updateDynamic("documentElement")(documentElement)
    __obj.updateDynamic("documentUri")(documentUri)
    __obj.updateDynamic("firstChild")(firstChild)
    __obj.updateDynamic("getElementById")(getElementById)
    __obj.updateDynamic("getElementsByTagName")(getElementsByTagName)
    __obj.updateDynamic("getXml")(getXml)
    __obj.updateDynamic("hasChildNodes")(hasChildNodes)
    __obj.updateDynamic("implementation")(implementation)
    __obj.updateDynamic("importNode")(importNode)
    __obj.updateDynamic("innerText")(innerText)
    __obj.updateDynamic("insertBefore")(insertBefore)
    __obj.updateDynamic("lastChild")(lastChild)
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
    __obj.updateDynamic("selectNodes")(selectNodes)
    __obj.updateDynamic("selectNodesNS")(selectNodesNS)
    __obj.updateDynamic("selectSingleNode")(selectSingleNode)
    __obj.updateDynamic("selectSingleNodeNS")(selectSingleNodeNS)
    __obj.asInstanceOf[IXmlDocument]
  }
}

