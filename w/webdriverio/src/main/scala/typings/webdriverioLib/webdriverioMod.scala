package typings
package webdriverioLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webdriverio", JSImport.Namespace)
@js.native
object webdriverioMod extends js.Object {
  def attach(options: webdriverLib.WebDriverNs.AttachSessionOptions): webdriverioLib.WebdriverIOAsyncNs.BrowserObject = js.native
  def multiremote(
    options: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify WebdriverIO.MultiRemoteOptions */ js.Any
  ): webdriverioLib.WebdriverIOAsyncNs.BrowserObject = js.native
  def remote(): webdriverioLib.WebdriverIOAsyncNs.BrowserObject = js.native
  def remote(
    options: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify WebdriverIO.RemoteOptions */ js.Any
  ): webdriverioLib.WebdriverIOAsyncNs.BrowserObject = js.native
  def remote(
    options: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify WebdriverIO.RemoteOptions */ js.Any,
    modifier: js.Function1[/* repeated */ js.Any, _]
  ): webdriverioLib.WebdriverIOAsyncNs.BrowserObject = js.native
}

