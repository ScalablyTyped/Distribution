package typings.titanium.Titanium.XML

import typings.titanium.Titanium.Proxy
import typings.titanium.Titanium.UI.TabGroup
import typings.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Represents the textual content of an <Titanium.XML.Element> or <Titanium.XML.Attr> Implements the [DOM Level 2 API](https://www.w3.org/TR/DOM-Level-2-Core/core.html#ID-1312295772) on Android and iOS.
		 */
trait Text extends Proxy {
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
  			 * The character data of the node that implements this interface. Throws an exception during setting if this node is readonly.
  			 */
  var data: String
  /**
  			 * This node's first child.
  			 */
  val firstChild: Node
  /**
  			 * This node's last child.
  			 */
  val lastChild: Node
  /**
  			 * The number of characters that are available through data and the substringData method. This may have the value zero, i.e., <Titanium.XML.CharacterData> may be empty.
  			 */
  val length: Double
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
  			 * Append the string to the end of the character data of the node. Upon success, data provides access to the concatenation of data and the string specified. Throws an exception if this node is readonly.
  			 */
  def appendData(arg: String): Unit
  /**
  			 * Returns a duplicate of this node.
  			 */
  def cloneNode(deep: Boolean): Node
  /**
  			 * Remove a range of characters from the node. Upon success, data and length reflect the change. Throws an exception if this node is readonly, if offset is negative, offset is beyond the data's length, or if count is negative.
  			 */
  def deleteData(offset: Double, count: Double): Unit
  /**
  			 * Gets the value of the <Titanium.XML.Text.attributes> property.
  			 */
  def getAttributes(): NamedNodeMap
  /**
  			 * Gets the value of the <Titanium.XML.Text.data> property.
  			 */
  def getData(): String
  /**
  			 * Gets the value of the <Titanium.XML.Text.length> property.
  			 */
  def getLength(): Double
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
  			 * Insert a string at the specified offset. Throws an exception if this node is readonly, if offset is negative, or if offset is beyond the data's length.
  			 */
  def insertData(offset: Double, arg: String): Unit
  /**
  			 * Tests whether the DOM implementation supports a specific feature.
  			 */
  def isSupported(feature: String, version: String): Boolean
  /**
  			 * Normalizes text and attribute nodes in this node's child hierarchy.
  			 */
  def normalize(): Unit
  /**
  			 * Removes a child node from this node.
  			 */
  def removeChild(oldChild: Node): Node
  /**
  			 * Replaces the node `oldChild` with the node `newChild`.
  			 */
  def replaceChild(newChild: Node, oldChild: Node): Node
  /**
  			 * Replace the characters starting at the specified offset with the specified string. Throws an exception if this node is readonly, if offset is negative, offset is beyond the data's length, or if count is negative.
  			 */
  def replaceData(offset: Double, count: Double, arg: String): Unit
  /**
  			 * Sets the value of the <Titanium.XML.Text.data> property.
  			 */
  def setData(data: String): Unit
  /**
  			 * Breaks this node into two nodes at the specified by offset, and returns a new node of the same type, which contains all the content at and after the offset point. Throws an exception if the specified offset is negative or if this node is read only.
  			 */
  def splitText(offset: Double): Text
  /**
  			 * Extracts a range of data from the node. Throws an exception if offset is negative, offset is beyond the data's length, or if count is negative.
  			 */
  def substringData(offset: Double, count: Double): String
}

object Text {
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
    appendData: String => Unit,
    applyProperties: js.Any => Unit,
    attributes: NamedNodeMap,
    bubbleParent: Boolean,
    childNodes: NodeList,
    cloneNode: Boolean => Node,
    data: String,
    deleteData: (Double, Double) => Unit,
    fireEvent: (String, js.Any) => Unit,
    firstChild: Node,
    getApiName: () => String,
    getAttributes: () => NamedNodeMap,
    getBubbleParent: () => Boolean,
    getData: () => String,
    getLength: () => Double,
    hasAttributes: () => Boolean,
    hasChildNodes: () => Boolean,
    insertBefore: (Node, Node) => Node,
    insertData: (Double, String) => Unit,
    isSupported: (String, String) => Boolean,
    lastChild: Node,
    length: Double,
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
    removeChild: Node => Node,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, _]) => Unit,
    replaceChild: (Node, Node) => Node,
    replaceData: (Double, Double, String) => Unit,
    setBubbleParent: Boolean => Unit,
    setData: String => Unit,
    splitText: Double => Text,
    substringData: (Double, Double) => String,
    text: String,
    textContent: String,
    getLifecycleContainer: () => Window | TabGroup = null,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): Text = {
    val __obj = js.Dynamic.literal(ATTRIBUTE_NODE = ATTRIBUTE_NODE, CDATA_SECTION_NODE = CDATA_SECTION_NODE, COMMENT_NODE = COMMENT_NODE, DOCUMENT_FRAGMENT_NODE = DOCUMENT_FRAGMENT_NODE, DOCUMENT_NODE = DOCUMENT_NODE, DOCUMENT_TYPE_NODE = DOCUMENT_TYPE_NODE, ELEMENT_NODE = ELEMENT_NODE, ENTITY_NODE = ENTITY_NODE, ENTITY_REFERENCE_NODE = ENTITY_REFERENCE_NODE, NOTATION_NODE = NOTATION_NODE, PROCESSING_INSTRUCTION_NODE = PROCESSING_INSTRUCTION_NODE, TEXT_NODE = TEXT_NODE, addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName, appendChild = js.Any.fromFunction1(appendChild), appendData = js.Any.fromFunction1(appendData), applyProperties = js.Any.fromFunction1(applyProperties), attributes = attributes, bubbleParent = bubbleParent, childNodes = childNodes, cloneNode = js.Any.fromFunction1(cloneNode), data = data, deleteData = js.Any.fromFunction2(deleteData), fireEvent = js.Any.fromFunction2(fireEvent), firstChild = firstChild, getApiName = js.Any.fromFunction0(getApiName), getAttributes = js.Any.fromFunction0(getAttributes), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getData = js.Any.fromFunction0(getData), getLength = js.Any.fromFunction0(getLength), hasAttributes = js.Any.fromFunction0(hasAttributes), hasChildNodes = js.Any.fromFunction0(hasChildNodes), insertBefore = js.Any.fromFunction2(insertBefore), insertData = js.Any.fromFunction2(insertData), isSupported = js.Any.fromFunction2(isSupported), lastChild = lastChild, length = length, localName = localName, namespaceURI = namespaceURI, nextSibling = nextSibling, nodeName = nodeName, nodeType = nodeType, nodeValue = nodeValue, normalize = js.Any.fromFunction0(normalize), ownerDocument = ownerDocument, parentNode = parentNode, prefix = prefix, previousSibling = previousSibling, removeChild = js.Any.fromFunction1(removeChild), removeEventListener = js.Any.fromFunction2(removeEventListener), replaceChild = js.Any.fromFunction2(replaceChild), replaceData = js.Any.fromFunction3(replaceData), setBubbleParent = js.Any.fromFunction1(setBubbleParent), setData = js.Any.fromFunction1(setData), splitText = js.Any.fromFunction1(splitText), substringData = js.Any.fromFunction2(substringData), text = text, textContent = textContent)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[Text]
  }
}

