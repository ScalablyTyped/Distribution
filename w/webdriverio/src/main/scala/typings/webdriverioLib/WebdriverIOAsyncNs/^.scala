package typings
package webdriverioLib.WebdriverIOAsyncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WebdriverIOAsync")
@js.native
object ^ extends js.Object {
  def attach(): webdriverioLib.BrowserObject = js.native
  def attach(options: webdriverLib.WebDriverNs.AttachSessionOptions): webdriverioLib.BrowserObject = js.native
  def multiremote(
    options: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify WebdriverIO.MultiRemoteOptions */ js.Any
  ): webdriverLib.WebDriverNs.ClientAsync = js.native
  def remote(): webdriverioLib.BrowserObject = js.native
  def remote(
    options: webdriverLib.WebDriverNs.Options with (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify WebdriverIO.Options */ js.Any)
  ): webdriverioLib.BrowserObject = js.native
  def remote(
    options: webdriverLib.WebDriverNs.Options with (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify WebdriverIO.Options */ js.Any),
    modifier: js.Function1[/* repeated */ js.Any, _]
  ): webdriverioLib.BrowserObject = js.native
}

