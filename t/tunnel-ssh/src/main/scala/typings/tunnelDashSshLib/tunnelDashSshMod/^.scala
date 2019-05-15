package typings
package tunnelDashSshLib.tunnelDashSshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tunnel-ssh", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): nodeLib.netMod.Server = js.native
  def apply(config: Config): nodeLib.netMod.Server = js.native
  def apply(
    config: Config,
    cb: js.Function2[/* error */ stdLib.Error, /* server */ nodeLib.netMod.Server, scala.Unit]
  ): nodeLib.netMod.Server = js.native
}

