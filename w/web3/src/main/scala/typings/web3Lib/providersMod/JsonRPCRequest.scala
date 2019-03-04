package typings
package web3Lib.providersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonRPCRequest extends js.Object {
  var id: scala.Double
  var jsonrpc: java.lang.String
  var method: java.lang.String
  var params: js.Array[_]
}

object JsonRPCRequest {
  @scala.inline
  def apply(id: scala.Double, jsonrpc: java.lang.String, method: java.lang.String, params: js.Array[_]): JsonRPCRequest = {
    val __obj = js.Dynamic.literal(id = id, jsonrpc = jsonrpc, method = method, params = params)
  
    __obj.asInstanceOf[JsonRPCRequest]
  }
}

