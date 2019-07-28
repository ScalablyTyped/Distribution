package typings.xmlbuilder.xmlbuilderMod

import typings.xmlbuilder.Anon_Encoding
import typings.xmlbuilder.Anon_PubID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the base class of XML nodes.
  */
@JSImport("xmlbuilder", "XMLNode")
@js.native
abstract class XMLNode () extends js.Object {
  /** 
    * Child nodes 
    */
  var children: js.Array[XMLNode] = js.native
  /** 
    * Parent element node 
    */
  var parent: XMLElement = js.native
  /** 
    * Type of the node 
    */
  var `type`: NodeType = js.native
  def a(name: js.Any): XMLElement = js.native
  def a(name: js.Any, value: js.Any): XMLElement = js.native
  def att(name: js.Any): XMLElement = js.native
  def att(name: js.Any, value: js.Any): XMLElement = js.native
  /**
    * Adds or modifies an attribute.
    * 
    * _Aliases:_ `att`, `a`
    * 
    * @param name - attribute name
    * @param value - attribute value
    * 
    * @returns the parent element node
    */
  def attribute(name: js.Any): XMLElement = js.native
  def attribute(name: js.Any, value: js.Any): XMLElement = js.native
  def c(value: String): XMLElement = js.native
  /**
    * Creates a new CDATA node and appends it to the list of child nodes.
    * 
    * _Aliases:_ `dat` and `d`
    * 
    * @param value - node value
    * 
    * @returns the parent node
    */
  def cdata(value: String): XMLElement = js.native
  def com(value: String): XMLElement = js.native
  /**
    * Creates a new comment node and appends it to the list of child nodes.
    * 
    * _Aliases:_ `com` and `c`
    * 
    * @param value - node value
    * 
    * @returns the parent node
    */
  def comment(value: String): XMLElement = js.native
  /**
    * Creates a comment node after the current node
    * 
    * @param value - node value
    * 
    * @returns the parent node
    */
  def commentAfter(value: String): XMLElement = js.native
  /**
    * Creates a comment node before the current node
    * 
    * @param value - node value
    * 
    * @returns the parent node
    */
  def commentBefore(value: String): XMLElement = js.native
  def d(value: String): XMLElement = js.native
  def dat(value: String): XMLElement = js.native
  def dec(): XMLElement = js.native
  def dec(version: String): XMLElement = js.native
  def dec(version: String, encoding: String): XMLElement = js.native
  def dec(version: String, encoding: String, standalone: Boolean): XMLElement = js.native
  def dec(version: Anon_Encoding): XMLElement = js.native
  def dec(version: Anon_Encoding, encoding: String): XMLElement = js.native
  def dec(version: Anon_Encoding, encoding: String, standalone: Boolean): XMLElement = js.native
  /**
    * Creates the XML declaration.
    * 
    * _Alias:_ `dec`
    * 
    * @param version - version number string, e.g. `1.0`
    * @param encoding - encoding declaration, e.g. `UTF-8`
    * @param standalone - standalone document declaration: `true` or `false`
    * 
    * @returns the root element node
    */
  def declaration(): XMLElement = js.native
  def declaration(version: String): XMLElement = js.native
  def declaration(version: String, encoding: String): XMLElement = js.native
  def declaration(version: String, encoding: String, standalone: Boolean): XMLElement = js.native
  def declaration(version: Anon_Encoding): XMLElement = js.native
  def declaration(version: Anon_Encoding, encoding: String): XMLElement = js.native
  def declaration(version: Anon_Encoding, encoding: String, standalone: Boolean): XMLElement = js.native
  def doc(): XMLDocument = js.native
  /**
    * Creates the document type definition.
    * 
    * _Alias:_ `dtd`
    * 
    * @param pubID - public identifier of the DTD
    * @param sysID - system identifier of the DTD
    * 
    * @returns the DOCTYPE node
    */
  def doctype(): XMLDocType = js.native
  def doctype(pubID: String): XMLDocType = js.native
  def doctype(pubID: String, sysID: String): XMLDocType = js.native
  def doctype(pubID: Anon_PubID): XMLDocType = js.native
  def doctype(pubID: Anon_PubID, sysID: String): XMLDocType = js.native
  /**
    * Returns the document node.
    * 
    * _Alias:_ `doc`
    */
  def document(): XMLDocument = js.native
  def dtd(): XMLDocType = js.native
  def dtd(pubID: String): XMLDocType = js.native
  def dtd(pubID: String, sysID: String): XMLDocType = js.native
  def dtd(pubID: Anon_PubID): XMLDocType = js.native
  def dtd(pubID: Anon_PubID, sysID: String): XMLDocType = js.native
  def e(name: js.Any): XMLElement = js.native
  def e(name: js.Any, attributes: js.Object): XMLElement = js.native
  def e(name: js.Any, attributes: js.Object, text: js.Any): XMLElement = js.native
  def ele(name: js.Any): XMLElement = js.native
  def ele(name: js.Any, attributes: js.Object): XMLElement = js.native
  def ele(name: js.Any, attributes: js.Object, text: js.Any): XMLElement = js.native
  /**
    * Creates a new child node and appends it to the list of child nodes.
    * 
    * _Aliases:_ `ele` and `e`
    * 
    * @param name - node name or a JS object defining the nodes to insert
    * @param attributes - node attributes
    * @param text - node text
    * 
    * @returns the last top level node created
    */
  def element(name: js.Any): XMLElement = js.native
  def element(name: js.Any, attributes: js.Object): XMLElement = js.native
  def element(name: js.Any, attributes: js.Object, text: js.Any): XMLElement = js.native
  /**
    * Converts the XML document to string.
    * 
    * @param options - conversion options
    */
  def end(): String = js.native
  def end(options: XMLToStringOptions): String = js.native
  def end(options: XMLWriter): String = js.native
  def i(array: js.Array[_]): XMLElement = js.native
  def i(obj: js.Object): XMLElement = js.native
  def i(target: String, value: js.Any): XMLElement = js.native
  /**
    * Takes the root node of the given XML document and appends it 
    * to child nodes.
    * 
    * @param doc - the document whose root node to import
    * 
    * @returns the current node
    */
  def importDocument(doc: XMLNode): XMLElement = js.native
  def ins(array: js.Array[_]): XMLElement = js.native
  def ins(obj: js.Object): XMLElement = js.native
  def ins(target: String, value: js.Any): XMLElement = js.native
  /**
    * Creates a new sibling node and inserts it after this node.
    * 
    * @param name - node name or a JS object defining the nodes to insert
    * @param attributes - node attributes
    * @param text - node text
    * 
    * @returns the new node
    */
  def insertAfter(name: js.Any): XMLElement = js.native
  def insertAfter(name: js.Any, attributes: js.Object): XMLElement = js.native
  def insertAfter(name: js.Any, attributes: js.Object, text: js.Any): XMLElement = js.native
  /**
    * Creates a new sibling node and inserts it before this node.
    * 
    * @param name - node name or a JS object defining the nodes to insert
    * @param attributes - node attributes
    * @param text - node text
    * 
    * @returns the new node
    */
  def insertBefore(name: js.Any): XMLElement = js.native
  def insertBefore(name: js.Any, attributes: js.Object): XMLElement = js.native
  def insertBefore(name: js.Any, attributes: js.Object, text: js.Any): XMLElement = js.native
  def instruction(array: js.Array[_]): XMLElement = js.native
  def instruction(obj: js.Object): XMLElement = js.native
  /**
    * Creates a new processing instruction node and appends it to the list
    * of child nodes.
    * 
    * _Aliases:_ `ins` and `i`
    * 
    * @param target - node target
    * @param value - node value
    * 
    * @returns the parent node
    */
  def instruction(target: String, value: js.Any): XMLElement = js.native
  /**
    * Creates a processing instruction node after the current node.
    * 
    * @param target - node target
    * @param value - node value
    * 
    * @returns the parent node
    */
  def instructionAfter(target: String, value: js.Any): XMLElement = js.native
  /**
    * Creates a processing instruction node before the current node.
    * 
    * @param target - node target
    * @param value - node value
    * 
    * @returns the parent node
    */
  def instructionBefore(target: String, value: js.Any): XMLElement = js.native
  def n(name: String): XMLElement = js.native
  def n(name: String, attributes: js.Object): XMLElement = js.native
  def n(name: String, attributes: js.Object, text: js.Any): XMLElement = js.native
  /**
    * Returns the next sibling node.
    */
  def next(): XMLNode = js.native
  def nod(name: String): XMLElement = js.native
  def nod(name: String, attributes: js.Object): XMLElement = js.native
  def nod(name: String, attributes: js.Object, text: js.Any): XMLElement = js.native
  /**
    * Creates a new element node and appends it to the list of child nodes.
    * 
    * _Aliases:_ `nod` and `n`
    * 
    * @param name - element node name
    * @param attributes - node attributes
    * @param text - node text
    * 
    * @returns the node created
    */
  def node(name: String): XMLElement = js.native
  def node(name: String, attributes: js.Object): XMLElement = js.native
  def node(name: String, attributes: js.Object, text: js.Any): XMLElement = js.native
  /**
    * Returns the previous sibling node.
    */
  def prev(): XMLNode = js.native
  def r(value: String): XMLElement = js.native
  /**
    * Creates a new raw text node and appends it to the list of child
    * nodes.
    * 
    * _Alias:_ `r`
    * 
    * @param value - node value
    * 
    * @returns the parent node
    */
  def raw(value: String): XMLElement = js.native
  /**
    * Removes this node from the tree.
    * 
    * @returns the parent node
    */
  def remove(): XMLElement = js.native
  /**
    * Returns the root element node.
    */
  def root(): XMLElement = js.native
  def t(value: String): XMLElement = js.native
  /**
    * Creates a new text node and appends it to the list of child nodes.
    * 
    * _Aliases:_ `txt` and `t`
    * 
    * @param value - node value
    * 
    * @returns the parent node
    */
  def text(value: String): XMLElement = js.native
  def txt(value: String): XMLElement = js.native
  def u(): XMLElement = js.native
  /**
    * Returns the parent node.
    * 
    * _Alias:_ `u`
    */
  def up(): XMLElement = js.native
}

