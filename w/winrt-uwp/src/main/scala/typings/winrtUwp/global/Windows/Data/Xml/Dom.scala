package typings.winrtUwp.global.Windows.Data.Xml

import typings.winrtUwp.Windows.Data.Xml.Dom.IXmlNode
import typings.winrtUwp.Windows.Data.Xml.Dom.IXmlText
import typings.winrtUwp.Windows.Data.Xml.Dom.NodeType
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.Storage.IStorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides support for the XML Document Object Model (DOM). */
@JSGlobal("Windows.Data.Xml.Dom")
@js.native
object Dom extends js.Object {
  /** Represents a parsed or unparsed entity in the XML document. */
  @js.native
  abstract class DtdEntity ()
    extends typings.winrtUwp.Windows.Data.Xml.Dom.DtdEntity {
    /** Gets the list of attributes of this node. */
    /* CompleteClass */
    override var attributes: typings.winrtUwp.Windows.Data.Xml.Dom.XmlNamedNodeMap = js.native
    /** Gets a list of children in the current node. */
    /* CompleteClass */
    override var childNodes: typings.winrtUwp.Windows.Data.Xml.Dom.XmlNodeList = js.native
    /** Gets the first child node. */
    /* CompleteClass */
    override var firstChild: IXmlNode = js.native
    /** Gets the text from inside the XML. */
    /* CompleteClass */
    override var innerText: String = js.native
    /** Gets the last child node. */
    /* CompleteClass */
    override var lastChild: IXmlNode = js.native
    /** Gets the local name, which is the local part of a qualified name. This is called the local part in Namespaces in XML. */
    /* CompleteClass */
    override var localName: js.Any = js.native
    /** Returns the Uniform Resource Identifier (URI) for the namespace. */
    /* CompleteClass */
    override var namespaceUri: js.Any = js.native
    /** Gets the next sibling of the node in the parent's child list. */
    /* CompleteClass */
    override var nextSibling: IXmlNode = js.native
    /** Returns the qualified name for attribute, document type, element, entity, or notation nodes. Returns a fixed string for all other node types. */
    /* CompleteClass */
    override var nodeName: String = js.native
    /** Gets the XML Document Object Model (DOM) node type, which determines valid values and whether the node can have child nodes. */
    /* CompleteClass */
    override var nodeType: NodeType = js.native
    /** Gets or sets the text associated with the node. This value is always NULL. */
    /* CompleteClass */
    override var nodeValue: js.Any = js.native
    /** Gets the notation name. */
    /* CompleteClass */
    override var notationName: js.Any = js.native
    /** Returns the root of the document that contains the node. */
    /* CompleteClass */
    override var ownerDocument: typings.winrtUwp.Windows.Data.Xml.Dom.XmlDocument = js.native
    /** Gets the parent node of the node instance. */
    /* CompleteClass */
    override var parentNode: IXmlNode = js.native
    /** Returns the namespace prefix. */
    /* CompleteClass */
    override var prefix: js.Any = js.native
    /** Gets the previous sibling of the node in the parent's child list. */
    /* CompleteClass */
    override var previousSibling: IXmlNode = js.native
    /** Gets the public identifier associated with the entity. */
    /* CompleteClass */
    override var publicId: js.Any = js.native
    /** Gets the system identifier associated with the entity. */
    /* CompleteClass */
    override var systemId: js.Any = js.native
    /**
      * Appends a new child node as the last child of the node.
      * @param newChild The new child node to be appended to the end of the list of children of this node.
      * @return The new child node successfully appended to the list. If null, no object is created.
      */
    /* CompleteClass */
    override def appendChild(newChild: IXmlNode): IXmlNode = js.native
    /**
      * Clones a new node.
      * @param deep A flag that indicates whether to recursively clone all nodes that are descendants of this node. If true, this method creates a clone of the complete tree below this node. If false, this method clones this node and its attributes only.
      * @return The newly created clone node.
      */
    /* CompleteClass */
    override def cloneNode(deep: Boolean): IXmlNode = js.native
    /**
      * Returns the XML representation of the node and all its descendants.
      * @return The XML representation of the node and all its descendants.
      */
    /* CompleteClass */
    override def getXml(): String = js.native
    /**
      * Determines whether a node has children.
      * @return True if this node has children; otherwise false.
      */
    /* CompleteClass */
    override def hasChildNodes(): Boolean = js.native
    /**
      * Inserts a child node to the left of the specified node, or at the end of the child node list.
      * @param newChild The address of the new node to be inserted. The node passed here must be a valid child of the current XML DOM document node. For example, if the current node is an attribute, you cannot pass another attribute in the newChild parameter, because an attribute cannot have an attribute as a child. If newChild is a DOCUMENT_FRAGMENT node type, all its children are inserted in order before referenceChild.
      * @param referenceChild The reference node. The node specified is where the newChild node is to be inserted to the left as the preceding sibling in the child list. The node passed here must be a either a child node of the current node or null. If the value is null, the newChild node is inserted at the end of the child list. If the referenceChild node is not a child of the current node, an error is returned.
      * @return On success, the child node that was inserted. If null, no object is created.
      */
    /* CompleteClass */
    override def insertBefore(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
    /** Normalizes all descendant elements by combining two or more adjacent text nodes into one unified text node. */
    /* CompleteClass */
    override def normalize(): Unit = js.native
    /**
      * Removes the specified child node from the list of children and returns it.
      * @param childNode The child node to be removed from the list of children of this node.
      * @return The removed child node. If null, the childNode object is not removed.
      */
    /* CompleteClass */
    override def removeChild(childNode: IXmlNode): IXmlNode = js.native
    /**
      * Replaces the specified old child node with the supplied new child node.
      * @param newChild The new child that is to replace the old child. If null, the referenceChild parameter is removed without a replacement.
      * @param referenceChild The old child that is to be replaced by the new child.
      * @return The old child that is replaced. If null, no object is created.
      */
    /* CompleteClass */
    override def replaceChild(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
    /**
      * Applies the specified pattern-matching operation to this node's context and returns the list of matching nodes as an XmlNodeList .
      * @param xpath Specifies an XPath expression.
      * @return The collection of nodes selected by applying the given pattern-matching operation. If no nodes are selected, this method returns an empty collection.
      */
    /* CompleteClass */
    override def selectNodes(xpath: String): typings.winrtUwp.Windows.Data.Xml.Dom.XmlNodeList = js.native
    /**
      * Applies the specified pattern-matching operation to this node's context and returns the list of matching nodes as an XmlNodeList .
      * @param xpath Specifies an XPath expression.
      * @param namespaces Contains a string that specifies the namespaces to use in XPath expressions when it is necessary to define new namespaces externally. Namespaces are defined in the XML style, as a space-separated list of namespace declaration attributes. You can use this property to set the default namespace as well.
      * @return The first node that matches the given pattern-matching operation. If no nodes match the expression, this method returns a null value.
      */
    /* CompleteClass */
    override def selectNodesNS(xpath: String, namespaces: js.Any): typings.winrtUwp.Windows.Data.Xml.Dom.XmlNodeList = js.native
    /**
      * Applies the specified pattern-matching operation to this node's context and returns the first matching node.
      * @param xpath Specifies an XPath expression.
      * @return The first node that matches the given pattern-matching operation. If no nodes match the expression, the method returns a null value.
      */
    /* CompleteClass */
    override def selectSingleNode(xpath: String): IXmlNode = js.native
    /**
      * Applies the specified pattern-matching operation to this node's context and returns the first matching node.
      * @param xpath Specifies an XPath expression.
      * @param namespaces Contains a string that specifies the namespaces to use in XPath expressions when it is necessary to define new namespaces externally. Namespaces are defined in the XML style, as a space-separated list of namespace declaration attributes. You can use this property to set the default namespace as well.
      * @return The first node that matches the given pattern-matching operation. If no nodes match the expression, this method returns a null value.
      */
    /* CompleteClass */
    override def selectSingleNodeNS(xpath: String, namespaces: js.Any): IXmlNode = js.native
  }
  
  /** Contains a notation declared in the DTD or schema. */
  @js.native
  abstract class DtdNotation ()
    extends typings.winrtUwp.Windows.Data.Xml.Dom.DtdNotation {
    /** Gets the list of attributes of this node. */
    /* CompleteClass */
    override var attributes: typings.winrtUwp.Windows.Data.Xml.Dom.XmlNamedNodeMap = js.native
    /** Gets a list of children in the current node. */
    /* CompleteClass */
    override var childNodes: typings.winrtUwp.Windows.Data.Xml.Dom.XmlNodeList = js.native
    /** Gets the first child node. */
    /* CompleteClass */
    override var firstChild: IXmlNode = js.native
    /** Gets the text from inside the XML. */
    /* CompleteClass */
    override var innerText: String = js.native
    /** Gets the last child node. */
    /* CompleteClass */
    override var lastChild: IXmlNode = js.native
    /** Gets the local name, which is the local part of a qualified name. This is called the local part in Namespaces in XML. */
    /* CompleteClass */
    override var localName: js.Any = js.native
    /** Returns the Uniform Resource Identifier (URI) for the namespace. */
    /* CompleteClass */
    override var namespaceUri: js.Any = js.native
    /** Gets the next sibling of the node in the parent's child list. */
    /* CompleteClass */
    override var nextSibling: IXmlNode = js.native
    /** Returns the qualified name for attribute, document type, element, entity, or notation nodes. Returns a fixed string for all other node types. */
    /* CompleteClass */
    override var nodeName: String = js.native
    /** Gets the XML Document Object Model (DOM) node type, which determines valid values and whether the node can have child nodes. */
    /* CompleteClass */
    override var nodeType: NodeType = js.native
    /** Gets or sets the text associated with the node. */
    /* CompleteClass */
    override var nodeValue: js.Any = js.native
    /** Returns the root of the document that contains the node. */
    /* CompleteClass */
    override var ownerDocument: typings.winrtUwp.Windows.Data.Xml.Dom.XmlDocument = js.native
    /** Gets the parent node of the node instance. */
    /* CompleteClass */
    override var parentNode: IXmlNode = js.native
    /** Gets or sets the namespace prefix. */
    /* CompleteClass */
    override var prefix: js.Any = js.native
    /** Gets the previous sibling of the node in the parent's child list. */
    /* CompleteClass */
    override var previousSibling: IXmlNode = js.native
    /** Gets the public identifier for the notation. */
    /* CompleteClass */
    override var publicId: js.Any = js.native
    /** Gets the system identifier for the notation. */
    /* CompleteClass */
    override var systemId: js.Any = js.native
    /**
      * Appends a new child node as the last child of the node.
      * @param newChild The new child node to be appended to the end of the list of children of this node.
      * @return The new child node successfully appended to the list. If null, no object is created.
      */
    /* CompleteClass */
    override def appendChild(newChild: IXmlNode): IXmlNode = js.native
    /**
      * Clones a new node.
      * @param deep A flag that indicates whether to recursively clone all nodes that are descendants of this node. If true, this method creates a clone of the complete tree below this node. If false, this method clones this node and its attributes only.
      * @return The newly created clone node.
      */
    /* CompleteClass */
    override def cloneNode(deep: Boolean): IXmlNode = js.native
    /**
      * Returns the XML representation of the node and all its descendants.
      * @return The XML representation of the node and all its descendants.
      */
    /* CompleteClass */
    override def getXml(): String = js.native
    /**
      * Determines whether a node has children.
      * @return True if this node has children; otherwise false.
      */
    /* CompleteClass */
    override def hasChildNodes(): Boolean = js.native
    /**
      * Inserts a child node to the left of the specified node, or at the end of the child node list.
      * @param newChild The address of the new node to be inserted. The node passed here must be a valid child of the current XML DOM document node. For example, if the current node is an attribute, you cannot pass another attribute in the newChild parameter, because an attribute cannot have an attribute as a child. If newChild is a DOCUMENT_FRAGMENT node type, all its children are inserted in order before referenceChild.
      * @param referenceChild The reference node. The node specified is where the newChild node is to be inserted to the left as the preceding sibling in the child list. The node passed here must be a either a child node of the current node or null. If the value is null, the newChild node is inserted at the end of the child list. If the referenceChild node is not a child of the current node, an error is returned.
      * @return On success, the child node that was inserted. If null, no object is created.
      */
    /* CompleteClass */
    override def insertBefore(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
    /** Normalizes all descendant elements by combining two or more adjacent text nodes into one unified text node. */
    /* CompleteClass */
    override def normalize(): Unit = js.native
    /**
      * Removes the specified child node from the list of children and returns it.
      * @param childNode The child node to be removed from the list of children of this node.
      * @return The removed child node. If null, the childNode object is not removed.
      */
    /* CompleteClass */
    override def removeChild(childNode: IXmlNode): IXmlNode = js.native
    /**
      * Replaces the specified old child node with the supplied new child node.
      * @param newChild The new child that is to replace the old child. If null, the referenceChild parameter is removed without a replacement.
      * @param referenceChild The old child that is to be replaced by the new child.
      * @return The old child that is replaced. If null, no object is created.
      */
    /* CompleteClass */
    override def replaceChild(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
    /**
      * Applies the specified pattern-matching operation to this node's context and returns the list of matching nodes as an XmlNodeList.
      * @param xpath Specifies an XPath expression.
      * @return The collection of nodes selected by applying the given pattern-matching operation. If no nodes are selected, this method returns an empty collection.
      */
    /* CompleteClass */
    override def selectNodes(xpath: String): typings.winrtUwp.Windows.Data.Xml.Dom.XmlNodeList = js.native
    /**
      * Applies the specified pattern-matching operation to this node's context and returns the list of matching nodes as an XmlNodeList.
      * @param xpath Specifies an XPath expresssion.
      * @param namespaces Contains a string that specifies namespaces for use in XPath expressions when it is necessary to define new namespaces externally. Namespaces are defined in the XML style, as a space-separated list of namespace declaration attributes. You can use this property to set the default namespace as well.
      * @return The collection of nodes selected by applying the given pattern-matching operation. If no nodes are selected, returns an empty collection.
      */
    /* CompleteClass */
    override def selectNodesNS(xpath: String, namespaces: js.Any): typings.winrtUwp.Windows.Data.Xml.Dom.XmlNodeList = js.native
    /**
      * Applies the specified pattern-matching operation to this node's context and returns the first matching node.
      * @param xpath Specifies an XPath expression.
      * @return The first node that matches the given pattern-matching operation. If no nodes match the expression, the method returns a null value.
      */
    /* CompleteClass */
    override def selectSingleNode(xpath: String): IXmlNode = js.native
    /**
      * Applies the specified pattern-matching operation to this node's context and returns the first matching node.
      * @param xpath Specifies an XPath expression.
      * @param namespaces Contains a string that specifies the namespaces to use in XPath expressions when it is necessary to define new namespaces externally. Namespaces are defined in the XML style, as a space-separated list of namespace declaration attributes. You can use this property to set the default namespace as well.
      * @return The first node that matches the given pattern-matching operation. If no nodes match the expression, this method returns a null value.
      */
    /* CompleteClass */
    override def selectSingleNodeNS(xpath: String, namespaces: js.Any): IXmlNode = js.native
  }
  
  /** Represents an attribute of an XmlElement. Valid and default values for the attribute are defined in a document type definition (DTD) or schema. */
  @js.native
  abstract class XmlAttribute ()
    extends typings.winrtUwp.Windows.Data.Xml.Dom.XmlAttribute {
    /** This method is not applicable to this class and will throw an exception. */
    /* CompleteClass */
    override var attributes: typings.winrtUwp.Windows.Data.Xml.Dom.XmlNamedNodeMap = js.native
    /** Gets a list of children in the current node. */
    /* CompleteClass */
    override var childNodes: typings.winrtUwp.Windows.Data.Xml.Dom.XmlNodeList = js.native
    /** Gets the first child node. */
    /* CompleteClass */
    override var firstChild: IXmlNode = js.native
    /** Gets the text from inside the XML. */
    /* CompleteClass */
    override var innerText: String = js.native
    /** Gets the last child node. */
    /* CompleteClass */
    override var lastChild: IXmlNode = js.native
    /** Gets the local name, which is the local part of a qualified name. This is called the local part in Namespaces in XML. */
    /* CompleteClass */
    override var localName: js.Any = js.native
    /** Returns the attribute name. */
    /* CompleteClass */
    override var name: String = js.native
    /** Returns the Uniform Resource Identifier (URI) for the namespace. */
    /* CompleteClass */
    override var namespaceUri: js.Any = js.native
    /** This property is not applicable to this class and will always return null. */
    /* CompleteClass */
    override var nextSibling: IXmlNode = js.native
    /** Returns the qualified name for attribute, document type, element, entity, or notation nodes. Returns a fixed string for all other node types. */
    /* CompleteClass */
    override var nodeName: String = js.native
    /** Gets the XML Document Object Model (DOM) node type, which determines valid values and whether the node can have child nodes. */
    /* CompleteClass */
    override var nodeType: NodeType = js.native
    /** Gets or sets the text associated with the node. */
    /* CompleteClass */
    override var nodeValue: js.Any = js.native
    /** Returns the root of the document that contains the node. */
    /* CompleteClass */
    override var ownerDocument: typings.winrtUwp.Windows.Data.Xml.Dom.XmlDocument = js.native
    /** This property is not applicable to this class and will throw an exception. */
    /* CompleteClass */
    override var parentNode: IXmlNode = js.native
    /** Gets or sets the namespace prefix. */
    /* CompleteClass */
    override var prefix: js.Any = js.native
    /** This property is not applicable to this class and will throw an exception. */
    /* CompleteClass */
    override var previousSibling: IXmlNode = js.native
    /** Gets a value that indicates whether the attribute is explicitly specified or derived from a default value in the document type definition (DTD) or schema. */
    /* CompleteClass */
    override var specified: Boolean = js.native
    /** Gets or sets the attribute value. */
    /* CompleteClass */
    override var value: String = js.native
    /**
      * This method is not applicable to this class and will throw an exception.
      * @param newChild The new child node to be appended to the end of the list of children of this node.
      * @return The new child node successfully appended to the list. If null, no object is created.
      */
    /* CompleteClass */
    override def appendChild(newChild: IXmlNode): IXmlNode = js.native
    /**
      * Clones a new node.
      * @param deep A flag that indicates whether to recursively clone all nodes that are descendants of this node. If true, this method creates a clone of the complete tree below this node. If false, this method clones this node and its attributes only.
      * @return The newly created clone node.
      */
    /* CompleteClass */
    override def cloneNode(deep: Boolean): IXmlNode = js.native
    /**
      * Returns the XML representation of the node and all its descendants.
      * @return The XML representation of the node and all its descendants.
      */
    /* CompleteClass */
    override def getXml(): String = js.native
    /**
      * Determines whether a node has children.
      * @return True if this node has children; otherwise false.
      */
    /* CompleteClass */
    override def hasChildNodes(): Boolean = js.native
    /**
      * Inserts a child node to the left of the specified node, or at the end of the child node list.
      * @param newChild The address of the new node to be inserted. The node passed here must be a valid child of the current XML DOM document node. For example, if the current node is an attribute, you cannot pass another attribute in the newChild parameter, because an attribute cannot have an attribute as a child. If newChild is a DOCUMENT_FRAGMENT node type, all its children are inserted in order before referenceChild.
      * @param referenceChild The reference node. The node specified is where the newChild node is to be inserted to the left as the preceding sibling in the child list. The node passed here must be a either a child node of the current node or null. If the value is null, the newChild node is inserted at the end of the child list. If the referenceChild node is not a child of the current node, an error is returned.
      * @return On success, the child node that was inserted. If null, no object is created.
      */
    /* CompleteClass */
    override def insertBefore(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
    /** This method is not applicable to this class and will throw an exception. */
    /* CompleteClass */
    override def normalize(): Unit = js.native
    /**
      * Removes the specified child node from the list of children and returns it.
      * @param childNode The child node to be removed from the list of children of this node.
      * @return The removed child node. If null, the childNode object is not removed.
      */
    /* CompleteClass */
    override def removeChild(childNode: IXmlNode): IXmlNode = js.native
    /**
      * Replaces the specified old child node with the supplied new child node.
      * @param newChild The new child that is to replace the old child. If null, the referenceChild parameter is removed without a replacement.
      * @param referenceChild The old child that is to be replaced by the new child.
      * @return The old child that is replaced. If null, no object is created.
      */
    /* CompleteClass */
    override def replaceChild(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
    /**
      * Applies the specified pattern-matching operation to this node's context and returns the list of matching nodes as an XmlNodeList .
      * @param xpath Specifies an XPath expression.
      * @return The collection of nodes selected by applying the given pattern-matching operation. If no nodes are selected, this method returns an empty collection.
      */
    /* CompleteClass */
    override def selectNodes(xpath: String): typings.winrtUwp.Windows.Data.Xml.Dom.XmlNodeList = js.native
    /**
      * Applies the specified pattern-matching operation to this node's context and returns the list of matching nodes as an XmlNodeList .
      * @param xpath Specifies an XPath expresssion.
      * @param namespaces Contains a string that specifies namespaces for use in XPath expressions when it is necessary to define new namespaces externally. Namespaces are defined in the XML style, as a space-separated list of namespace declaration attributes. You can use this property to set the default namespace as well.
      * @return The collection of nodes selected by applying the given pattern-matching operation. If no nodes are selected, returns an empty collection.
      */
    /* CompleteClass */
    override def selectNodesNS(xpath: String, namespaces: js.Any): typings.winrtUwp.Windows.Data.Xml.Dom.XmlNodeList = js.native
    /**
      * Applies the specified pattern-matching operation to this node's context and returns the first matching node.
      * @param xpath Specifies an XPath expression.
      * @return The first node that matches the given pattern-matching operation. If no nodes match the expression, the method returns a null value.
      */
    /* CompleteClass */
    override def selectSingleNode(xpath: String): IXmlNode = js.native
    /**
      * Applies the specified pattern-matching operation to this node's context and returns the first matching node.
      * @param xpath Specifies an XPath expression.
      * @param namespaces Contains a string that specifies the namespaces to use in XPath expressions when it is necessary to define new namespaces externally. Namespaces are defined in the XML style, as a space-separated list of namespace declaration attributes. You can use this property to set the default namespace as well.
      * @return The first node that matches the given pattern-matching operation. If no nodes match the expression, this method returns a null value.
      */
    /* CompleteClass */
    override def selectSingleNodeNS(xpath: String, namespaces: js.Any): IXmlNode = js.native
  }
  
  /** Represents a CDATA section of an XML document. */
  @js.native
  abstract class XmlCDataSection ()
    extends typings.winrtUwp.Windows.Data.Xml.Dom.XmlCDataSection {
    /** Gets the list of attributes of this node. */
    /* CompleteClass */
    override var attributes: typings.winrtUwp.Windows.Data.Xml.Dom.XmlNamedNodeMap = js.native
    /** Gets a list of children in the current node. This property always returns NULL. */
    /* CompleteClass */
    override var childNodes: typings.winrtUwp.Windows.Data.Xml.Dom.XmlNodeList = js.native
    /** Gets or sets the node data depending on the node type. */
    /* CompleteClass */
    override var data: String = js.native
    /** Gets the first child node. This property always returns NULL. */
    /* CompleteClass */
    override var firstChild: IXmlNode = js.native
    /** Gets the text from inside the XML. */
    /* CompleteClass */
    override var innerText: String = js.native
    /** Gets the last child node. This property always returns NULL because the CDataSection does not have children. */
    /* CompleteClass */
    override var lastChild: IXmlNode = js.native
    /** Gets the length of the data, in Unicode characters. */
    /* CompleteClass */
    override var length: Double = js.native
    /** Gets the local name, which is the local part of a qualified name. This is called the local part in Namespaces in XML. */
    /* CompleteClass */
    override var localName: js.Any = js.native
    /** Returns the Uniform Resource Identifier (URI) for the namespace. */
    /* CompleteClass */
    override var namespaceUri: js.Any = js.native
    /** Gets the next sibling of the node in the parent's child list. */
    /* CompleteClass */
    override var nextSibling: IXmlNode = js.native
    /** Returns the qualified name for attribute, document type, element, entity, or notation nodes. Returns a fixed string for all other node types. */
    /* CompleteClass */
    override var nodeName: String = js.native
    /** Gets the XML Document Object Model (DOM) node type, which determines valid values and whether the node can have child nodes. */
    /* CompleteClass */
    override var nodeType: NodeType = js.native
    /** Gets or sets the text associated with the node. */
    /* CompleteClass */
    override var nodeValue: js.Any = js.native
    /** Returns the root of the document that contains the node. */
    /* CompleteClass */
    override var ownerDocument: typings.winrtUwp.Windows.Data.Xml.Dom.XmlDocument = js.native
    /** Gets the parent node of the node instance. */
    /* CompleteClass */
    override var parentNode: IXmlNode = js.native
    /** Gets or sets the namespace prefix. */
    /* CompleteClass */
    override var prefix: js.Any = js.native
    /** Gets the previous sibling of the node in the parent's child list. */
    /* CompleteClass */
    override var previousSibling: IXmlNode = js.native
    /**
      * This method is not applicable to this class. The CDataSection does not have children. This method will throw an exception.
      * @param newChild The new child node to be appended to the end of the list of children of this node.
      * @return The new child node successfully appended to the list. If null, no object is created.
      */
    /* CompleteClass */
    override def appendChild(newChild: IXmlNode): IXmlNode = js.native
    /**
      * Appends the supplied string to the existing string data.
      * @param data The data to be appended to the existing string.
      */
    /* CompleteClass */
    override def appendData(data: String): Unit = js.native
    /**
      * Clones a new node.
      * @param deep A flag that indicates whether to recursively clone all nodes that are descendants of this node. If true, this method creates a clone of the complete tree below this node. If false, this method clones this node and its attributes only.
      * @return The newly created clone node.
      */
    /* CompleteClass */
    override def cloneNode(deep: Boolean): IXmlNode = js.native
    /**
      * Deletes specified data.
      * @param offset The offset, in characters, at which to start deleting the string data.
      * @param count The number of characters to delete.
      */
    /* CompleteClass */
    override def deleteData(offset: Double, count: Double): Unit = js.native
    /**
      * Returns the XML representation of the node and all its descendants.
      * @return The XML representation of the node and all its descendants.
      */
    /* CompleteClass */
    override def getXml(): String = js.native
    /**
      * Determines whether a node has children. The CDataSection does not have children. This method always returns false.
      * @return True if this node has children; otherwise false. This method always returns false.
      */
    /* CompleteClass */
    override def hasChildNodes(): Boolean = js.native
    /**
      * Inserts a child node to the left of the specified node, or at the end of the child node list. This method is not applicable to this class and will throw an exception.
      * @param newChild The address of the new node to be inserted. The node passed here must be a valid child of the current XML DOM document node. For example, if the current node is an attribute, you cannot pass another attribute in the newChild parameter, because an attribute cannot have an attribute as a child. If newChild is a DOCUMENT_FRAGMENT node type, all its children are inserted in order before referenceChild.
      * @param referenceChild The reference node. The node specified is where the newChild node is to be inserted to the left as the preceding sibling in the child list. The node passed here must be a either a child node of the current node or null. If the value is null, the newChild node is inserted at the end of the child list. If the referenceChild node is not a child of the current node, an error is returned.
      * @return On success, the child node that was inserted. If null, no object is created.
      */
    /* CompleteClass */
    override def insertBefore(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
    /**
      * Inserts a string at the specified offset.
      * @param offset The offset, in characters, at which to insert the supplied string data.
      * @param data The data to be inserted into the existing string.
      */
    /* CompleteClass */
    override def insertData(offset: Double, data: String): Unit = js.native
    /** Normalizes all descendant elements by combining two or more adjacent text nodes into one unified text node. */
    /* CompleteClass */
    override def normalize(): Unit = js.native
    /**
      * Removes the specified child node from the list of children and returns it. This method is not applicable to this class as the CDataSection does not have children. This method will throw an exception.
      * @param childNode The child node to be removed from the list of children of this node.
      * @return The removed child node. If null, the childNode object is not removed.
      */
    /* CompleteClass */
    override def removeChild(childNode: IXmlNode): IXmlNode = js.native
    /**
      * Replaces the specified old child node with the supplied new child node. This method is not applicable to this class as the CDataSection does not have children. This method will throw an exception.
      * @param newChild The new child that is to replace the old child. If null, the referenceChild parameter is removed without a replacement.
      * @param referenceChild The old child that is to be replaced by the new child.
      * @return The old child that is replaced. If null, no object is created.
      */
    /* CompleteClass */
    override def replaceChild(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
    /**
      * Replaces the specified number of characters with the supplied string.
      * @param offset The offset, in characters, at which to start replacing string data.
      * @param count The number of characters to replace.
      * @param data The new data that replaces the old string data.
      */
    /* CompleteClass */
    override def replaceData(offset: Double, count: Double, data: String): Unit = js.native
    /**
      * Applies the specified pattern-matching operation to this node's context and returns the list of matching nodes as an XmlNodeList . This method is not applicable to this class and will throw an exception.
      * @param xpath Specifies an XPath expression.
      * @return The collection of nodes selected by applying the given pattern-matching operation. If no nodes are selected, this method returns an empty collection.
      */
    /* CompleteClass */
    override def selectNodes(xpath: String): typings.winrtUwp.Windows.Data.Xml.Dom.XmlNodeList = js.native
    /**
      * Applies the specified pattern-matching operation to this node's context and returns the list of matching nodes as an XmlNodeList . This method is not applicable to this class and will throw an exception.
      * @param xpath Specifies an XPath expresssion.
      * @param namespaces Contains a string that specifies namespaces for use in XPath expressions when it is necessary to define new namespaces externally. Namespaces are defined in the XML style, as a space-separated list of namespace declaration attributes. You can use this property to set the default namespace as well.
      * @return The collection of nodes selected by applying the given pattern-matching operation. If no nodes are selected, returns an empty collection.
      */
    /* CompleteClass */
    override def selectNodesNS(xpath: String, namespaces: js.Any): typings.winrtUwp.Windows.Data.Xml.Dom.XmlNodeList = js.native
    /**
      * Applies the specified pattern-matching operation to this node's context and returns the first matching node. This method is not applicable to this class and will throw an exception.
      * @param xpath Specifies an XPath expression.
      * @return The first node that matches the given pattern-matching operation. If no nodes match the expression, the method returns a null value.
      */
    /* CompleteClass */
    override def selectSingleNode(xpath: String): IXmlNode = js.native
    /**
      * Applies the specified pattern-matching operation to this node's context and returns the first matching node. This method is not applicable to this class and will throw an exception.
      * @param xpath Specifies an XPath expression.
      * @param namespaces Contains a string that specifies the namespaces to use in XPath expressions when it is necessary to define new namespaces externally. Namespaces are defined in the XML style, as a space-separated list of namespace declaration attributes. You can use this property to set the default namespace as well.
      * @return The first node that matches the given pattern-matching operation. If no nodes match the expression, this method returns a null value.
      */
    /* CompleteClass */
    override def selectSingleNodeNS(xpath: String, namespaces: js.Any): IXmlNode = js.native
    /**
      * Splits this text node into two text nodes at the specified offset and inserts the new text node into the tree as a sibling that immediately follows this node.
      * @param offset The number of characters at which to split this text node into two nodes, starting from zero.
      * @return The new text node.
      */
    /* CompleteClass */
    override def splitText(offset: Double): IXmlText = js.native
    /**
      * Retrieves a substring of the full string from the specified range.
      * @param offset Specifies the offset, in characters, from the beginning of the string. An offset of zero indicates copying from the start of the data.
      * @param count Specifies the number of characters to retrieve from the specified offset.
      * @return The returned substring.
      */
    /* CompleteClass */
    override def substringData(offset: Double, count: Double): String = js.native
  }
  
  /** Represents an XML comment. */
  @js.native
  abstract class XmlComment ()
    extends typings.winrtUwp.Windows.Data.Xml.Dom.XmlComment {
    /** Gets the list of attributes of this node. */
    /* CompleteClass */
    override var attributes: typings.winrtUwp.Windows.Data.Xml.Dom.XmlNamedNodeMap = js.native
    /** Gets a list of children in the current node. This method always returns NULL. */
    /* CompleteClass */
    override var childNodes: typings.winrtUwp.Windows.Data.Xml.Dom.XmlNodeList = js.native
    /** Gets or sets the node data depending on the node type. */
    /* CompleteClass */
    override var data: String = js.native
    /** Gets the first child node. This property always returns NULL. */
    /* CompleteClass */
    override var firstChild: IXmlNode = js.native
    /** Gets the text from inside the XML. */
    /* CompleteClass */
    override var innerText: String = js.native
    /** Gets the last child node. This property always returns NULL. */
    /* CompleteClass */
    override var lastChild: IXmlNode = js.native
    /** Gets the length of the data in Unicode characters. */
    /* CompleteClass */
    override var length: Double = js.native
    /** Gets the local name, which is the local part of a qualified name. This is called the local part in Namespaces in XML. */
    /* CompleteClass */
    override var localName: js.Any = js.native
    /** Returns the Uniform Resource Identifier (URI) for the namespace. */
    /* CompleteClass */
    override var namespaceUri: js.Any = js.native
    /** Gets the next sibling of the node in the parent's child list. */
    /* CompleteClass */
    override var nextSibling: IXmlNode = js.native
    /** Returns the qualified name for attribute, document type, element, entity, or notation nodes. Returns a fixed string for all other node types. */
    /* CompleteClass */
    override var nodeName: String = js.native
    /** Gets the XML Document Object Model (DOM) node type, which determines valid values and whether the node can have child nodes. */
    /* CompleteClass */
    override var nodeType: NodeType = js.native
    /** Gets or sets the text associated with the node. */
    /* CompleteClass */
    override var nodeValue: js.Any = js.native
    /** Returns the root of the document that contains the node. */
    /* CompleteClass */
    override var ownerDocument: typings.winrtUwp.Windows.Data.Xml.Dom.XmlDocument = js.native
    /** Gets the parent node of the node instance. */
    /* CompleteClass */
    override var parentNode: IXmlNode = js.native
    /** Gets or sets the namespace prefix. */
    /* CompleteClass */
    override var prefix: js.Any = js.native
    /** Gets the previous sibling of the node in the parent's child list. */
    /* CompleteClass */
    override var previousSibling: IXmlNode = js.native
    /**
      * Appends a new child node as the last child of the node. This method is not applicable to this class and it will throw an exception.
      * @param newChild The new child node to be appended to the end of the list of children of this node.
      * @return The new child node successfully appended to the list. If null, no object is created.
      */
    /* CompleteClass */
    override def appendChild(newChild: IXmlNode): IXmlNode = js.native
    /**
      * Appends the supplied string to the existing string data.
      * @param data The data to be appended to the existing string.
      */
    /* CompleteClass */
    override def appendData(data: String): Unit = js.native
    /**
      * Clones a new node.
      * @param deep A flag that indicates whether to recursively clone all nodes that are descendants of this node. If true, this method creates a clone of the complete tree below this node. If false, this method clones this node and its attributes only.
      * @return The newly created clone node.
      */
    /* CompleteClass */
    override def cloneNode(deep: Boolean): IXmlNode = js.native
    /**
      * Deletes the specified data.
      * @param offset The offset, in characters, at which to start deleting the string data.
      * @param count The number of characters to delete.
      */
    /* CompleteClass */
    override def deleteData(offset: Double, count: Double): Unit = js.native
    /**
      * Returns the XML representation of the node and all its descendants.
      * @return The XML representation of the node and all its descendants.
      */
    /* CompleteClass */
    override def getXml(): String = js.native
    /**
      * Determines whether a node has children.
      * @return True if this node has children; otherwise false.
      */
    /* CompleteClass */
    override def hasChildNodes(): Boolean = js.native
    /**
      * Inserts a child node to the left of the specified node, or at the end of the list. This method is not applicable to this class and will throw an exception.
      * @param newChild The address of the new node to be inserted. The node passed here must be a valid child of the current XML DOM document node. For example, if the current node is an attribute, you cannot pass another attribute in the newChild parameter, because an attribute cannot have an attribute as a child. If newChild is a DOCUMENT_FRAGMENT node type, all its children are inserted in order before referenceChild.
      * @param referenceChild The reference node. The node specified is where the newChild node is to be inserted to the left as the preceding sibling in the child list. The node passed here must be a either a child node of the current node or null. If the value is null, the newChild node is inserted at the end of the child list. If the referenceChild node is not a child of the current node, an error is returned.
      * @return On success, the child node that was inserted. If null, no object is created.
      */
    /* CompleteClass */
    override def insertBefore(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
    /**
      * Inserts a string at the specified offset.
      * @param offset The offset, in characters, at which to insert the supplied string data.
      * @param data The data to be inserted into the existing string.
      */
    /* CompleteClass */
    override def insertData(offset: Double, data: String): Unit = js.native
    /** Normalizes all descendant elements by combining two or more adjacent text nodes into one unified text node. */
    /* CompleteClass */
    override def normalize(): Unit = js.native
    /**
      * Removes the specified child node from the list of children and returns it. This method is not applicable to this class and will throw an exception.
      * @param childNode The child node to be removed from the list of children of this node.
      * @return The removed child node. If null, the childNode object is not removed.
      */
    /* CompleteClass */
    override def removeChild(childNode: IXmlNode): IXmlNode = js.native
    /**
      * Replaces the specified old child node with the supplied new child node. This method is not applicable to this class and will throw an exception.
      * @param newChild The new child that is to replace the old child. If null, the referenceChild parameter is removed without a replacement.
      * @param referenceChild The old child that is to be replaced by the new child.
      * @return The old child that is replaced. If null, no object is created.
      */
    /* CompleteClass */
    override def replaceChild(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
    /**
      * Replaces the specified number of characters with the supplied string.
      * @param offset The offset, in characters, at which to start replacing string data.
      * @param count The number of characters to replace.
      * @param data The new data that replaces the old string data.
      */
    /* CompleteClass */
    override def replaceData(offset: Double, count: Double, data: String): Unit = js.native
    /**
      * Applies the specified pattern-matching operation to this node's context and returns the list of matching nodes as an XmlNodeList . This method is not applicable to this class and will throw an exception.
      * @param xpath Specifies an XPath expression.
      * @return The collection of nodes selected by applying the given pattern-matching operation. If no nodes are selected, this method returns an empty collection.
      */
    /* CompleteClass */
    override def selectNodes(xpath: String): typings.winrtUwp.Windows.Data.Xml.Dom.XmlNodeList = js.native
    /**
      * Applies the specified pattern-matching operation to this node's context and returns the list of matching nodes as an XmlNodeList . This method is not applicable to this class and will throw an exception.
      * @param xpath Specifies an XPath expresssion.
      * @param namespaces Contains a string that specifies namespaces for use in XPath expressions when it is necessary to define new namespaces externally. Namespaces are defined in the XML style, as a space-separated list of namespace declaration attributes. You can use this property to set the default namespace as well.
      * @return The collection of nodes selected by applying the given pattern-matching operation. If no nodes are selected, returns an empty collection.
      */
    /* CompleteClass */
    override def selectNodesNS(xpath: String, namespaces: js.Any): typings.winrtUwp.Windows.Data.Xml.Dom.XmlNodeList = js.native
    /**
      * Applies the specified pattern-matching operation to this node's context and returns the first matching node. This method is not applicable to this class and will throw an exception.
      * @param xpath Specifies an XPath expression.
      * @return The first node that matches the given pattern-matching operation. If no nodes match the expression, the method returns a null value.
      */
    /* CompleteClass */
    override def selectSingleNode(xpath: String): IXmlNode = js.native
    /**
      * Applies the specified pattern-matching operation to this node's context and returns the first matching node. This method is not applicable to this class and will throw an exception.
      * @param xpath Specifies an XPath expression.
      * @param namespaces Contains a string that specifies the namespaces to use in XPath expressions when it is necessary to define new namespaces externally. Namespaces are defined in the XML style, as a space-separated list of namespace declaration attributes. You can use this property to set the default namespace as well.
      * @return The first node that matches the given pattern-matching operation. If no nodes match the expression, this method returns a null value.
      */
    /* CompleteClass */
    override def selectSingleNodeNS(xpath: String, namespaces: js.Any): IXmlNode = js.native
    /**
      * Retrieves a substring of the full string from the specified range.
      * @param offset Specifies the offset, in characters, from the beginning of the string. An offset of zero indicates copying from the start of the data.
      * @param count Specifies the number of characters to retrieve from the specified offset.
      * @return The returned substring.
      */
    /* CompleteClass */
    override def substringData(offset: Double, count: Double): String = js.native
  }
  
  /** Represents the top level of the XML source. This class includes members for retrieving and creating all other XML objects. */
  @js.native
  /** Creates a new instance of the XmlDocument class. */
  class XmlDocument ()
    extends typings.winrtUwp.Windows.Data.Xml.Dom.XmlDocument
  
  /** Represents a lightweight object that is useful for tree insertion operations. */
  @js.native
  abstract class XmlDocumentFragment ()
    extends typings.winrtUwp.Windows.Data.Xml.Dom.XmlDocumentFragment {
    /** Gets the list of attributes of this node. */
    /* CompleteClass */
    override var attributes: typings.winrtUwp.Windows.Data.Xml.Dom.XmlNamedNodeMap = js.native
    /** Gets a list of children in the current node. */
    /* CompleteClass */
    override var childNodes: typings.winrtUwp.Windows.Data.Xml.Dom.XmlNodeList = js.native
    /** Gets the first child node. */
    /* CompleteClass */
    override var firstChild: IXmlNode = js.native
    /** Gets the text from inside the XML. */
    /* CompleteClass */
    override var innerText: String = js.native
    /** Gets the last child node. */
    /* CompleteClass */
    override var lastChild: IXmlNode = js.native
    /** Gets the local name, which is the local part of a qualified name. This is called the local part in Namespaces in XML. */
    /* CompleteClass */
    override var localName: js.Any = js.native
    /** Returns the Uniform Resource Identifier (URI) for the namespace. */
    /* CompleteClass */
    override var namespaceUri: js.Any = js.native
    /** Gets the next sibling of the node in the parent's child list. */
    /* CompleteClass */
    override var nextSibling: IXmlNode = js.native
    /** Returns the qualified name for attribute, document type, element, entity, or notation nodes. Returns a fixed string for all other node types. */
    /* CompleteClass */
    override var nodeName: String = js.native
    /** Gets the XML Document Object Model (DOM) node type, which determines valid values and whether the node can have child nodes. */
    /* CompleteClass */
    override var nodeType: NodeType = js.native
    /** Gets or sets the text associated with the node. */
    /* CompleteClass */
    override var nodeValue: js.Any = js.native
    /** Returns the root of the document that contains the node. */
    /* CompleteClass */
    override var ownerDocument: typings.winrtUwp.Windows.Data.Xml.Dom.XmlDocument = js.native
    /** Gets the parent node of the node instance. This property is not applicable to this class. */
    /* CompleteClass */
    override var parentNode: IXmlNode = js.native
    /** Gets or sets the namespace prefix. */
    /* CompleteClass */
    override var prefix: js.Any = js.native
    /** Gets the previous sibling of the node in the parent's child list. This property is not applicable to this class. */
    /* CompleteClass */
    override var previousSibling: IXmlNode = js.native
    /**
      * Appends a new child node as the last child of the node.
      * @param newChild The new child node to be appended to the end of the list of children of this node.
      * @return The new child node successfully appended to the list. If null, no object is created.
      */
    /* CompleteClass */
    override def appendChild(newChild: IXmlNode): IXmlNode = js.native
    /**
      * Clones a new node.
      * @param deep A flag that indicates whether to recursively clone all nodes that are descendants of this node. If true, this method creates a clone of the complete tree below this node. If false, this method clones this node and its attributes only.
      * @return The newly created clone node.
      */
    /* CompleteClass */
    override def cloneNode(deep: Boolean): IXmlNode = js.native
    /**
      * Returns the XML representation of the node and all its descendants.
      * @return The XML representation of the node and all its descendants.
      */
    /* CompleteClass */
    override def getXml(): String = js.native
    /**
      * Determines whether a node has children.
      * @return True if this node has children; otherwise false.
      */
    /* CompleteClass */
    override def hasChildNodes(): Boolean = js.native
    /**
      * Inserts a child node to the left of the specified node, or at the end of the list.
      * @param newChild The address of the new node to be inserted. The node passed here must be a valid child of the current XML DOM document node. For example, if the current node is an attribute, you cannot pass another attribute in the newChild parameter, because an attribute cannot have an attribute as a child. If newChild is a DOCUMENT_FRAGMENT node type, all its children are inserted in order before referenceChild.
      * @param referenceChild The reference node. The node specified is where the newChild node is to be inserted to the left as the preceding sibling in the child list. The node passed here must be a either a child node of the current node or null. If the value is null, the newChild node is inserted at the end of the child list. If the referenceChild node is not a child of the current node, an error is returned.
      * @return On success, the child node that was inserted. If null, no object is created.
      */
    /* CompleteClass */
    override def insertBefore(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
    /** Normalizes all descendant elements by combining two or more adjacent text nodes into one unified text node. */
    /* CompleteClass */
    override def normalize(): Unit = js.native
    /**
      * Removes the specified child node from the list of children and returns it.
      * @param childNode The child node to be removed from the list of children of this node.
      * @return The removed child node. If null, the childNode object is not removed.
      */
    /* CompleteClass */
    override def removeChild(childNode: IXmlNode): IXmlNode = js.native
    /**
      * Replaces the specified old child node with the supplied new child node.
      * @param newChild The new child that is to replace the old child. If null, the referenceChild parameter is removed without a replacement.
      * @param referenceChild The old child that is to be replaced by the new child.
      * @return The old child that is replaced. If null, no object is created.
      */
    /* CompleteClass */
    override def replaceChild(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
    /**
      * Applies the specified pattern-matching operation to this node's context and returns the list of matching nodes as an XmlNodeList .
      * @param xpath Specifies an XPath expression.
      * @return The collection of nodes selected by applying the given pattern-matching operation. If no nodes are selected, this method returns an empty collection.
      */
    /* CompleteClass */
    override def selectNodes(xpath: String): typings.winrtUwp.Windows.Data.Xml.Dom.XmlNodeList = js.native
    /**
      * Applies the specified pattern-matching operation to this node's context and returns the list of matching nodes as an XmlNodeList .
      * @param xpath Specifies an XPath expression.
      * @param namespaces Contains a string that specifies namespaces for use in XPath expressions when it is necessary to define new namespaces externally. Namespaces are defined in the XML style, as a space-separated list of namespace declaration attributes. You can use this property to set the default namespace as well.
      * @return The collection of nodes selected by applying the given pattern-matching operation. If no nodes are selected, returns an empty collection.
      */
    /* CompleteClass */
    override def selectNodesNS(xpath: String, namespaces: js.Any): typings.winrtUwp.Windows.Data.Xml.Dom.XmlNodeList = js.native
    /**
      * Applies the specified pattern-matching operation to this node's context and returns the first matching node.
      * @param xpath Specifies an XPath expression.
      * @return The first node that matches the given pattern-matching operation. If no nodes match the expression, the method returns a null value.
      */
    /* CompleteClass */
    override def selectSingleNode(xpath: String): IXmlNode = js.native
    /**
      * Applies the specified pattern-matching operation to this node's context and returns the first matching node.
      * @param xpath Specifies an XPath expression.
      * @param namespaces Contains a string that specifies the namespaces to use in XPath expressions when it is necessary to define new namespaces externally. Namespaces are defined in the XML style, as a space-separated list of namespace declaration attributes. You can use this property to set the default namespace as well.
      * @return The first node that matches the given pattern-matching operation. If no nodes match the expression, this method returns a null value.
      */
    /* CompleteClass */
    override def selectSingleNodeNS(xpath: String, namespaces: js.Any): IXmlNode = js.native
  }
  
  /** Contains information associated with the document type. */
  @js.native
  abstract class XmlDocumentType ()
    extends typings.winrtUwp.Windows.Data.Xml.Dom.XmlDocumentType {
    /** Gets the list of attributes of this node. */
    /* CompleteClass */
    override var attributes: typings.winrtUwp.Windows.Data.Xml.Dom.XmlNamedNodeMap = js.native
    /** Gets a list of children in the current node. */
    /* CompleteClass */
    override var childNodes: typings.winrtUwp.Windows.Data.Xml.Dom.XmlNodeList = js.native
    /** Gets a list of the entities declared in the <!DOCTYPE> declaration. */
    /* CompleteClass */
    override var entities: typings.winrtUwp.Windows.Data.Xml.Dom.XmlNamedNodeMap = js.native
    /** Gets the first child node. */
    /* CompleteClass */
    override var firstChild: IXmlNode = js.native
    /** Gets the text from inside the XML. */
    /* CompleteClass */
    override var innerText: String = js.native
    /** Gets the last child node. */
    /* CompleteClass */
    override var lastChild: IXmlNode = js.native
    /** Gets the local name, which is the local part of a qualified name. This is called the local part in Namespaces in XML. */
    /* CompleteClass */
    override var localName: js.Any = js.native
    /** A list of the general entities, both external and internal, that are present in this document. */
    /* CompleteClass */
    override var name: String = js.native
    /** Returns the Uniform Resource Identifier (URI) for the namespace. */
    /* CompleteClass */
    override var namespaceUri: js.Any = js.native
    /** Gets the next sibling of the node in the parent's child list. */
    /* CompleteClass */
    override var nextSibling: IXmlNode = js.native
    /** Returns the qualified name for attribute, document type, element, entity, or notation nodes. Returns a fixed string for all other node types. */
    /* CompleteClass */
    override var nodeName: String = js.native
    /** Gets the XML Document Object Model (DOM) node type, which determines valid values and whether the node can have child nodes. */
    /* CompleteClass */
    override var nodeType: NodeType = js.native
    /** Gets or sets the text associated with the node. */
    /* CompleteClass */
    override var nodeValue: js.Any = js.native
    /** Returns a list of the DtdNotation members that are present in the document type declaration. */
    /* CompleteClass */
    override var notations: typings.winrtUwp.Windows.Data.Xml.Dom.XmlNamedNodeMap = js.native
    /** Returns the root of the document that contains the node. */
    /* CompleteClass */
    override var ownerDocument: typings.winrtUwp.Windows.Data.Xml.Dom.XmlDocument = js.native
    /** Gets the parent node of the node instance. */
    /* CompleteClass */
    override var parentNode: IXmlNode = js.native
    /** Gets or sets the namespace prefix. */
    /* CompleteClass */
    override var prefix: js.Any = js.native
    /** Gets the previous sibling of the node in the parent's child list. */
    /* CompleteClass */
    override var previousSibling: IXmlNode = js.native
    /**
      * Appends a new child node as the last child of the node.
      * @param newChild The new child node to be appended to the end of the list of children of this node.
      * @return The new child node successfully appended to the list. If null, no object is created.
      */
    /* CompleteClass */
    override def appendChild(newChild: IXmlNode): IXmlNode = js.native
    /**
      * Clones a new node.
      * @param deep A flag that indicates whether to recursively clone all nodes that are descendants of this node. If true, this method creates a clone of the complete tree below this node. If false, this method clones this node and its attributes only.
      * @return The newly created clone node.
      */
    /* CompleteClass */
    override def cloneNode(deep: Boolean): IXmlNode = js.native
    /**
      * Returns the XML representation of the node and all its descendants.
      * @return The XML representation of the node and all its descendants.
      */
    /* CompleteClass */
    override def getXml(): String = js.native
    /**
      * Determines whether a node has children.
      * @return True if this node has children; otherwise false.
      */
    /* CompleteClass */
    override def hasChildNodes(): Boolean = js.native
    /**
      * Inserts a child node to the left of the specified node, or at the end of the list.
      * @param newChild The address of the new node to be inserted. The node passed here must be a valid child of the current XML DOM document node. For example, if the current node is an attribute, you cannot pass another attribute in the newChild parameter, because an attribute cannot have an attribute as a child. If newChild is a DOCUMENT_FRAGMENT node type, all its children are inserted in order before referenceChild.
      * @param referenceChild The reference node. The node specified is where the newChild node is to be inserted to the left as the preceding sibling in the child list. The node passed here must be a either a child node of the current node or null. If the value is null, the newChild node is inserted at the end of the child list. If the referenceChild node is not a child of the current node, an error is returned.
      * @return On success, the child node that was inserted. If null, no object is created.
      */
    /* CompleteClass */
    override def insertBefore(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
    /** Normalizes all descendant elements by combining two or more adjacent text nodes into one unified text node. */
    /* CompleteClass */
    override def normalize(): Unit = js.native
    /**
      * Removes the specified child node from the list of children and returns it.
      * @param childNode The child node to be removed from the list of children of this node.
      * @return The removed child node. If null, the childNode object is not removed.
      */
    /* CompleteClass */
    override def removeChild(childNode: IXmlNode): IXmlNode = js.native
    /**
      * Replaces the specified old child node with the supplied new child node.
      * @param newChild The new child that is to replace the old child. If null, the referenceChild parameter is removed without a replacement.
      * @param referenceChild The old child that is to be replaced by the new child.
      * @return The old child that is replaced. If null, no object is created.
      */
    /* CompleteClass */
    override def replaceChild(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
    /**
      * Applies the specified pattern-matching operation to this node's context and returns the list of matching nodes as an XmlNodeList .
      * @param xpath Specifies an XPath expression.
      * @return The collection of nodes selected by applying the given pattern-matching operation. If no nodes are selected, this method returns an empty collection.
      */
    /* CompleteClass */
    override def selectNodes(xpath: String): typings.winrtUwp.Windows.Data.Xml.Dom.XmlNodeList = js.native
    /**
      * Applies the specified pattern-matching operation to this node's context and returns the list of matching nodes as an XmlNodeList .
      * @param xpath Specifies an XPath expression.
      * @param namespaces Contains a string that specifies namespaces for use in XPath expressions when it is necessary to define new namespaces externally. Namespaces are defined in the XML style, as a space-separated list of namespace declaration attributes. You can use this property to set the default namespace as well.
      * @return The collection of nodes selected by applying the given pattern-matching operation. If no nodes are selected, returns an empty collection.
      */
    /* CompleteClass */
    override def selectNodesNS(xpath: String, namespaces: js.Any): typings.winrtUwp.Windows.Data.Xml.Dom.XmlNodeList = js.native
    /**
      * Applies the specified pattern-matching operation to this node's context and returns the first matching node.
      * @param xpath Specifies an XPath expression.
      * @return The first node that matches the given pattern-matching operation. If no nodes match the expression, the method returns a null value.
      */
    /* CompleteClass */
    override def selectSingleNode(xpath: String): IXmlNode = js.native
    /**
      * Applies the specified pattern-matching operation to this node's context and returns the first matching node.
      * @param xpath Specifies an XPath expression.
      * @param namespaces Contains a string that specifies the namespaces to use in XPath expressions when it is necessary to define new namespaces externally. Namespaces are defined in the XML style, as a space-separated list of namespace declaration attributes. You can use this property to set the default namespace as well.
      * @return The first node that matches the given pattern-matching operation. If no nodes match the expression, this method returns a null value.
      */
    /* CompleteClass */
    override def selectSingleNodeNS(xpath: String, namespaces: js.Any): IXmlNode = js.native
  }
  
  /** Provides methods that are independent of any particular instance of the document object model. */
  @js.native
  abstract class XmlDomImplementation ()
    extends typings.winrtUwp.Windows.Data.Xml.Dom.XmlDomImplementation {
    /**
      * Indicates support for the specified feature.
      * @param feature Specifies the feature to test. In Level 1, valid feature values are "XML", "DOM", and "MS-DOM" (case-insensitive).
      * @param version Specifies the version number to test. If NULL, tests for implementation of the feature in any version. In Level 1, "1.0" is the valid version value.
      * @return True if the specified feature is implemented; otherwise false.
      */
    /* CompleteClass */
    override def hasFeature(feature: String, version: js.Any): Boolean = js.native
  }
  
  /** Encapsulates information specific to XML Element nodes. */
  @js.native
  abstract class XmlElement ()
    extends typings.winrtUwp.Windows.Data.Xml.Dom.XmlElement {
    /** Gets the list of attributes of this node. */
    /* CompleteClass */
    override var attributes: typings.winrtUwp.Windows.Data.Xml.Dom.XmlNamedNodeMap = js.native
    /** Gets a list of children in the current node. */
    /* CompleteClass */
    override var childNodes: typings.winrtUwp.Windows.Data.Xml.Dom.XmlNodeList = js.native
    /** Gets the first child node. */
    /* CompleteClass */
    override var firstChild: IXmlNode = js.native
    /** Gets the text from inside the XML. */
    /* CompleteClass */
    override var innerText: String = js.native
    /** Gets the last child node. */
    /* CompleteClass */
    override var lastChild: IXmlNode = js.native
    /** Gets the local name, which is the local part of a qualified name. This is called the local part in Namespaces in XML. */
    /* CompleteClass */
    override var localName: js.Any = js.native
    /** Returns the Uniform Resource Identifier (URI) for the namespace. */
    /* CompleteClass */
    override var namespaceUri: js.Any = js.native
    /** Gets the next sibling of the node in the parent's child list. */
    /* CompleteClass */
    override var nextSibling: IXmlNode = js.native
    /** Returns the qualified name for attribute, document type, element, entity, or notation nodes. Returns a fixed string for all other node types. */
    /* CompleteClass */
    override var nodeName: String = js.native
    /** Gets the XML Document Object Model (DOM) node type, which determines valid values and whether the node can have child nodes. */
    /* CompleteClass */
    override var nodeType: NodeType = js.native
    /** Gets or sets the text associated with the node. */
    /* CompleteClass */
    override var nodeValue: js.Any = js.native
    /** Returns the root of the document that contains the node. */
    /* CompleteClass */
    override var ownerDocument: typings.winrtUwp.Windows.Data.Xml.Dom.XmlDocument = js.native
    /** Gets the parent node of the node instance. */
    /* CompleteClass */
    override var parentNode: IXmlNode = js.native
    /** Gets or sets the namespace prefix. */
    /* CompleteClass */
    override var prefix: js.Any = js.native
    /** Gets the previous sibling of the node in the parent's child list. */
    /* CompleteClass */
    override var previousSibling: IXmlNode = js.native
    /** Gets the element name. */
    /* CompleteClass */
    override var tagName: String = js.native
    /**
      * Appends a new child node as the last child of the node.
      * @param newChild The new child node to be appended to the end of the list of children of this node.
      * @return The new child node successfully appended to the list. If null, no object is created.
      */
    /* CompleteClass */
    override def appendChild(newChild: IXmlNode): IXmlNode = js.native
    /**
      * Clones a new node.
      * @param deep A flag that indicates whether to recursively clone all nodes that are descendants of this node. If true, this method creates a clone of the complete tree below this node. If false, this method clones this node and its attributes only.
      * @return The newly created clone node.
      */
    /* CompleteClass */
    override def cloneNode(deep: Boolean): IXmlNode = js.native
    /**
      * Returns the value of the attribute.
      * @param attributeName The name of the required attribute.
      * @return The string value of the attribute.
      */
    /* CompleteClass */
    override def getAttribute(attributeName: String): String = js.native
    /**
      * Returns the value of the attribute.
      * @param namespaceUri The namespace of the attribute to get.
      * @param localName The name of the attribute without the namespace prefix.
      * @return The string value of the attribute.
      */
    /* CompleteClass */
    override def getAttributeNS(namespaceUri: js.Any, localName: String): String = js.native
    /**
      * Returns the attribute node.
      * @param attributeName The name of the required attribute.
      * @return The returned attribute pointer.
      */
    /* CompleteClass */
    override def getAttributeNode(attributeName: String): typings.winrtUwp.Windows.Data.Xml.Dom.XmlAttribute = js.native
    /**
      * Returns the specified attribute from the specified namespace.
      * @param namespaceUri The namespace of the attribute to get.
      * @param localName The name of the attribute without the namespace prefix.
      * @return The returned attribute pointer.
      */
    /* CompleteClass */
    override def getAttributeNodeNS(namespaceUri: js.Any, localName: String): typings.winrtUwp.Windows.Data.Xml.Dom.XmlAttribute = js.native
    /**
      * Returns a list of all descendant elements that match the supplied name.
      * @param tagName The tag of the required elements.
      * @return The required elements. The list can be empty.
      */
    /* CompleteClass */
    override def getElementsByTagName(tagName: String): typings.winrtUwp.Windows.Data.Xml.Dom.XmlNodeList = js.native
    /**
      * Returns the XML representation of the node and all its descendants.
      * @return The XML representation of the node and all its descendants.
      */
    /* CompleteClass */
    override def getXml(): String = js.native
    /**
      * Determines whether a node has children.
      * @return True if this node has children; otherwise false.
      */
    /* CompleteClass */
    override def hasChildNodes(): Boolean = js.native
    /**
      * Inserts a child node to the left of the specified node, or at the end of the list.
      * @param newChild The address of the new node to be inserted. The node passed here must be a valid child of the current XML DOM document node. For example, if the current node is an attribute, you cannot pass another attribute in the newChild parameter, because an attribute cannot have an attribute as a child. If newChild is a DOCUMENT_FRAGMENT node type, all its children are inserted in order before referenceChild.
      * @param referenceChild The reference node. The node specified is where the newChild node is to be inserted to the left as the preceding sibling in the child list. The node passed here must be a either a child node of the current node or null. If the value is null, the newChild node is inserted at the end of the child list. If the referenceChild node is not a child of the current node, an error is returned.
      * @return On success, the child node that was inserted. If null, no object is created.
      */
    /* CompleteClass */
    override def insertBefore(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
    /** Normalizes all descendant elements by combining two or more adjacent text nodes into one unified text node. */
    /* CompleteClass */
    override def normalize(): Unit = js.native
    /**
      * Removes or replaces the named attribute.
      * @param attributeName The name of the attribute to be removed.
      */
    /* CompleteClass */
    override def removeAttribute(attributeName: String): Unit = js.native
    /**
      * Removes the specified attribute from this element in the specified namespace.
      * @param namespaceUri The namespace of attribute to be removed.
      * @param localName The name of the attribute without the namespace prefix.
      */
    /* CompleteClass */
    override def removeAttributeNS(namespaceUri: js.Any, localName: String): Unit = js.native
    /**
      * Removes the specified attribute from this element.
      * @param attributeNode The attribute to be removed.
      * @return The removed attribute, if any.
      */
    /* CompleteClass */
    override def removeAttributeNode(attributeNode: typings.winrtUwp.Windows.Data.Xml.Dom.XmlAttribute): typings.winrtUwp.Windows.Data.Xml.Dom.XmlAttribute = js.native
    /**
      * Removes the specified child node from the list of children and returns it.
      * @param childNode The child node to be removed from the list of children of this node.
      * @return The removed child node. If null, the childNode object is not removed.
      */
    /* CompleteClass */
    override def removeChild(childNode: IXmlNode): IXmlNode = js.native
    /**
      * Replaces the specified old child node with the supplied new child node.
      * @param newChild The new child that is to replace the old child. If null, the referenceChild parameter is removed without a replacement.
      * @param referenceChild The old child that is to be replaced by the new child.
      * @return The old child that is replaced. If null, no object is created.
      */
    /* CompleteClass */
    override def replaceChild(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
    /**
      * Applies the specified pattern-matching operation to this node's context and returns the list of matching nodes as an XmlNodeList .
      * @param xpath Specifies an XPath expression.
      * @return The collection of nodes selected by applying the given pattern-matching operation. If no nodes are selected, this method returns an empty collection.
      */
    /* CompleteClass */
    override def selectNodes(xpath: String): typings.winrtUwp.Windows.Data.Xml.Dom.XmlNodeList = js.native
    /**
      * Applies the specified pattern-matching operation to this node's context and returns the list of matching nodes as an XmlNodeList .
      * @param xpath Specifies an XPath expression.
      * @param namespaces Contains a string that specifies namespaces for use in XPath expressions when it is necessary to define new namespaces externally. Namespaces are defined in the XML style, as a space-separated list of namespace declaration attributes. You can use this property to set the default namespace as well.
      * @return The collection of nodes selected by applying the given pattern-matching operation. If no nodes are selected, returns an empty collection.
      */
    /* CompleteClass */
    override def selectNodesNS(xpath: String, namespaces: js.Any): typings.winrtUwp.Windows.Data.Xml.Dom.XmlNodeList = js.native
    /**
      * Applies the specified pattern-matching operation to this node's context and returns the first matching node.
      * @param xpath Specifies an XPath expression.
      * @return The first node that matches the given pattern-matching operation. If no nodes match the expression, the method returns a null value.
      */
    /* CompleteClass */
    override def selectSingleNode(xpath: String): IXmlNode = js.native
    /**
      * Applies the specified pattern-matching operation to this node's context and returns the first matching node.
      * @param xpath Specifies an XPath expression.
      * @param namespaces Contains a string that specifies the namespaces to use in XPath expressions when it is necessary to define new namespaces externally. Namespaces are defined in the XML style, as a space-separated list of namespace declaration attributes. You can use this property to set the default namespace as well.
      * @return The first node that matches the given pattern-matching operation. If no nodes match the expression, this method returns a null value.
      */
    /* CompleteClass */
    override def selectSingleNodeNS(xpath: String, namespaces: js.Any): IXmlNode = js.native
    /**
      * Sets the value of the named attribute.
      * @param attributeName The name of the required attribute.
      * @param attributeValue The new value for the attribute.
      */
    /* CompleteClass */
    override def setAttribute(attributeName: String, attributeValue: String): Unit = js.native
    /**
      * Sets the value of the named attribute in the given namespace.
      * @param namespaceUri The namespace of the attribute being set.
      * @param qualifiedName The name of the attribute being set.
      * @param value The new value for the attribute.
      */
    /* CompleteClass */
    override def setAttributeNS(namespaceUri: js.Any, qualifiedName: String, value: String): Unit = js.native
    /**
      * Sets or updates the supplied attribute node on this element.
      * @param newAttribute A pointer to the new attribute.
      * @return The returned pointer to the previous attribute (if any) with the same name.
      */
    /* CompleteClass */
    override def setAttributeNode(newAttribute: typings.winrtUwp.Windows.Data.Xml.Dom.XmlAttribute): typings.winrtUwp.Windows.Data.Xml.Dom.XmlAttribute = js.native
    /**
      * Sets or updates the supplied attribute node on this element. If you are not using any namespaces, then use the SetAttributeNode method.
      * @param newAttribute The node to add to the collection.
      * @return The attribute successfully added to the collection. If Null, no object is created.
      */
    /* CompleteClass */
    override def setAttributeNodeNS(newAttribute: typings.winrtUwp.Windows.Data.Xml.Dom.XmlAttribute): typings.winrtUwp.Windows.Data.Xml.Dom.XmlAttribute = js.native
  }
  
  /** Represents an entity reference node. */
  @js.native
  abstract class XmlEntityReference ()
    extends typings.winrtUwp.Windows.Data.Xml.Dom.XmlEntityReference {
    /** Gets the list of attributes of this node. */
    /* CompleteClass */
    override var attributes: typings.winrtUwp.Windows.Data.Xml.Dom.XmlNamedNodeMap = js.native
    /** Gets a list of children in the current node. */
    /* CompleteClass */
    override var childNodes: typings.winrtUwp.Windows.Data.Xml.Dom.XmlNodeList = js.native
    /** Gets the first child node. */
    /* CompleteClass */
    override var firstChild: IXmlNode = js.native
    /** Gets the text from inside the XML. */
    /* CompleteClass */
    override var innerText: String = js.native
    /** Gets the last child node. */
    /* CompleteClass */
    override var lastChild: IXmlNode = js.native
    /** Gets the local name, which is the local part of a qualified name. This is called the local part in Namespaces in XML. */
    /* CompleteClass */
    override var localName: js.Any = js.native
    /** Returns the Uniform Resource Identifier (URI) for the namespace. */
    /* CompleteClass */
    override var namespaceUri: js.Any = js.native
    /** Gets the next sibling of the node in the parent's child list. */
    /* CompleteClass */
    override var nextSibling: IXmlNode = js.native
    /** Returns the qualified name for attribute, document type, element, entity, or notation nodes. Returns a fixed string for all other node types. */
    /* CompleteClass */
    override var nodeName: String = js.native
    /** Gets the XML Document Object Model (DOM) node type, which determines valid values and whether the node can have child nodes. */
    /* CompleteClass */
    override var nodeType: NodeType = js.native
    /** Gets or sets the text associated with the node. */
    /* CompleteClass */
    override var nodeValue: js.Any = js.native
    /** Returns the root of the document that contains the node. */
    /* CompleteClass */
    override var ownerDocument: typings.winrtUwp.Windows.Data.Xml.Dom.XmlDocument = js.native
    /** Gets the parent node of the node instance. */
    /* CompleteClass */
    override var parentNode: IXmlNode = js.native
    /** Gets or sets the namespace prefix. */
    /* CompleteClass */
    override var prefix: js.Any = js.native
    /** Gets the previous sibling of the node in the parent's child list. */
    /* CompleteClass */
    override var previousSibling: IXmlNode = js.native
    /**
      * Appends a new child node as the last child of the node.
      * @param newChild The new child node to be appended to the end of the list of children of this node.
      * @return The new child node successfully appended to the list. If null, no object is created.
      */
    /* CompleteClass */
    override def appendChild(newChild: IXmlNode): IXmlNode = js.native
    /**
      * Clones a new node.
      * @param deep A flag that indicates whether to recursively clone all nodes that are descendants of this node. If true, this method creates a clone of the complete tree below this node. If false, this method clones this node and its attributes only.
      * @return The newly created clone node.
      */
    /* CompleteClass */
    override def cloneNode(deep: Boolean): IXmlNode = js.native
    /**
      * Returns the XML representation of the node and all its descendants.
      * @return The XML representation of the node and all its descendants.
      */
    /* CompleteClass */
    override def getXml(): String = js.native
    /**
      * Determines whether a node has children.
      * @return True if this node has children; otherwise false.
      */
    /* CompleteClass */
    override def hasChildNodes(): Boolean = js.native
    /**
      * Inserts a child node to the left of the specified node, or at the end of the list.
      * @param newChild The address of the new node to be inserted. The node passed here must be a valid child of the current XML DOM document node. For example, if the current node is an attribute, you cannot pass another attribute in the newChild parameter, because an attribute cannot have an attribute as a child. If newChild is a DOCUMENT_FRAGMENT node type, all its children are inserted in order before referenceChild.
      * @param referenceChild The reference node. The node specified is where the newChild node is to be inserted to the left as the preceding sibling in the child list. The node passed here must be a either a child node of the current node or null. If the value is null, the newChild node is inserted at the end of the child list. If the referenceChild node is not a child of the current node, an error is returned.
      * @return On success, the child node that was inserted. If null, no object is created.
      */
    /* CompleteClass */
    override def insertBefore(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
    /** Normalizes all descendant elements by combining two or more adjacent text nodes into one unified text node. */
    /* CompleteClass */
    override def normalize(): Unit = js.native
    /**
      * Removes the specified child node from the list of children and returns it.
      * @param childNode The child node to be removed from the list of children of this node.
      * @return The removed child node. If null, the childNode object is not removed.
      */
    /* CompleteClass */
    override def removeChild(childNode: IXmlNode): IXmlNode = js.native
    /**
      * Replaces the specified old child node with the supplied new child node.
      * @param newChild The new child that is to replace the old child. If null, the referenceChild parameter is removed without a replacement.
      * @param referenceChild The old child that is to be replaced by the new child.
      * @return The old child that is replaced. If null, no object is created.
      */
    /* CompleteClass */
    override def replaceChild(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
    /**
      * Applies the specified pattern-matching operation to this node's context and returns the list of matching nodes as an XmlNodeList .
      * @param xpath Specifies an XPath expression.
      * @return The collection of nodes selected by applying the given pattern-matching operation. If no nodes are selected, this method returns an empty collection.
      */
    /* CompleteClass */
    override def selectNodes(xpath: String): typings.winrtUwp.Windows.Data.Xml.Dom.XmlNodeList = js.native
    /**
      * Applies the specified pattern-matching operation to this node's context and returns the list of matching nodes as an XmlNodeList .
      * @param xpath Specifies an XPath expression.
      * @param namespaces Contains a string that specifies namespaces for use in XPath expressions when it is necessary to define new namespaces externally. Namespaces are defined in the XML style, as a space-separated list of namespace declaration attributes. You can use this property to set the default namespace as well.
      * @return The collection of nodes selected by applying the given pattern-matching operation. If no nodes are selected, returns an empty collection.
      */
    /* CompleteClass */
    override def selectNodesNS(xpath: String, namespaces: js.Any): typings.winrtUwp.Windows.Data.Xml.Dom.XmlNodeList = js.native
    /**
      * Applies the specified pattern-matching operation to this node's context and returns the first matching node.
      * @param xpath Specifies an XPath expression.
      * @return The first node that matches the given pattern-matching operation. If no nodes match the expression, the method returns a null value.
      */
    /* CompleteClass */
    override def selectSingleNode(xpath: String): IXmlNode = js.native
    /**
      * Applies the specified pattern-matching operation to this node's context and returns the first matching node.
      * @param xpath Specifies an XPath expression.
      * @param namespaces Contains a string that specifies the namespaces to use in XPath expressions when it is necessary to define new namespaces externally. Namespaces are defined in the XML style, as a space-separated list of namespace declaration attributes. You can use this property to set the default namespace as well.
      * @return The first node that matches the given pattern-matching operation. If no nodes match the expression, this method returns a null value.
      */
    /* CompleteClass */
    override def selectSingleNodeNS(xpath: String, namespaces: js.Any): IXmlNode = js.native
  }
  
  /** Contains settings that are used during loading and parsing of XML documents. The default settings are chosen for the highest security. This class can be instantiated and is accepted by LoadXml , LoadFromUriAsync , and LoadFromFileAsync . */
  @js.native
  /** Creates a new XmlLoadSettings object. */
  class XmlLoadSettings ()
    extends typings.winrtUwp.Windows.Data.Xml.Dom.XmlLoadSettings {
    /** Specifies whether default handling preserves white space. */
    /* CompleteClass */
    override var elementContentWhiteSpace: Boolean = js.native
    /** Gets and sets the limits of the element depth of an XML document to be loaded into a DOM object. */
    /* CompleteClass */
    override var maxElementDepth: Double = js.native
    /** Gets or sets a value that specifies whether to prohibit or allow the inclusion of a DTD in the XML DOM document. */
    /* CompleteClass */
    override var prohibitDtd: Boolean = js.native
    /** Gets or sets a value that specifies whether external definitions, resolvable namespaces, external subsets of document type definitions (DTDs), and external entity references are to be resolved at the time the document is parsed. */
    /* CompleteClass */
    override var resolveExternals: Boolean = js.native
    /** Gets or sets a value that specifies whether the XML parser should validate this document against the document type definition (DTD) on loading. */
    /* CompleteClass */
    override var validateOnParse: Boolean = js.native
  }
  
  /** Encapsulates iteration through the collection of attribute nodes. */
  @js.native
  abstract class XmlNamedNodeMap ()
    extends typings.winrtUwp.Windows.Data.Xml.Dom.XmlNamedNodeMap
  
  /** Describes a collection of nodes. */
  @js.native
  abstract class XmlNodeList ()
    extends typings.winrtUwp.Windows.Data.Xml.Dom.XmlNodeList
  
  /** Represents a processing instruction, which XML defines to keep processor-specific information in the text of the document. */
  @js.native
  abstract class XmlProcessingInstruction ()
    extends typings.winrtUwp.Windows.Data.Xml.Dom.XmlProcessingInstruction {
    /** Gets the list of attributes of this node. */
    /* CompleteClass */
    override var attributes: typings.winrtUwp.Windows.Data.Xml.Dom.XmlNamedNodeMap = js.native
    /** Gets a list of children in the current node. */
    /* CompleteClass */
    override var childNodes: typings.winrtUwp.Windows.Data.Xml.Dom.XmlNodeList = js.native
    /** Gets or sets the content of the processing instruction, excluding the target. */
    /* CompleteClass */
    override var data: String = js.native
    /** Gets the first child node. */
    /* CompleteClass */
    override var firstChild: IXmlNode = js.native
    /** Gets the text from inside the XML. */
    /* CompleteClass */
    override var innerText: String = js.native
    /** Gets the last child node. */
    /* CompleteClass */
    override var lastChild: IXmlNode = js.native
    /** Gets the local name, which is the local part of a qualified name. This is called the local part in Namespaces in XML. */
    /* CompleteClass */
    override var localName: js.Any = js.native
    /** Returns the Uniform Resource Identifier (URI) for the namespace. */
    /* CompleteClass */
    override var namespaceUri: js.Any = js.native
    /** Gets the next sibling of the node in the parent's child list. */
    /* CompleteClass */
    override var nextSibling: IXmlNode = js.native
    /** Returns the qualified name for attribute, document type, element, entity, or notation nodes. Returns a fixed string for all other node types. */
    /* CompleteClass */
    override var nodeName: String = js.native
    /** Gets the XML Document Object Model (DOM) node type, which determines valid values and whether the node can have child nodes. */
    /* CompleteClass */
    override var nodeType: NodeType = js.native
    /** Gets or sets the text associated with the node. */
    /* CompleteClass */
    override var nodeValue: js.Any = js.native
    /** Returns the root of the document that contains the node. */
    /* CompleteClass */
    override var ownerDocument: typings.winrtUwp.Windows.Data.Xml.Dom.XmlDocument = js.native
    /** Gets the parent node of the node instance. */
    /* CompleteClass */
    override var parentNode: IXmlNode = js.native
    /** Gets or sets the namespace prefix. */
    /* CompleteClass */
    override var prefix: js.Any = js.native
    /** Gets the previous sibling of the node in the parent's child list. */
    /* CompleteClass */
    override var previousSibling: IXmlNode = js.native
    /** Gets the target for the processing instruction. */
    /* CompleteClass */
    override var target: String = js.native
    /**
      * Appends a new child node as the last child of the node.
      * @param newChild The new child node to be appended to the end of the list of children of this node.
      * @return The new child node successfully appended to the list. If null, no object is created.
      */
    /* CompleteClass */
    override def appendChild(newChild: IXmlNode): IXmlNode = js.native
    /**
      * Clones a new node.
      * @param deep A flag that indicates whether to recursively clone all nodes that are descendants of this node. If true, this method creates a clone of the complete tree below this node. If false, this method clones this node and its attributes only.
      * @return The newly created clone node.
      */
    /* CompleteClass */
    override def cloneNode(deep: Boolean): IXmlNode = js.native
    /**
      * Returns the XML representation of the node and all its descendants.
      * @return The XML representation of the node and all its descendants.
      */
    /* CompleteClass */
    override def getXml(): String = js.native
    /**
      * Determines whether a node has children.
      * @return True if this node has children; otherwise false.
      */
    /* CompleteClass */
    override def hasChildNodes(): Boolean = js.native
    /**
      * Inserts a child node to the left of the specified node, or at the end of the list.
      * @param newChild The address of the new node to be inserted. The node passed here must be a valid child of the current XML DOM document node. For example, if the current node is an attribute, you cannot pass another attribute in the newChild parameter, because an attribute cannot have an attribute as a child. If newChild is a DOCUMENT_FRAGMENT node type, all its children are inserted in order before referenceChild.
      * @param referenceChild The reference node. The node specified is where the newChild node is to be inserted to the left as the preceding sibling in the child list. The node passed here must be a either a child node of the current node or null. If the value is null, the newChild node is inserted at the end of the child list. If the referenceChild node is not a child of the current node, an error is returned.
      * @return On success, the child node that was inserted. If null, no object is created.
      */
    /* CompleteClass */
    override def insertBefore(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
    /** Normalizes all descendant elements by combining two or more adjacent text nodes into one unified text node. */
    /* CompleteClass */
    override def normalize(): Unit = js.native
    /**
      * Removes the specified child node from the list of children and returns it.
      * @param childNode The child node to be removed from the list of children of this node.
      * @return The removed child node. If null, the childNode object is not removed.
      */
    /* CompleteClass */
    override def removeChild(childNode: IXmlNode): IXmlNode = js.native
    /**
      * Replaces the specified old child node with the supplied new child node.
      * @param newChild The new child that is to replace the old child. If null, the referenceChild parameter is removed without a replacement.
      * @param referenceChild The old child that is to be replaced by the new child.
      * @return The old child that is replaced. If null, no object is created.
      */
    /* CompleteClass */
    override def replaceChild(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
    /**
      * Applies the specified pattern-matching operation to this node's context and returns the list of matching nodes as an XmlNodeList .
      * @param xpath Specifies an XPath expression.
      * @return The collection of nodes selected by applying the given pattern-matching operation. If no nodes are selected, this method returns an empty collection.
      */
    /* CompleteClass */
    override def selectNodes(xpath: String): typings.winrtUwp.Windows.Data.Xml.Dom.XmlNodeList = js.native
    /**
      * Applies the specified pattern-matching operation to this node's context and returns the list of matching nodes as an XmlNodeList .
      * @param xpath Specifies an XPath expression.
      * @param namespaces Contains a string that specifies namespaces for use in XPath expressions when it is necessary to define new namespaces externally. Namespaces are defined in the XML style, as a space-separated list of namespace declaration attributes. You can use this property to set the default namespace as well.
      * @return The collection of nodes selected by applying the given pattern-matching operation. If no nodes are selected, returns an empty collection.
      */
    /* CompleteClass */
    override def selectNodesNS(xpath: String, namespaces: js.Any): typings.winrtUwp.Windows.Data.Xml.Dom.XmlNodeList = js.native
    /**
      * Applies the specified pattern-matching operation to this node's context and returns the first matching node.
      * @param xpath Specifies an XPath expression.
      * @return The first node that matches the given pattern-matching operation. If no nodes match the expression, the method returns a null value.
      */
    /* CompleteClass */
    override def selectSingleNode(xpath: String): IXmlNode = js.native
    /**
      * Applies the specified pattern-matching operation to this node's context and returns the first matching node.
      * @param xpath Specifies an XPath expression.
      * @param namespaces Contains a string that specifies the namespaces to use in XPath expressions when it is necessary to define new namespaces externally. Namespaces are defined in the XML style, as a space-separated list of namespace declaration attributes. You can use this property to set the default namespace as well.
      * @return The first node that matches the given pattern-matching operation. If no nodes match the expression, this method returns a null value.
      */
    /* CompleteClass */
    override def selectSingleNodeNS(xpath: String, namespaces: js.Any): IXmlNode = js.native
  }
  
  /** Represents the text content of an element. */
  @js.native
  abstract class XmlText ()
    extends typings.winrtUwp.Windows.Data.Xml.Dom.XmlText {
    /** Gets the list of attributes of this node. */
    /* CompleteClass */
    override var attributes: typings.winrtUwp.Windows.Data.Xml.Dom.XmlNamedNodeMap = js.native
    /** Gets a list of children in the current node. */
    /* CompleteClass */
    override var childNodes: typings.winrtUwp.Windows.Data.Xml.Dom.XmlNodeList = js.native
    /** Gets or sets the node data depending on the node type. */
    /* CompleteClass */
    override var data: String = js.native
    /** Gets the first child node. */
    /* CompleteClass */
    override var firstChild: IXmlNode = js.native
    /** Gets the text from inside the XML. */
    /* CompleteClass */
    override var innerText: String = js.native
    /** Gets the last child node. */
    /* CompleteClass */
    override var lastChild: IXmlNode = js.native
    /** Gets the length of the data, in Unicode characters. */
    /* CompleteClass */
    override var length: Double = js.native
    /** Gets the local name, which is the local part of a qualified name. This is called the local part in Namespaces in XML. */
    /* CompleteClass */
    override var localName: js.Any = js.native
    /** Returns the Uniform Resource Identifier (URI) for the namespace. */
    /* CompleteClass */
    override var namespaceUri: js.Any = js.native
    /** Gets the next sibling of the node in the parent's child list. */
    /* CompleteClass */
    override var nextSibling: IXmlNode = js.native
    /** Returns the qualified name for attribute, document type, element, entity, or notation nodes. Returns a fixed string for all other node types. */
    /* CompleteClass */
    override var nodeName: String = js.native
    /** Gets the XML Document Object Model (DOM) node type, which determines valid values and whether the node can have child nodes. */
    /* CompleteClass */
    override var nodeType: NodeType = js.native
    /** Gets or sets the text associated with the node. */
    /* CompleteClass */
    override var nodeValue: js.Any = js.native
    /** Returns the root of the document that contains the node. */
    /* CompleteClass */
    override var ownerDocument: typings.winrtUwp.Windows.Data.Xml.Dom.XmlDocument = js.native
    /** Gets the parent node of the node instance. */
    /* CompleteClass */
    override var parentNode: IXmlNode = js.native
    /** Gets or sets the namespace prefix. */
    /* CompleteClass */
    override var prefix: js.Any = js.native
    /** Gets the previous sibling of the node in the parent's child list. */
    /* CompleteClass */
    override var previousSibling: IXmlNode = js.native
    /**
      * Appends a new child node as the last child of the node.
      * @param newChild The new child node to be appended to the end of the list of children of this node.
      * @return The new child node successfully appended to the list. If null, no object is created.
      */
    /* CompleteClass */
    override def appendChild(newChild: IXmlNode): IXmlNode = js.native
    /**
      * Appends the supplied string to the existing string data.
      * @param data The data to be appended to the existing string.
      */
    /* CompleteClass */
    override def appendData(data: String): Unit = js.native
    /**
      * Clones a new node.
      * @param deep A flag that indicates whether to recursively clone all nodes that are descendants of this node. If true, this method creates a clone of the complete tree below this node. If false, this method clones this node and its attributes only.
      * @return The newly created clone node.
      */
    /* CompleteClass */
    override def cloneNode(deep: Boolean): IXmlNode = js.native
    /**
      * Deletes specified data.
      * @param offset The offset, in characters, at which to start deleting the string data.
      * @param count The number of characters to delete.
      */
    /* CompleteClass */
    override def deleteData(offset: Double, count: Double): Unit = js.native
    /**
      * Returns the XML representation of the node and all its descendants.
      * @return The XML representation of the node and all its descendants.
      */
    /* CompleteClass */
    override def getXml(): String = js.native
    /**
      * Determines whether a node has children.
      * @return True if this node has children; otherwise false.
      */
    /* CompleteClass */
    override def hasChildNodes(): Boolean = js.native
    /**
      * Inserts a child node to the left of the specified node, or at the end of the list.
      * @param newChild The address of the new node to be inserted. The node passed here must be a valid child of the current XML DOM document node. For example, if the current node is an attribute, you cannot pass another attribute in the newChild parameter, because an attribute cannot have an attribute as a child. If newChild is a DOCUMENT_FRAGMENT node type, all its children are inserted in order before referenceChild.
      * @param referenceChild The reference node. The node specified is where the newChild node is to be inserted to the left as the preceding sibling in the child list. The node passed here must be a either a child node of the current node or null. If the value is null, the newChild node is inserted at the end of the child list. If the referenceChild node is not a child of the current node, an error is returned.
      * @return On success, the child node that was inserted. If null, no object is created.
      */
    /* CompleteClass */
    override def insertBefore(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
    /**
      * Inserts a string at the specified offset.
      * @param offset The offset, in characters, at which to insert the supplied string data.
      * @param data The data to be inserted into the existing string.
      */
    /* CompleteClass */
    override def insertData(offset: Double, data: String): Unit = js.native
    /** Normalizes all descendant elements by combining two or more adjacent text nodes into one unified text node. */
    /* CompleteClass */
    override def normalize(): Unit = js.native
    /**
      * Removes the specified child node from the list of children and returns it.
      * @param childNode The child node to be removed from the list of children of this node.
      * @return The removed child node. If null, the childNode object is not removed.
      */
    /* CompleteClass */
    override def removeChild(childNode: IXmlNode): IXmlNode = js.native
    /**
      * Replaces the specified old child node with the supplied new child node.
      * @param newChild The new child that is to replace the old child. If null, the referenceChild parameter is removed without a replacement.
      * @param referenceChild The old child that is to be replaced by the new child.
      * @return The old child that is replaced. If null, no object is created.
      */
    /* CompleteClass */
    override def replaceChild(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
    /**
      * Replaces the specified number of characters with the supplied string.
      * @param offset The offset, in characters, at which to start replacing string data.
      * @param count The number of characters to replace.
      * @param data The new data that replaces the old string data.
      */
    /* CompleteClass */
    override def replaceData(offset: Double, count: Double, data: String): Unit = js.native
    /**
      * Applies the specified pattern-matching operation to this node's context and returns the list of matching nodes as an XmlNodeList .
      * @param xpath Specifies an XPath expression.
      * @return The collection of nodes selected by applying the given pattern-matching operation. If no nodes are selected, this method returns an empty collection.
      */
    /* CompleteClass */
    override def selectNodes(xpath: String): typings.winrtUwp.Windows.Data.Xml.Dom.XmlNodeList = js.native
    /**
      * Applies the specified pattern-matching operation to this node's context and returns the list of matching nodes as an XmlNodeList .
      * @param xpath Specifies an XPath expression.
      * @param namespaces Contains a string that specifies namespaces for use in XPath expressions when it is necessary to define new namespaces externally. Namespaces are defined in the XML style, as a space-separated list of namespace declaration attributes. You can use this property to set the default namespace as well.
      * @return The collection of nodes selected by applying the given pattern-matching operation. If no nodes are selected, returns an empty collection.
      */
    /* CompleteClass */
    override def selectNodesNS(xpath: String, namespaces: js.Any): typings.winrtUwp.Windows.Data.Xml.Dom.XmlNodeList = js.native
    /**
      * Applies the specified pattern-matching operation to this node's context and returns the first matching node.
      * @param xpath Specifies an XPath expression.
      * @return The first node that matches the given pattern-matching operation. If no nodes match the expression, the method returns a null value.
      */
    /* CompleteClass */
    override def selectSingleNode(xpath: String): IXmlNode = js.native
    /**
      * Applies the specified pattern-matching operation to this node's context and returns the first matching node.
      * @param xpath Specifies an XPath expression.
      * @param namespaces Contains a string that specifies the namespaces to use in XPath expressions when it is necessary to define new namespaces externally. Namespaces are defined in the XML style, as a space-separated list of namespace declaration attributes. You can use this property to set the default namespace as well.
      * @return The first node that matches the given pattern-matching operation. If no nodes match the expression, this method returns a null value.
      */
    /* CompleteClass */
    override def selectSingleNodeNS(xpath: String, namespaces: js.Any): IXmlNode = js.native
    /**
      * Splits this text node into two text nodes at the specified offset and inserts the new text node into the tree as a sibling that immediately follows this node.
      * @param offset The number of characters at which to split this text node into two nodes, starting from zero.
      * @return The new text node.
      */
    /* CompleteClass */
    override def splitText(offset: Double): IXmlText = js.native
    /**
      * Retrieves a substring of the full string from the specified range.
      * @param offset The offset, in characters, from the beginning of the string. An offset of zero indicates copying from the start of the data.
      * @param count The number of characters to retrieve from the specified offset.
      * @return The returned substring.
      */
    /* CompleteClass */
    override def substringData(offset: Double, count: Double): String = js.native
  }
  
  /** The type of an IXmlNode, as returned by the NodeType property. */
  @js.native
  object NodeType extends js.Object {
    /* 2 */ val attributeNode: typings.winrtUwp.Windows.Data.Xml.Dom.NodeType.attributeNode with Double = js.native
    /* 8 */ val commentNode: typings.winrtUwp.Windows.Data.Xml.Dom.NodeType.commentNode with Double = js.native
    /* 4 */ val dataSectionNode: typings.winrtUwp.Windows.Data.Xml.Dom.NodeType.dataSectionNode with Double = js.native
    /* 11 */ val documentFragmentNode: typings.winrtUwp.Windows.Data.Xml.Dom.NodeType.documentFragmentNode with Double = js.native
    /* 9 */ val documentNode: typings.winrtUwp.Windows.Data.Xml.Dom.NodeType.documentNode with Double = js.native
    /* 10 */ val documentTypeNode: typings.winrtUwp.Windows.Data.Xml.Dom.NodeType.documentTypeNode with Double = js.native
    /* 1 */ val elementNode: typings.winrtUwp.Windows.Data.Xml.Dom.NodeType.elementNode with Double = js.native
    /* 6 */ val entityNode: typings.winrtUwp.Windows.Data.Xml.Dom.NodeType.entityNode with Double = js.native
    /* 5 */ val entityReferenceNode: typings.winrtUwp.Windows.Data.Xml.Dom.NodeType.entityReferenceNode with Double = js.native
    /* 0 */ val invalid: typings.winrtUwp.Windows.Data.Xml.Dom.NodeType.invalid with Double = js.native
    /* 12 */ val notationNode: typings.winrtUwp.Windows.Data.Xml.Dom.NodeType.notationNode with Double = js.native
    /* 7 */ val processingInstructionNode: typings.winrtUwp.Windows.Data.Xml.Dom.NodeType.processingInstructionNode with Double = js.native
    /* 3 */ val textNode: typings.winrtUwp.Windows.Data.Xml.Dom.NodeType.textNode with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Data.Xml.Dom.NodeType with Double] = js.native
  }
  
  /* static members */
  @js.native
  object XmlDocument extends js.Object {
    /**
      * Asynchronously loads an XML document from the specified file. The document is parsed using the default parser settings.
      * @param file The file from which to load the document.
      * @return The object that must be used to start the operation.
      */
    def loadFromFileAsync(file: IStorageFile): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Data.Xml.Dom.XmlDocument] = js.native
    /**
      * Asynchronously loads an XML document from the specified file. The document is parsed using the provided settings.
      * @param file The file from which to load the document.
      * @param loadSettings Settings for customizing parser behavior.
      * @return The object that must be used to start the operation.
      */
    def loadFromFileAsync(file: IStorageFile, loadSettings: typings.winrtUwp.Windows.Data.Xml.Dom.XmlLoadSettings): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Data.Xml.Dom.XmlDocument] = js.native
    /**
      * Asynchronously loads an XML document from the specified location. The document is parsed using the default parser settings.
      * @param uri A URL that specifies the location of the XML file.
      * @return The object that must be used to start the operation.
      */
    def loadFromUriAsync(uri: Uri): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Data.Xml.Dom.XmlDocument] = js.native
    /**
      * Asynchronously loads an XML document from the specified location. The document is parsed using the provided settings.
      * @param uri A URL that specifies the location of the XML file.
      * @param loadSettings Customizes parser behavior.
      * @return An object that must be used to start the operation.
      */
    def loadFromUriAsync(uri: Uri, loadSettings: typings.winrtUwp.Windows.Data.Xml.Dom.XmlLoadSettings): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Data.Xml.Dom.XmlDocument] = js.native
  }
  
}

