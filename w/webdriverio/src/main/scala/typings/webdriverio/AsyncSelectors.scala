package typings.webdriverio

import typings.webdriverio.WebdriverIOAsync.Element
import typings.webdriverio.WebdriverIOAsync.ElementArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Methods which return async element(s) so non-async equivalents cannot just be promise-wrapped
@js.native
trait AsyncSelectors extends js.Object {
  @JSName("$")
  var $_Original: _empty = js.native
  @JSName("$$")
  var DollarDollar_Original: $ = js.native
  @JSName("$")
  def $(selector: String): js.Promise[Element] = js.native
  @JSName("$")
  def $(selector: js.Function): js.Promise[Element] = js.native
  @JSName("$$")
  def DollarDollar(selector: String): js.Promise[ElementArray] = js.native
  @JSName("$$")
  def DollarDollar(selector: js.Function): js.Promise[ElementArray] = js.native
}

