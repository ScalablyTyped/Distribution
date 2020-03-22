package typings.xmlcreate.xmlDocumentMod

import typings.xmlcreate.optionsMod.IStringOptions
import typings.xmlcreate.xmlCommentMod.IXmlCommentOptions
import typings.xmlcreate.xmlDeclMod.IXmlDeclOptions
import typings.xmlcreate.xmlDtdMod.IXmlDtdOptions
import typings.xmlcreate.xmlElementMod.IXmlElementOptions
import typings.xmlcreate.xmlProcInstMod.IXmlProcInstOptions
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
  def comment(options: IXmlCommentOptions): typings.xmlcreate.xmlCommentMod.default[this.type] = js.native
  /**
    * Adds a declaration to this document and returns the new declaration.
    */
  def decl(): typings.xmlcreate.xmlDeclMod.default[this.type] = js.native
  def decl(options: IXmlDeclOptions): typings.xmlcreate.xmlDeclMod.default[this.type] = js.native
  /**
    * Adds a document type definition to this document and returns the new
    * document type definition.
    */
  def dtd(options: IXmlDtdOptions): typings.xmlcreate.xmlDtdMod.default[this.type] = js.native
  /**
    * Adds the root element to this document and returns the element.
    */
  def element(options: IXmlElementOptions): typings.xmlcreate.xmlElementMod.default[this.type] = js.native
  /**
    * Adds a processing instruction to this document and returns the new
    * processing instruction.
    */
  def procInst(options: IXmlProcInstOptions): typings.xmlcreate.xmlProcInstMod.default[this.type] = js.native
  def toString(options: IStringOptions): String = js.native
}

