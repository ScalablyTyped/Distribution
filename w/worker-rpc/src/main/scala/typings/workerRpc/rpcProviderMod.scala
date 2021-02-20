package typings.workerRpc

import typings.std.Event
import typings.workerRpc.rpcProviderInterfaceMod.RpcProviderInterface
import typings.workerRpc.rpcProviderMod.RpcProvider.Dispatcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rpcProviderMod {
  
  @JSImport("worker-rpc/lib/RpcProvider", JSImport.Default)
  @js.native
  class default protected () extends RpcProvider {
    def this(_dispatch: Dispatcher) = this()
    def this(_dispatch: Dispatcher, _rpcTimeout: Double) = this()
  }
  object default {
    
    @JSImport("worker-rpc/lib/RpcProvider", "default.MessageType")
    @js.native
    object MessageType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.workerRpc.rpcProviderMod.RpcProvider.MessageType with Double] = js.native
      
      /* 2 */ val internal: typings.workerRpc.rpcProviderMod.RpcProvider.MessageType.internal with Double = js.native
      
      /* 1 */ val rpc: typings.workerRpc.rpcProviderMod.RpcProvider.MessageType.rpc with Double = js.native
      
      /* 0 */ val signal: typings.workerRpc.rpcProviderMod.RpcProvider.MessageType.signal with Double = js.native
    }
  }
  
  @js.native
  trait RpcProvider extends RpcProviderInterface {
    
    var _clearTransaction: js.Any = js.native
    
    var _dispatch: js.Any = js.native
    
    var _handeRpc: js.Any = js.native
    
    var _handleInternal: js.Any = js.native
    
    var _handleSignal: js.Any = js.native
    
    var _nextTransactionId: js.Any = js.native
    
    var _pendingTransactions: js.Any = js.native
    
    var _raiseError: js.Any = js.native
    
    var _rpcHandlers: js.Any = js.native
    
    var _rpcTimeout: js.Any = js.native
    
    var _signalHandlers: js.Any = js.native
    
    var _transactionTimeout: js.Any = js.native
    
    @JSName("error")
    var error_RpcProvider: Event = js.native
    
    def rpc[T, U](id: String, payload: T, transfer: js.Any): js.Promise[U] = js.native
    def rpc[T, U](id: String, payload: js.UndefOr[scala.Nothing], transfer: js.Any): js.Promise[U] = js.native
    
    def signal[T](id: String, payload: T, transfer: js.Any): this.type = js.native
    def signal[T](id: String, payload: js.UndefOr[scala.Nothing], transfer: js.Any): this.type = js.native
  }
  object RpcProvider {
    
    @js.native
    sealed trait MessageType extends StObject
    @JSImport("worker-rpc/lib/RpcProvider", "RpcProvider.MessageType")
    @js.native
    object MessageType extends StObject {
      
      @js.native
      sealed trait internal extends MessageType
      
      @js.native
      sealed trait rpc extends MessageType
      
      @js.native
      sealed trait signal extends MessageType
    }
    
    type Dispatcher = js.Function2[/* message */ Message, /* transfer */ js.UndefOr[js.Array[js.Any]], Unit]
    
    @js.native
    trait Message extends StObject {
      
      var id: String = js.native
      
      var payload: js.UndefOr[js.Any] = js.native
      
      var transactionId: js.UndefOr[Double] = js.native
      
      var `type`: MessageType = js.native
    }
    object Message {
      
      @scala.inline
      def apply(id: String, `type`: MessageType): Message = {
        val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[Message]
      }
      
      @scala.inline
      implicit class MessageMutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPayload(value: js.Any): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
        
        @scala.inline
        def setTransactionId(value: Double): Self = StObject.set(x, "transactionId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTransactionIdUndefined: Self = StObject.set(x, "transactionId", js.undefined)
        
        @scala.inline
        def setType(value: MessageType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
  }
}
