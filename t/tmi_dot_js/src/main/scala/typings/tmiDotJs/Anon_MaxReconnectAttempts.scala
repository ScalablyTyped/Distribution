package typings.tmiDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MaxReconnectAttempts extends js.Object {
  var maxReconnectAttempts: js.UndefOr[Double] = js.undefined
  var maxReconnectInverval: js.UndefOr[Double] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var reconnect: js.UndefOr[Boolean] = js.undefined
  var reconnectDecay: js.UndefOr[Double] = js.undefined
  var reconnectInterval: js.UndefOr[Double] = js.undefined
  var secure: js.UndefOr[Boolean] = js.undefined
  var server: js.UndefOr[String] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object Anon_MaxReconnectAttempts {
  @scala.inline
  def apply(
    maxReconnectAttempts: Int | Double = null,
    maxReconnectInverval: Int | Double = null,
    port: Int | Double = null,
    reconnect: js.UndefOr[Boolean] = js.undefined,
    reconnectDecay: Int | Double = null,
    reconnectInterval: Int | Double = null,
    secure: js.UndefOr[Boolean] = js.undefined,
    server: String = null,
    timeout: Int | Double = null
  ): Anon_MaxReconnectAttempts = {
    val __obj = js.Dynamic.literal()
    if (maxReconnectAttempts != null) __obj.updateDynamic("maxReconnectAttempts")(maxReconnectAttempts.asInstanceOf[js.Any])
    if (maxReconnectInverval != null) __obj.updateDynamic("maxReconnectInverval")(maxReconnectInverval.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (!js.isUndefined(reconnect)) __obj.updateDynamic("reconnect")(reconnect)
    if (reconnectDecay != null) __obj.updateDynamic("reconnectDecay")(reconnectDecay.asInstanceOf[js.Any])
    if (reconnectInterval != null) __obj.updateDynamic("reconnectInterval")(reconnectInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure)
    if (server != null) __obj.updateDynamic("server")(server)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MaxReconnectAttempts]
  }
}

