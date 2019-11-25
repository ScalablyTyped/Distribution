package typings.subscriptionsDashTransportDashWs.distClientMod

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
    inactivityTimeout: Int | Double = null,
    `lazy`: js.UndefOr[Boolean] = js.undefined,
    reconnect: js.UndefOr[Boolean] = js.undefined,
    reconnectionAttempts: Int | Double = null,
    timeout: Int | Double = null
  ): ClientOptions = {
    val __obj = js.Dynamic.literal()
    if (connectionCallback != null) __obj.updateDynamic("connectionCallback")(js.Any.fromFunction2(connectionCallback))
    if (connectionParams != null) __obj.updateDynamic("connectionParams")(connectionParams.asInstanceOf[js.Any])
    if (inactivityTimeout != null) __obj.updateDynamic("inactivityTimeout")(inactivityTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(`lazy`)) __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
    if (!js.isUndefined(reconnect)) __obj.updateDynamic("reconnect")(reconnect.asInstanceOf[js.Any])
    if (reconnectionAttempts != null) __obj.updateDynamic("reconnectionAttempts")(reconnectionAttempts.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientOptions]
  }
}

