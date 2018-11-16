package typings
package titaniumLib.TitaniumNs.XMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * An interface extending <Titanium.XML.Node> with a set of attributes and methods for accessing character data in the DOM.
		 * Implements the [DOM Level 2 API](https://www.w3.org/TR/DOM-Level-2-Core/core.html#ID-FF21A306) on Android and iOS. For reasons of compatibility with the javascript engine, text is represented by UTF-8 instead of UTF-16 on Android and iOS.
		 */

trait CharacterData
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  			 * Used with [nodeType](Titanium.XML.Node.nodeType) to identify an
  			 * [Attr](Titanium.XML.Attr) node.
  			 */
  val ATTRIBUTE_NODE: scala.Double
  /**
  			 * Used with [nodeType](Titanium.XML.Node.nodeType) to identify a
  			 * [CDATASection](Titanium.XML.CDATASection) node.
  			 */
  val CDATA_SECTION_NODE: scala.Double
  /**
  			 * Used with [nodeType](Titanium.XML.Node.nodeType) to identify a
  			 * [Comment](Titanium.XML.Comment) node.
  			 */
  val COMMENT_NODE: scala.Double
  /**
  			 * Used with [nodeType](Titanium.XML.Node.nodeType) to identify a
  			 * [DocumentFragment](Titanium.XML.DocumentFragment) node.
  			 */
  val DOCUMENT_FRAGMENT_NODE: scala.Double
  /**
  			 * Used with [nodeType](Titanium.XML.Node.nodeType) to identify a
  			 * [Document](Titanium.XML.Document) node.
  			 */
  val DOCUMENT_NODE: scala.Double
  /**
  			 * Used with [nodeType](Titanium.XML.Node.nodeType) to identify a
  			 * [DocumentType](Titanium.XML.DocumentType) node.
  			 */
  val DOCUMENT_TYPE_NODE: scala.Double
  /**
  			 * Used with [nodeType](Titanium.XML.Node.nodeType) to identify an
  			 * [Element](Titanium.XML.Element) node.
  			 */
  val ELEMENT_NODE: scala.Double
  /**
  			 * Used with [nodeType](Titanium.XML.Node.nodeType) to identify an
  			 * [Entity](Titanium.XML.Entity) node.
  			 */
  val ENTITY_NODE: scala.Double
  /**
  			 * Used with [nodeType](Titanium.XML.Node.nodeType) to identify an
  			 * [EntityReference](Titanium.XML.EntityReference) node.
  			 */
  val ENTITY_REFERENCE_NODE: scala.Double
  /**
  			 * Used with [nodeType](Titanium.XML.Node.nodeType) to identify a
  			 * [Notation](Titanium.XML.Notation) node.
  			 */
  val NOTATION_NODE: scala.Double
  /**
  			 * Used with [nodeType](Titanium.XML.Node.nodeType) to identify a
  			 * [ProcessingInstruction](Titanium.XML.ProcessingInstruction) node.
  			 */
  val PROCESSING_INSTRUCTION_NODE: scala.Double
  /**
  			 * Used with [nodeType](Titanium.XML.Node.nodeType) to identify a
  			 * [Text](Titanium.XML.Text) node.
  			 */
  val TEXT_NODE: scala.Double
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
  var data: java.lang.String
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
  val length: scala.Double
  /**
  			 * Local part of the qualified name of this node.
  			 */
  var localName: java.lang.String
  /**
  			 * Namespace URI of this node.
  			 */
  val namespaceURI: java.lang.String
  /**
  			 * This node's next sibling.
  			 */
  val nextSibling: Node
  /**
  			 * Name of this node.
  			 */
  val nodeName: java.lang.String
  /**
  			 * This node's type. One of `ELEMENT_NODE`, `ATTRIBUTE_NODE`, `TEXT_NODE`, `CDATA_SECTION_NODE`,
  			 * `ENTITY_REFERENCE_NODE`, `ENTITY_NODE`, `PROCESSING_INSTRUCTION_NODE`, `COMMENT_NODE`,
  			 * `DOCUMENT_NODE`, `DOCUMENT_TYPE_NODE`, `DOCUMENT_FRAGMENT_NODE`, `NOTATION_NODE`.
  			 */
  val nodeType: scala.Double
  /**
  			 * Content (value) of this node.
  			 */
  var nodeValue: java.lang.String
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
  var prefix: java.lang.String
  /**
  			 * This node's previous sibling.
  			 */
  val previousSibling: Node
  /**
  			 * Content (value) of all text nodes within this node.
  			 */
  val text: java.lang.String
  /**
  			 * Content (value) of all text nodes within this node.
  			 */
  val textContent: java.lang.String
  /**
  			 * Appends the node `newChild` as a child of this node.
  			 */
  def appendChild(newChild: Node): Node
  /**
  			 * Append the string to the end of the character data of the node. Upon success, data provides access to the concatenation of data and the string specified. Throws an exception if this node is readonly.
  			 */
  def appendData(arg: java.lang.String): scala.Unit
  /**
  			 * Returns a duplicate of this node.
  			 */
  def cloneNode(deep: scala.Boolean): Node
  /**
  			 * Remove a range of characters from the node. Upon success, data and length reflect the change. Throws an exception if this node is readonly, if offset is negative, offset is beyond the data's length, or if count is negative.
  			 */
  def deleteData(offset: scala.Double, count: scala.Double): scala.Unit
  /**
  			 * Gets the value of the <Titanium.XML.CharacterData.attributes> property.
  			 */
  def getAttributes(): NamedNodeMap
  /**
  			 * Gets the value of the <Titanium.XML.CharacterData.data> property.
  			 */
  def getData(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.XML.CharacterData.length> property.
  			 */
  def getLength(): scala.Double
  /**
  			 * Returns `true` if this node has attributes.
  			 */
  def hasAttributes(): scala.Boolean
  /**
  			 * Returns `true` if this node has child nodes.
  			 */
  def hasChildNodes(): scala.Boolean
  /**
  			 * Inserts the node `newChild` before the node `refChild`.
  			 */
  def insertBefore(newChild: Node, refChild: Node): Node
  /**
  			 * Insert a string at the specified offset. Throws an exception if this node is readonly, if offset is negative, or if offset is beyond the data's length.
  			 */
  def insertData(offset: scala.Double, arg: java.lang.String): scala.Unit
  /**
  			 * Tests whether the DOM implementation supports a specific feature.
  			 */
  def isSupported(feature: java.lang.String, version: java.lang.String): scala.Boolean
  /**
  			 * Normalizes text and attribute nodes in this node's child hierarchy.
  			 */
  def normalize(): scala.Unit
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
  def replaceData(offset: scala.Double, count: scala.Double, arg: java.lang.String): scala.Unit
  /**
  			 * Sets the value of the <Titanium.XML.CharacterData.data> property.
  			 */
  def setData(data: java.lang.String): scala.Unit
  /**
  			 * Extracts a range of data from the node. Throws an exception if offset is negative, offset is beyond the data's length, or if count is negative.
  			 */
  def substringData(offset: scala.Double, count: scala.Double): java.lang.String
}

