package typings.xss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xss", "filterXSS")
@js.native
object filterXSS extends js.Object {
  def apply(html: String): String = js.native
  def apply(html: String, options: IFilterXSSOptions): String = js.native
}

