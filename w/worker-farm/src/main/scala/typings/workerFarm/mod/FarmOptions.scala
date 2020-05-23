package typings.workerFarm.mod

import typings.node.childProcessMod.ForkOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FarmOptions extends js.Object {
  var autoStart: js.UndefOr[Boolean] = js.undefined
  var maxCallTime: js.UndefOr[Double] = js.undefined
  var maxCallsPerWorker: js.UndefOr[Double] = js.undefined
  var maxConcurrentCalls: js.UndefOr[Double] = js.undefined
  var maxConcurrentCallsPerWorker: js.UndefOr[Double] = js.undefined
  var maxConcurrentWorkers: js.UndefOr[Double] = js.undefined
  var maxRetries: js.UndefOr[Double] = js.undefined
  var workerOptions: js.UndefOr[ForkOptions] = js.undefined
}

object FarmOptions {
  @scala.inline
  def apply(
    autoStart: js.UndefOr[Boolean] = js.undefined,
    maxCallTime: js.UndefOr[Double] = js.undefined,
    maxCallsPerWorker: js.UndefOr[Double] = js.undefined,
    maxConcurrentCalls: js.UndefOr[Double] = js.undefined,
    maxConcurrentCallsPerWorker: js.UndefOr[Double] = js.undefined,
    maxConcurrentWorkers: js.UndefOr[Double] = js.undefined,
    maxRetries: js.UndefOr[Double] = js.undefined,
    workerOptions: ForkOptions = null
  ): FarmOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoStart)) __obj.updateDynamic("autoStart")(autoStart.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxCallTime)) __obj.updateDynamic("maxCallTime")(maxCallTime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxCallsPerWorker)) __obj.updateDynamic("maxCallsPerWorker")(maxCallsPerWorker.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxConcurrentCalls)) __obj.updateDynamic("maxConcurrentCalls")(maxConcurrentCalls.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxConcurrentCallsPerWorker)) __obj.updateDynamic("maxConcurrentCallsPerWorker")(maxConcurrentCallsPerWorker.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxConcurrentWorkers)) __obj.updateDynamic("maxConcurrentWorkers")(maxConcurrentWorkers.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRetries)) __obj.updateDynamic("maxRetries")(maxRetries.get.asInstanceOf[js.Any])
    if (workerOptions != null) __obj.updateDynamic("workerOptions")(workerOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[FarmOptions]
  }
}

