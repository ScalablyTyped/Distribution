package typings.xss.xssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xss", "FilterXSS")
@js.native
class FilterXSS () extends js.Object {
  def this(options: IFilterXSSOptions) = this()
  def process(html: String): String = js.native
}

@JSImport("xss", "filterXSS")
@js.native
object filterXSS extends js.Object {
  def apply(html: String): String = js.native
  def apply(html: String, options: IFilterXSSOptions): String = js.native
}

