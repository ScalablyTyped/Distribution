package typings
package subscriptionsDashTransportDashWsLib.distClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientOptions extends js.Object {
  var connectionCallback: js.UndefOr[
    js.Function2[/* error */ js.Array[nodeLib.Error], /* result */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  var connectionParams: js.UndefOr[ConnectionParamsOptions] = js.undefined
  var inactivityTimeout: js.UndefOr[scala.Double] = js.undefined
  var `lazy`: js.UndefOr[scala.Boolean] = js.undefined
  var reconnect: js.UndefOr[scala.Boolean] = js.undefined
  var reconnectionAttempts: js.UndefOr[scala.Double] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object ClientOptions {
  @scala.inline
  def apply(
    connectionCallback: js.Function2[/* error */ js.Array[nodeLib.Error], /* result */ js.UndefOr[js.Any], scala.Unit] = null,
    connectionParams: ConnectionParamsOptions = null,
    inactivityTimeout: scala.Int | scala.Double = null,
    `lazy`: js.UndefOr[scala.Boolean] = js.undefined,
    reconnect: js.UndefOr[scala.Boolean] = js.undefined,
    reconnectionAttempts: scala.Int | scala.Double = null,
    timeout: scala.Int | scala.Double = null
  ): ClientOptions = {
    val __obj = js.Dynamic.literal()
    if (connectionCallback != null) __obj.updateDynamic("connectionCallback")(connectionCallback)
    if (connectionParams != null) __obj.updateDynamic("connectionParams")(connectionParams.asInstanceOf[js.Any])
    if (inactivityTimeout != null) __obj.updateDynamic("inactivityTimeout")(inactivityTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(`lazy`)) __obj.updateDynamic("lazy")(`lazy`)
    if (!js.isUndefined(reconnect)) __obj.updateDynamic("reconnect")(reconnect)
    if (reconnectionAttempts != null) __obj.updateDynamic("reconnectionAttempts")(reconnectionAttempts.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientOptions]
  }
}

