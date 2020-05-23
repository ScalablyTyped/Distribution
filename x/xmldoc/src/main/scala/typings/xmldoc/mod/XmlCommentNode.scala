package typings.xmldoc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldoc", "XmlCommentNode")
@js.native
class XmlCommentNode protected () extends XmlNode {
  def this(comment: String) = this()
  var comment: String = js.native
  var `type`: typings.xmldoc.xmldocStrings.comment = js.native
  def toString(opts: XmlOptions): String = js.native
  def toStringWithIndent(indent: String): String = js.native
  def toStringWithIndent(indent: String, opts: XmlOptions): String = js.native
}

