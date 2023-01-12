package typings.workerRpc

import typings.std.Event
import typings.workerRpc.libRpcProviderInterfaceMod.RpcProviderInterface
import typings.workerRpc.libRpcProviderMod.RpcProvider.Dispatcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRpcProviderMod {
  
  @JSImport("worker-rpc/lib/RpcProvider", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with RpcProvider {
    def this(_dispatch: Dispatcher) = this()
    def this(_dispatch: Dispatcher, _rpcTimeout: Double) = this()
  }
  object default {
    
    @JSImport("worker-rpc/lib/RpcProvider", "default.MessageType")
    @js.native
    object MessageType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.workerRpc.libRpcProviderMod.RpcProvider.MessageType & Double] = js.native
      
      /* 2 */ val internal: typings.workerRpc.libRpcProviderMod.RpcProvider.MessageType.internal & Double = js.native
      
      /* 1 */ val rpc: typings.workerRpc.libRpcProviderMod.RpcProvider.MessageType.rpc & Double = js.native
      
      /* 0 */ val signal: typings.workerRpc.libRpcProviderMod.RpcProvider.MessageType.signal & Double = js.native
    }
  }
  
  @js.native
  trait RpcProvider
    extends StObject
       with RpcProviderInterface {
    
    /* private */ var _clearTransaction: Any = js.native
    
    /* private */ var _dispatch: Any = js.native
    
    /* private */ var _handeRpc: Any = js.native
    
    /* private */ var _handleInternal: Any = js.native
    
    /* private */ var _handleSignal: Any = js.native
    
    /* private */ var _nextTransactionId: Any = js.native
    
    /* private */ var _pendingTransactions: Any = js.native
    
    /* private */ var _raiseError: Any = js.native
    
    /* private */ var _rpcHandlers: Any = js.native
    
    /* private */ var _rpcTimeout: Any = js.native
    
    /* private */ var _signalHandlers: Any = js.native
    
    /* private */ var _transactionTimeout: Any = js.native
    
    @JSName("error")
    var error_RpcProvider: Event = js.native
    
    def rpc[T, U](id: String, payload: T, transfer: Any): js.Promise[U] = js.native
    def rpc[T, U](id: String, payload: Unit, transfer: Any): js.Promise[U] = js.native
    
    def signal[T](id: String, payload: T, transfer: Any): this.type = js.native
    def signal[T](id: String, payload: Unit, transfer: Any): this.type = js.native
  }
  object RpcProvider {
    
    @js.native
    sealed trait MessageType extends StObject
    @JSImport("worker-rpc/lib/RpcProvider", "RpcProvider.MessageType")
    @js.native
    object MessageType extends StObject {
      
      @js.native
      sealed trait internal
        extends StObject
           with MessageType
      
      @js.native
      sealed trait rpc
        extends StObject
           with MessageType
      
      @js.native
      sealed trait signal
        extends StObject
           with MessageType
    }
    
    type Dispatcher = js.Function2[/* message */ Message, /* transfer */ js.UndefOr[js.Array[Any]], Unit]
    
    trait Message extends StObject {
      
      var id: String
      
      var payload: js.UndefOr[Any] = js.undefined
      
      var transactionId: js.UndefOr[Double] = js.undefined
      
      var `type`: MessageType
    }
    object Message {
      
      inline def apply(id: String, `type`: MessageType): Message = {
        val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[Message]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setPayload(value: Any): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
        
        inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
        
        inline def setTransactionId(value: Double): Self = StObject.set(x, "transactionId", value.asInstanceOf[js.Any])
        
        inline def setTransactionIdUndefined: Self = StObject.set(x, "transactionId", js.undefined)
        
        inline def setType(value: MessageType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
  }
}
