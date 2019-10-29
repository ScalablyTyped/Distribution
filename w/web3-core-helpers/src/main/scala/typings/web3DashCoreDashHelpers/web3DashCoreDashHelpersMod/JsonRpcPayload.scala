package typings.web3DashCoreDashHelpers.web3DashCoreDashHelpersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonRpcPayload extends js.Object {
  var id: js.UndefOr[String | Double] = js.undefined
  var jsonrpc: String
  var method: String
  var params: js.Array[_]
}

object JsonRpcPayload {
  @scala.inline
  def apply(jsonrpc: String, method: String, params: js.Array[_], id: String | Double = null): JsonRpcPayload = {
    val __obj = js.Dynamic.literal(jsonrpc = jsonrpc, method = method, params = params)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonRpcPayload]
  }
}

