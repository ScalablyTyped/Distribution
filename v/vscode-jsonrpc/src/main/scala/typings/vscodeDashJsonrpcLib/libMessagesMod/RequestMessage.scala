package typings
package vscodeDashJsonrpcLib.libMessagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestMessage extends Message {
  /**
    * The request id.
    */
  var id: scala.Double | java.lang.String
  /**
    * The method to be invoked.
    */
  var method: java.lang.String
  /**
    * The method's params.
    */
  var params: js.UndefOr[js.Any] = js.undefined
}

object RequestMessage {
  @scala.inline
  def apply(
    id: scala.Double | java.lang.String,
    jsonrpc: java.lang.String,
    method: java.lang.String,
    params: js.Any = null
  ): RequestMessage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.updateDynamic("jsonrpc")(jsonrpc)
    __obj.updateDynamic("method")(method)
    if (params != null) __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[RequestMessage]
  }
}

