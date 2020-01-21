package typings.wampy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdvancedOptions extends js.Object {
  var disclose_me: js.UndefOr[Boolean] = js.undefined
  var eligible: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var exclude: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var exclude_me: js.UndefOr[Boolean] = js.undefined
}

object AdvancedOptions {
  @scala.inline
  def apply(
    disclose_me: js.UndefOr[Boolean] = js.undefined,
    eligible: Double | js.Array[Double] = null,
    exclude: Double | js.Array[Double] = null,
    exclude_me: js.UndefOr[Boolean] = js.undefined
  ): AdvancedOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disclose_me)) __obj.updateDynamic("disclose_me")(disclose_me.asInstanceOf[js.Any])
    if (eligible != null) __obj.updateDynamic("eligible")(eligible.asInstanceOf[js.Any])
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (!js.isUndefined(exclude_me)) __obj.updateDynamic("exclude_me")(exclude_me.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdvancedOptions]
  }
}

