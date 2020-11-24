package typings.titanium.Titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The top level XML module.  The XML module is used for parsing and processing XML-based content.
  */
@JSGlobal("Titanium.XML")
@js.native
object XML extends js.Object {
  
  /**
    * Represents an attribute of an [Element](Titanium.XML.Element).
    */
  @js.native
  trait Attr extends Node {
    
    /**
      * Gets the value of the <Titanium.XML.Attr.name> property.
      * @deprecated Access <Titanium.XML.Attr.name> instead.
      */
    def getName(): String = js.native
    
    /**
      * Gets the value of the <Titanium.XML.Attr.ownerElement> property.
      * @deprecated Access <Titanium.XML.Attr.ownerElement> instead.
      */
    def getOwnerElement(): Element = js.native
    
    /**
      * Gets the value of the <Titanium.XML.Attr.specified> property.
      * @deprecated Access <Titanium.XML.Attr.specified> instead.
      */
    def getSpecified(): Boolean = js.native
    
    /**
      * Gets the value of the <Titanium.XML.Attr.value> property.
      * @deprecated Access <Titanium.XML.Attr.value> instead.
      */
    def getValue(): String = js.native
    
    /**
      * Attribute name
      */
    val name: String = js.native
    
    /**
      * The <Titanium.XML.Element> to which the attribute belongs.
      */
    val ownerElement: Element = js.native
    
    /**
      * Sets the value of the <Titanium.XML.Attr.value> property.
      * @deprecated Set the value using <Titanium.XML.Attr.value> instead.
      */
    def setValue(value: String): Unit = js.native
    
    /**
      * True if this attribute was explicitly given a value in the instance document, false otherwise.
      */
    val specified: Boolean = js.native
    
    /**
      * The attribute value as a string.
      */
    var value: String = js.native
  }
  
  /**
    * Used to include blocks of literal text containing characters that would otherwise need
    * to be escaped.
    */
  @js.native
  trait CDATASection extends Text
  
  /**
    * An interface extending <Titanium.XML.Node> with a set of attributes and methods for accessing character data in the DOM.
    * Implements the [DOM Level 2 API](https://www.w3.org/TR/DOM-Level-2-Core/core.html#ID-FF21A306) on Android and iOS. For reasons of compatibility with the javascript engine, text is represented by UTF-8 instead of UTF-16 on Android and iOS.
    */
  @js.native
  trait CharacterData extends Node {
    
    /**
      * Append the string to the end of the character data of the node. Upon success, data provides access to the concatenation of data and the string specified. Throws an exception if this node is readonly.
      */
    def appendData(arg: String): Unit = js.native
    
    /**
      * The character data of the node that implements this interface. Throws an exception during setting if this node is readonly.
      */
    var data: String = js.native
    
    /**
      * Remove a range of characters from the node. Upon success, data and length reflect the change. Throws an exception if this node is readonly, if offset is negative, offset is beyond the data's length, or if count is negative.
      */
    def deleteData(offset: Double, count: Double): Unit = js.native
    
    /**
      * Gets the value of the <Titanium.XML.CharacterData.data> property.
      * @deprecated Access <Titanium.XML.CharacterData.data> instead.
      */
    def getData(): String = js.native
    
    /**
      * Gets the value of the <Titanium.XML.CharacterData.length> property.
      * @deprecated Access <Titanium.XML.CharacterData.length> instead.
      */
    def getLength(): Double = js.native
    
    /**
      * Insert a string at the specified offset. Throws an exception if this node is readonly, if offset is negative, or if offset is beyond the data's length.
      */
    def insertData(offset: Double, arg: String): Unit = js.native
    
    /**
      * The number of characters that are available through data and the substringData method. This may have the value zero, i.e., <Titanium.XML.CharacterData> may be empty.
      */
    val length: Double = js.native
    
    /**
      * Replace the characters starting at the specified offset with the specified string. Throws an exception if this node is readonly, if offset is negative, offset is beyond the data's length, or if count is negative.
      */
    def replaceData(offset: Double, count: Double, arg: String): Unit = js.native
    
    /**
      * Sets the value of the <Titanium.XML.CharacterData.data> property.
      * @deprecated Set the value using <Titanium.XML.CharacterData.data> instead.
      */
    def setData(data: String): Unit = js.native
    
    /**
      * Extracts a range of data from the node. Throws an exception if offset is negative, offset is beyond the data's length, or if count is negative.
      */
    def substringData(offset: Double, count: Double): String = js.native
  }
  
  /**
    * Represents the contents of an XML comment.
    */
  @js.native
  trait Comment extends CharacterData
  
  /**
    * The <Titanium.XML.DOMImplementation> interface provides a number of methods for performing operations that are independent of any particular instance of the document object model.Implements the [DOM Level 2 API](https://www.w3.org/TR/DOM-Level-2-Core/core.html#ID-102161490) on Android and iOS.
    */
  @js.native
  trait DOMImplementation extends Proxy {
    
    /**
      * Creates an <Titanium.XML.Document> object of the specified type with its document element. Raises an exception if qualifiedName is malformed, contains an illegal character, or is inconsistent with namespaceURI. Also raises an exception if doctype has already been used with a different document.
      */
    def createDocument(namespaceURI: String, qualifiedName: String, doctype: DocumentType): Document = js.native
    
    /**
      * Creates an empty <Titanium.XML.DocumentType> node. Entity declarations and notations are not made available. Entity reference expansions and default attribute additions do not occur. Raises an exception if qualifiedName is malformed or contains an illegal character.
      */
    def createDocumentType(qualifiedName: String, publicId: String, systemId: String): DocumentType = js.native
    
    /**
      * Test if the <Titanium.XML.DOMImplementation> implements a specific feature.
      */
    def hasFeature(feature: String, version: String): Boolean = js.native
  }
  
  /**
    * The DOM Document returned from <Titanium.XML.parseString>.
    */
  @js.native
  trait Document extends Node {
    
    /**
      * Creates an attribute with the given name.
      */
    def createAttribute(name: String): Attr = js.native
    
    /**
      * Creates an attribute with the given name and namespace.
      */
    def createAttributeNS(namespaceURI: String, name: String): Attr = js.native
    
    /**
      * Creates and returns a [CDATASection](Titanium.XML.CDATASection).
      */
    def createCDATASection(data: String): CDATASection = js.native
    
    /**
      * Creates a [Comment](Titanium.XML.Comment) with the supplied string data.
      */
    def createComment(data: String): Comment = js.native
    
    /**
      * Creates an empty [DocumentFragment](Titanium.XML.DocumentFragment).
      */
    def createDocumentFragment(): DocumentFragment = js.native
    
    /**
      * Creates an element with the given tag name.
      */
    def createElement(tagName: String): Element = js.native
    
    /**
      * Create a new element with the given namespace and name.
      */
    def createElementNS(namespaceURI: String, name: String): Element = js.native
    
    /**
      * Creates an [EntityReference](Titanium.XML.EntityReference) with the given name.
      */
    def createEntityReference(name: String): EntityReference = js.native
    
    /**
      * Creates a processing instruction for inserting into the DOM tree.
      */
    def createProcessingInstruction(target: String, data: String): ProcessingInstruction = js.native
    
    /**
      * Creates a text node.
      */
    def createTextNode(data: String): Text = js.native
    
    /**
      * An interface to the list of entities that are defined for the document, such as via a Document Type Definition (DTD).
      */
    val doctype: DocumentType = js.native
    
    /**
      * Root element of this document.
      */
    val documentElement: Element = js.native
    
    /**
      * Gets the value of the <Titanium.XML.Document.doctype> property.
      * @deprecated Access <Titanium.XML.Document.doctype> instead.
      */
    def getDoctype(): DocumentType = js.native
    
    /**
      * Gets the value of the <Titanium.XML.Document.documentElement> property.
      * @deprecated Access <Titanium.XML.Document.documentElement> instead.
      */
    def getDocumentElement(): Element = js.native
    
    /**
      * Returns an [Element](Titanium.XML.Element) that has an ID attribute with the given value.
      */
    def getElementById(elementId: String): Element = js.native
    
    /**
      * Returns a node list of elements in the document which have the given tag.
      */
    def getElementsByTagName(tagname: String): NodeList = js.native
    
    /**
      * Returns a node list of elements in the document which belong to the given namespace and have the given tag name.
      */
    def getElementsByTagNameNS(namespaceURI: String, localname: String): NodeList = js.native
    
    /**
      * Gets the value of the <Titanium.XML.Document.implementation> property.
      * @deprecated Access <Titanium.XML.Document.implementation> instead.
      */
    def getImplementation(): DOMImplementation = js.native
    
    /**
      * [DOMImplementation](Titanium.XML.DOMImplementation) object associated with this
      * document.
      */
    val implementation: DOMImplementation = js.native
    
    /**
      * Imports a node from another document to this document,
      * without altering or removing the source node from the original document.
      */
    def importNode(importedNode: Node, deep: Boolean): Node = js.native
  }
  
  /**
    * A lightweight document object used as a container for a group of nodes.
    */
  @js.native
  trait DocumentFragment extends Node
  
  /**
    * Each <Titanium.XML.Document> has a `doctype` attribute whose value is either 'null' or a <Titanium.XML.DocumentType> object.
    */
  @js.native
  trait DocumentType extends Node {
    
    /**
      * A <Titanium.XML.NamedNodeMap> containing the general entities, both external and internal, declared in the DTD. Parameter entities are not contained. Duplicates are discarded.
      */
    val entities: NamedNodeMap = js.native
    
    /**
      * Gets the value of the <Titanium.XML.DocumentType.entities> property.
      * @deprecated Access <Titanium.XML.DocumentType.entities> instead.
      */
    def getEntities(): NamedNodeMap = js.native
    
    /**
      * Gets the value of the <Titanium.XML.DocumentType.internalSubset> property.
      * @deprecated Access <Titanium.XML.DocumentType.internalSubset> instead.
      */
    def getInternalSubset(): String = js.native
    
    /**
      * Gets the value of the <Titanium.XML.DocumentType.name> property.
      * @deprecated Access <Titanium.XML.DocumentType.name> instead.
      */
    def getName(): String = js.native
    
    /**
      * Gets the value of the <Titanium.XML.DocumentType.notations> property.
      * @deprecated Access <Titanium.XML.DocumentType.notations> instead.
      */
    def getNotations(): NamedNodeMap = js.native
    
    /**
      * Gets the value of the <Titanium.XML.DocumentType.publicId> property.
      * @deprecated Access <Titanium.XML.DocumentType.publicId> instead.
      */
    def getPublicId(): String = js.native
    
    /**
      * Gets the value of the <Titanium.XML.DocumentType.systemId> property.
      * @deprecated Access <Titanium.XML.DocumentType.systemId> instead.
      */
    def getSystemId(): String = js.native
    
    /**
      * The internal subset as a string.
      */
    val internalSubset: String = js.native
    
    /**
      * The name of DTD; i.e., the name immediately following the `DOCTYPE` keyword.
      */
    val name: String = js.native
    
    /**
      * A <Titanium.XML.NamedNodeMap> containing the notations declared in the DTD. Duplicates are discarded. Every node in this map also implements the <Titanium.XML.Notation> interface.
      */
    val notations: NamedNodeMap = js.native
    
    /**
      * The public identifier of the external subset.
      */
    val publicId: String = js.native
    
    /**
      * The system identifier of the external subset.
      */
    val systemId: String = js.native
  }
  
  /**
    * Represents an element in a DOM document, a <Titanium.XML.Node> defined by a start-tag and end-tag (or an empty tag). Elements may have [attributes](Titanium.XML.Attr) associated with them.
    * Implements the [DOM Level 2 API](https://www.w3.org/TR/DOM-Level-2-Core/core.html#ID-745549614) on Android and iOS with some non-standard extensions.
    */
  @js.native
  trait Element extends Node {
    
    /**
      * Retrieves an attribute value by name, returning it as a string.
      */
    def getAttribute(name: String): String = js.native
    
    /**
      * Retrieves an attribute value by local name and namespace URI, returning it as a string.
      */
    def getAttributeNS(namespaceURI: String, localName: String): String = js.native
    
    /**
      * Retrieves an attribute value by name, returning it as a <Titanium.XML.Attr> object.
      */
    def getAttributeNode(name: String): Attr = js.native
    
    /**
      * Retrieves an attribute value by local name and namespace URI, returning it as a <Titanium.XML.Attr> object.
      */
    def getAttributeNodeNS(namespaceURI: String, localName: String): Attr = js.native
    
    /**
      * Retrieves a <Titanium.XML.NodeList> of all descendant elements with a given tag name, in preorder traversal.
      */
    def getElementsByTagName(name: String): NodeList = js.native
    
    /**
      * Retrieves a <Titanium.XML.NodeList> of all descendant elements with a given local name and namespace URI, in preorder traversal.
      */
    def getElementsByTagNameNS(namespaceURI: String, localName: String): NodeList = js.native
    
    /**
      * Gets the value of the <Titanium.XML.Element.tagName> property.
      * @deprecated Access <Titanium.XML.Element.tagName> instead.
      */
    def getTagName(): String = js.native
    
    /**
      * Determines whether or not an attribute with the given name is available in the element, or has a default value.
      */
    def hasAttribute(name: String): Boolean = js.native
    
    /**
      * Determines whether or not an attribute with the given name is available in the element, or has a default value.
      */
    def hasAttributeNS(namespaceURI: String, localName: String): Boolean = js.native
    
    /**
      * Removes an attribute by name. If the attribute has a default value, it is immediately replaced with this default, including namespace URI and local name. Throws an exception if the element is read-only.
      */
    def removeAttribute(name: String): Unit = js.native
    
    /**
      * Removes an attribute by local name and namespace URI. If the attribute has a default value, it is immediately replaced with this default, including namespace URI and local name. Throws an exception if the element is read-only.
      */
    def removeAttributeNS(namespaceURI: String, localName: String): Unit = js.native
    
    /**
      * Removes the specified attribute node. If the removed attribute has a default value, it is replaced immediately, with the same namespace and local name as the removed attribute, if applicable. Throws an exception if the element is read-only, or the attribute is not an attribute of the element.
      */
    def removeAttributeNode(oldAttr: Attr): Unit = js.native
    
    /**
      * Adds a new attribute. Any attribute with the same name is replaced. Throws an exception if the element is read-only, or if the name contains an illegal character.
      */
    def setAttribute(name: String, value: String): Unit = js.native
    
    /**
      * Adds a new attribute. Any attribute with the same local name and namespace URI is present on the element is replaced, with its prefix changed to that of the `qualifiedName` parameter. Throws an exception if the element is read-only, if the name contains an illegal character, or if the qualified name contains an error.
      */
    def setAttributeNS(namespaceURI: String, qualifiedName: String, value: String): Unit = js.native
    
    /**
      * Adds a new attribute. Any attribute with the same `nodeName` as the argument is replaced. Throws an exception if the element is read-only, if `newAttr` is from a different document, or if `newAttr` is already an attribute of another element.
      */
    def setAttributeNode(newAttr: Attr): Attr = js.native
    
    /**
      * Adds a new attribute. Any attribute with the same local name and namespace URI is replaced. Throws an exception if the element is read-only, if `newAttr` is from a different document, or if `newAttr` is already an attribute of another element.
      */
    def setAttributeNodeNS(newAttr: Attr): Attr = js.native
    
    /**
      * The name of the element, as defined by its tag.
      */
    val tagName: String = js.native
  }
  
  /**
    * This interface represents an entity, either parsed or unparsed, in an XML document. Note that this models the entity itself not the entity declaration. The nodeName attribute that is inherited from Node contains the name of the entity. An Entity node does not have any parent.
    * Implements the [DOM Level 2 API](https://www.w3.org/TR/DOM-Level-2-Core/core.html#ID-527DCFF2) on Android and iOS.
    */
  @js.native
  trait Entity extends Node {
    
    /**
      * Gets the value of the <Titanium.XML.Entity.notationName> property.
      * @deprecated Access <Titanium.XML.Entity.notationName> instead.
      */
    def getNotationName(): String = js.native
    
    /**
      * Gets the value of the <Titanium.XML.Entity.publicId> property.
      * @deprecated Access <Titanium.XML.Entity.publicId> instead.
      */
    def getPublicId(): String = js.native
    
    /**
      * Gets the value of the <Titanium.XML.Entity.systemId> property.
      * @deprecated Access <Titanium.XML.Entity.systemId> instead.
      */
    def getSystemId(): String = js.native
    
    /**
      * For unparsed entities, the name of the notation for the entity. For parsed entities, this is `null`.
      */
    val notationName: String = js.native
    
    /**
      * The public identifier associated with the entity, if specified. If the public identifier was not specified, this is `null`.
      */
    val publicId: String = js.native
    
    /**
      * The system identifier associated with the entity, if specified. If the system identifier was not specified, this is null.
      */
    val systemId: String = js.native
  }
  
  /**
    * Represents an XML entity reference.
    */
  @js.native
  trait EntityReference extends Node
  
  /**
    * A key-value paired map that maps String objects to <Titanium.XML.Node> objects.
    * Implements the [DOM Level 2 API](https://www.w3.org/TR/DOM-Level-2-Core/core.html#ID-1780488922) on Android and iOS.
    */
  @js.native
  trait NamedNodeMap extends Proxy {
    
    /**
      * Gets the value of the <Titanium.XML.NamedNodeMap.length> property.
      * @deprecated Access <Titanium.XML.NamedNodeMap.length> instead.
      */
    def getLength(): Double = js.native
    
    /**
      * Retrieves a node specified by name.
      */
    def getNamedItem(name: String): Node = js.native
    
    /**
      * Retrieves a node specified by name and namespace. Returns `null` if no matching node is in the map.
      */
    def getNamedItemNS(namespaceURI: String, localName: String): Node = js.native
    
    /**
      * Retrieves the node at the specified index of the map. Note that NamedNodeMaps are not ordered.
      */
    def item(index: Double): Node = js.native
    
    /**
      * The number of nodes in the map. The valid range of child node indices is 0-`length`-1, inclusive.
      */
    val length: Double = js.native
    
    /**
      * Removes a node from the map specified by name. When this map contains attributes attached to an element, if the removed attribtue is known to have a default, it is replaced with that value.
      */
    def removeNamedItem(name: String): Node = js.native
    
    /**
      * Removes a node from the map specified by local name and namespace URI. When this map contains attributes attached to an element, if the removed attribtue is known to have a default, it is replaced with that value. Returns the node removed from the map, or `null` if there is no corresponding node.
      */
    def removeNamedItemNS(namespaceURI: String, localName: String): Node = js.native
    
    /**
      * Adds a node using its `nodeName` attribute. If a node with that name is already present, it is replaced. Throws an exception if the argument is from a different document, the map is read-only, or the argument is an attribute of another element.
      */
    def setNamedItem(node: Node): Node = js.native
    
    /**
      * Adds a node using its `namespaceURI` and `localName` attributes. If a node with that name is already present, it is replaced. Throws an exception if the argument is from a different document, the map is read-only, or the argument is an attribute of another element.
      */
    def setNamedItemNS(node: Node): Node = js.native
  }
  
  /**
    * A single node in the [Document](Titanium.XML.Document) tree.
    */
  @js.native
  trait Node extends Proxy {
    
    /**
      * Used with [nodeType](Titanium.XML.Node.nodeType) to identify an
      * [Attr](Titanium.XML.Attr) node.
      */
    val ATTRIBUTE_NODE: Double = js.native
    
    /**
      * Used with [nodeType](Titanium.XML.Node.nodeType) to identify a
      * [CDATASection](Titanium.XML.CDATASection) node.
      */
    val CDATA_SECTION_NODE: Double = js.native
    
    /**
      * Used with [nodeType](Titanium.XML.Node.nodeType) to identify a
      * [Comment](Titanium.XML.Comment) node.
      */
    val COMMENT_NODE: Double = js.native
    
    /**
      * Used with [nodeType](Titanium.XML.Node.nodeType) to identify a
      * [DocumentFragment](Titanium.XML.DocumentFragment) node.
      */
    val DOCUMENT_FRAGMENT_NODE: Double = js.native
    
    /**
      * Used with [nodeType](Titanium.XML.Node.nodeType) to identify a
      * [Document](Titanium.XML.Document) node.
      */
    val DOCUMENT_NODE: Double = js.native
    
    /**
      * Used with [nodeType](Titanium.XML.Node.nodeType) to identify a
      * [DocumentType](Titanium.XML.DocumentType) node.
      */
    val DOCUMENT_TYPE_NODE: Double = js.native
    
    /**
      * Used with [nodeType](Titanium.XML.Node.nodeType) to identify an
      * [Element](Titanium.XML.Element) node.
      */
    val ELEMENT_NODE: Double = js.native
    
    /**
      * Used with [nodeType](Titanium.XML.Node.nodeType) to identify an
      * [Entity](Titanium.XML.Entity) node.
      */
    val ENTITY_NODE: Double = js.native
    
    /**
      * Used with [nodeType](Titanium.XML.Node.nodeType) to identify an
      * [EntityReference](Titanium.XML.EntityReference) node.
      */
    val ENTITY_REFERENCE_NODE: Double = js.native
    
    /**
      * Used with [nodeType](Titanium.XML.Node.nodeType) to identify a
      * [Notation](Titanium.XML.Notation) node.
      */
    val NOTATION_NODE: Double = js.native
    
    /**
      * Used with [nodeType](Titanium.XML.Node.nodeType) to identify a
      * [ProcessingInstruction](Titanium.XML.ProcessingInstruction) node.
      */
    val PROCESSING_INSTRUCTION_NODE: Double = js.native
    
    /**
      * Used with [nodeType](Titanium.XML.Node.nodeType) to identify a
      * [Text](Titanium.XML.Text) node.
      */
    val TEXT_NODE: Double = js.native
    
    /**
      * Appends the node `newChild` as a child of this node.
      */
    def appendChild(newChild: Node): Node = js.native
    
    /**
      * A map of this node's attributes.
      */
    val attributes: NamedNodeMap = js.native
    
    /**
      * A <Titanium.XML.NodeList> of this node's children.
      */
    val childNodes: NodeList = js.native
    
    /**
      * Returns a duplicate of this node.
      */
    def cloneNode(deep: Boolean): Node = js.native
    
    /**
      * This node's first child.
      */
    val firstChild: Node = js.native
    
    /**
      * Gets the value of the <Titanium.XML.Node.attributes> property.
      * @deprecated Access <Titanium.XML.Node.attributes> instead.
      */
    def getAttributes(): NamedNodeMap = js.native
    
    /**
      * Returns `true` if this node has attributes.
      */
    def hasAttributes(): Boolean = js.native
    
    /**
      * Returns `true` if this node has child nodes.
      */
    def hasChildNodes(): Boolean = js.native
    
    /**
      * Inserts the node `newChild` before the node `refChild`.
      */
    def insertBefore(newChild: Node, refChild: Node): Node = js.native
    
    /**
      * Tests whether the DOM implementation supports a specific feature.
      */
    def isSupported(feature: String, version: String): Boolean = js.native
    
    /**
      * This node's last child.
      */
    val lastChild: Node = js.native
    
    /**
      * Local part of the qualified name of this node.
      */
    var localName: String = js.native
    
    /**
      * Namespace URI of this node.
      */
    val namespaceURI: String = js.native
    
    /**
      * This node's next sibling.
      */
    val nextSibling: Node = js.native
    
    /**
      * Name of this node.
      */
    val nodeName: String = js.native
    
    /**
      * This node's type. One of `ELEMENT_NODE`, `ATTRIBUTE_NODE`, `TEXT_NODE`, `CDATA_SECTION_NODE`,
      * `ENTITY_REFERENCE_NODE`, `ENTITY_NODE`, `PROCESSING_INSTRUCTION_NODE`, `COMMENT_NODE`,
      * `DOCUMENT_NODE`, `DOCUMENT_TYPE_NODE`, `DOCUMENT_FRAGMENT_NODE`, `NOTATION_NODE`.
      */
    val nodeType: Double = js.native
    
    /**
      * Content (value) of this node.
      */
    var nodeValue: String = js.native
    
    /**
      * Normalizes text and attribute nodes in this node's child hierarchy.
      */
    def normalize(): Unit = js.native
    
    /**
      * This node's owning document.
      */
    val ownerDocument: Document = js.native
    
    /**
      * This node's parent node.
      */
    val parentNode: Node = js.native
    
    /**
      * Namespace prefix of this node.
      */
    var prefix: String = js.native
    
    /**
      * This node's previous sibling.
      */
    val previousSibling: Node = js.native
    
    /**
      * Removes a child node from this node.
      */
    def removeChild(oldChild: Node): Node = js.native
    
    /**
      * Replaces the node `oldChild` with the node `newChild`.
      */
    def replaceChild(newChild: Node, oldChild: Node): Node = js.native
    
    /**
      * Content (value) of all text nodes within this node.
      * @deprecated Use [Titanium.XML.Node.textContent](Titanium.XML.Node.textContent) instead.
      */
    val text: String = js.native
    
    /**
      * Content (value) of all text nodes within this node.
      */
    val textContent: String = js.native
  }
  
  /**
    * A list of <Titanium.XML.Node> objects. Implements the [DOM Level 2 API](https://www.w3.org/TR/DOM-Level-2-Core/core.html#ID-536297177) on Android and iOS.
    */
  @js.native
  trait NodeList extends Proxy {
    
    /**
      * Gets the value of the <Titanium.XML.NodeList.length> property.
      * @deprecated Access <Titanium.XML.NodeList.length> instead.
      */
    def getLength(): Double = js.native
    
    /**
      * Returns the <Titanium.XML.Node> object at the specified index.
      */
    def item(index: Double): Node = js.native
    
    /**
      * The length of the node list.
      */
    val length: Double = js.native
  }
  
  /**
    * Represents a notation declared in the DTD.  Implements the [DOM Level 2 API](https://www.w3.org/TR/DOM-Level-2-Core/core.html#ID-5431D1B9) on Android and iOS.
    */
  @js.native
  trait Notation extends Proxy {
    
    /**
      * Gets the value of the <Titanium.XML.Notation.publicId> property.
      * @deprecated Access <Titanium.XML.Notation.publicId> instead.
      */
    def getPublicId(): String = js.native
    
    /**
      * Gets the value of the <Titanium.XML.Notation.systemId> property.
      * @deprecated Access <Titanium.XML.Notation.systemId> instead.
      */
    def getSystemId(): String = js.native
    
    /**
      * The public identifier of this notation. If the public identifier was not specified, this is `null`.
      */
    val publicId: String = js.native
    
    /**
      * The system identifier of this notation. If the system identifier was not specified, this is `null`.
      */
    val systemId: String = js.native
  }
  
  /**
    * A way to keep processor-specific information in the text of the document. Implements the [DOM Level 2 API](https://www.w3.org/TR/DOM-Level-2-Core/core.html#ID-1004215813) on Android and iOS.
    */
  @js.native
  trait ProcessingInstruction extends Proxy {
    
    /**
      * Retrieve the content of this processing instruction. This from the first non white space character after the target to the character immediatly preceding the ?>. When setting a processing instruction, a DOMException may be thrown on an invalid instruction.
      */
    var data: String = js.native
    
    /**
      * Gets the value of the <Titanium.XML.ProcessingInstruction.data> property.
      * @deprecated Access <Titanium.XML.ProcessingInstruction.data> instead.
      */
    def getData(): String = js.native
    
    /**
      * Gets the value of the <Titanium.XML.ProcessingInstruction.target> property.
      * @deprecated Access <Titanium.XML.ProcessingInstruction.target> instead.
      */
    def getTarget(): String = js.native
    
    /**
      * Sets the value of the <Titanium.XML.ProcessingInstruction.data> property.
      * @deprecated Set the value using <Titanium.XML.ProcessingInstruction.data> instead.
      */
    def setData(data: String): Unit = js.native
    
    /**
      * Retrieve the target of this processing instruction. XML defines this as being the first token following the markup that begins the processing instruction.
      */
    val target: String = js.native
  }
  
  /**
    * Represents the textual content of an <Titanium.XML.Element> or <Titanium.XML.Attr> Implements the [DOM Level 2 API](https://www.w3.org/TR/DOM-Level-2-Core/core.html#ID-1312295772) on Android and iOS.
    */
  @js.native
  trait Text extends CharacterData {
    
    /**
      * Breaks this node into two nodes at the specified by offset, and returns a new node of the same type, which contains all the content at and after the offset point. Throws an exception if the specified offset is negative or if this node is read only.
      */
    def splitText(offset: Double): Text = js.native
  }
}
