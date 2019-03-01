package typings
package web3DashProviderDashEngineLib.web3DashProviderDashEngineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Web3ProviderEngineOptions extends js.Object {
  var blockTracker: js.UndefOr[js.Any] = js.undefined
  var blockTrackerProvider: js.UndefOr[js.Any] = js.undefined
  var pollingInterval: js.UndefOr[scala.Double] = js.undefined
}

object Web3ProviderEngineOptions {
  @scala.inline
  def apply(
    blockTracker: js.Any = null,
    blockTrackerProvider: js.Any = null,
    pollingInterval: scala.Int | scala.Double = null
  ): Web3ProviderEngineOptions = {
    val __obj = js.Dynamic.literal()
    if (blockTracker != null) __obj.updateDynamic("blockTracker")(blockTracker)
    if (blockTrackerProvider != null) __obj.updateDynamic("blockTrackerProvider")(blockTrackerProvider)
    if (pollingInterval != null) __obj.updateDynamic("pollingInterval")(pollingInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[Web3ProviderEngineOptions]
  }
}

