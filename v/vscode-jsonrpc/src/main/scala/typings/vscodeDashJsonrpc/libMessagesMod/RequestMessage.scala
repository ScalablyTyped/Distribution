package typings.vscodeDashJsonrpc.libMessagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestMessage extends Message {
  /**
    * The request id.
    */
  var id: Double | String
  /**
    * The method to be invoked.
    */
  var method: String
  /**
    * The method's params.
    */
  var params: js.UndefOr[js.Any] = js.undefined
}

object RequestMessage {
  @scala.inline
  def apply(id: Double | String, jsonrpc: String, method: String, params: js.Any = null): RequestMessage = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], jsonrpc = jsonrpc, method = method)
    if (params != null) __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[RequestMessage]
  }
}

