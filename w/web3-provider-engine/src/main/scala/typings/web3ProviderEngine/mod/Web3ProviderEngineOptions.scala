package typings.web3ProviderEngine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Web3ProviderEngineOptions extends js.Object {
  var blockTracker: js.UndefOr[js.Any] = js.undefined
  var blockTrackerProvider: js.UndefOr[js.Any] = js.undefined
  var pollingInterval: js.UndefOr[Double] = js.undefined
}

object Web3ProviderEngineOptions {
  @scala.inline
  def apply(
    blockTracker: js.Any = null,
    blockTrackerProvider: js.Any = null,
    pollingInterval: js.UndefOr[Double] = js.undefined
  ): Web3ProviderEngineOptions = {
    val __obj = js.Dynamic.literal()
    if (blockTracker != null) __obj.updateDynamic("blockTracker")(blockTracker.asInstanceOf[js.Any])
    if (blockTrackerProvider != null) __obj.updateDynamic("blockTrackerProvider")(blockTrackerProvider.asInstanceOf[js.Any])
    if (!js.isUndefined(pollingInterval)) __obj.updateDynamic("pollingInterval")(pollingInterval.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Web3ProviderEngineOptions]
  }
}

