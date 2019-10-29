package typings.web3DashCoreDashHelpers.web3DashCoreDashHelpersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebsocketProviderOptions extends js.Object {
  var clientConfig: js.UndefOr[String] = js.undefined
  var headers: js.UndefOr[js.Any] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var origin: js.UndefOr[String] = js.undefined
  var protocol: js.UndefOr[String] = js.undefined
  var reconnectDelay: js.UndefOr[Double] = js.undefined
  var requestOptions: js.UndefOr[js.Any] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object WebsocketProviderOptions {
  @scala.inline
  def apply(
    clientConfig: String = null,
    headers: js.Any = null,
    host: String = null,
    origin: String = null,
    protocol: String = null,
    reconnectDelay: Int | Double = null,
    requestOptions: js.Any = null,
    timeout: Int | Double = null
  ): WebsocketProviderOptions = {
    val __obj = js.Dynamic.literal()
    if (clientConfig != null) __obj.updateDynamic("clientConfig")(clientConfig)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (host != null) __obj.updateDynamic("host")(host)
    if (origin != null) __obj.updateDynamic("origin")(origin)
    if (protocol != null) __obj.updateDynamic("protocol")(protocol)
    if (reconnectDelay != null) __obj.updateDynamic("reconnectDelay")(reconnectDelay.asInstanceOf[js.Any])
    if (requestOptions != null) __obj.updateDynamic("requestOptions")(requestOptions)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebsocketProviderOptions]
  }
}

