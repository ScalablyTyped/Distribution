package typings.xmldom.mod

import org.scalablytyped.runtime.TopLevel
import typings.std.Document_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DOMParser extends js.Object {
  def parseFromString(xmlsource: String): Document_ = js.native
  def parseFromString(xmlsource: String, mimeType: String): Document_ = js.native
}

@JSImport("xmldom", "DOMParser")
@js.native
object DOMParser extends TopLevel[DOMParserStatic]

