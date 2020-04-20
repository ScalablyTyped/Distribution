package typings.titanium

import typings.titanium.Titanium.Network.Socket.TCP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object passed to the error callback when the socket enters the [ERROR](Titanium.Network.Socket.ERROR) state.
  */
trait ErrorCallbackArgs extends FailureResponse {
  /**
  	 * Socket that experienced the error.
  	 */
  var socket: js.UndefOr[TCP] = js.undefined
}

object ErrorCallbackArgs {
  @scala.inline
  def apply(
    code: Int | Double = null,
    error: java.lang.String = null,
    socket: TCP = null,
    success: js.UndefOr[Boolean] = js.undefined
  ): ErrorCallbackArgs = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (socket != null) __obj.updateDynamic("socket")(socket.asInstanceOf[js.Any])
    if (!js.isUndefined(success)) __obj.updateDynamic("success")(success.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorCallbackArgs]
  }
}

