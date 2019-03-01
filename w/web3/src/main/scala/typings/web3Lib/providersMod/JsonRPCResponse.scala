package typings
package web3Lib.providersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonRPCResponse extends js.Object {
  var error: js.UndefOr[java.lang.String] = js.undefined
  var id: scala.Double
  var jsonrpc: java.lang.String
  var result: js.UndefOr[js.Any] = js.undefined
}

object JsonRPCResponse {
  @scala.inline
  def apply(id: scala.Double, jsonrpc: java.lang.String, error: java.lang.String = null, result: js.Any = null): JsonRPCResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("jsonrpc")(jsonrpc)
    if (error != null) __obj.updateDynamic("error")(error)
    if (result != null) __obj.updateDynamic("result")(result)
    __obj.asInstanceOf[JsonRPCResponse]
  }
}

