package typings.wampy.wampyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublishAdvancedOptions extends AdvancedOptions {
  var eligible_authid: js.UndefOr[String | js.Array[String]] = js.undefined
  var eligible_authrole: js.UndefOr[String | js.Array[String]] = js.undefined
  var exclude_authid: js.UndefOr[String | js.Array[String]] = js.undefined
  var exclude_authrole: js.UndefOr[String | js.Array[String]] = js.undefined
}

object PublishAdvancedOptions {
  @scala.inline
  def apply(
    disclose_me: js.UndefOr[Boolean] = js.undefined,
    eligible: Double | js.Array[Double] = null,
    eligible_authid: String | js.Array[String] = null,
    eligible_authrole: String | js.Array[String] = null,
    exclude: Double | js.Array[Double] = null,
    exclude_authid: String | js.Array[String] = null,
    exclude_authrole: String | js.Array[String] = null,
    exclude_me: js.UndefOr[Boolean] = js.undefined
  ): PublishAdvancedOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disclose_me)) __obj.updateDynamic("disclose_me")(disclose_me.asInstanceOf[js.Any])
    if (eligible != null) __obj.updateDynamic("eligible")(eligible.asInstanceOf[js.Any])
    if (eligible_authid != null) __obj.updateDynamic("eligible_authid")(eligible_authid.asInstanceOf[js.Any])
    if (eligible_authrole != null) __obj.updateDynamic("eligible_authrole")(eligible_authrole.asInstanceOf[js.Any])
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (exclude_authid != null) __obj.updateDynamic("exclude_authid")(exclude_authid.asInstanceOf[js.Any])
    if (exclude_authrole != null) __obj.updateDynamic("exclude_authrole")(exclude_authrole.asInstanceOf[js.Any])
    if (!js.isUndefined(exclude_me)) __obj.updateDynamic("exclude_me")(exclude_me.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishAdvancedOptions]
  }
}

