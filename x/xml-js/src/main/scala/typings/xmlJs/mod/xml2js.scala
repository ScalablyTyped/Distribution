package typings.xmlJs.mod

import typings.xmlJs.mod.Options.XML2JS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xml-js", "xml2js")
@js.native
object xml2js extends js.Object {
  def apply(xml: String): Element | ElementCompact = js.native
  def apply(xml: String, options: XML2JS): Element | ElementCompact = js.native
}

