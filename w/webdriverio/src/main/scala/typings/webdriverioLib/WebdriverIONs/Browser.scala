package typings
package webdriverioLib.WebdriverIONs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Browser[T] extends js.Object {
  @JSName("call")
  var call_Original: Call = js.native
  @JSName("executeAsync")
  var executeAsync_Original: ExecuteAsync = js.native
  @JSName("execute")
  var execute_Original: Execute = js.native
  var options: Options = js.native
  @JSName("$")
  def $(selector: java.lang.String): Element[scala.Unit] = js.native
  @JSName("$")
  def $(selector: js.Function): Element[scala.Unit] = js.native
  @JSName("$$")
  def $$(selector: java.lang.String): js.Array[Element[scala.Unit]] = js.native
  @JSName("$$")
  def $$(selector: js.Function): js.Array[Element[scala.Unit]] = js.native
  def addCommand(name: java.lang.String, func: js.Function): js.UndefOr[scala.Nothing] = js.native
  def addCommand(name: java.lang.String, func: js.Function, attachToElement: scala.Boolean): js.UndefOr[scala.Nothing] = js.native
  def call[T](callback: js.Function): T = js.native
  def debug(): js.UndefOr[scala.Nothing] = js.native
  def deleteCookies(): js.UndefOr[scala.Nothing] = js.native
  def deleteCookies(names: js.Array[java.lang.String]): js.UndefOr[scala.Nothing] = js.native
  def execute[T](script: java.lang.String, arguments: js.Any*): T = js.native
  def execute[T](script: js.Function1[/* repeated */ js.Any, T], arguments: js.Any*): T = js.native
  def executeAsync(script: java.lang.String, arguments: js.Any*): js.Any = js.native
  def executeAsync(script: js.Function1[/* repeated */ js.Any, _], arguments: js.Any*): js.Any = js.native
  def getCookies(): js.Array[Cookie] = js.native
  def getCookies(names: js.Array[java.lang.String]): js.Array[Cookie] = js.native
  def keys(value: java.lang.String): js.UndefOr[scala.Nothing] = js.native
  def keys(value: js.Array[java.lang.String]): js.UndefOr[scala.Nothing] = js.native
  def newWindow(url: java.lang.String): java.lang.String = js.native
  def newWindow(url: java.lang.String, windowName: java.lang.String): java.lang.String = js.native
  def newWindow(url: java.lang.String, windowName: java.lang.String, windowFeatures: java.lang.String): java.lang.String = js.native
  def pause(milliseconds: scala.Double): js.UndefOr[scala.Nothing] = js.native
  def reloadSession(): js.UndefOr[scala.Nothing] = js.native
  def saveScreenshot(filepath: java.lang.String): nodeLib.Buffer = js.native
  def setCookies(cookie: Cookie): js.UndefOr[scala.Nothing] = js.native
  def setTimeout(timeouts: Timeouts): js.UndefOr[scala.Nothing] = js.native
  def switchWindow(urlOrTitleToMatch: java.lang.String): js.UndefOr[scala.Nothing] = js.native
  def switchWindow(urlOrTitleToMatch: stdLib.RegExp): js.UndefOr[scala.Nothing] = js.native
  def touchAction(action: TouchActions): js.UndefOr[scala.Nothing] = js.native
  def url(): java.lang.String = js.native
  def url(url: java.lang.String): java.lang.String = js.native
  def waitUntil(condition: js.Function0[scala.Boolean]): js.UndefOr[scala.Nothing] = js.native
  def waitUntil(condition: js.Function0[scala.Boolean], timeout: scala.Double): js.UndefOr[scala.Nothing] = js.native
  def waitUntil(condition: js.Function0[scala.Boolean], timeout: scala.Double, timeoutMsg: java.lang.String): js.UndefOr[scala.Nothing] = js.native
  def waitUntil(
    condition: js.Function0[scala.Boolean],
    timeout: scala.Double,
    timeoutMsg: java.lang.String,
    interval: scala.Double
  ): js.UndefOr[scala.Nothing] = js.native
}

