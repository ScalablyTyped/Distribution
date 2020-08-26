package typings.xmlcreate.xmlDtdMod

import typings.xmlcreate.optionsMod.IStringOptions
import typings.xmlcreate.xmlCommentMod.IXmlCommentOptions
import typings.xmlcreate.xmlDtdAttlistMod.IXmlDtdAttlistOptions
import typings.xmlcreate.xmlDtdElementMod.IXmlDtdElementOptions
import typings.xmlcreate.xmlDtdEntityMod.IXmlDtdEntityOptions
import typings.xmlcreate.xmlDtdNotationMod.IXmlDtdNotationOptions
import typings.xmlcreate.xmlDtdParamEntityRefMod.IXmlDtdParamEntityRefOptions
import typings.xmlcreate.xmlProcInstMod.IXmlProcInstOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XmlDtd[Parent] extends js.Object {
  val _children: js.Any = js.native
  var _name: js.Any = js.native
  val _parent: js.Any = js.native
  var _pubId: js.Any = js.native
  var _sysId: js.Any = js.native
  val _validation: js.Any = js.native
  /**
    * Appends the XML string representation of a public or system identifier
    * to an existing string.
    */
  var appendId: js.Any = js.native
  /**
    * Adds an attribute-list declaration to this document type declaration
    * and returns the new attribute-list declaration.
    */
  def attlist(options: IXmlDtdAttlistOptions): typings.xmlcreate.xmlDtdAttlistMod.default[this.type] = js.native
  /**
    * Adds a comment to this document type declaration and returns the
    * new comment.
    */
  def comment(options: IXmlCommentOptions): typings.xmlcreate.xmlCommentMod.default[this.type] = js.native
  /**
    * Adds an element declaration to this document type declaration
    * and returns the new element declaration.
    */
  def element(options: IXmlDtdElementOptions): typings.xmlcreate.xmlDtdElementMod.default[this.type] = js.native
  /**
    * Adds an entity declaration to this document type declaration
    * and returns the new entity declaration.
    */
  def entity(options: IXmlDtdEntityOptions): typings.xmlcreate.xmlDtdEntityMod.default[this.type] = js.native
  /**
    * Gets the name of the DTD.
    */
  def name: String = js.native
  /**
    * Sets the name of the DTD.
    */
  def name_=(name: String): Unit = js.native
  /**
    * Adds a notation declaration to this document type declaration
    * and returns the new notation declaration.
    */
  def notation(options: IXmlDtdNotationOptions): typings.xmlcreate.xmlDtdNotationMod.default[this.type] = js.native
  /**
    * Adds a parameter entity reference to this document type declaration
    * and returns the new parameter entity reference.
    */
  def paramEntityRef(options: IXmlDtdParamEntityRefOptions): typings.xmlcreate.xmlDtdParamEntityRefMod.default[this.type] = js.native
  /**
    * Adds a processing instruction to this document type declaration
    * and returns the new processing instruction.
    */
  def procInst(options: IXmlProcInstOptions): typings.xmlcreate.xmlProcInstMod.default[this.type] = js.native
  /**
    * Gets the public identifier of the DTD.
    */
  def pubId: js.UndefOr[String] = js.native
  /**
    * Sets the public identifier of the DTD.
    */
  def pubId_=(pubId: js.UndefOr[String]): Unit = js.native
  /**
    * Gets the system identifier of the DTD.
    */
  def sysId: js.UndefOr[String] = js.native
  /**
    * Sets the system identifier of the DTD.
    */
  def sysId_=(sysId: js.UndefOr[String]): Unit = js.native
  def toString(options: IStringOptions): String = js.native
  /**
    * Returns the parent of this attribute.
    */
  def up(): Parent = js.native
}

