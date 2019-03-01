package typings
package stripeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Daily extends js.Object {
  /**
    * The number of days charges for the account will be held before being
    * paid out. May also be the string “minimum” for the lowest available
    * value (based on country). Default is “minimum”. Does not apply when
    * interval is “manual”.
    */
  var delay_days: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * How frequently funds will be paid out. One of "manual" (for only
    * triggered via API call), "daily", "weekly", or "monthly". Default is "daily".
    */
  var interval: js.UndefOr[
    stripeLib.stripeLibStrings.manual | stripeLib.stripeLibStrings.daily | stripeLib.stripeLibStrings.weekly | stripeLib.stripeLibStrings.monthly
  ] = js.undefined
  /**
    * The day of the month funds will be paid out. Required and available
    * only if interval is "monthly".
    */
  var monthly_anchor: js.UndefOr[scala.Double] = js.undefined
  /**
    * The day of the week funds will be paid out, of the style ‘monday’,
    * ‘tuesday’, etc. Required and available only if interval is weekly.
    */
  var weekly_anchor: js.UndefOr[
    stripeLib.stripeLibStrings.monday | stripeLib.stripeLibStrings.tuesday | stripeLib.stripeLibStrings.wednesday | stripeLib.stripeLibStrings.thursday | stripeLib.stripeLibStrings.friday | stripeLib.stripeLibStrings.saturday | stripeLib.stripeLibStrings.sunday
  ] = js.undefined
}

object Anon_Daily {
  @scala.inline
  def apply(
    delay_days: scala.Double | java.lang.String = null,
    interval: stripeLib.stripeLibStrings.manual | stripeLib.stripeLibStrings.daily | stripeLib.stripeLibStrings.weekly | stripeLib.stripeLibStrings.monthly = null,
    monthly_anchor: scala.Int | scala.Double = null,
    weekly_anchor: stripeLib.stripeLibStrings.monday | stripeLib.stripeLibStrings.tuesday | stripeLib.stripeLibStrings.wednesday | stripeLib.stripeLibStrings.thursday | stripeLib.stripeLibStrings.friday | stripeLib.stripeLibStrings.saturday | stripeLib.stripeLibStrings.sunday = null
  ): Anon_Daily = {
    val __obj = js.Dynamic.literal()
    if (delay_days != null) __obj.updateDynamic("delay_days")(delay_days.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (monthly_anchor != null) __obj.updateDynamic("monthly_anchor")(monthly_anchor.asInstanceOf[js.Any])
    if (weekly_anchor != null) __obj.updateDynamic("weekly_anchor")(weekly_anchor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Daily]
  }
}

