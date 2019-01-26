package typings
package webdriverioLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object ^ extends js.Object {
  var browser: webdriverLib.WebDriverNs.Client[scala.Unit] with webdriverioLib.WebdriverIONs.Browser[scala.Unit] = js.native
  @JSName("$")
  def $(selector: java.lang.String): webdriverioLib.WebdriverIONs.Element[scala.Unit] = js.native
  @JSName("$")
  def $(selector: js.Function): webdriverioLib.WebdriverIONs.Element[scala.Unit] = js.native
  @JSName("$$")
  def $$(selector: java.lang.String): js.Array[webdriverioLib.WebdriverIONs.Element[scala.Unit]] = js.native
  @JSName("$$")
  def $$(selector: js.Function): js.Array[webdriverioLib.WebdriverIONs.Element[scala.Unit]] = js.native
}

