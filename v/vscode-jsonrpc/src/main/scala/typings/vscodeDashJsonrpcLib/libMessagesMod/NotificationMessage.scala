package typings
package vscodeDashJsonrpcLib.libMessagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationMessage extends Message {
  /**
    * The method to be invoked.
    */
  var method: java.lang.String
  /**
    * The notification's params.
    */
  var params: js.UndefOr[js.Any] = js.undefined
}

object NotificationMessage {
  @scala.inline
  def apply(jsonrpc: java.lang.String, method: java.lang.String, params: js.Any = null): NotificationMessage = {
    val __obj = js.Dynamic.literal(jsonrpc = jsonrpc, method = method)
    if (params != null) __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[NotificationMessage]
  }
}

