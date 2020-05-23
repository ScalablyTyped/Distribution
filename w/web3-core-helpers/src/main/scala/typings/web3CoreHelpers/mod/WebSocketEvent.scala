package typings.web3CoreHelpers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebSocketEvent extends js.Object {
  var code: js.UndefOr[Double] = js.undefined
  var reason: js.UndefOr[String] = js.undefined
}

object WebSocketEvent {
  @scala.inline
  def apply(code: js.UndefOr[Double] = js.undefined, reason: String = null): WebSocketEvent = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(code)) __obj.updateDynamic("code")(code.get.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebSocketEvent]
  }
}

