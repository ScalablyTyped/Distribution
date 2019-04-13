package typings
package wampyLib.wampyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublishAdvancedOptions extends AdvancedOptions {
  var eligible_authid: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var eligible_authrole: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var exclude_authid: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var exclude_authrole: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
}

object PublishAdvancedOptions {
  @scala.inline
  def apply(
    disclose_me: js.UndefOr[scala.Boolean] = js.undefined,
    eligible: scala.Double | js.Array[scala.Double] = null,
    eligible_authid: java.lang.String | js.Array[java.lang.String] = null,
    eligible_authrole: java.lang.String | js.Array[java.lang.String] = null,
    exclude: scala.Double | js.Array[scala.Double] = null,
    exclude_authid: java.lang.String | js.Array[java.lang.String] = null,
    exclude_authrole: java.lang.String | js.Array[java.lang.String] = null,
    exclude_me: js.UndefOr[scala.Boolean] = js.undefined
  ): PublishAdvancedOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disclose_me)) __obj.updateDynamic("disclose_me")(disclose_me)
    if (eligible != null) __obj.updateDynamic("eligible")(eligible.asInstanceOf[js.Any])
    if (eligible_authid != null) __obj.updateDynamic("eligible_authid")(eligible_authid.asInstanceOf[js.Any])
    if (eligible_authrole != null) __obj.updateDynamic("eligible_authrole")(eligible_authrole.asInstanceOf[js.Any])
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (exclude_authid != null) __obj.updateDynamic("exclude_authid")(exclude_authid.asInstanceOf[js.Any])
    if (exclude_authrole != null) __obj.updateDynamic("exclude_authrole")(exclude_authrole.asInstanceOf[js.Any])
    if (!js.isUndefined(exclude_me)) __obj.updateDynamic("exclude_me")(exclude_me)
    __obj.asInstanceOf[PublishAdvancedOptions]
  }
}

