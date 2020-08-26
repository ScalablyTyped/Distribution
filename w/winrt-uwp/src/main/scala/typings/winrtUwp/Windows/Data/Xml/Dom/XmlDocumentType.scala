package typings.winrtUwp.Windows.Data.Xml.Dom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information associated with the document type. */
@js.native
trait XmlDocumentType extends js.Object {
  /** Gets the list of attributes of this node. */
  var attributes: XmlNamedNodeMap = js.native
  /** Gets a list of children in the current node. */
  var childNodes: XmlNodeList = js.native
  /** Gets a list of the entities declared in the <!DOCTYPE> declaration. */
  var entities: XmlNamedNodeMap = js.native
  /** Gets the first child node. */
  var firstChild: IXmlNode = js.native
  /** Gets the text from inside the XML. */
  var innerText: String = js.native
  /** Gets the last child node. */
  var lastChild: IXmlNode = js.native
  /** Gets the local name, which is the local part of a qualified name. This is called the local part in Namespaces in XML. */
  var localName: js.Any = js.native
  /** A list of the general entities, both external and internal, that are present in this document. */
  var name: String = js.native
  /** Returns the Uniform Resource Identifier (URI) for the namespace. */
  var namespaceUri: js.Any = js.native
  /** Gets the next sibling of the node in the parent's child list. */
  var nextSibling: IXmlNode = js.native
  /** Returns the qualified name for attribute, document type, element, entity, or notation nodes. Returns a fixed string for all other node types. */
  var nodeName: String = js.native
  /** Gets the XML Document Object Model (DOM) node type, which determines valid values and whether the node can have child nodes. */
  var nodeType: NodeType = js.native
  /** Gets or sets the text associated with the node. */
  var nodeValue: js.Any = js.native
  /** Returns a list of the DtdNotation members that are present in the document type declaration. */
  var notations: XmlNamedNodeMap = js.native
  /** Returns the root of the document that contains the node. */
  var ownerDocument: XmlDocument = js.native
  /** Gets the parent node of the node instance. */
  var parentNode: IXmlNode = js.native
  /** Gets or sets the namespace prefix. */
  var prefix: js.Any = js.native
  /** Gets the previous sibling of the node in the parent's child list. */
  var previousSibling: IXmlNode = js.native
  /**
    * Appends a new child node as the last child of the node.
    * @param newChild The new child node to be appended to the end of the list of children of this node.
    * @return The new child node successfully appended to the list. If null, no object is created.
    */
  def appendChild(newChild: IXmlNode): IXmlNode = js.native
  /**
    * Clones a new node.
    * @param deep A flag that indicates whether to recursively clone all nodes that are descendants of this node. If true, this method creates a clone of the complete tree below this node. If false, this method clones this node and its attributes only.
    * @return The newly created clone node.
    */
  def cloneNode(deep: Boolean): IXmlNode = js.native
  /**
    * Returns the XML representation of the node and all its descendants.
    * @return The XML representation of the node and all its descendants.
    */
  def getXml(): String = js.native
  /**
    * Determines whether a node has children.
    * @return True if this node has children; otherwise false.
    */
  def hasChildNodes(): Boolean = js.native
  /**
    * Inserts a child node to the left of the specified node, or at the end of the list.
    * @param newChild The address of the new node to be inserted. The node passed here must be a valid child of the current XML DOM document node. For example, if the current node is an attribute, you cannot pass another attribute in the newChild parameter, because an attribute cannot have an attribute as a child. If newChild is a DOCUMENT_FRAGMENT node type, all its children are inserted in order before referenceChild.
    * @param referenceChild The reference node. The node specified is where the newChild node is to be inserted to the left as the preceding sibling in the child list. The node passed here must be a either a child node of the current node or null. If the value is null, the newChild node is inserted at the end of the child list. If the referenceChild node is not a child of the current node, an error is returned.
    * @return On success, the child node that was inserted. If null, no object is created.
    */
  def insertBefore(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
  /** Normalizes all descendant elements by combining two or more adjacent text nodes into one unified text node. */
  def normalize(): Unit = js.native
  /**
    * Removes the specified child node from the list of children and returns it.
    * @param childNode The child node to be removed from the list of children of this node.
    * @return The removed child node. If null, the childNode object is not removed.
    */
  def removeChild(childNode: IXmlNode): IXmlNode = js.native
  /**
    * Replaces the specified old child node with the supplied new child node.
    * @param newChild The new child that is to replace the old child. If null, the referenceChild parameter is removed without a replacement.
    * @param referenceChild The old child that is to be replaced by the new child.
    * @return The old child that is replaced. If null, no object is created.
    */
  def replaceChild(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
  /**
    * Applies the specified pattern-matching operation to this node's context and returns the list of matching nodes as an XmlNodeList .
    * @param xpath Specifies an XPath expression.
    * @return The collection of nodes selected by applying the given pattern-matching operation. If no nodes are selected, this method returns an empty collection.
    */
  def selectNodes(xpath: String): XmlNodeList = js.native
  /**
    * Applies the specified pattern-matching operation to this node's context and returns the list of matching nodes as an XmlNodeList .
    * @param xpath Specifies an XPath expression.
    * @param namespaces Contains a string that specifies namespaces for use in XPath expressions when it is necessary to define new namespaces externally. Namespaces are defined in the XML style, as a space-separated list of namespace declaration attributes. You can use this property to set the default namespace as well.
    * @return The collection of nodes selected by applying the given pattern-matching operation. If no nodes are selected, returns an empty collection.
    */
  def selectNodesNS(xpath: String, namespaces: js.Any): XmlNodeList = js.native
  /**
    * Applies the specified pattern-matching operation to this node's context and returns the first matching node.
    * @param xpath Specifies an XPath expression.
    * @return The first node that matches the given pattern-matching operation. If no nodes match the expression, the method returns a null value.
    */
  def selectSingleNode(xpath: String): IXmlNode = js.native
  /**
    * Applies the specified pattern-matching operation to this node's context and returns the first matching node.
    * @param xpath Specifies an XPath expression.
    * @param namespaces Contains a string that specifies the namespaces to use in XPath expressions when it is necessary to define new namespaces externally. Namespaces are defined in the XML style, as a space-separated list of namespace declaration attributes. You can use this property to set the default namespace as well.
    * @return The first node that matches the given pattern-matching operation. If no nodes match the expression, this method returns a null value.
    */
  def selectSingleNodeNS(xpath: String, namespaces: js.Any): IXmlNode = js.native
}

object XmlDocumentType {
  @scala.inline
  def apply(
    appendChild: IXmlNode => IXmlNode,
    attributes: XmlNamedNodeMap,
    childNodes: XmlNodeList,
    cloneNode: Boolean => IXmlNode,
    entities: XmlNamedNodeMap,
    firstChild: IXmlNode,
    getXml: () => String,
    hasChildNodes: () => Boolean,
    innerText: String,
    insertBefore: (IXmlNode, IXmlNode) => IXmlNode,
    lastChild: IXmlNode,
    localName: js.Any,
    name: String,
    namespaceUri: js.Any,
    nextSibling: IXmlNode,
    nodeName: String,
    nodeType: NodeType,
    nodeValue: js.Any,
    normalize: () => Unit,
    notations: XmlNamedNodeMap,
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
  ): XmlDocumentType = {
    val __obj = js.Dynamic.literal(appendChild = js.Any.fromFunction1(appendChild), attributes = attributes.asInstanceOf[js.Any], childNodes = childNodes.asInstanceOf[js.Any], cloneNode = js.Any.fromFunction1(cloneNode), entities = entities.asInstanceOf[js.Any], firstChild = firstChild.asInstanceOf[js.Any], getXml = js.Any.fromFunction0(getXml), hasChildNodes = js.Any.fromFunction0(hasChildNodes), innerText = innerText.asInstanceOf[js.Any], insertBefore = js.Any.fromFunction2(insertBefore), lastChild = lastChild.asInstanceOf[js.Any], localName = localName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespaceUri = namespaceUri.asInstanceOf[js.Any], nextSibling = nextSibling.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], nodeValue = nodeValue.asInstanceOf[js.Any], normalize = js.Any.fromFunction0(normalize), notations = notations.asInstanceOf[js.Any], ownerDocument = ownerDocument.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], previousSibling = previousSibling.asInstanceOf[js.Any], removeChild = js.Any.fromFunction1(removeChild), replaceChild = js.Any.fromFunction2(replaceChild), selectNodes = js.Any.fromFunction1(selectNodes), selectNodesNS = js.Any.fromFunction2(selectNodesNS), selectSingleNode = js.Any.fromFunction1(selectSingleNode), selectSingleNodeNS = js.Any.fromFunction2(selectSingleNodeNS))
    __obj.asInstanceOf[XmlDocumentType]
  }
  @scala.inline
  implicit class XmlDocumentTypeOps[Self <: XmlDocumentType] (val x: Self) extends AnyVal {
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
    def setEntities(value: XmlNamedNodeMap): Self = this.set("entities", value.asInstanceOf[js.Any])
    @scala.inline
    def setFirstChild(value: IXmlNode): Self = this.set("firstChild", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetXml(value: () => String): Self = this.set("getXml", js.Any.fromFunction0(value))
    @scala.inline
    def setHasChildNodes(value: () => Boolean): Self = this.set("hasChildNodes", js.Any.fromFunction0(value))
    @scala.inline
    def setInnerText(value: String): Self = this.set("innerText", value.asInstanceOf[js.Any])
    @scala.inline
    def setInsertBefore(value: (IXmlNode, IXmlNode) => IXmlNode): Self = this.set("insertBefore", js.Any.fromFunction2(value))
    @scala.inline
    def setLastChild(value: IXmlNode): Self = this.set("lastChild", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocalName(value: js.Any): Self = this.set("localName", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
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
    def setNotations(value: XmlNamedNodeMap): Self = this.set("notations", value.asInstanceOf[js.Any])
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
    @scala.inline
    def setSelectNodes(value: String => XmlNodeList): Self = this.set("selectNodes", js.Any.fromFunction1(value))
    @scala.inline
    def setSelectNodesNS(value: (String, js.Any) => XmlNodeList): Self = this.set("selectNodesNS", js.Any.fromFunction2(value))
    @scala.inline
    def setSelectSingleNode(value: String => IXmlNode): Self = this.set("selectSingleNode", js.Any.fromFunction1(value))
    @scala.inline
    def setSelectSingleNodeNS(value: (String, js.Any) => IXmlNode): Self = this.set("selectSingleNodeNS", js.Any.fromFunction2(value))
  }
  
}

