package typings
package tmiDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MaxReconnectAttempts extends js.Object {
  var maxReconnectAttempts: js.UndefOr[scala.Double] = js.undefined
  var maxReconnectInverval: js.UndefOr[scala.Double] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
  var reconnect: js.UndefOr[scala.Boolean] = js.undefined
  var reconnectDecay: js.UndefOr[scala.Double] = js.undefined
  var reconnectInterval: js.UndefOr[scala.Double] = js.undefined
  var secure: js.UndefOr[scala.Boolean] = js.undefined
  var server: js.UndefOr[java.lang.String] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object Anon_MaxReconnectAttempts {
  @scala.inline
  def apply(
    maxReconnectAttempts: scala.Int | scala.Double = null,
    maxReconnectInverval: scala.Int | scala.Double = null,
    port: scala.Int | scala.Double = null,
    reconnect: js.UndefOr[scala.Boolean] = js.undefined,
    reconnectDecay: scala.Int | scala.Double = null,
    reconnectInterval: scala.Int | scala.Double = null,
    secure: js.UndefOr[scala.Boolean] = js.undefined,
    server: java.lang.String = null,
    timeout: scala.Int | scala.Double = null
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

