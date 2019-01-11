package typings
package webdriverioLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object ^ extends js.Object {
  var browser: webdriverioLib.WebdriverIONs.Client[scala.Unit] = js.native
  @JSName("$")
  def $(selector: java.lang.String): webdriverioLib.WebdriverIONs.Client[webdriverioLib.WebdriverIONs.RawResult[webdriverioLib.WebdriverIONs.Element]] with webdriverioLib.WebdriverIONs.RawResult[webdriverioLib.WebdriverIONs.Element] = js.native
  @JSName("$$")
  def $$(selector: java.lang.String): (js.Array[
    webdriverioLib.WebdriverIONs.Client[webdriverioLib.WebdriverIONs.RawResult[webdriverioLib.WebdriverIONs.Element]]
  ]) with js.Array[webdriverioLib.WebdriverIONs.RawResult[webdriverioLib.WebdriverIONs.Element]] = js.native
  @JSName("$$")
  def $$_PClient[P](selector: java.lang.String): webdriverioLib.WebdriverIONs.Client[P] = js.native
  @JSName("$")
  def $_PClient[P](selector: java.lang.String): webdriverioLib.WebdriverIONs.Client[P] = js.native
}

