package typings.winrtUwp.Windows.Data.Xml.Dom

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.Storage.IStorageFile
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the top level of the XML source. This class includes members for retrieving and creating all other XML objects. */
@JSGlobal("Windows.Data.Xml.Dom.XmlDocument")
@js.native
/** Creates a new instance of the XmlDocument class. */
class XmlDocument () extends js.Object {
  /** Gets the list of attributes of this node. */
  var attributes: XmlNamedNodeMap = js.native
  /** Gets a list of children in the current node. */
  var childNodes: XmlNodeList = js.native
  /** For XML, this property gets the address of the node that specifies the DTD. This property returns Null for for HTML documents and XML documents without a DTD. */
  var doctype: XmlDocumentType = js.native
  /** Gets the root element of the document. */
  var documentElement: XmlElement = js.native
  /** Returns the URL for the last loaded XML document. */
  var documentUri: String = js.native
  /** Gets the first child node. */
  var firstChild: IXmlNode = js.native
  /** Gets the Implementation object for the document. */
  var implementation: XmlDomImplementation = js.native
  /** Gets the text from inside the XML. */
  var innerText: String = js.native
  /** Gets the last child node. */
  var lastChild: IXmlNode = js.native
  /** Gets the local name, which is the local part of a qualified name. This is called the local part in Namespaces in XML. */
  var localName: js.Any = js.native
  /** Returns the Uniform Resource Identifier (URI) for the namespace. */
  var namespaceUri: js.Any = js.native
  /** Gets the next sibling of the node in the parent's child list. This property is not applicable to this class. */
  var nextSibling: IXmlNode = js.native
  /** Returns the qualified name for attribute, document type, element, entity, or notation nodes. Returns a fixed string for all other node types. */
  var nodeName: String = js.native
  /** Gets the XML Document Object Model (DOM) node type, which determines valid values and whether the node can have child nodes. */
  var nodeType: NodeType = js.native
  /** Gets or sets the text associated with the node. */
  var nodeValue: js.Any = js.native
  /** Returns the root of the document that contains the node. */
  var ownerDocument: XmlDocument = js.native
  /** Gets the parent node of the node instance. */
  var parentNode: IXmlNode = js.native
  /** Gets or sets the namespace prefix. */
  var prefix: js.Any = js.native
  /** Gets the previous sibling of the node in the parent's child list. This property is not applicable to this class. */
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
    * Creates a new attribute with the specified name.
    * @param name The name of the new attribute object. This name is subsequently available as the new node's NodeName property.
    * @return The newly created attribute.
    */
  def createAttribute(name: String): XmlAttribute = js.native
  /**
    * Creates a new attribute with the specified namespace and name.
    * @param namespaceUri The name of the desired namespace or a null value if no namespace is desired.
    * @param qualifiedName The name of the new attribute object. This name is subsequently available as the new node's NodeName property.
    * @return The newly created attribute.
    */
  def createAttributeNS(namespaceUri: js.Any, qualifiedName: String): XmlAttribute = js.native
  /**
    * Creates a CDATA section node that contains the supplied data.
    * @param data The value to be supplied to the new CDATA section object's NodeValue property.
    * @return The newly created object.
    */
  def createCDataSection(data: String): XmlCDataSection = js.native
  /**
    * Creates a comment node that contains the supplied data.
    * @param data The value to be supplied to the new comment object's NodeValue .
    * @return The newly created comment node.
    */
  def createComment(data: String): XmlComment = js.native
  /**
    * Creates an empty XmlDocumentFragment object.
    * @return The newly created object.
    */
  def createDocumentFragment(): XmlDocumentFragment = js.native
  /**
    * Creates an element node using the specified name.
    * @param tagName The name for the new element node. The string is case-sensitive. This name is subsequently available as the element node's NodeName property.
    * @return The newly created object.
    */
  def createElement(tagName: String): XmlElement = js.native
  /**
    * Creates an element node using the specified namespace and name.
    * @param namespaceUri The name of the desired namespace or a null value if no namespace is desired.
    * @param qualifiedName The name for the new element node. It is case-sensitive. This name is subsequently available as the element node's NodeName property.
    * @return The newly created object.
    */
  def createElementNS(namespaceUri: js.Any, qualifiedName: String): XmlElement = js.native
  /**
    * Creates a new XmlEntityReference object.
    * @param name The name of the entity referenced. This name is subsequently available as the new object's NodeName property.
    * @return The newly created object.
    */
  def createEntityReference(name: String): XmlEntityReference = js.native
  /**
    * Creates a processing instruction node that contains the supplied target and data.
    * @param target The target part of the processing instruction. It supplies the NodeName property of the new object.
    * @param data The remainder of the processing instruction preceding the closing ?> characters. It supplies the NodeValue property for the new object.
    * @return The newly created object.
    */
  def createProcessingInstruction(target: String, data: String): XmlProcessingInstruction = js.native
  /**
    * Creates a text node that contains the supplied data.
    * @param data The value to be supplied to the new text object's NodeValue .
    * @return The created text node.
    */
  def createTextNode(data: String): XmlText = js.native
  /**
    * Returns the element that matches the ID attribute.
    * @param elementId The ID to match.
    * @return The element that matches the supplied ID. If no elements match, this method returns Null.
    */
  def getElementById(elementId: String): XmlElement = js.native
  /**
    * Returns a collection of elements that have the specified name.
    * @param tagName The element name to find. The value "*" returns all elements in the document.
    * @return The collection of elements that match the specified name.
    */
  def getElementsByTagName(tagName: String): XmlNodeList = js.native
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
    * Imports a node from another document to this document.
    * @param node The object to be cloned.
    * @param deep If true, any children of node will be cloned as well. If false, no children of the node will be cloned.
    * @return The imported node.
    */
  def importNode(node: IXmlNode, deep: Boolean): IXmlNode = js.native
  /**
    * Inserts a child node to the left of the specified node, or at the end of the child node list.
    * @param newChild The address of the new node to be inserted. The node passed here must be a valid child of the current XML DOM document node. For example, if the current node is an attribute, you cannot pass another attribute in the newChild parameter, because an attribute cannot have an attribute as a child. If newChild is a DOCUMENT_FRAGMENT node type, all its children are inserted in order before referenceChild.
    * @param referenceChild The reference node. The node specified is where the newChild node is to be inserted to the left as the preceding sibling in the child list. The node passed here must be a either a child node of the current node or null. If the value is null, the newChild node is inserted at the end of the child list. If the referenceChild node is not a child of the current node, an error is returned.
    * @return On success, the child node that was inserted. If null, no object is created.
    */
  def insertBefore(newChild: IXmlNode, referenceChild: IXmlNode): IXmlNode = js.native
  /**
    * Loads an XML document using the supplied string. The document is parsed using the default parser settings.
    * @param xml The XML string to load into this XML document object. This string can contain an entire XML document or a well-formed fragment.
    */
  def loadXml(xml: String): Unit = js.native
  /**
    * Loads an XML document using the supplied string. The document is parsed using the settings provided.
    * @param xml The XML string to load into this XML document object. This string can contain an entire XML document or a well-formed fragment.
    * @param loadSettings The settings for parsing the document.
    */
  def loadXml(xml: String, loadSettings: XmlLoadSettings): Unit = js.native
  /**
    * Loads an XML document using the buffer. The document is parsed using the default parser settings.
    * @param buffer The buffer to load into this XML document object. This buffer can contain an entire XML document or a well-formed fragment.
    */
  def loadXmlFromBuffer(buffer: IBuffer): Unit = js.native
  /**
    * Loads an XML document using the buffer. The document is parsed using the settings provided.
    * @param buffer The buffer to load into this XML document object. This buffer can contain an entire XML document or a well-formed fragment.
    * @param loadSettings The settings for parsing the document.
    */
  def loadXmlFromBuffer(buffer: IBuffer, loadSettings: XmlLoadSettings): Unit = js.native
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
    * Asynchronously saves an XML document to the specified file.
    * @param file The file to save the document to.
    * @return The object that must be used to start the operation.
    */
  def saveToFileAsync(file: IStorageFile): IPromiseWithIAsyncAction = js.native
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

/* static members */
@JSGlobal("Windows.Data.Xml.Dom.XmlDocument")
@js.native
object XmlDocument extends js.Object {
  /**
    * Asynchronously loads an XML document from the specified file. The document is parsed using the default parser settings.
    * @param file The file from which to load the document.
    * @return The object that must be used to start the operation.
    */
  def loadFromFileAsync(file: IStorageFile): IPromiseWithIAsyncOperation[XmlDocument] = js.native
  /**
    * Asynchronously loads an XML document from the specified file. The document is parsed using the provided settings.
    * @param file The file from which to load the document.
    * @param loadSettings Settings for customizing parser behavior.
    * @return The object that must be used to start the operation.
    */
  def loadFromFileAsync(file: IStorageFile, loadSettings: XmlLoadSettings): IPromiseWithIAsyncOperation[XmlDocument] = js.native
  /**
    * Asynchronously loads an XML document from the specified location. The document is parsed using the default parser settings.
    * @param uri A URL that specifies the location of the XML file.
    * @return The object that must be used to start the operation.
    */
  def loadFromUriAsync(uri: Uri): IPromiseWithIAsyncOperation[XmlDocument] = js.native
  /**
    * Asynchronously loads an XML document from the specified location. The document is parsed using the provided settings.
    * @param uri A URL that specifies the location of the XML file.
    * @param loadSettings Customizes parser behavior.
    * @return An object that must be used to start the operation.
    */
  def loadFromUriAsync(uri: Uri, loadSettings: XmlLoadSettings): IPromiseWithIAsyncOperation[XmlDocument] = js.native
}

