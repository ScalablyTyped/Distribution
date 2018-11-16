package typings
package xmldocLib.xmldocMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldoc", "XmlCommentNode")
@js.native
class XmlCommentNode protected () extends js.Object {
  def this(comment: java.lang.String) = this()
  var comment: java.lang.String = js.native
  var `type`: xmldocLib.xmldocLibStrings.comment = js.native
  def toString(opts: XmlOptions): java.lang.String = js.native
  def toStringWithIndent(indent: java.lang.String): java.lang.String = js.native
  def toStringWithIndent(indent: java.lang.String, opts: XmlOptions): java.lang.String = js.native
}

