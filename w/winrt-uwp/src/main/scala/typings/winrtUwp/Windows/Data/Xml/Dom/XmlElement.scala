package typings.winrtUwp.Windows.Data.Xml.Dom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Encapsulates information specific to XML Element nodes. */
trait XmlElement extends js.Object {
  /** Gets the list of attributes of this node. */
  var attributes: XmlNamedNodeMap
  /** Gets a list of children in the current node. */
  var childNodes: XmlNodeList
  /** Gets the first child node. */
  var firstChild: IXmlNode
  /** Gets the text from inside the XML. */
  var innerText: String
  /** Gets the last child node. */
  var lastChild: IXmlNode
  /** Gets the local name, which is the local part of a qualified name. This is called the local part in Namespaces in XML. */
  var localName: js.Any
  /** Returns the Uniform Resource Identifier (URI) for the namespace. */
  var namespaceUri: js.Any
  /** Gets the next sibling of the node in the parent's child list. */
  var nextSibling: IXmlNode
  /** Returns the qualified name for attribute, document type, element, entity, or notation nodes. Returns a fixed string for all other node types. */
  var nodeName: String
  /** Gets the XML Document Object Model (DOM) node type, which determines valid values and whether the node can have child nodes. */
  var nodeType: NodeType
  /** Gets or sets the text associated with the node. */
  var nodeValue: js.Any
  /** Returns the root of the document that contains the node. */
  var ownerDocument: XmlDocument
  /** Gets the parent node of the node instance. */
  var parentNode: IXmlNode
  /** Gets or sets the namespace prefix. */
  var prefix: js.Any
  /** Gets the previous sibling of the node in the parent's child list. */
  var previousSibling: IXmlNode
  /** Gets the element name. */
  var tagName: String
  /**
    * Appends a new child node as the last child of the node.
    * @param newChild The new child node to be appended to the end of the list of children of this node.
    * @return The new child node successfully appended to the list. If null, no object is created.
    */
  def appendChild(newChild: IXmlNode): IXmlNode
  /**
    * Clones a new node.
    * @param deep A flag that indicates whether to recursively clone all nodes that are descendants of this node. If true, this method creates a clone of the complete tree below this node. If false, this method clones this node and its attributes only.
    * @return The newly created clone node.
    */
  def cloneNode(deep: Boolean): IXmlNode
  /**
    * Returns the value of the attribute.
    * @param attributeName The name of the required attribute.
    * @return The string value of the attribute.
    */
  def getAttribute(attributeName: String): String
  /**
    * Returns the value of the attribute.
    * @param namespaceUri The namespace of the attribute to get.
    * @param localName The name of the attribute without the namespace prefix.
    * @return The string value of the attribute.
    */
  def getAttributeNS(namespaceUri: js.Any, localName: String): String
  /**
    * Returns the attribute node.
    * @param attributeName The name of the required attribute.
    * @return The returned attribute pointer.
    */
  def getAttributeNode(attributeName: String): XmlAttribute
  /**
    * Returns the specified attribute from the specified namespace.
    * @param namespaceUri The namespace of the attribute to get.
    * @param localName The name of the attribute without the namespace prefix.
    * @return The returned attribute pointer.
    */
  def getAttributeNodeNS(namespaceUri: js.Any, localName: String): XmlAttribute
  /**
    * Returns a list of all descendant elements that match the supplied name.
    * @param tagName The tag of the required elements.
    * @return The required elements. The list can be empty.
    */
  def getElementsByTagName(tagName: String): XmlNodeList
  /**
    * Returns the XML representation of the node and all its descendants.
    * @return The XML representation of the node and all its descendants.
    */
  def getXml(): String
  /**
    * Determines whether a node has children.
    * @return True if this node has children; otherwise false.
    */
  def hasChildNodes(): Boolean
  /**
    * Inserts a child node to the left of the specified node, or at the end of the list.
    * @param newChild The address of the new node to be inserted. The node passed here must be a valid child of the current XML DOM document node. For example, if the current node is an attribute, you cannot pass another attribute in the newChild parameter, because an attribute cannot have an attribute as a child. If newChild is a DOCUMENT_FRAGMENT node type, all its children are inserted in order before referenceChild.
    * @param referenceChild The reference node. The node specified is where the newChild node is to be inserted to the left as the preceding sibling in the child list. The node passed here must be a either a child node of the current node or null. If the value is null, the newChild node is inserted at the end of the child list. If the referenceChild node is not a child of the current node, an error is returned.
    * @return On success, the child node that was inserted. If null, no object is created.
    */
  def insertBefore(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode
  /** Normalizes all descendant elements by combining two or more adjacent text nodes into one unified text node. */
  def normalize(): Unit
  /**
    * Removes or replaces the named attribute.
    * @param attributeName The name of the attribute to be removed.
    */
  def removeAttribute(attributeName: String): Unit
  /**
    * Removes the specified attribute from this element in the specified namespace.
    * @param namespaceUri The namespace of attribute to be removed.
    * @param localName The name of the attribute without the namespace prefix.
    */
  def removeAttributeNS(namespaceUri: js.Any, localName: String): Unit
  /**
    * Removes the specified attribute from this element.
    * @param attributeNode The attribute to be removed.
    * @return The removed attribute, if any.
    */
  def removeAttributeNode(attributeNode: XmlAttribute): XmlAttribute
  /**
    * Removes the specified child node from the list of children and returns it.
    * @param childNode The child node to be removed from the list of children of this node.
    * @return The removed child node. If null, the childNode object is not removed.
    */
  def removeChild(childNode: IXmlNode): IXmlNode
  /**
    * Replaces the specified old child node with the supplied new child node.
    * @param newChild The new child that is to replace the old child. If null, the referenceChild parameter is removed without a replacement.
    * @param referenceChild The old child that is to be replaced by the new child.
    * @return The old child that is replaced. If null, no object is created.
    */
  def replaceChild(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode
  /**
    * Applies the specified pattern-matching operation to this node's context and returns the list of matching nodes as an XmlNodeList .
    * @param xpath Specifies an XPath expression.
    * @return The collection of nodes selected by applying the given pattern-matching operation. If no nodes are selected, this method returns an empty collection.
    */
  def selectNodes(xpath: String): XmlNodeList
  /**
    * Applies the specified pattern-matching operation to this node's context and returns the list of matching nodes as an XmlNodeList .
    * @param xpath Specifies an XPath expression.
    * @param namespaces Contains a string that specifies namespaces for use in XPath expressions when it is necessary to define new namespaces externally. Namespaces are defined in the XML style, as a space-separated list of namespace declaration attributes. You can use this property to set the default namespace as well.
    * @return The collection of nodes selected by applying the given pattern-matching operation. If no nodes are selected, returns an empty collection.
    */
  def selectNodesNS(xpath: String, namespaces: js.Any): XmlNodeList
  /**
    * Applies the specified pattern-matching operation to this node's context and returns the first matching node.
    * @param xpath Specifies an XPath expression.
    * @return The first node that matches the given pattern-matching operation. If no nodes match the expression, the method returns a null value.
    */
  def selectSingleNode(xpath: String): IXmlNode
  /**
    * Applies the specified pattern-matching operation to this node's context and returns the first matching node.
    * @param xpath Specifies an XPath expression.
    * @param namespaces Contains a string that specifies the namespaces to use in XPath expressions when it is necessary to define new namespaces externally. Namespaces are defined in the XML style, as a space-separated list of namespace declaration attributes. You can use this property to set the default namespace as well.
    * @return The first node that matches the given pattern-matching operation. If no nodes match the expression, this method returns a null value.
    */
  def selectSingleNodeNS(xpath: String, namespaces: js.Any): IXmlNode
  /**
    * Sets the value of the named attribute.
    * @param attributeName The name of the required attribute.
    * @param attributeValue The new value for the attribute.
    */
  def setAttribute(attributeName: String, attributeValue: String): Unit
  /**
    * Sets the value of the named attribute in the given namespace.
    * @param namespaceUri The namespace of the attribute being set.
    * @param qualifiedName The name of the attribute being set.
    * @param value The new value for the attribute.
    */
  def setAttributeNS(namespaceUri: js.Any, qualifiedName: String, value: String): Unit
  /**
    * Sets or updates the supplied attribute node on this element.
    * @param newAttribute A pointer to the new attribute.
    * @return The returned pointer to the previous attribute (if any) with the same name.
    */
  def setAttributeNode(newAttribute: XmlAttribute): XmlAttribute
  /**
    * Sets or updates the supplied attribute node on this element. If you are not using any namespaces, then use the SetAttributeNode method.
    * @param newAttribute The node to add to the collection.
    * @return The attribute successfully added to the collection. If Null, no object is created.
    */
  def setAttributeNodeNS(newAttribute: XmlAttribute): XmlAttribute
}

object XmlElement {
  @scala.inline
  def apply(
    appendChild: IXmlNode => IXmlNode,
    attributes: XmlNamedNodeMap,
    childNodes: XmlNodeList,
    cloneNode: Boolean => IXmlNode,
    firstChild: IXmlNode,
    getAttribute: String => String,
    getAttributeNS: (js.Any, String) => String,
    getAttributeNode: String => XmlAttribute,
    getAttributeNodeNS: (js.Any, String) => XmlAttribute,
    getElementsByTagName: String => XmlNodeList,
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
    removeAttribute: String => Unit,
    removeAttributeNS: (js.Any, String) => Unit,
    removeAttributeNode: XmlAttribute => XmlAttribute,
    removeChild: IXmlNode => IXmlNode,
    replaceChild: (IXmlNode, IXmlNode) => IXmlNode,
    selectNodes: String => XmlNodeList,
    selectNodesNS: (String, js.Any) => XmlNodeList,
    selectSingleNode: String => IXmlNode,
    selectSingleNodeNS: (String, js.Any) => IXmlNode,
    setAttribute: (String, String) => Unit,
    setAttributeNS: (js.Any, String, String) => Unit,
    setAttributeNode: XmlAttribute => XmlAttribute,
    setAttributeNodeNS: XmlAttribute => XmlAttribute,
    tagName: String
  ): XmlElement = {
    val __obj = js.Dynamic.literal(appendChild = js.Any.fromFunction1(appendChild), attributes = attributes.asInstanceOf[js.Any], childNodes = childNodes.asInstanceOf[js.Any], cloneNode = js.Any.fromFunction1(cloneNode), firstChild = firstChild.asInstanceOf[js.Any], getAttribute = js.Any.fromFunction1(getAttribute), getAttributeNS = js.Any.fromFunction2(getAttributeNS), getAttributeNode = js.Any.fromFunction1(getAttributeNode), getAttributeNodeNS = js.Any.fromFunction2(getAttributeNodeNS), getElementsByTagName = js.Any.fromFunction1(getElementsByTagName), getXml = js.Any.fromFunction0(getXml), hasChildNodes = js.Any.fromFunction0(hasChildNodes), innerText = innerText.asInstanceOf[js.Any], insertBefore = js.Any.fromFunction2(insertBefore), lastChild = lastChild.asInstanceOf[js.Any], localName = localName.asInstanceOf[js.Any], namespaceUri = namespaceUri.asInstanceOf[js.Any], nextSibling = nextSibling.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], nodeValue = nodeValue.asInstanceOf[js.Any], normalize = js.Any.fromFunction0(normalize), ownerDocument = ownerDocument.asInstanceOf[js.Any], parentNode = parentNode.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], previousSibling = previousSibling.asInstanceOf[js.Any], removeAttribute = js.Any.fromFunction1(removeAttribute), removeAttributeNS = js.Any.fromFunction2(removeAttributeNS), removeAttributeNode = js.Any.fromFunction1(removeAttributeNode), removeChild = js.Any.fromFunction1(removeChild), replaceChild = js.Any.fromFunction2(replaceChild), selectNodes = js.Any.fromFunction1(selectNodes), selectNodesNS = js.Any.fromFunction2(selectNodesNS), selectSingleNode = js.Any.fromFunction1(selectSingleNode), selectSingleNodeNS = js.Any.fromFunction2(selectSingleNodeNS), setAttribute = js.Any.fromFunction2(setAttribute), setAttributeNS = js.Any.fromFunction3(setAttributeNS), setAttributeNode = js.Any.fromFunction1(setAttributeNode), setAttributeNodeNS = js.Any.fromFunction1(setAttributeNodeNS), tagName = tagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[XmlElement]
  }
}

