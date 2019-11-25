package typings.vscodeDashJsonrpc.libMessagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationMessage extends Message {
  /**
    * The method to be invoked.
    */
  var method: String
  /**
    * The notification's params.
    */
  var params: js.UndefOr[js.Any] = js.undefined
}

object NotificationMessage {
  @scala.inline
  def apply(jsonrpc: String, method: String, params: js.Any = null): NotificationMessage = {
    val __obj = js.Dynamic.literal(jsonrpc = jsonrpc.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationMessage]
  }
}

