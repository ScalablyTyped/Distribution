package typings.winrt.Windows.Data.Xml.Dom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IXmlNode
  extends IXmlNodeSelector
     with IXmlNodeSerializer {
  var attributes: XmlNamedNodeMap = js.native
  var childNodes: XmlNodeList = js.native
  var firstChild: IXmlNode = js.native
  var lastChild: IXmlNode = js.native
  var localName: js.Any = js.native
  var namespaceUri: js.Any = js.native
  var nextSibling: IXmlNode = js.native
  var nodeName: String = js.native
  var nodeType: NodeType = js.native
  var nodeValue: js.Any = js.native
  var ownerDocument: XmlDocument = js.native
  var parentNode: IXmlNode = js.native
  var prefix: js.Any = js.native
  var previousSibling: IXmlNode = js.native
  def appendChild(newChild: IXmlNode): IXmlNode = js.native
  def cloneNode(deep: Boolean): IXmlNode = js.native
  def hasChildNodes(): Boolean = js.native
  def insertBefore(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
  def normalize(): Unit = js.native
  def removeChild(childNode: IXmlNode): IXmlNode = js.native
  def replaceChild(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
}

object IXmlNode {
  @scala.inline
  def apply(
    appendChild: IXmlNode => IXmlNode,
    attributes: XmlNamedNodeMap,
    childNodes: XmlNodeList,
    cloneNode: Boolean => IXmlNode,
    firstChild: IXmlNode,
    getXml: () => String,
    hasChildNodes: () => Boolean,
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
  ): IXmlNode = {
    val __obj = js.Dynamic.literal(appendChild = js.Any.fromFunction1(appendChild), attributes = attributes.asInstanceOf[js.Any], childNodes = childNodes.asInstanceOf[js.Any], cloneNode = js.Any.fromFunction1(cloneNode), firstChild = firstChild.asInstanceOf[js.Any], getXml = js.Any.fromFunction0(getXml), hasChildNodes = js.Any.fromFunction0(hasChildNodes), innerText = innerText.asInstanceOf[js.Any], insertBefore = js.Any.fromFunction2(insertBefore), lastChild = lastChild.asInstanceOf[js.Any], localName = localName.asInstanceOf[js.Any], namespaceUri = namespaceUri.asInstanceOf[js.Any], nextSibling = nextSibling.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], nodeValue = nodeValue.asInstanceOf[js.Any], normalize = js.Any.fromFunction0(normalize), ownerDocument = ownerDocument.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], previousSibling = previousSibling.asInstanceOf[js.Any], removeChild = js.Any.fromFunction1(removeChild), replaceChild = js.Any.fromFunction2(replaceChild), selectNodes = js.Any.fromFunction1(selectNodes), selectNodesNS = js.Any.fromFunction2(selectNodesNS), selectSingleNode = js.Any.fromFunction1(selectSingleNode), selectSingleNodeNS = js.Any.fromFunction2(selectSingleNodeNS))
    __obj.asInstanceOf[IXmlNode]
  }
  @scala.inline
  implicit class IXmlNodeOps[Self <: IXmlNode] (val x: Self) extends AnyVal {
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
    def setAppendChild(value: IXmlNode => IXmlNode): Self = this.set("appendChild", js.Any.fromFunction1(value))
    @scala.inline
    def setAttributes(value: XmlNamedNodeMap): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildNodes(value: XmlNodeList): Self = this.set("childNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def setCloneNode(value: Boolean => IXmlNode): Self = this.set("cloneNode", js.Any.fromFunction1(value))
    @scala.inline
    def setFirstChild(value: IXmlNode): Self = this.set("firstChild", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasChildNodes(value: () => Boolean): Self = this.set("hasChildNodes", js.Any.fromFunction0(value))
    @scala.inline
    def setInsertBefore(value: (IXmlNode, IXmlNode) => IXmlNode): Self = this.set("insertBefore", js.Any.fromFunction2(value))
    @scala.inline
    def setLastChild(value: IXmlNode): Self = this.set("lastChild", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocalName(value: js.Any): Self = this.set("localName", value.asInstanceOf[js.Any])
    @scala.inline
    def setNamespaceUri(value: js.Any): Self = this.set("namespaceUri", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextSibling(value: IXmlNode): Self = this.set("nextSibling", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodeName(value: String): Self = this.set("nodeName", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodeType(value: NodeType): Self = this.set("nodeType", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodeValue(value: js.Any): Self = this.set("nodeValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setNormalize(value: () => Unit): Self = this.set("normalize", js.Any.fromFunction0(value))
    @scala.inline
    def setOwnerDocument(value: XmlDocument): Self = this.set("ownerDocument", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentNode(value: IXmlNode): Self = this.set("parentNode", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefix(value: js.Any): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreviousSibling(value: IXmlNode): Self = this.set("previousSibling", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveChild(value: IXmlNode => IXmlNode): Self = this.set("removeChild", js.Any.fromFunction1(value))
    @scala.inline
    def setReplaceChild(value: (IXmlNode, IXmlNode) => IXmlNode): Self = this.set("replaceChild", js.Any.fromFunction2(value))
  }
  
}

