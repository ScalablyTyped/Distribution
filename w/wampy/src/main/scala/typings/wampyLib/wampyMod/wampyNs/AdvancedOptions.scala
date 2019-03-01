package typings
package wampyLib.wampyMod.wampyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdvancedOptions extends js.Object {
  var disclose_me: js.UndefOr[scala.Boolean] = js.undefined
  var eligible: js.UndefOr[scala.Double | js.Array[scala.Double]] = js.undefined
  var exclude: js.UndefOr[scala.Double | js.Array[scala.Double]] = js.undefined
  var exclude_me: js.UndefOr[scala.Boolean] = js.undefined
}

object AdvancedOptions {
  @scala.inline
  def apply(
    disclose_me: js.UndefOr[scala.Boolean] = js.undefined,
    eligible: scala.Double | js.Array[scala.Double] = null,
    exclude: scala.Double | js.Array[scala.Double] = null,
    exclude_me: js.UndefOr[scala.Boolean] = js.undefined
  ): AdvancedOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disclose_me)) __obj.updateDynamic("disclose_me")(disclose_me)
    if (eligible != null) __obj.updateDynamic("eligible")(eligible.asInstanceOf[js.Any])
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (!js.isUndefined(exclude_me)) __obj.updateDynamic("exclude_me")(exclude_me)
    __obj.asInstanceOf[AdvancedOptions]
  }
}

