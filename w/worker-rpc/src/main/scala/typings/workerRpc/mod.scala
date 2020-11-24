package typings.workerRpc

import typings.workerRpc.rpcProviderMod.RpcProvider.Dispatcher
import typings.workerRpc.rpcProviderMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("worker-rpc", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class RpcProvider protected () extends default {
    def this(_dispatch: Dispatcher) = this()
    def this(_dispatch: Dispatcher, _rpcTimeout: Double) = this()
  }
  @js.native
  object RpcProvider extends js.Object {
    
    @js.native
    object MessageType extends js.Object {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.workerRpc.rpcProviderMod.RpcProvider.MessageType with Double] = js.native
      
      /* 2 */ val internal: typings.workerRpc.rpcProviderMod.RpcProvider.MessageType.internal with Double = js.native
      
      /* 1 */ val rpc: typings.workerRpc.rpcProviderMod.RpcProvider.MessageType.rpc with Double = js.native
      
      /* 0 */ val signal: typings.workerRpc.rpcProviderMod.RpcProvider.MessageType.signal with Double = js.native
    }
  }
}
