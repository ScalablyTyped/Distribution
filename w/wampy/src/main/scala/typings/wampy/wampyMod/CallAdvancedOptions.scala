package typings.wampy.wampyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallAdvancedOptions extends js.Object {
  var disclose_me: js.UndefOr[Boolean] = js.undefined
  var receive_progress: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object CallAdvancedOptions {
  @scala.inline
  def apply(
    disclose_me: js.UndefOr[Boolean] = js.undefined,
    receive_progress: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null
  ): CallAdvancedOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disclose_me)) __obj.updateDynamic("disclose_me")(disclose_me.asInstanceOf[js.Any])
    if (!js.isUndefined(receive_progress)) __obj.updateDynamic("receive_progress")(receive_progress.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallAdvancedOptions]
  }
}

