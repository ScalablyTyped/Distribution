package typings
package websocketLib.websocketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClientConfig extends IConfig {
  /**
    * Options to pass to https.request if connecting via TLS.
    * See Node's HTTPS documentation
    * @see https://nodejs.org/api/https.html#https_https_request_options_callback
    */
  var tlsOptions: js.UndefOr[nodeLib.httpsMod.RequestOptions] = js.undefined
  /**
    * Which version of the WebSocket protocol to use when making the connection.
    * Currently supported values are 8 and 13. This option will be removed once the
    * protocol is finalized by the IETF It is only available to ease the transition
    * through the intermediate draft protocol versions. The only thing this affects
    * the name of the Origin header.
    * @default 13
    */
  var webSocketVersion: js.UndefOr[scala.Double] = js.undefined
}

object IClientConfig {
  @scala.inline
  def apply(
    assembleFragments: js.UndefOr[scala.Boolean] = js.undefined,
    closeTimeout: scala.Int | scala.Double = null,
    fragmentOutgoingMessages: js.UndefOr[scala.Boolean] = js.undefined,
    fragmentationThreshold: scala.Int | scala.Double = null,
    maxReceivedFrameSize: scala.Int | scala.Double = null,
    maxReceivedMessageSize: scala.Int | scala.Double = null,
    tlsOptions: nodeLib.httpsMod.RequestOptions = null,
    webSocketVersion: scala.Int | scala.Double = null
  ): IClientConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(assembleFragments)) __obj.updateDynamic("assembleFragments")(assembleFragments)
    if (closeTimeout != null) __obj.updateDynamic("closeTimeout")(closeTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(fragmentOutgoingMessages)) __obj.updateDynamic("fragmentOutgoingMessages")(fragmentOutgoingMessages)
    if (fragmentationThreshold != null) __obj.updateDynamic("fragmentationThreshold")(fragmentationThreshold.asInstanceOf[js.Any])
    if (maxReceivedFrameSize != null) __obj.updateDynamic("maxReceivedFrameSize")(maxReceivedFrameSize.asInstanceOf[js.Any])
    if (maxReceivedMessageSize != null) __obj.updateDynamic("maxReceivedMessageSize")(maxReceivedMessageSize.asInstanceOf[js.Any])
    if (tlsOptions != null) __obj.updateDynamic("tlsOptions")(tlsOptions)
    if (webSocketVersion != null) __obj.updateDynamic("webSocketVersion")(webSocketVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClientConfig]
  }
}

