package typings
package xmlcreateLib.libNodesXmlDocumentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XmlDocument extends js.Object {
  val _children: js.Any = js.native
  val _validation: js.Any = js.native
  /**
    * Adds a comment to this document and returns the new comment.
    */
  def comment(options: xmlcreateLib.libNodesXmlCommentMod.IXmlCommentOptions): xmlcreateLib.libNodesXmlCommentMod.default[this.type] = js.native
  /**
    * Adds a declaration to this document and returns the new declaration.
    */
  def decl(): xmlcreateLib.libNodesXmlDeclMod.default[this.type] = js.native
  def decl(options: xmlcreateLib.libNodesXmlDeclMod.IXmlDeclOptions): xmlcreateLib.libNodesXmlDeclMod.default[this.type] = js.native
  /**
    * Adds a document type definition to this document and returns the new
    * document type definition.
    */
  def dtd(options: xmlcreateLib.libNodesXmlDtdMod.IXmlDtdOptions): xmlcreateLib.libNodesXmlDtdMod.default[this.type] = js.native
  /**
    * Adds the root element to this document and returns the element.
    */
  def element(options: xmlcreateLib.libNodesXmlElementMod.IXmlElementOptions): xmlcreateLib.libNodesXmlElementMod.default[this.type] = js.native
  /**
    * Adds a processing instruction to this document and returns the new
    * processing instruction.
    */
  def procInst(options: xmlcreateLib.libNodesXmlProcInstMod.IXmlProcInstOptions): xmlcreateLib.libNodesXmlProcInstMod.default[this.type] = js.native
  def toString(options: xmlcreateLib.libOptionsMod.IStringOptions): java.lang.String = js.native
}

