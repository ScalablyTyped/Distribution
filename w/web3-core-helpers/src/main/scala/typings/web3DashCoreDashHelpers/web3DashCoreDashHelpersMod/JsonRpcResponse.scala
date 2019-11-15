package typings.web3DashCoreDashHelpers.web3DashCoreDashHelpersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonRpcResponse extends js.Object {
  var error: js.UndefOr[String] = js.undefined
  var id: Double
  var jsonrpc: String
  var result: js.UndefOr[js.Any] = js.undefined
}

object JsonRpcResponse {
  @scala.inline
  def apply(id: Double, jsonrpc: String, error: String = null, result: js.Any = null): JsonRpcResponse = {
    val __obj = js.Dynamic.literal(id = id, jsonrpc = jsonrpc)
    if (error != null) __obj.updateDynamic("error")(error)
    if (result != null) __obj.updateDynamic("result")(result)
    __obj.asInstanceOf[JsonRpcResponse]
  }
}

