package typings.workerRpc

import typings.workerRpc.libRpcProviderMod.RpcProvider.Dispatcher
import typings.workerRpc.libRpcProviderMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("worker-rpc", "RpcProvider")
  @js.native
  open class RpcProvider protected () extends default {
    def this(_dispatch: Dispatcher) = this()
    def this(_dispatch: Dispatcher, _rpcTimeout: Double) = this()
  }
  object RpcProvider {
    
    @JSImport("worker-rpc", "RpcProvider.MessageType")
    @js.native
    object MessageType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.workerRpc.libRpcProviderMod.RpcProvider.MessageType & Double] = js.native
      
      /* 2 */ val internal: typings.workerRpc.libRpcProviderMod.RpcProvider.MessageType.internal & Double = js.native
      
      /* 1 */ val rpc: typings.workerRpc.libRpcProviderMod.RpcProvider.MessageType.rpc & Double = js.native
      
      /* 0 */ val signal: typings.workerRpc.libRpcProviderMod.RpcProvider.MessageType.signal & Double = js.native
    }
  }
}
