package typings
package webdriverioLib.WebdriverIONs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WebdriverIO")
@js.native
object WebdriverIONsMembers extends js.Object {
  val VERSION: java.lang.String = js.native
  def multiremote(options: MultiRemoteOptions): Client[scala.Unit] = js.native
  def remote(): Client[scala.Unit] = js.native
  def remote(options: Options): Client[scala.Unit] = js.native
  def remote(options: Options, modifier: js.Function1[/* repeated */js.Any, _]): Client[scala.Unit] = js.native
}

