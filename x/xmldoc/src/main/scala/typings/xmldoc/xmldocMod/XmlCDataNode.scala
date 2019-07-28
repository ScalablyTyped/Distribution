package typings.xmldoc.xmldocMod

import typings.xmldoc.xmldocStrings.cdata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldoc", "XmlCDataNode")
@js.native
class XmlCDataNode protected () extends XmlNode {
  def this(cdata: String) = this()
  var cdata: String = js.native
  var `type`: cdata = js.native
  def toString(opts: XmlOptions): String = js.native
  def toStringWithIndent(indent: String): String = js.native
  def toStringWithIndent(indent: String, opts: XmlOptions): String = js.native
}

