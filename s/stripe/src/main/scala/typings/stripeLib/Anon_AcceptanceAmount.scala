package typings
package stripeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AcceptanceAmount extends js.Object {
  var acceptance: js.UndefOr[Anon_AcceptedDate] = js.undefined
  var amount: js.UndefOr[scala.Double | scala.Null] = js.undefined
  var currency: js.UndefOr[java.lang.String] = js.undefined
  var interval: js.UndefOr[
    stripeLib.stripeLibStrings.one_time | stripeLib.stripeLibStrings.scheduled | stripeLib.stripeLibStrings.variable
  ] = js.undefined
  var notification_method: js.UndefOr[
    stripeLib.stripeLibStrings.email | stripeLib.stripeLibStrings.manual | stripeLib.stripeLibStrings.none
  ] = js.undefined
}

object Anon_AcceptanceAmount {
  @scala.inline
  def apply(
    acceptance: Anon_AcceptedDate = null,
    amount: scala.Int | scala.Double = null,
    currency: java.lang.String = null,
    interval: stripeLib.stripeLibStrings.one_time | stripeLib.stripeLibStrings.scheduled | stripeLib.stripeLibStrings.variable = null,
    notification_method: stripeLib.stripeLibStrings.email | stripeLib.stripeLibStrings.manual | stripeLib.stripeLibStrings.none = null
  ): Anon_AcceptanceAmount = {
    val __obj = js.Dynamic.literal()
    if (acceptance != null) __obj.updateDynamic("acceptance")(acceptance)
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    if (currency != null) __obj.updateDynamic("currency")(currency)
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (notification_method != null) __obj.updateDynamic("notification_method")(notification_method.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AcceptanceAmount]
  }
}

