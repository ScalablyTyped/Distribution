package typings.webdriverio

import typings.std.Error
import typings.webdriver.WebDriver.AttachSessionOptions
import typings.webdriverio.WebdriverIO.BrowserObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webdriverio", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * Error to be thrown when a severe error was encountered when a Service is being ran.
    */
  @js.native
  class SevereServiceError () extends Error
  
  def attach(options: AttachSessionOptions): BrowserObject = js.native
  def multiremote(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MultiRemoteOptions */ js.Any
  ): js.Promise[BrowserObject] = js.native
  def remote(): js.Promise[BrowserObject] = js.native
  def remote(options: js.UndefOr[scala.Nothing], modifier: js.Function1[/* repeated */ js.Any, _]): js.Promise[BrowserObject] = js.native
  def remote(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RemoteOptions */ js.Any
  ): js.Promise[BrowserObject] = js.native
  def remote(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RemoteOptions */ js.Any,
    modifier: js.Function1[/* repeated */ js.Any, _]
  ): js.Promise[BrowserObject] = js.native
}

