package typings.workerDashRpc.libRpcProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object RpcProvider {
  type Dispatcher = js.Function2[/* message */ Message, /* transfer */ js.UndefOr[js.Array[js.Any]], Unit]
}
