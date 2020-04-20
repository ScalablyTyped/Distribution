package typings.tabris

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloseEventInit extends EventInit {
  var code: js.UndefOr[Double] = js.undefined
  var reason: js.UndefOr[String] = js.undefined
  var wasClean: js.UndefOr[Boolean] = js.undefined
}

object CloseEventInit {
  @scala.inline
  def apply(
    bubbles: js.UndefOr[Boolean] = js.undefined,
    cancelable: js.UndefOr[Boolean] = js.undefined,
    code: Int | Double = null,
    reason: String = null,
    wasClean: js.UndefOr[Boolean] = js.undefined
  ): CloseEventInit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (!js.isUndefined(wasClean)) __obj.updateDynamic("wasClean")(wasClean.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloseEventInit]
  }
}

