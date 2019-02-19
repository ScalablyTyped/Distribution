package typings
package webdriverioLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webdriverio", JSImport.Namespace)
@js.native
object webdriverioMod extends js.Object {
  def multiremote(options: js.Any): webdriverLib.WebDriverNs.Client = js.native
  def remote(): webdriverLib.WebDriverNs.Client with webdriverioLib.WebdriverIONs.Browser = js.native
  def remote(options: webdriverLib.WebDriverNs.Options): webdriverLib.WebDriverNs.Client with webdriverioLib.WebdriverIONs.Browser = js.native
  def remote(options: webdriverLib.WebDriverNs.Options, modifier: js.Function1[/* repeated */ js.Any, _]): webdriverLib.WebDriverNs.Client with webdriverioLib.WebdriverIONs.Browser = js.native
}

