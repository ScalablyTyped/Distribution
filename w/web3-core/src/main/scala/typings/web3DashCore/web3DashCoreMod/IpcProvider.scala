package typings.web3DashCore.web3DashCoreMod

import typings.node.netMod.Server
import typings.web3DashCoreDashHelpers.web3DashCoreDashHelpersMod.IpcProviderBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("web3-core", "IpcProvider")
@js.native
class IpcProvider protected ()
  extends IpcProviderBase
     with _provider {
  def this(path: String, net: Server) = this()
}

