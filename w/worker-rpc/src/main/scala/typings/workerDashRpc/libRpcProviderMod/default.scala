package typings.workerDashRpc.libRpcProviderMod

import typings.workerDashRpc.libRpcProviderMod.RpcProviderNs.Dispatcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("worker-rpc/lib/RpcProvider", JSImport.Default)
@js.native
class default protected () extends RpcProvider {
  def this(_dispatch: Dispatcher) = this()
  def this(_dispatch: Dispatcher, _rpcTimeout: Double) = this()
}

