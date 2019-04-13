package typings
package wampyLib.wampyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WampyOptions extends js.Object {
  var authid: js.UndefOr[java.lang.String] = js.undefined
  var authmethods: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var autoReconnect: js.UndefOr[scala.Boolean] = js.undefined
  var helloCustomDetails: js.UndefOr[js.Any] = js.undefined
  var maxRetries: js.UndefOr[scala.Double] = js.undefined
  var onChallenge: js.UndefOr[ChallengeCallback] = js.undefined
  var onClose: js.UndefOr[Callback] = js.undefined
  var onConnect: js.UndefOr[Callback] = js.undefined
  var onError: js.UndefOr[Callback] = js.undefined
  var onReconnect: js.UndefOr[Callback] = js.undefined
  var onReconnectSuccess: js.UndefOr[Callback] = js.undefined
  var realm: js.UndefOr[java.lang.String] = js.undefined
  var reconnectInterval: js.UndefOr[scala.Double] = js.undefined
  var serializer: js.UndefOr[js.Any] = js.undefined
  var ws: js.UndefOr[js.Any] = js.undefined
}

object WampyOptions {
  @scala.inline
  def apply(
    authid: java.lang.String = null,
    authmethods: js.Array[java.lang.String] = null,
    autoReconnect: js.UndefOr[scala.Boolean] = js.undefined,
    helloCustomDetails: js.Any = null,
    maxRetries: scala.Int | scala.Double = null,
    onChallenge: ChallengeCallback = null,
    onClose: Callback = null,
    onConnect: Callback = null,
    onError: Callback = null,
    onReconnect: Callback = null,
    onReconnectSuccess: Callback = null,
    realm: java.lang.String = null,
    reconnectInterval: scala.Int | scala.Double = null,
    serializer: js.Any = null,
    ws: js.Any = null
  ): WampyOptions = {
    val __obj = js.Dynamic.literal()
    if (authid != null) __obj.updateDynamic("authid")(authid)
    if (authmethods != null) __obj.updateDynamic("authmethods")(authmethods)
    if (!js.isUndefined(autoReconnect)) __obj.updateDynamic("autoReconnect")(autoReconnect)
    if (helloCustomDetails != null) __obj.updateDynamic("helloCustomDetails")(helloCustomDetails)
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (onChallenge != null) __obj.updateDynamic("onChallenge")(onChallenge)
    if (onClose != null) __obj.updateDynamic("onClose")(onClose)
    if (onConnect != null) __obj.updateDynamic("onConnect")(onConnect)
    if (onError != null) __obj.updateDynamic("onError")(onError)
    if (onReconnect != null) __obj.updateDynamic("onReconnect")(onReconnect)
    if (onReconnectSuccess != null) __obj.updateDynamic("onReconnectSuccess")(onReconnectSuccess)
    if (realm != null) __obj.updateDynamic("realm")(realm)
    if (reconnectInterval != null) __obj.updateDynamic("reconnectInterval")(reconnectInterval.asInstanceOf[js.Any])
    if (serializer != null) __obj.updateDynamic("serializer")(serializer)
    if (ws != null) __obj.updateDynamic("ws")(ws)
    __obj.asInstanceOf[WampyOptions]
  }
}

