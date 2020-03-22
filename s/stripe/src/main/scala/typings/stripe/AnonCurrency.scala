package typings.stripe

import typings.stripe.stripeStrings.email
import typings.stripe.stripeStrings.manual
import typings.stripe.stripeStrings.none
import typings.stripe.stripeStrings.one_time
import typings.stripe.stripeStrings.scheduled
import typings.stripe.stripeStrings.variable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCurrency extends js.Object {
  var acceptance: js.UndefOr[AnonOnline] = js.undefined
  var amount: js.UndefOr[Double | Null] = js.undefined
  var currency: js.UndefOr[String] = js.undefined
  var interval: js.UndefOr[one_time | scheduled | variable] = js.undefined
  var notification_method: js.UndefOr[email | manual | none] = js.undefined
}

object AnonCurrency {
  @scala.inline
  def apply(
    acceptance: AnonOnline = null,
    amount: Int | Double = null,
    currency: String = null,
    interval: one_time | scheduled | variable = null,
    notification_method: email | manual | none = null
  ): AnonCurrency = {
    val __obj = js.Dynamic.literal()
    if (acceptance != null) __obj.updateDynamic("acceptance")(acceptance.asInstanceOf[js.Any])
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    if (currency != null) __obj.updateDynamic("currency")(currency.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (notification_method != null) __obj.updateDynamic("notification_method")(notification_method.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCurrency]
  }
}

