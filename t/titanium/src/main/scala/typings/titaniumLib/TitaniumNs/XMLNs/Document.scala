package typings
package titaniumLib.TitaniumNs.XMLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * The DOM Document returned from <Titanium.XML.parseString>.
		 */
trait Document
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
  			 * An interface to the list of entities that are defined for the document, such as via a Document Type Definition (DTD).
  			 */
  val doctype: DocumentType
  /**
  			 * Root element of this document.
  			 */
  val documentElement: Element
  /**
  			 * This node's first child.
  			 */
  val firstChild: Node
  /**
  			 * [DOMImplementation](Titanium.XML.DOMImplementation) object associated with this
  			 * document.
  			 */
  val implementation: DOMImplementation
  /**
  			 * This node's last child.
  			 */
  val lastChild: Node
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
  			 * Returns a duplicate of this node.
  			 */
  def cloneNode(deep: scala.Boolean): Node
  /**
  			 * Creates an attribute with the given name.
  			 */
  def createAttribute(name: java.lang.String): Attr
  /**
  			 * Creates an attribute with the given name and namespace.
  			 */
  def createAttributeNS(namespaceURI: java.lang.String, name: java.lang.String): Attr
  /**
  			 * Creates and returns a [CDATASection](Titanium.XML.CDATASection).
  			 */
  def createCDATASection(data: java.lang.String): CDATASection
  /**
  			 * Creates a [Comment](Titanium.XML.Comment) with the supplied string data.
  			 */
  def createComment(data: java.lang.String): Comment
  /**
  			 * Creates an empty [DocumentFragment](Titanium.XML.DocumentFragment).
  			 */
  def createDocumentFragment(): DocumentFragment
  /**
  			 * Creates an element with the given tag name.
  			 */
  def createElement(tagName: java.lang.String): Element
  /**
  			 * Create a new element with the given namespace and name.
  			 */
  def createElementNS(namespaceURI: java.lang.String, name: java.lang.String): Element
  /**
  			 * Creates an [EntityReference](Titanium.XML.EntityReference) with the given name.
  			 */
  def createEntityReference(name: java.lang.String): EntityReference
  /**
  			 * Creates a processing instruction for inserting into the DOM tree.
  			 */
  def createProcessingInstruction(target: java.lang.String, data: java.lang.String): ProcessingInstruction
  /**
  			 * Creates a text node.
  			 */
  def createTextNode(data: java.lang.String): Text
  /**
  			 * Gets the value of the <Titanium.XML.Document.attributes> property.
  			 */
  def getAttributes(): NamedNodeMap
  /**
  			 * Gets the value of the <Titanium.XML.Document.doctype> property.
  			 */
  def getDoctype(): DocumentType
  /**
  			 * Gets the value of the <Titanium.XML.Document.documentElement> property.
  			 */
  def getDocumentElement(): Element
  /**
  			 * Returns an [Element](Titanium.XML.Element) that has an ID attribute with the given value.
  			 */
  def getElementById(elementId: java.lang.String): Element
  /**
  			 * Returns a node list of elements in the document which have the given tag.
  			 */
  def getElementsByTagName(tagname: java.lang.String): NodeList
  /**
  			 * Returns a node list of elements in the document which belong to the given namespace and have the given tag name.
  			 */
  def getElementsByTagNameNS(namespaceURI: java.lang.String, localname: java.lang.String): NodeList
  /**
  			 * Gets the value of the <Titanium.XML.Document.implementation> property.
  			 */
  def getImplementation(): DOMImplementation
  /**
  			 * Returns `true` if this node has attributes.
  			 */
  def hasAttributes(): scala.Boolean
  /**
  			 * Returns `true` if this node has child nodes.
  			 */
  def hasChildNodes(): scala.Boolean
  /**
  			 * Imports a node from another document to this document,
  			 * without altering or removing the source node from the original document.
  			 */
  def importNode(importedNode: Node, deep: scala.Boolean): Node
  /**
  			 * Inserts the node `newChild` before the node `refChild`.
  			 */
  def insertBefore(newChild: Node, refChild: Node): Node
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
}

