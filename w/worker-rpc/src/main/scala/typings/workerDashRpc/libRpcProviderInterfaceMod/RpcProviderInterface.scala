package typings.workerDashRpc.libRpcProviderInterfaceMod

import typings.workerDashRpc.libRpcProviderInterfaceMod.RpcProviderInterfaceNs.RpcHandler
import typings.workerDashRpc.libRpcProviderInterfaceMod.RpcProviderInterfaceNs.SignalHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RpcProviderInterface extends js.Object {
  var error: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify EventInterface<Error> */ js.Any = js.native
  def deregisterRpcHandler[T, U](id: String, handler: RpcHandler[T, U]): this.type = js.native
  def deregisterSignalHandler[T](id: String, handler: SignalHandler[T]): this.type = js.native
  def dispatch(message: js.Any): Unit = js.native
  def registerRpcHandler[T, U](id: String, handler: RpcHandler[T, U]): this.type = js.native
  def registerSignalHandler[T](id: String, handler: SignalHandler[T]): this.type = js.native
  def rpc[T, U](id: String): js.Promise[U] = js.native
  def rpc[T, U](id: String, payload: T): js.Promise[U] = js.native
  def rpc[T, U](id: String, payload: T, transfer: js.Array[_]): js.Promise[U] = js.native
  def signal[T](id: String): this.type = js.native
  def signal[T](id: String, payload: T): this.type = js.native
  def signal[T](id: String, payload: T, transfer: js.Array[_]): this.type = js.native
}

