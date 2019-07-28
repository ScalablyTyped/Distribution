package typings.webdriverio

import typings.webdriverio.WebdriverIOAsyncNs.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Methods which return async element(s) so non-async equivalents cannot just be promise-wrapped
@js.native
trait AsyncSelectors extends js.Object {
  @JSName("$$")
  var $$_Original: $$ = js.native
  @JSName("$")
  var $_Original: $ = js.native
  @JSName("$")
  def $(selector: String): js.Promise[Element] = js.native
  @JSName("$")
  def $(selector: js.Function): js.Promise[Element] = js.native
  @JSName("$$")
  def $$(selector: String): js.Promise[js.Array[Element]] = js.native
  @JSName("$$")
  def $$(selector: js.Function): js.Promise[js.Array[Element]] = js.native
}

