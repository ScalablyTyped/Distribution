package typings
package webdriverioLib.webdriverioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webdriverio", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val VERSION: java.lang.String = js.native
  def multiremote(options: webdriverioLib.WebdriverIONs.MultiRemoteOptions): webdriverioLib.WebdriverIONs.Client[scala.Unit] = js.native
  def remote(): webdriverioLib.WebdriverIONs.Client[scala.Unit] = js.native
  def remote(options: webdriverioLib.WebdriverIONs.Options): webdriverioLib.WebdriverIONs.Client[scala.Unit] = js.native
  def remote(options: webdriverioLib.WebdriverIONs.Options, modifier: js.Function1[/* repeated */ js.Any, _]): webdriverioLib.WebdriverIONs.Client[scala.Unit] = js.native
}

