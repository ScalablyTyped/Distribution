package typings
package winrtDashUwpLib.WindowsNs.DataNs.XmlNs.DomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a parsed or unparsed entity in the XML document. */
@JSGlobal("Windows.Data.Xml.Dom.DtdEntity")
@js.native
abstract class DtdEntity () extends js.Object {
  /** Gets the list of attributes of this node. */
  var attributes: XmlNamedNodeMap = js.native
  /** Gets a list of children in the current node. */
  var childNodes: XmlNodeList = js.native
  /** Gets the first child node. */
  var firstChild: IXmlNode = js.native
  /** Gets the text from inside the XML. */
  var innerText: java.lang.String = js.native
  /** Gets the last child node. */
  var lastChild: IXmlNode = js.native
  /** Gets the local name, which is the local part of a qualified name. This is called the local part in Namespaces in XML. */
  var localName: js.Any = js.native
  /** Returns the Uniform Resource Identifier (URI) for the namespace. */
  var namespaceUri: js.Any = js.native
  /** Gets the next sibling of the node in the parent's child list. */
  var nextSibling: IXmlNode = js.native
  /** Returns the qualified name for attribute, document type, element, entity, or notation nodes. Returns a fixed string for all other node types. */
  var nodeName: java.lang.String = js.native
  /** Gets the XML Document Object Model (DOM) node type, which determines valid values and whether the node can have child nodes. */
  var nodeType: NodeType = js.native
  /** Gets or sets the text associated with the node. This value is always NULL. */
  var nodeValue: js.Any = js.native
  /** Gets the notation name. */
  var notationName: js.Any = js.native
  /** Returns the root of the document that contains the node. */
  var ownerDocument: XmlDocument = js.native
  /** Gets the parent node of the node instance. */
  var parentNode: IXmlNode = js.native
  /** Returns the namespace prefix. */
  var prefix: js.Any = js.native
  /** Gets the previous sibling of the node in the parent's child list. */
  var previousSibling: IXmlNode = js.native
  /** Gets the public identifier associated with the entity. */
  var publicId: js.Any = js.native
  /** Gets the system identifier associated with the entity. */
  var systemId: js.Any = js.native
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
  def cloneNode(deep: scala.Boolean): IXmlNode = js.native
  /**
                       * Returns the XML representation of the node and all its descendants.
                       * @return The XML representation of the node and all its descendants.
                       */
  def getXml(): java.lang.String = js.native
  /**
                       * Determines whether a node has children.
                       * @return True if this node has children; otherwise false.
                       */
  def hasChildNodes(): scala.Boolean = js.native
  /**
                       * Inserts a child node to the left of the specified node, or at the end of the child node list.
                       * @param newChild The address of the new node to be inserted. The node passed here must be a valid child of the current XML DOM document node. For example, if the current node is an attribute, you cannot pass another attribute in the newChild parameter, because an attribute cannot have an attribute as a child. If newChild is a DOCUMENT_FRAGMENT node type, all its children are inserted in order before referenceChild.
                       * @param referenceChild The reference node. The node specified is where the newChild node is to be inserted to the left as the preceding sibling in the child list. The node passed here must be a either a child node of the current node or null. If the value is null, the newChild node is inserted at the end of the child list. If the referenceChild node is not a child of the current node, an error is returned.
                       * @return On success, the child node that was inserted. If null, no object is created.
                       */
  def insertBefore(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
  /** Normalizes all descendant elements by combining two or more adjacent text nodes into one unified text node. */
  def normalize(): scala.Unit = js.native
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
  def selectNodes(xpath: java.lang.String): XmlNodeList = js.native
  /**
                       * Applies the specified pattern-matching operation to this node's context and returns the list of matching nodes as an XmlNodeList .
                       * @param xpath Specifies an XPath expression.
                       * @param namespaces Contains a string that specifies the namespaces to use in XPath expressions when it is necessary to define new namespaces externally. Namespaces are defined in the XML style, as a space-separated list of namespace declaration attributes. You can use this property to set the default namespace as well.
                       * @return The first node that matches the given pattern-matching operation. If no nodes match the expression, this method returns a null value.
                       */
  def selectNodesNS(xpath: java.lang.String, namespaces: js.Any): XmlNodeList = js.native
  /**
                       * Applies the specified pattern-matching operation to this node's context and returns the first matching node.
                       * @param xpath Specifies an XPath expression.
                       * @return The first node that matches the given pattern-matching operation. If no nodes match the expression, the method returns a null value.
                       */
  def selectSingleNode(xpath: java.lang.String): IXmlNode = js.native
  /**
                       * Applies the specified pattern-matching operation to this node's context and returns the first matching node.
                       * @param xpath Specifies an XPath expression.
                       * @param namespaces Contains a string that specifies the namespaces to use in XPath expressions when it is necessary to define new namespaces externally. Namespaces are defined in the XML style, as a space-separated list of namespace declaration attributes. You can use this property to set the default namespace as well.
                       * @return The first node that matches the given pattern-matching operation. If no nodes match the expression, this method returns a null value.
                       */
  def selectSingleNodeNS(xpath: java.lang.String, namespaces: js.Any): IXmlNode = js.native
}

