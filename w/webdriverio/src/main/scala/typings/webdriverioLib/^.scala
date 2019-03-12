package typings
package webdriverioLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object ^ extends js.Object {
  var browser: BrowserObject = js.native
  @JSName("$")
  def $(selector: java.lang.String): js.Promise[webdriverioLib.WebdriverIOAsyncNs.Element] = js.native
  @JSName("$")
  def $(selector: js.Function): js.Promise[webdriverioLib.WebdriverIOAsyncNs.Element] = js.native
  @JSName("$$")
  def $$(selector: java.lang.String): js.Promise[js.Array[webdriverioLib.WebdriverIOAsyncNs.Element]] = js.native
  @JSName("$$")
  def $$(selector: js.Function): js.Promise[js.Array[webdriverioLib.WebdriverIOAsyncNs.Element]] = js.native
}

