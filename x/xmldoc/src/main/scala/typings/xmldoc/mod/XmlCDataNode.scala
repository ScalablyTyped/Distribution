package typings.xmldoc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("xmldoc", "XmlCDataNode")
@js.native
class XmlCDataNode protected () extends XmlNode {
  def this(cdata: String) = this()
  
  var cdata: String = js.native
  
  def toString(opts: XmlOptions): String = js.native
  
  def toStringWithIndent(indent: String): String = js.native
  def toStringWithIndent(indent: String, opts: XmlOptions): String = js.native
  
  var `type`: typings.xmldoc.xmldocStrings.cdata = js.native
}
