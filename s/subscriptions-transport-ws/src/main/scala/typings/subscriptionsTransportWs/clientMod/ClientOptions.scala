package typings.subscriptionsTransportWs.clientMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientOptions extends js.Object {
  var connectionCallback: js.UndefOr[js.Function2[/* error */ js.Array[Error], /* result */ js.UndefOr[js.Any], Unit]] = js.undefined
  var connectionParams: js.UndefOr[ConnectionParamsOptions] = js.undefined
  var inactivityTimeout: js.UndefOr[Double] = js.undefined
  var `lazy`: js.UndefOr[Boolean] = js.undefined
  var reconnect: js.UndefOr[Boolean] = js.undefined
  var reconnectionAttempts: js.UndefOr[Double] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object ClientOptions {
  @scala.inline
  def apply(
    connectionCallback: (/* error */ js.Array[Error], /* result */ js.UndefOr[js.Any]) => Unit = null,
    connectionParams: ConnectionParamsOptions = null,
    inactivityTimeout: js.UndefOr[Double] = js.undefined,
    `lazy`: js.UndefOr[Boolean] = js.undefined,
    reconnect: js.UndefOr[Boolean] = js.undefined,
    reconnectionAttempts: js.UndefOr[Double] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined
  ): ClientOptions = {
    val __obj = js.Dynamic.literal()
    if (connectionCallback != null) __obj.updateDynamic("connectionCallback")(js.Any.fromFunction2(connectionCallback))
    if (connectionParams != null) __obj.updateDynamic("connectionParams")(connectionParams.asInstanceOf[js.Any])
    if (!js.isUndefined(inactivityTimeout)) __obj.updateDynamic("inactivityTimeout")(inactivityTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`lazy`)) __obj.updateDynamic("lazy")(`lazy`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reconnect)) __obj.updateDynamic("reconnect")(reconnect.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reconnectionAttempts)) __obj.updateDynamic("reconnectionAttempts")(reconnectionAttempts.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientOptions]
  }
}

