package typings
package webdriverioLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webdriverio", JSImport.Namespace)
@js.native
object webdriverioMod extends js.Object {
  def multiremote(
    options: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify WebdriverIO.MultiRemoteOptions */ js.Any
  ): webdriverLib.WebDriverNs.ClientAsync = js.native
  def remote(): webdriverioLib.BrowserObject = js.native
  def remote(options: webdriverLib.WebDriverNs.Options): webdriverioLib.BrowserObject = js.native
  def remote(options: webdriverLib.WebDriverNs.Options, modifier: js.Function1[/* repeated */ js.Any, _]): webdriverioLib.BrowserObject = js.native
}

