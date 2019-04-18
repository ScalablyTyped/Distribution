package typings
package workerDashRpcLib.libRpcProviderInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object RpcProviderInterfaceNs {
  type RpcHandler[T, U] = js.Function1[/* payload */ js.UndefOr[T], js.Promise[U] | U]
  type SignalHandler[T] = js.Function1[/* payload */ js.UndefOr[T], scala.Unit]
}
