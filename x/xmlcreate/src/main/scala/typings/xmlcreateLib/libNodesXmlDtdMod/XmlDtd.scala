package typings
package xmlcreateLib.libNodesXmlDtdMod

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
  var name: java.lang.String = js.native
  /**
    * Gets the public identifier of the DTD.
    */
  /**
    * Sets the public identifier of the DTD.
    */
  var pubId: js.UndefOr[java.lang.String] = js.native
  /**
    * Gets the system identifier of the DTD.
    */
  /**
    * Sets the system identifier of the DTD.
    */
  var sysId: js.UndefOr[java.lang.String] = js.native
  /**
    * Adds an attribute-list declaration to this document type declaration
    * and returns the new attribute-list declaration.
    */
  def attlist(options: xmlcreateLib.libNodesXmlDtdAttlistMod.IXmlDtdAttlistOptions): xmlcreateLib.libNodesXmlDtdAttlistMod.default[this.type] = js.native
  /**
    * Adds a comment to this document type declaration and returns the
    * new comment.
    */
  def comment(options: xmlcreateLib.libNodesXmlCommentMod.IXmlCommentOptions): xmlcreateLib.libNodesXmlCommentMod.default[this.type] = js.native
  /**
    * Adds an element declaration to this document type declaration
    * and returns the new element declaration.
    */
  def element(options: xmlcreateLib.libNodesXmlDtdElementMod.IXmlDtdElementOptions): xmlcreateLib.libNodesXmlDtdElementMod.default[this.type] = js.native
  /**
    * Adds an entity declaration to this document type declaration
    * and returns the new entity declaration.
    */
  def entity(options: xmlcreateLib.libNodesXmlDtdEntityMod.IXmlDtdEntityOptions): xmlcreateLib.libNodesXmlDtdEntityMod.default[this.type] = js.native
  /**
    * Adds a notation declaration to this document type declaration
    * and returns the new notation declaration.
    */
  def notation(options: xmlcreateLib.libNodesXmlDtdNotationMod.IXmlDtdNotationOptions): xmlcreateLib.libNodesXmlDtdNotationMod.default[this.type] = js.native
  /**
    * Adds a parameter entity reference to this document type declaration
    * and returns the new parameter entity reference.
    */
  def paramEntityRef(options: xmlcreateLib.libNodesXmlDtdParamEntityRefMod.IXmlDtdParamEntityRefOptions): xmlcreateLib.libNodesXmlDtdParamEntityRefMod.default[this.type] = js.native
  /**
    * Adds a processing instruction to this document type declaration
    * and returns the new processing instruction.
    */
  def procInst(options: xmlcreateLib.libNodesXmlProcInstMod.IXmlProcInstOptions): xmlcreateLib.libNodesXmlProcInstMod.default[this.type] = js.native
  def toString(options: xmlcreateLib.libOptionsMod.IStringOptions): java.lang.String = js.native
  /**
    * Returns the parent of this attribute.
    */
  def up(): Parent = js.native
}

