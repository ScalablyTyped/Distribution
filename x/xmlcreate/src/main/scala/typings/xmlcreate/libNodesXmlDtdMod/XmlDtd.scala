package typings.xmlcreate.libNodesXmlDtdMod

import typings.xmlcreate.libNodesXmlCommentMod.IXmlCommentOptions
import typings.xmlcreate.libNodesXmlDtdAttlistMod.IXmlDtdAttlistOptions
import typings.xmlcreate.libNodesXmlDtdElementMod.IXmlDtdElementOptions
import typings.xmlcreate.libNodesXmlDtdEntityMod.IXmlDtdEntityOptions
import typings.xmlcreate.libNodesXmlDtdNotationMod.IXmlDtdNotationOptions
import typings.xmlcreate.libNodesXmlDtdParamEntityRefMod.IXmlDtdParamEntityRefOptions
import typings.xmlcreate.libNodesXmlProcInstMod.IXmlProcInstOptions
import typings.xmlcreate.libOptionsMod.IStringOptions
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
    * Gets the name of the DTD.
    */
  /**
    * Sets the name of the DTD.
    */
  var name: String = js.native
  /**
    * Gets the public identifier of the DTD.
    */
  /**
    * Sets the public identifier of the DTD.
    */
  var pubId: js.UndefOr[String] = js.native
  /**
    * Gets the system identifier of the DTD.
    */
  /**
    * Sets the system identifier of the DTD.
    */
  var sysId: js.UndefOr[String] = js.native
  /**
    * Adds an attribute-list declaration to this document type declaration
    * and returns the new attribute-list declaration.
    */
  def attlist(options: IXmlDtdAttlistOptions): typings.xmlcreate.libNodesXmlDtdAttlistMod.default[this.type] = js.native
  /**
    * Adds a comment to this document type declaration and returns the
    * new comment.
    */
  def comment(options: IXmlCommentOptions): typings.xmlcreate.libNodesXmlCommentMod.default[this.type] = js.native
  /**
    * Adds an element declaration to this document type declaration
    * and returns the new element declaration.
    */
  def element(options: IXmlDtdElementOptions): typings.xmlcreate.libNodesXmlDtdElementMod.default[this.type] = js.native
  /**
    * Adds an entity declaration to this document type declaration
    * and returns the new entity declaration.
    */
  def entity(options: IXmlDtdEntityOptions): typings.xmlcreate.libNodesXmlDtdEntityMod.default[this.type] = js.native
  /**
    * Adds a notation declaration to this document type declaration
    * and returns the new notation declaration.
    */
  def notation(options: IXmlDtdNotationOptions): typings.xmlcreate.libNodesXmlDtdNotationMod.default[this.type] = js.native
  /**
    * Adds a parameter entity reference to this document type declaration
    * and returns the new parameter entity reference.
    */
  def paramEntityRef(options: IXmlDtdParamEntityRefOptions): typings.xmlcreate.libNodesXmlDtdParamEntityRefMod.default[this.type] = js.native
  /**
    * Adds a processing instruction to this document type declaration
    * and returns the new processing instruction.
    */
  def procInst(options: IXmlProcInstOptions): typings.xmlcreate.libNodesXmlProcInstMod.default[this.type] = js.native
  def toString(options: IStringOptions): String = js.native
  /**
    * Returns the parent of this attribute.
    */
  def up(): Parent = js.native
}

