package typings
package stripeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Monthlyanchor extends js.Object {
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

