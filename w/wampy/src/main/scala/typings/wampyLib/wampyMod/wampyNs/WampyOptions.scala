package typings
package wampyLib.wampyMod.wampyNs

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

