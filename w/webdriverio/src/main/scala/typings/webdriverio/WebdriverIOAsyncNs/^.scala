package typings.webdriverio.WebdriverIOAsyncNs

import typings.webdriver.WebDriverNs.AttachSessionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WebdriverIOAsync")
@js.native
object ^ extends js.Object {
  def attach(options: AttachSessionOptions): BrowserObject = js.native
  def multiremote(
    options: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify WebdriverIO.MultiRemoteOptions */ js.Any
  ): BrowserObject = js.native
  def remote(): BrowserObject = js.native
  def remote(
    options: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify WebdriverIO.RemoteOptions */ js.Any
  ): BrowserObject = js.native
  def remote(
    options: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify WebdriverIO.RemoteOptions */ js.Any,
    modifier: js.Function1[/* repeated */ js.Any, _]
  ): BrowserObject = js.native
}

