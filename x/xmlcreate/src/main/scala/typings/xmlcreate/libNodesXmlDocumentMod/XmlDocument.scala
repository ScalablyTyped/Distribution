package typings.xmlcreate.libNodesXmlDocumentMod

import typings.xmlcreate.libNodesXmlCommentMod.IXmlCommentOptions
import typings.xmlcreate.libNodesXmlDeclMod.IXmlDeclOptions
import typings.xmlcreate.libNodesXmlDtdMod.IXmlDtdOptions
import typings.xmlcreate.libNodesXmlElementMod.IXmlElementOptions
import typings.xmlcreate.libNodesXmlProcInstMod.IXmlProcInstOptions
import typings.xmlcreate.libOptionsMod.IStringOptions
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
  def comment(options: IXmlCommentOptions): typings.xmlcreate.libNodesXmlCommentMod.default[this.type] = js.native
  /**
    * Adds a declaration to this document and returns the new declaration.
    */
  def decl(): typings.xmlcreate.libNodesXmlDeclMod.default[this.type] = js.native
  def decl(options: IXmlDeclOptions): typings.xmlcreate.libNodesXmlDeclMod.default[this.type] = js.native
  /**
    * Adds a document type definition to this document and returns the new
    * document type definition.
    */
  def dtd(options: IXmlDtdOptions): typings.xmlcreate.libNodesXmlDtdMod.default[this.type] = js.native
  /**
    * Adds the root element to this document and returns the element.
    */
  def element(options: IXmlElementOptions): typings.xmlcreate.libNodesXmlElementMod.default[this.type] = js.native
  /**
    * Adds a processing instruction to this document and returns the new
    * processing instruction.
    */
  def procInst(options: IXmlProcInstOptions): typings.xmlcreate.libNodesXmlProcInstMod.default[this.type] = js.native
  def toString(options: IStringOptions): String = js.native
}

