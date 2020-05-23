package typings.telebot.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Interval extends js.Object {
  // Optional. Use polling.
  var interval: js.UndefOr[Double] = js.undefined
   // Optional. Update polling timeout (0 - short polling).
  var limit: js.UndefOr[Double] = js.undefined
   // Optional. Reconnecting timeout (in ms).
  var proxy: js.UndefOr[String] = js.undefined
   // Optional. Limits the number of updates to be retrieved.
  var retryTimeout: js.UndefOr[Double] = js.undefined
   // Optional. How often check updates (in ms).
  var timeout: js.UndefOr[Double] = js.undefined
}

object Interval {
  @scala.inline
  def apply(
    interval: js.UndefOr[Double] = js.undefined,
    limit: js.UndefOr[Double] = js.undefined,
    proxy: String = null,
    retryTimeout: js.UndefOr[Double] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined
  ): Interval = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(interval)) __obj.updateDynamic("interval")(interval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (!js.isUndefined(retryTimeout)) __obj.updateDynamic("retryTimeout")(retryTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Interval]
  }
}

