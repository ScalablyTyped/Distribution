package typings
package xmlbuilderLib.xmlbuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an XML document builder used in callback mode with the
  * `begin` function.
  */
@JSImport("xmlbuilder", "XMLDocumentCB")
@js.native
class XMLDocumentCB () extends js.Object {
  def a(elementName: java.lang.String, attributeName: java.lang.String, attributeType: java.lang.String): XMLDocumentCB = js.native
  def a(
    elementName: java.lang.String,
    attributeName: java.lang.String,
    attributeType: java.lang.String,
    defaultValueType: java.lang.String
  ): XMLDocumentCB = js.native
  def a(
    elementName: java.lang.String,
    attributeName: java.lang.String,
    attributeType: java.lang.String,
    defaultValueType: java.lang.String,
    defaultValue: js.Any
  ): XMLDocumentCB = js.native
  def a(name: js.Any): XMLDocumentCB = js.native
  def a(name: js.Any, value: js.Any): XMLDocumentCB = js.native
  def att(elementName: java.lang.String, attributeName: java.lang.String, attributeType: java.lang.String): XMLDocumentCB = js.native
  def att(
    elementName: java.lang.String,
    attributeName: java.lang.String,
    attributeType: java.lang.String,
    defaultValueType: java.lang.String
  ): XMLDocumentCB = js.native
  def att(
    elementName: java.lang.String,
    attributeName: java.lang.String,
    attributeType: java.lang.String,
    defaultValueType: java.lang.String,
    defaultValue: js.Any
  ): XMLDocumentCB = js.native
  def att(name: js.Any): XMLDocumentCB = js.native
  def att(name: js.Any, value: js.Any): XMLDocumentCB = js.native
  /**
    * Creates an attribute declaration.
    * 
    * _Alias:_ `att`
    * 
    * @param elementName - the name of the element containing this attribute
    * @param attributeName - attribute name
    * @param attributeType - type of the attribute (defaults to `CDATA`)
    * @param defaultValueType - default value type (either `#REQUIRED`,
    * `#IMPLIED`, `#FIXED` or `#DEFAULT`) (defaults to `#IMPLIED`)
    * @param defaultValue - default value of the attribute (only used
    * for `#FIXED` or `#DEFAULT`)
    * 
    * @returns the document builder object
    */
  def attList(elementName: java.lang.String, attributeName: java.lang.String, attributeType: java.lang.String): XMLDocumentCB = js.native
  def attList(
    elementName: java.lang.String,
    attributeName: java.lang.String,
    attributeType: java.lang.String,
    defaultValueType: java.lang.String
  ): XMLDocumentCB = js.native
  def attList(
    elementName: java.lang.String,
    attributeName: java.lang.String,
    attributeType: java.lang.String,
    defaultValueType: java.lang.String,
    defaultValue: js.Any
  ): XMLDocumentCB = js.native
  /**
    * Adds or modifies an attribute.
    * 
    * _Aliases:_ `att` and `a`
    * 
    * @param name - attribute name
    * @param value - attribute value
    * 
    * @returns the document builder object
    */
  def attribute(name: js.Any): XMLDocumentCB = js.native
  def attribute(name: js.Any, value: js.Any): XMLDocumentCB = js.native
  def c(value: java.lang.String): XMLDocumentCB = js.native
  /**
    * Creates a new CDATA node and appends it to the list of child nodes.
    * 
    * _Aliases:_ `dat` and `d`
    * 
    * @param value - node value
    * 
    * @returns the document builder object
    */
  def cdata(value: java.lang.String): XMLDocumentCB = js.native
  def com(value: java.lang.String): XMLDocumentCB = js.native
  /**
    * Creates a new comment node and appends it to the list of child nodes.
    * 
    * _Aliases:_ `com` and `c`
    * 
    * @param value - node value
    * 
    * @returns the document builder object
    */
  def comment(value: java.lang.String): XMLDocumentCB = js.native
  def d(value: java.lang.String): XMLDocumentCB = js.native
  def dat(value: java.lang.String): XMLDocumentCB = js.native
  def dec(): XMLDocumentCB = js.native
  def dec(version: java.lang.String): XMLDocumentCB = js.native
  def dec(version: java.lang.String, encoding: java.lang.String): XMLDocumentCB = js.native
  def dec(version: java.lang.String, encoding: java.lang.String, standalone: scala.Boolean): XMLDocumentCB = js.native
  /**
    * Creates the XML declaration.
    * 
    * _Alias:_ `dec`
    * 
    * @param version - version number string, e.g. `1.0`
    * @param encoding - encoding declaration, e.g. `UTF-8`
    * @param standalone - standalone document declaration: `true` or `false`
    * 
    * @returns the document builder object
    */
  def declaration(): XMLDocumentCB = js.native
  def declaration(version: java.lang.String): XMLDocumentCB = js.native
  def declaration(version: java.lang.String, encoding: java.lang.String): XMLDocumentCB = js.native
  def declaration(version: java.lang.String, encoding: java.lang.String, standalone: scala.Boolean): XMLDocumentCB = js.native
  /**
    * Creates the document type definition.
    * 
    * _Alias:_ `dtd`
    * 
    * @param root - the name of the root node
    * @param pubID - public identifier of the DTD
    * @param sysID - system identifier of the DTD
    * 
    * @returns the document builder object
    */
  def doctype(root: java.lang.String): XMLDocumentCB = js.native
  def doctype(root: java.lang.String, pubID: java.lang.String): XMLDocumentCB = js.native
  def doctype(root: java.lang.String, pubID: java.lang.String, sysID: java.lang.String): XMLDocumentCB = js.native
  def dtd(root: java.lang.String): XMLDocumentCB = js.native
  def dtd(root: java.lang.String, pubID: java.lang.String): XMLDocumentCB = js.native
  def dtd(root: java.lang.String, pubID: java.lang.String, sysID: java.lang.String): XMLDocumentCB = js.native
  /**
    * Creates an element type declaration.
    * 
    * _Aliases:_ `element` and `ele`
    * 
    * @param name - element name
    * @param value - element content (defaults to `#PCDATA`)
    * 
    * @returns the document builder object
    */
  def dtdElement(name: java.lang.String): XMLDocumentCB = js.native
  def dtdElement(name: java.lang.String, value: js.Object): XMLDocumentCB = js.native
  def e(name: js.Any): XMLDocumentCB = js.native
  def e(name: js.Any, attributes: js.Object): XMLDocumentCB = js.native
  def e(name: js.Any, attributes: js.Object, text: js.Any): XMLDocumentCB = js.native
  def ele(name: java.lang.String): XMLDocumentCB = js.native
  def ele(name: java.lang.String, value: js.Object): XMLDocumentCB = js.native
  def ele(name: js.Any): XMLDocumentCB = js.native
  def ele(name: js.Any, attributes: js.Object): XMLDocumentCB = js.native
  def ele(name: js.Any, attributes: js.Object, text: js.Any): XMLDocumentCB = js.native
  def element(name: java.lang.String): XMLDocumentCB = js.native
  def element(name: java.lang.String, value: js.Object): XMLDocumentCB = js.native
  /**
    * Creates a child element node.
    * 
    * _Aliases:_ `ele` and `e`
    * 
    * @param name - element node name or a JS object defining the nodes 
    * to insert
    * @param attributes - node attributes
    * @param text - node text
    * 
    * @returns the document builder object
    */
  def element(name: js.Any): XMLDocumentCB = js.native
  def element(name: js.Any, attributes: js.Object): XMLDocumentCB = js.native
  def element(name: js.Any, attributes: js.Object, text: js.Any): XMLDocumentCB = js.native
  /**
    * Ends the document and calls the `onEnd` callback function.
    */
  def end(): scala.Unit = js.native
  def ent(name: java.lang.String, value: java.lang.String): XMLDocumentCB = js.native
  def ent(name: java.lang.String, value: xmlbuilderLib.Anon_NData): XMLDocumentCB = js.native
  /**
    * Creates a general entity declaration.
    * 
    * _Alias:_ `ent`
    * 
    * @param name - the name of the entity
    * @param value - entity parameters
    * 
    * @returns the document builder object
    */
  def entity(name: java.lang.String, value: java.lang.String): XMLDocumentCB = js.native
  def entity(name: java.lang.String, value: xmlbuilderLib.Anon_NData): XMLDocumentCB = js.native
  def i(array: js.Array[_]): XMLDocumentCB = js.native
  def i(obj: js.Object): XMLDocumentCB = js.native
  def i(target: java.lang.String, value: js.Any): XMLDocumentCB = js.native
  def ins(array: js.Array[_]): XMLDocumentCB = js.native
  def ins(obj: js.Object): XMLDocumentCB = js.native
  def ins(target: java.lang.String, value: js.Any): XMLDocumentCB = js.native
  def instruction(array: js.Array[_]): XMLDocumentCB = js.native
  def instruction(obj: js.Object): XMLDocumentCB = js.native
  /**
    * Creates a new processing instruction node and appends it to the list 
    * of child nodes.
    * 
    * _Aliases:_ `ins` and `i`
    * 
    * @param target - node target
    * @param value - node value
    * 
    * @returns the document builder object
    */
  def instruction(target: java.lang.String, value: js.Any): XMLDocumentCB = js.native
  def n(name: java.lang.String): XMLDocumentCB = js.native
  def n(name: java.lang.String, attributes: js.Object): XMLDocumentCB = js.native
  def n(name: java.lang.String, attributes: js.Object, text: js.Any): XMLDocumentCB = js.native
  def nod(name: java.lang.String): XMLDocumentCB = js.native
  def nod(name: java.lang.String, attributes: js.Object): XMLDocumentCB = js.native
  def nod(name: java.lang.String, attributes: js.Object, text: js.Any): XMLDocumentCB = js.native
  /**
    * Creates a new child node and appends it to the list of child nodes.
    * 
    * _Aliases:_ `nod` and `n`
    * 
    * @param name - element node name
    * @param attributes - node attributes
    * @param text - node text
    * 
    * @returns the document builder object
    */
  def node(name: java.lang.String): XMLDocumentCB = js.native
  def node(name: java.lang.String, attributes: js.Object): XMLDocumentCB = js.native
  def node(name: java.lang.String, attributes: js.Object, text: js.Any): XMLDocumentCB = js.native
  def not(name: java.lang.String, value: xmlbuilderLib.Anon_PubID): XMLDocumentCB = js.native
  /**
    * Creates a notation declaration.
    * 
    * _Alias:_ `not`
    * 
    * @param name - the name of the entity
    * @param value - entity parameters
    * 
    * @returns the document builder object
    */
  def notation(name: java.lang.String, value: xmlbuilderLib.Anon_PubID): XMLDocumentCB = js.native
  /**
    * Creates a parameter entity declaration.
    * 
    * _Alias:_ `pent`
    * 
    * @param name - the name of the entity
    * @param value - entity parameters
    * 
    * @returns the document builder object
    */
  def pEntity(name: java.lang.String, value: java.lang.String): XMLDocumentCB = js.native
  def pEntity(name: java.lang.String, value: xmlbuilderLib.Anon_PubID): XMLDocumentCB = js.native
  def pent(name: java.lang.String, value: java.lang.String): XMLDocumentCB = js.native
  def pent(name: java.lang.String, value: xmlbuilderLib.Anon_PubID): XMLDocumentCB = js.native
  def r(value: java.lang.String): XMLDocumentCB = js.native
  /**
    * Creates a new raw text node and appends it to the list of child 
    * nodes.
    * 
    * _Alias:_ `r`
    * 
    * @param value - node value
    * 
    * @returns the document builder object
    */
  def raw(value: java.lang.String): XMLDocumentCB = js.native
  def t(value: java.lang.String): XMLDocumentCB = js.native
  /**
    * Creates a new text node and appends it to the list of child nodes.
    * 
    * _Aliases:_ `txt` and `t`
    * 
    * @param value - node value
    * 
    * @returns the document builder object
    */
  def text(value: java.lang.String): XMLDocumentCB = js.native
  def txt(value: java.lang.String): XMLDocumentCB = js.native
  def u(): XMLDocumentCB = js.native
  /**
    * Moves up to the parent node.
    * 
    * _Alias:_ `u`
    * 
    * @returns the document builder object
    */
  def up(): XMLDocumentCB = js.native
}

