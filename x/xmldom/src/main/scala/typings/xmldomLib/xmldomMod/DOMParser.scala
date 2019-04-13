package typings
package xmldomLib.xmldomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DOMParser extends js.Object {
  def parseFromString(xmlsource: java.lang.String): stdLib.Document = js.native
  def parseFromString(xmlsource: java.lang.String, mimeType: java.lang.String): stdLib.Document = js.native
}

@JSImport("xmldom", "DOMParser")
@js.native
class DOMParserCls () extends DOMParser {
  def this(options: Options) = this()
}

