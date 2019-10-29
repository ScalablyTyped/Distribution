package typings.web3DashProvidersDashIpc

import typings.node.netMod.Server
import typings.web3DashCoreDashHelpers.web3DashCoreDashHelpersMod.IpcProviderBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("web3-providers-ipc", JSImport.Namespace)
@js.native
object web3DashProvidersDashIpcMod extends js.Object {
  @js.native
  class IpcProvider protected () extends IpcProviderBase {
    def this(path: String, net: Server) = this()
  }
  
}

