package typings
package xmldocLib.xmldocMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldoc", "XmlCDataNode")
@js.native
class XmlCDataNode protected () extends js.Object {
  def this(cdata: java.lang.String) = this()
  var cdata: java.lang.String = js.native
  var `type`: xmldocLib.xmldocLibStrings.cdata = js.native
  def toString(opts: XmlOptions): java.lang.String = js.native
  def toStringWithIndent(indent: java.lang.String): java.lang.String = js.native
  def toStringWithIndent(indent: java.lang.String, opts: XmlOptions): java.lang.String = js.native
}

