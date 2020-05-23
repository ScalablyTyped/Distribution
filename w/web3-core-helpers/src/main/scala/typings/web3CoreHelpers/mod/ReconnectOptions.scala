package typings.web3CoreHelpers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReconnectOptions extends js.Object {
  var auto: js.UndefOr[Boolean] = js.undefined
  var delay: js.UndefOr[Double] = js.undefined
  var maxAttempts: js.UndefOr[Double] = js.undefined
  var onTimeout: js.UndefOr[Boolean] = js.undefined
}

object ReconnectOptions {
  @scala.inline
  def apply(
    auto: js.UndefOr[Boolean] = js.undefined,
    delay: js.UndefOr[Double] = js.undefined,
    maxAttempts: js.UndefOr[Double] = js.undefined,
    onTimeout: js.UndefOr[Boolean] = js.undefined
  ): ReconnectOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(auto)) __obj.updateDynamic("auto")(auto.get.asInstanceOf[js.Any])
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxAttempts)) __obj.updateDynamic("maxAttempts")(maxAttempts.get.asInstanceOf[js.Any])
    if (!js.isUndefined(onTimeout)) __obj.updateDynamic("onTimeout")(onTimeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReconnectOptions]
  }
}

