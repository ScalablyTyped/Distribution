package typings
package workerDashRpcLib.libRpcProviderInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RpcProviderInterface extends js.Object {
  var error: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify EventInterface<Error> */ js.Any = js.native
  def deregisterRpcHandler[T, U](
    id: java.lang.String,
    handler: workerDashRpcLib.libRpcProviderInterfaceMod.RpcProviderInterfaceNs.RpcHandler[T, U]
  ): this.type = js.native
  def deregisterSignalHandler[T](
    id: java.lang.String,
    handler: workerDashRpcLib.libRpcProviderInterfaceMod.RpcProviderInterfaceNs.SignalHandler[T]
  ): this.type = js.native
  def dispatch(message: js.Any): scala.Unit = js.native
  def registerRpcHandler[T, U](
    id: java.lang.String,
    handler: workerDashRpcLib.libRpcProviderInterfaceMod.RpcProviderInterfaceNs.RpcHandler[T, U]
  ): this.type = js.native
  def registerSignalHandler[T](
    id: java.lang.String,
    handler: workerDashRpcLib.libRpcProviderInterfaceMod.RpcProviderInterfaceNs.SignalHandler[T]
  ): this.type = js.native
  def rpc[T, U](id: java.lang.String): js.Promise[U] = js.native
  def rpc[T, U](id: java.lang.String, payload: T): js.Promise[U] = js.native
  def rpc[T, U](id: java.lang.String, payload: T, transfer: js.Array[_]): js.Promise[U] = js.native
  def signal[T](id: java.lang.String): this.type = js.native
  def signal[T](id: java.lang.String, payload: T): this.type = js.native
  def signal[T](id: java.lang.String, payload: T, transfer: js.Array[_]): this.type = js.native
}

