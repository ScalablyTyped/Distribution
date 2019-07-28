package typings.titanium.TitaniumNs.XMLNs

import typings.titanium.TitaniumNs.Proxy
import typings.titanium.TitaniumNs.UINs.TabGroup
import typings.titanium.TitaniumNs.UINs.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Represents an element in a DOM document, a <Titanium.XML.Node> defined by a start-tag and end-tag (or an empty tag). Elements may have [attributes](Titanium.XML.Attr) associated with them.
		 * Implements the [DOM Level 2 API](https://www.w3.org/TR/DOM-Level-2-Core/core.html#ID-745549614) on Android and iOS with some non-standard extensions.
		 */
trait Element extends Proxy {
  /**
  			 * Used with [nodeType](Titanium.XML.Node.nodeType) to identify an
  			 * [Attr](Titanium.XML.Attr) node.
  			 */
  val ATTRIBUTE_NODE: Double
  /**
  			 * Used with [nodeType](Titanium.XML.Node.nodeType) to identify a
  			 * [CDATASection](Titanium.XML.CDATASection) node.
  			 */
  val CDATA_SECTION_NODE: Double
  /**
  			 * Used with [nodeType](Titanium.XML.Node.nodeType) to identify a
  			 * [Comment](Titanium.XML.Comment) node.
  			 */
  val COMMENT_NODE: Double
  /**
  			 * Used with [nodeType](Titanium.XML.Node.nodeType) to identify a
  			 * [DocumentFragment](Titanium.XML.DocumentFragment) node.
  			 */
  val DOCUMENT_FRAGMENT_NODE: Double
  /**
  			 * Used with [nodeType](Titanium.XML.Node.nodeType) to identify a
  			 * [Document](Titanium.XML.Document) node.
  			 */
  val DOCUMENT_NODE: Double
  /**
  			 * Used with [nodeType](Titanium.XML.Node.nodeType) to identify a
  			 * [DocumentType](Titanium.XML.DocumentType) node.
  			 */
  val DOCUMENT_TYPE_NODE: Double
  /**
  			 * Used with [nodeType](Titanium.XML.Node.nodeType) to identify an
  			 * [Element](Titanium.XML.Element) node.
  			 */
  val ELEMENT_NODE: Double
  /**
  			 * Used with [nodeType](Titanium.XML.Node.nodeType) to identify an
  			 * [Entity](Titanium.XML.Entity) node.
  			 */
  val ENTITY_NODE: Double
  /**
  			 * Used with [nodeType](Titanium.XML.Node.nodeType) to identify an
  			 * [EntityReference](Titanium.XML.EntityReference) node.
  			 */
  val ENTITY_REFERENCE_NODE: Double
  /**
  			 * Used with [nodeType](Titanium.XML.Node.nodeType) to identify a
  			 * [Notation](Titanium.XML.Notation) node.
  			 */
  val NOTATION_NODE: Double
  /**
  			 * Used with [nodeType](Titanium.XML.Node.nodeType) to identify a
  			 * [ProcessingInstruction](Titanium.XML.ProcessingInstruction) node.
  			 */
  val PROCESSING_INSTRUCTION_NODE: Double
  /**
  			 * Used with [nodeType](Titanium.XML.Node.nodeType) to identify a
  			 * [Text](Titanium.XML.Text) node.
  			 */
  val TEXT_NODE: Double
  /**
  			 * A map of this node's attributes.
  			 */
  val attributes: NamedNodeMap
  /**
  			 * A <Titanium.XML.NodeList> of this node's children.
  			 */
  val childNodes: NodeList
  /**
  			 * This node's first child.
  			 */
  val firstChild: Node
  /**
  			 * This node's last child.
  			 */
  val lastChild: Node
  /**
  			 * Local part of the qualified name of this node.
  			 */
  var localName: String
  /**
  			 * Namespace URI of this node.
  			 */
  val namespaceURI: String
  /**
  			 * This node's next sibling.
  			 */
  val nextSibling: Node
  /**
  			 * Name of this node.
  			 */
  val nodeName: String
  /**
  			 * This node's type. One of `ELEMENT_NODE`, `ATTRIBUTE_NODE`, `TEXT_NODE`, `CDATA_SECTION_NODE`,
  			 * `ENTITY_REFERENCE_NODE`, `ENTITY_NODE`, `PROCESSING_INSTRUCTION_NODE`, `COMMENT_NODE`,
  			 * `DOCUMENT_NODE`, `DOCUMENT_TYPE_NODE`, `DOCUMENT_FRAGMENT_NODE`, `NOTATION_NODE`.
  			 */
  val nodeType: Double
  /**
  			 * Content (value) of this node.
  			 */
  var nodeValue: String
  /**
  			 * This node's owning document.
  			 */
  val ownerDocument: Document
  /**
  			 * This node's parent node.
  			 */
  val parentNode: Node
  /**
  			 * Namespace prefix of this node.
  			 */
  var prefix: String
  /**
  			 * This node's previous sibling.
  			 */
  val previousSibling: Node
  /**
  			 * The name of the element, as defined by its tag.
  			 */
  val tagName: String
  /**
  			 * Content (value) of all text nodes within this node.
  			 */
  val text: String
  /**
  			 * Content (value) of all text nodes within this node.
  			 */
  val textContent: String
  /**
  			 * Appends the node `newChild` as a child of this node.
  			 */
  def appendChild(newChild: Node): Node
  /**
  			 * Returns a duplicate of this node.
  			 */
  def cloneNode(deep: Boolean): Node
  /**
  			 * Retrieves an attribute value by name, returning it as a string.
  			 */
  def getAttribute(name: String): String
  /**
  			 * Retrieves an attribute value by local name and namespace URI, returning it as a string.
  			 */
  def getAttributeNS(namespaceURI: String, localName: String): String
  /**
  			 * Retrieves an attribute value by name, returning it as a <Titanium.XML.Attr> object.
  			 */
  def getAttributeNode(name: String): Attr
  /**
  			 * Retrieves an attribute value by local name and namespace URI, returning it as a <Titanium.XML.Attr> object.
  			 */
  def getAttributeNodeNS(namespaceURI: String, localName: String): Attr
  /**
  			 * Gets the value of the <Titanium.XML.Element.attributes> property.
  			 */
  def getAttributes(): NamedNodeMap
  /**
  			 * Retrieves a <Titanium.XML.NodeList> of all descendant elements with a given tag name, in preorder traversal.
  			 */
  def getElementsByTagName(name: String): NodeList
  /**
  			 * Retrieves a <Titanium.XML.NodeList> of all descendant elements with a given local name and namespace URI, in preorder traversal.
  			 */
  def getElementsByTagNameNS(namespaceURI: String, localName: String): NodeList
  /**
  			 * Gets the value of the <Titanium.XML.Element.tagName> property.
  			 */
  def getTagName(): String
  /**
  			 * Determines whether or not an attribute with the given name is available in the element, or has a default value.
  			 */
  def hasAttribute(name: String): Boolean
  /**
  			 * Determines whether or not an attribute with the given name is available in the element, or has a default value.
  			 */
  def hasAttributeNS(namespaceURI: String, localName: String): Boolean
  /**
  			 * Returns `true` if this node has attributes.
  			 */
  def hasAttributes(): Boolean
  /**
  			 * Returns `true` if this node has child nodes.
  			 */
  def hasChildNodes(): Boolean
  /**
  			 * Inserts the node `newChild` before the node `refChild`.
  			 */
  def insertBefore(newChild: Node, refChild: Node): Node
  /**
  			 * Tests whether the DOM implementation supports a specific feature.
  			 */
  def isSupported(feature: String, version: String): Boolean
  /**
  			 * Normalizes text and attribute nodes in this node's child hierarchy.
  			 */
  def normalize(): Unit
  /**
  			 * Removes an attribute by name. If the attribute has a default value, it is immediately replaced with this default, including namespace URI and local name. Throws an exception if the element is read-only.
  			 */
  def removeAttribute(name: String): Unit
  /**
  			 * Removes an attribute by local name and namespace URI. If the attribute has a default value, it is immediately replaced with this default, including namespace URI and local name. Throws an exception if the element is read-only.
  			 */
  def removeAttributeNS(namespaceURI: String, localName: String): Unit
  /**
  			 * Removes the specified attribute node. If the removed attribute has a default value, it is replaced immediately, with the same namespace and local name as the removed attribute, if applicable. Throws an exception if the element is read-only, or the attribute is not an attribute of the element.
  			 */
  def removeAttributeNode(oldAttr: Attr): Unit
  /**
  			 * Removes a child node from this node.
  			 */
  def removeChild(oldChild: Node): Node
  /**
  			 * Replaces the node `oldChild` with the node `newChild`.
  			 */
  def replaceChild(newChild: Node, oldChild: Node): Node
  /**
  			 * Adds a new attribute. Any attribute with the same name is replaced. Throws an exception if the element is read-only, or if the name contains an illegal character.
  			 */
  def setAttribute(name: String, value: String): Unit
  /**
  			 * Adds a new attribute. Any attribute with the same local name and namespace URI is present on the element is replaced, with its prefix changed to that of the `qualifiedName` parameter. Throws an exception if the element is read-only, if the name contains an illegal character, or if the qualified name contains an error.
  			 */
  def setAttributeNS(namespaceURI: String, qualifiedName: String, value: String): Unit
  /**
  			 * Adds a new attribute. Any attribute with the same `nodeName` as the argument is replaced. Throws an exception if the element is read-only, if `newAttr` is from a different document, or if `newAttr` is already an attribute of another element.
  			 */
  def setAttributeNode(newAttr: Attr): Attr
  /**
  			 * Adds a new attribute. Any attribute with the same local name and namespace URI is replaced. Throws an exception if the element is read-only, if `newAttr` is from a different document, or if `newAttr` is already an attribute of another element.
  			 */
  def setAttributeNodeNS(newAttr: Attr): Attr
}

object Element {
  @scala.inline
  def apply(
    ATTRIBUTE_NODE: Double,
    CDATA_SECTION_NODE: Double,
    COMMENT_NODE: Double,
    DOCUMENT_FRAGMENT_NODE: Double,
    DOCUMENT_NODE: Double,
    DOCUMENT_TYPE_NODE: Double,
    ELEMENT_NODE: Double,
    ENTITY_NODE: Double,
    ENTITY_REFERENCE_NODE: Double,
    NOTATION_NODE: Double,
    PROCESSING_INSTRUCTION_NODE: Double,
    TEXT_NODE: Double,
    addEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    apiName: String,
    appendChild: Node => Node,
    applyProperties: js.Any => Unit,
    attributes: NamedNodeMap,
    bubbleParent: Boolean,
    childNodes: NodeList,
    cloneNode: Boolean => Node,
    fireEvent: (String, js.Any) => Unit,
    firstChild: Node,
    getApiName: () => String,
    getAttribute: String => String,
    getAttributeNS: (String, String) => String,
    getAttributeNode: String => Attr,
    getAttributeNodeNS: (String, String) => Attr,
    getAttributes: () => NamedNodeMap,
    getBubbleParent: () => Boolean,
    getElementsByTagName: String => NodeList,
    getElementsByTagNameNS: (String, String) => NodeList,
    getTagName: () => String,
    hasAttribute: String => Boolean,
    hasAttributeNS: (String, String) => Boolean,
    hasAttributes: () => Boolean,
    hasChildNodes: () => Boolean,
    insertBefore: (Node, Node) => Node,
    isSupported: (String, String) => Boolean,
    lastChild: Node,
    localName: String,
    namespaceURI: String,
    nextSibling: Node,
    nodeName: String,
    nodeType: Double,
    nodeValue: String,
    normalize: () => Unit,
    ownerDocument: Document,
    parentNode: Node,
    prefix: String,
    previousSibling: Node,
    removeAttribute: String => Unit,
    removeAttributeNS: (String, String) => Unit,
    removeAttributeNode: Attr => Unit,
    removeChild: Node => Node,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    replaceChild: (Node, Node) => Node,
    setAttribute: (String, String) => Unit,
    setAttributeNS: (String, String, String) => Unit,
    setAttributeNode: Attr => Attr,
    setAttributeNodeNS: Attr => Attr,
    setBubbleParent: Boolean => Unit,
    tagName: String,
    text: String,
    textContent: String,
    getLifecycleContainer: () => Window | TabGroup = null,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): Element = {
    val __obj = js.Dynamic.literal(ATTRIBUTE_NODE = ATTRIBUTE_NODE, CDATA_SECTION_NODE = CDATA_SECTION_NODE, COMMENT_NODE = COMMENT_NODE, DOCUMENT_FRAGMENT_NODE = DOCUMENT_FRAGMENT_NODE, DOCUMENT_NODE = DOCUMENT_NODE, DOCUMENT_TYPE_NODE = DOCUMENT_TYPE_NODE, ELEMENT_NODE = ELEMENT_NODE, ENTITY_NODE = ENTITY_NODE, ENTITY_REFERENCE_NODE = ENTITY_REFERENCE_NODE, NOTATION_NODE = NOTATION_NODE, PROCESSING_INSTRUCTION_NODE = PROCESSING_INSTRUCTION_NODE, TEXT_NODE = TEXT_NODE, addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName, appendChild = js.Any.fromFunction1(appendChild), applyProperties = js.Any.fromFunction1(applyProperties), attributes = attributes, bubbleParent = bubbleParent, childNodes = childNodes, cloneNode = js.Any.fromFunction1(cloneNode), fireEvent = js.Any.fromFunction2(fireEvent), firstChild = firstChild, getApiName = js.Any.fromFunction0(getApiName), getAttribute = js.Any.fromFunction1(getAttribute), getAttributeNS = js.Any.fromFunction2(getAttributeNS), getAttributeNode = js.Any.fromFunction1(getAttributeNode), getAttributeNodeNS = js.Any.fromFunction2(getAttributeNodeNS), getAttributes = js.Any.fromFunction0(getAttributes), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getElementsByTagName = js.Any.fromFunction1(getElementsByTagName), getElementsByTagNameNS = js.Any.fromFunction2(getElementsByTagNameNS), getTagName = js.Any.fromFunction0(getTagName), hasAttribute = js.Any.fromFunction1(hasAttribute), hasAttributeNS = js.Any.fromFunction2(hasAttributeNS), hasAttributes = js.Any.fromFunction0(hasAttributes), hasChildNodes = js.Any.fromFunction0(hasChildNodes), insertBefore = js.Any.fromFunction2(insertBefore), isSupported = js.Any.fromFunction2(isSupported), lastChild = lastChild, localName = localName, namespaceURI = namespaceURI, nextSibling = nextSibling, nodeName = nodeName, nodeType = nodeType, nodeValue = nodeValue, normalize = js.Any.fromFunction0(normalize), ownerDocument = ownerDocument, parentNode = parentNode, prefix = prefix, previousSibling = previousSibling, removeAttribute = js.Any.fromFunction1(removeAttribute), removeAttributeNS = js.Any.fromFunction2(removeAttributeNS), removeAttributeNode = js.Any.fromFunction1(removeAttributeNode), removeChild = js.Any.fromFunction1(removeChild), removeEventListener = js.Any.fromFunction2(removeEventListener), replaceChild = js.Any.fromFunction2(replaceChild), setAttribute = js.Any.fromFunction2(setAttribute), setAttributeNS = js.Any.fromFunction3(setAttributeNS), setAttributeNode = js.Any.fromFunction1(setAttributeNode), setAttributeNodeNS = js.Any.fromFunction1(setAttributeNodeNS), setBubbleParent = js.Any.fromFunction1(setBubbleParent), tagName = tagName, text = text, textContent = textContent)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[Element]
  }
}

