package typings.xmlbuilder.mod

import typings.xmlbuilder.anon.NData
import typings.xmlbuilder.anon.PubID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the document type definition.
  */
@JSImport("xmlbuilder", "XMLDocType")
@js.native
class XMLDocType () extends js.Object {
  
  def att(elementName: String, attributeName: String, attributeType: String, defaultValueType: String): XMLDocType = js.native
  def att(
    elementName: String,
    attributeName: String,
    attributeType: String,
    defaultValueType: String,
    defaultValue: js.Any
  ): XMLDocType = js.native
  
  /**
    * Creates an attribute declaration.
    * 
    * _Alias:_ `att`
    * 
    * @param elementName - the name of the element containing this attribute
    * @param attributeName - attribute name
    * @param attributeType - type of the attribute
    * @param defaultValueType - default value type (either `#REQUIRED`,
    * `#IMPLIED`, `#FIXED` or `#DEFAULT`)
    * @param defaultValue - default value of the attribute (only used
    * for `#FIXED` or `#DEFAULT`)
    * 
    * @returns the DOCTYPE node
    */
  def attList(elementName: String, attributeName: String, attributeType: String, defaultValueType: String): XMLDocType = js.native
  def attList(
    elementName: String,
    attributeName: String,
    attributeType: String,
    defaultValueType: String,
    defaultValue: js.Any
  ): XMLDocType = js.native
  
  /**
    * Creates a new CDATA node and appends it to the list of child nodes.
    * 
    * _Alias:_ `dat`
    * 
    * @param value - node value
    * 
    * @returns the DOCTYPE node
    */
  def cdata(value: String): XMLDocType = js.native
  
  /** 
    * Child nodes 
    */
  var children: js.Array[XMLNode] = js.native
  
  @JSName("com")
  def com_(value: String): XMLDocType = js.native
  
  /**
    * Creates a new comment child and appends it to the list of child
    * nodes.
    * 
    * _Alias:_ `com`
    * 
    * @param value - node value
    * 
    * @returns the DOCTYPE node
    */
  def comment(value: String): XMLDocType = js.native
  
  def dat(value: String): XMLDocType = js.native
  
  def doc(): XMLDocument = js.native
  
  /**
    * Returns the document node.
    * 
    * _Alias:_ `doc`
    */
  def document(): XMLDocument = js.native
  
  def ele(name: String): XMLDocType = js.native
  def ele(name: String, value: js.Object): XMLDocType = js.native
  
  /**
    * Creates an element type declaration.
    * 
    * _Alias:_ `ele`
    * 
    * @param name - element name
    * @param value - element content (defaults to `#PCDATA`)
    * 
    * @returns the DOCTYPE node
    */
  def element(name: String): XMLDocType = js.native
  def element(name: String, value: js.Object): XMLDocType = js.native
  
  /**
    * Converts the XML document to string.
    * 
    * @param options - conversion options
    */
  def end(): String = js.native
  def end(options: XMLToStringOptions): String = js.native
  def end(options: XMLWriter): String = js.native
  
  def ent(name: String, value: String): XMLDocType = js.native
  def ent(name: String, value: NData): XMLDocType = js.native
  
  /**
    * Creates a general entity declaration.
    * 
    * _Alias:_ `ent`
    * 
    * @param name - the name of the entity
    * @param value - entity parameters
    * 
    * @returns the DOCTYPE node
    */
  def entity(name: String, value: String): XMLDocType = js.native
  def entity(name: String, value: NData): XMLDocType = js.native
  
  def ins(array: js.Array[_]): XMLDocType = js.native
  def ins(obj: js.Object): XMLDocType = js.native
  def ins(target: String, value: js.Any): XMLDocType = js.native
  
  def instruction(array: js.Array[_]): XMLDocType = js.native
  def instruction(obj: js.Object): XMLDocType = js.native
  /**
    * Creates a new processing instruction node and appends it to the list 
    * of child nodes.
    * 
    * _Alias:_ `ins`
    * 
    * @param target - node target
    * @param value - node value
    * 
    * @returns the DOCTYPE node
    */
  def instruction(target: String, value: js.Any): XMLDocType = js.native
  
  def not(name: String, value: PubID): XMLDocType = js.native
  
  /**
    * Creates a notation declaration.
    * 
    * _Alias:_ `not`
    * 
    * @param name - the name of the entity
    * @param value - entity parameters
    * 
    * @returns the DOCTYPE node
    */
  def notation(name: String, value: PubID): XMLDocType = js.native
  
  /**
    * Creates a parameter entity declaration.
    * 
    * _Alias:_ `pent`
    * 
    * @param name - the name of the entity
    * @param value - entity parameters
    * 
    * @returns the DOCTYPE node
    */
  def pEntity(name: String, value: String): XMLDocType = js.native
  def pEntity(name: String, value: PubID): XMLDocType = js.native
  
  /** 
    * Parent element node 
    */
  var parent: XMLElement = js.native
  
  def pent(name: String, value: String): XMLDocType = js.native
  def pent(name: String, value: PubID): XMLDocType = js.native
  
  /** 
    * Public identifier of the DTD 
    */
  var pubID: String = js.native
  
  /**
    * Returns the root element node.
    * 
    * _Alias:_ `up`
    */
  def root(): XMLElement = js.native
  
  /** 
    * System identifier of the DTD 
    */
  var sysID: String = js.native
  
  def toString(options: XMLToStringOptions): String = js.native
  
  /** 
    * Type of the node 
    */
  var `type`: NodeType_ = js.native
  
  def up(): XMLElement = js.native
}
