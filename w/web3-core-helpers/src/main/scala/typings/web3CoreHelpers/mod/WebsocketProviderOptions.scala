package typings.web3CoreHelpers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebsocketProviderOptions extends js.Object {
  var clientConfig: js.UndefOr[js.Object] = js.undefined
  var headers: js.UndefOr[js.Any] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var origin: js.UndefOr[String] = js.undefined
  var protocol: js.UndefOr[String] = js.undefined
  var reconnect: js.UndefOr[ReconnectOptions] = js.undefined
  var reconnectDelay: js.UndefOr[Double] = js.undefined
  var requestOptions: js.UndefOr[js.Any] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object WebsocketProviderOptions {
  @scala.inline
  def apply(
    clientConfig: js.Object = null,
    headers: js.Any = null,
    host: String = null,
    origin: String = null,
    protocol: String = null,
    reconnect: ReconnectOptions = null,
    reconnectDelay: js.UndefOr[Double] = js.undefined,
    requestOptions: js.Any = null,
    timeout: js.UndefOr[Double] = js.undefined
  ): WebsocketProviderOptions = {
    val __obj = js.Dynamic.literal()
    if (clientConfig != null) __obj.updateDynamic("clientConfig")(clientConfig.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (reconnect != null) __obj.updateDynamic("reconnect")(reconnect.asInstanceOf[js.Any])
    if (!js.isUndefined(reconnectDelay)) __obj.updateDynamic("reconnectDelay")(reconnectDelay.get.asInstanceOf[js.Any])
    if (requestOptions != null) __obj.updateDynamic("requestOptions")(requestOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebsocketProviderOptions]
  }
}

