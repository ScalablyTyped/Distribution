package typings.workerDashRpc.workerDashRpcMod

import typings.workerDashRpc.libRpcProviderMod.RpcProviderNs.Dispatcher
import typings.workerDashRpc.libRpcProviderMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("worker-rpc", "RpcProvider")
@js.native
class RpcProvider protected () extends default {
  def this(_dispatch: Dispatcher) = this()
  def this(_dispatch: Dispatcher, _rpcTimeout: Double) = this()
}

