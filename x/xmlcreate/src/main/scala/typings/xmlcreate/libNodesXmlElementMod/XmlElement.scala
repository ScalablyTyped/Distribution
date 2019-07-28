package typings.xmlcreate.libNodesXmlElementMod

import typings.xmlcreate.libNodesXmlAttributeMod.IXmlAttributeOptions
import typings.xmlcreate.libNodesXmlCdataMod.IXmlCdataOptions
import typings.xmlcreate.libNodesXmlCharDataMod.IXmlCharDataOptions
import typings.xmlcreate.libNodesXmlCharRefMod.IXmlCharRefOptions
import typings.xmlcreate.libNodesXmlCommentMod.IXmlCommentOptions
import typings.xmlcreate.libNodesXmlEntityRefMod.IXmlEntityRefOptions
import typings.xmlcreate.libNodesXmlProcInstMod.IXmlProcInstOptions
import typings.xmlcreate.libOptionsMod.IStringOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XmlElement[Parent] extends js.Object {
  val _attributeNames: js.Any = js.native
  val _children: js.Any = js.native
  var _name: js.Any = js.native
  val _parent: js.Any = js.native
  val _replaceInvalidCharsInName: js.Any = js.native
  val _useSelfClosingTagIfEmpty: js.Any = js.native
  val _validation: js.Any = js.native
  /**
    * Returns true if the specified nodes are all character references,
    * entity references, or character data.
    */
  var allSameLineNodes: js.Any = js.native
  /**
    * Gets the name of this element.
    */
  /**
    * Sets the name of this element.
    */
  var name: String = js.native
  /**
    * Returns true if the specified nodes are all character references,
    * entity references, or character data.
    */
  var onSameLine: js.Any = js.native
  /**
    * Returns an XML string representation of this element using the specified
    * options and initial indent.
    */
  var toStringWithIndent: js.Any = js.native
  /**
    * Adds an attribute to this element and returns the new attribute.
    */
  def attribute(options: IXmlAttributeOptions): typings.xmlcreate.libNodesXmlAttributeMod.default[this.type] = js.native
  /**
    * Adds a CDATA section to this element and returns the new CDATA section.
    */
  def cdata(options: IXmlCdataOptions): typings.xmlcreate.libNodesXmlCdataMod.default[this.type] = js.native
  /**
    * Adds character data to this element and returns the new character data.
    */
  def charData(options: IXmlCharDataOptions): typings.xmlcreate.libNodesXmlCharDataMod.default[this.type] = js.native
  /**
    * Adds a character reference to this element and returns the new
    * character reference.
    */
  def charRef(options: IXmlCharRefOptions): typings.xmlcreate.libNodesXmlCharRefMod.default[this.type] = js.native
  /**
    * Adds a comment to this element and returns the new comment.
    */
  def comment(options: IXmlCommentOptions): typings.xmlcreate.libNodesXmlCommentMod.default[this.type] = js.native
  /**
    * Adds an element to this element and returns the new element.
    */
  def element(options: IXmlElementOptions): XmlElement[this.type] = js.native
  /**
    * Adds an entity reference to this element and returns the new entity
    * reference.
    */
  def entityRef(options: IXmlEntityRefOptions): typings.xmlcreate.libNodesXmlEntityRefMod.default[this.type] = js.native
  /**
    * Adds a processing instruction to this element and returns the new
    * processing instruction.
    */
  def procInst(options: IXmlProcInstOptions): typings.xmlcreate.libNodesXmlProcInstMod.default[this.type] = js.native
  def toString(options: IStringOptions): String = js.native
  /**
    * Returns the parent of this element.
    */
  def up(): Parent = js.native
}

