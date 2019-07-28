package typings.titanium

import typings.titanium.TitaniumNs.NetworkNs.SocketNs.TCP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object passed to the error callback when the socket enters the [ERROR](Titanium.Network.Socket.ERROR) state.
  */
trait ErrorCallbackArgs extends js.Object {
  /**
  	 * Error code. Returns a non-zero value.
  	 */
  var code: js.UndefOr[Double] = js.undefined
  /**
  	 * Error message, if any returned.
  	 */
  var error: js.UndefOr[String] = js.undefined
  /**
  	 * The error code of the error (potentially system-dependent).
  	 */
  var errorCode: js.UndefOr[Double] = js.undefined
  /**
  	 * Socket that experienced the error.
  	 */
  var socket: js.UndefOr[TCP] = js.undefined
  /**
  	 * Indicates if the operation succeeded. Returns `false`.
  	 */
  var success: js.UndefOr[Boolean] = js.undefined
}

object ErrorCallbackArgs {
  @scala.inline
  def apply(
    code: Int | Double = null,
    error: String = null,
    errorCode: Int | Double = null,
    socket: TCP = null,
    success: js.UndefOr[Boolean] = js.undefined
  ): ErrorCallbackArgs = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error)
    if (errorCode != null) __obj.updateDynamic("errorCode")(errorCode.asInstanceOf[js.Any])
    if (socket != null) __obj.updateDynamic("socket")(socket)
    if (!js.isUndefined(success)) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[ErrorCallbackArgs]
  }
}

