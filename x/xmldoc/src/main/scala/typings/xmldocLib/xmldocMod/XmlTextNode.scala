package typings
package xmldocLib.xmldocMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldoc", "XmlTextNode")
@js.native
class XmlTextNode protected () extends XmlNode {
  def this(text: java.lang.String) = this()
  var text: java.lang.String = js.native
  var `type`: xmldocLib.xmldocLibStrings.text = js.native
  def toString(opts: XmlOptions): java.lang.String = js.native
  def toStringWithIndent(indent: java.lang.String): java.lang.String = js.native
  def toStringWithIndent(indent: java.lang.String, opts: XmlOptions): java.lang.String = js.native
}

