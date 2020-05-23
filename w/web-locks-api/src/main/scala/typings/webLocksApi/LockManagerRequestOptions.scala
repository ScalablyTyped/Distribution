package typings.webLocksApi

import typings.std.AbortSignal
import typings.webLocksApi.webLocksApiStrings.exclusive
import typings.webLocksApi.webLocksApiStrings.shared
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LockManagerRequestOptions extends js.Object {
  var ifAvailable: js.UndefOr[Boolean] = js.undefined
  var mode: js.UndefOr[exclusive | shared] = js.undefined
  var signal: js.UndefOr[AbortSignal] = js.undefined
  var steal: js.UndefOr[Boolean] = js.undefined
}

object LockManagerRequestOptions {
  @scala.inline
  def apply(
    ifAvailable: js.UndefOr[Boolean] = js.undefined,
    mode: exclusive | shared = null,
    signal: AbortSignal = null,
    steal: js.UndefOr[Boolean] = js.undefined
  ): LockManagerRequestOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ifAvailable)) __obj.updateDynamic("ifAvailable")(ifAvailable.get.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (signal != null) __obj.updateDynamic("signal")(signal.asInstanceOf[js.Any])
    if (!js.isUndefined(steal)) __obj.updateDynamic("steal")(steal.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LockManagerRequestOptions]
  }
}

