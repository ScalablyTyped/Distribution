package typings.web3.providersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonRPCRequest extends js.Object {
  var id: Double
  var jsonrpc: String
  var method: String
  var params: js.Array[_]
}

object JsonRPCRequest {
  @scala.inline
  def apply(id: Double, jsonrpc: String, method: String, params: js.Array[_]): JsonRPCRequest = {
    val __obj = js.Dynamic.literal(id = id, jsonrpc = jsonrpc, method = method, params = params)
  
    __obj.asInstanceOf[JsonRPCRequest]
  }
}

