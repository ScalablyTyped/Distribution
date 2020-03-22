package typings.stripeV3.stripe

import typings.stripeV3.stripeV3Strings.email
import typings.stripeV3.stripeV3Strings.manual
import typings.stripeV3.stripeV3Strings.none
import typings.stripeV3.stripeV3Strings.one_time
import typings.stripeV3.stripeV3Strings.scheduled
import typings.stripeV3.stripeV3Strings.variable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceMandate extends js.Object {
  var acceptance: js.UndefOr[SourceMandateAcceptance] = js.undefined
  var amount: js.UndefOr[Double] = js.undefined
  var currency: js.UndefOr[String] = js.undefined
  var interval: js.UndefOr[one_time | scheduled | variable] = js.undefined
  var notification_method: js.UndefOr[email | manual | none] = js.undefined
}

object SourceMandate {
  @scala.inline
  def apply(
    acceptance: SourceMandateAcceptance = null,
    amount: Int | Double = null,
    currency: String = null,
    interval: one_time | scheduled | variable = null,
    notification_method: email | manual | none = null
  ): SourceMandate = {
    val __obj = js.Dynamic.literal()
    if (acceptance != null) __obj.updateDynamic("acceptance")(acceptance.asInstanceOf[js.Any])
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    if (currency != null) __obj.updateDynamic("currency")(currency.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (notification_method != null) __obj.updateDynamic("notification_method")(notification_method.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceMandate]
  }
}

