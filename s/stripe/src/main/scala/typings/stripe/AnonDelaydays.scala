package typings.stripe

import typings.stripe.stripeStrings.daily
import typings.stripe.stripeStrings.friday
import typings.stripe.stripeStrings.manual
import typings.stripe.stripeStrings.monday
import typings.stripe.stripeStrings.monthly
import typings.stripe.stripeStrings.saturday
import typings.stripe.stripeStrings.sunday
import typings.stripe.stripeStrings.thursday
import typings.stripe.stripeStrings.tuesday
import typings.stripe.stripeStrings.wednesday
import typings.stripe.stripeStrings.weekly
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDelaydays extends js.Object {
  /**
    * The number of days charges for the account will be held before being paid out.
    * May also be the string “minimum” for the lowest available value (based on
    * country). Default is “minimum”. Does not apply when interval is “manual”.
    */
  var delay_days: js.UndefOr[Double | String] = js.undefined
  /**
    * How frequently funds will be paid out. One of "manual" (for only triggered
    * via API call), "daily", "weekly", or "monthly". Default is "daily".
    */
  var interval: js.UndefOr[manual | daily | weekly | monthly] = js.undefined
  /**
    * The day of the month funds will be paid out. Required and available only if
    * interval is "monthly".
    */
  var monthly_anchor: js.UndefOr[Double] = js.undefined
  /**
    * The day of the week funds will be paid out, of the style ‘monday’,
    * ‘tuesday’, etc. Required and available only if interval is weekly.
    */
  var weekly_anchor: js.UndefOr[monday | tuesday | wednesday | thursday | friday | saturday | sunday] = js.undefined
}

object AnonDelaydays {
  @scala.inline
  def apply(
    delay_days: Double | String = null,
    interval: manual | daily | weekly | monthly = null,
    monthly_anchor: Int | Double = null,
    weekly_anchor: monday | tuesday | wednesday | thursday | friday | saturday | sunday = null
  ): AnonDelaydays = {
    val __obj = js.Dynamic.literal()
    if (delay_days != null) __obj.updateDynamic("delay_days")(delay_days.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (monthly_anchor != null) __obj.updateDynamic("monthly_anchor")(monthly_anchor.asInstanceOf[js.Any])
    if (weekly_anchor != null) __obj.updateDynamic("weekly_anchor")(weekly_anchor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDelaydays]
  }
}

