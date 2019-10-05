package typings.workerDashRpc.libRpcProviderMod

import typings.workerDashRpc.libRpcProviderMod.RpcProvider.Dispatcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("worker-rpc/lib/RpcProvider", JSImport.Default)
@js.native
class default protected () extends RpcProvider {
  def this(_dispatch: Dispatcher) = this()
  def this(_dispatch: Dispatcher, _rpcTimeout: Double) = this()
}

@JSImport("worker-rpc/lib/RpcProvider", JSImport.Default)
@js.native
object default extends js.Object {
  @js.native
  object MessageType extends js.Object {
    /* 2 */ val internal: typings.workerDashRpc.libRpcProviderMod.RpcProvider.MessageType.internal with Double = js.native
    /* 1 */ val rpc: typings.workerDashRpc.libRpcProviderMod.RpcProvider.MessageType.rpc with Double = js.native
    /* 0 */ val signal: typings.workerDashRpc.libRpcProviderMod.RpcProvider.MessageType.signal with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.workerDashRpc.libRpcProviderMod.RpcProvider.MessageType with Double] = js.native
  }
  
}

