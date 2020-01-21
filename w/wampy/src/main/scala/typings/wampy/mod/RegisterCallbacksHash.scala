package typings.wampy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterCallbacksHash extends js.Object {
  var onError: js.UndefOr[ErrorCallback] = js.native
  var onSuccess: js.UndefOr[Callback] = js.native
  @JSName("rpc")
  var rpc_Original: RPCCallback = js.native
  def rpc(args: DataArgs): RPCResult | Unit = js.native
}

