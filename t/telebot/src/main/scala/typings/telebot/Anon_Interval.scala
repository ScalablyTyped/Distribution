package typings.telebot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Interval extends js.Object {
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

object Anon_Interval {
  @scala.inline
  def apply(
    interval: Int | Double = null,
    limit: Int | Double = null,
    proxy: String = null,
    retryTimeout: Int | Double = null,
    timeout: Int | Double = null
  ): Anon_Interval = {
    val __obj = js.Dynamic.literal()
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (retryTimeout != null) __obj.updateDynamic("retryTimeout")(retryTimeout.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Interval]
  }
}

