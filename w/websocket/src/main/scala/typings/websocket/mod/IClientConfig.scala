package typings.websocket.mod

import typings.node.httpsMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClientConfig extends IConfig {
  /**
    * Options to pass to https.request if connecting via TLS.
    * See Node's HTTPS documentation
    * @see https://nodejs.org/api/https.html#https_https_request_options_callback
    */
  var tlsOptions: js.UndefOr[RequestOptions] = js.undefined
  /**
    * Which version of the WebSocket protocol to use when making the connection.
    * Currently supported values are 8 and 13. This option will be removed once the
    * protocol is finalized by the IETF It is only available to ease the transition
    * through the intermediate draft protocol versions. The only thing this affects
    * the name of the Origin header.
    * @default 13
    */
  var webSocketVersion: js.UndefOr[Double] = js.undefined
}

object IClientConfig {
  @scala.inline
  def apply(
    assembleFragments: js.UndefOr[Boolean] = js.undefined,
    closeTimeout: js.UndefOr[Double] = js.undefined,
    fragmentOutgoingMessages: js.UndefOr[Boolean] = js.undefined,
    fragmentationThreshold: js.UndefOr[Double] = js.undefined,
    maxReceivedFrameSize: js.UndefOr[Double] = js.undefined,
    maxReceivedMessageSize: js.UndefOr[Double] = js.undefined,
    tlsOptions: RequestOptions = null,
    webSocketVersion: js.UndefOr[Double] = js.undefined
  ): IClientConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(assembleFragments)) __obj.updateDynamic("assembleFragments")(assembleFragments.get.asInstanceOf[js.Any])
    if (!js.isUndefined(closeTimeout)) __obj.updateDynamic("closeTimeout")(closeTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fragmentOutgoingMessages)) __obj.updateDynamic("fragmentOutgoingMessages")(fragmentOutgoingMessages.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fragmentationThreshold)) __obj.updateDynamic("fragmentationThreshold")(fragmentationThreshold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxReceivedFrameSize)) __obj.updateDynamic("maxReceivedFrameSize")(maxReceivedFrameSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxReceivedMessageSize)) __obj.updateDynamic("maxReceivedMessageSize")(maxReceivedMessageSize.get.asInstanceOf[js.Any])
    if (tlsOptions != null) __obj.updateDynamic("tlsOptions")(tlsOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(webSocketVersion)) __obj.updateDynamic("webSocketVersion")(webSocketVersion.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClientConfig]
  }
}

