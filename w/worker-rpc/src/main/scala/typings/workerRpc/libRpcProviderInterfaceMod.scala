package typings.workerRpc

import typings.workerRpc.libRpcProviderInterfaceMod.RpcProviderInterface.RpcHandler
import typings.workerRpc.libRpcProviderInterfaceMod.RpcProviderInterface.SignalHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRpcProviderInterfaceMod {
  
  @js.native
  trait RpcProviderInterface extends StObject {
    
    def deregisterRpcHandler[T, U](id: String, handler: RpcHandler[T, U]): this.type = js.native
    
    def deregisterSignalHandler[T](id: String, handler: SignalHandler[T]): this.type = js.native
    
    def dispatch(message: Any): Unit = js.native
    
    var error: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventInterface<Error> */ Any = js.native
    
    def registerRpcHandler[T, U](id: String, handler: RpcHandler[T, U]): this.type = js.native
    
    def registerSignalHandler[T](id: String, handler: SignalHandler[T]): this.type = js.native
    
    def rpc[T, U](id: String): js.Promise[U] = js.native
    def rpc[T, U](id: String, payload: T): js.Promise[U] = js.native
    def rpc[T, U](id: String, payload: T, transfer: js.Array[Any]): js.Promise[U] = js.native
    def rpc[T, U](id: String, payload: Unit, transfer: js.Array[Any]): js.Promise[U] = js.native
    
    def signal[T](id: String): this.type = js.native
    def signal[T](id: String, payload: T): this.type = js.native
    def signal[T](id: String, payload: T, transfer: js.Array[Any]): this.type = js.native
    def signal[T](id: String, payload: Unit, transfer: js.Array[Any]): this.type = js.native
  }
  object RpcProviderInterface {
    
    type RpcHandler[T, U] = js.Function1[/* payload */ js.UndefOr[T], js.Promise[U] | U]
    
    type SignalHandler[T] = js.Function1[/* payload */ js.UndefOr[T], Unit]
  }
}
