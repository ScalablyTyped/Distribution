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
    maxCallTime: Int | Double = null,
    maxCallsPerWorker: Int | Double = null,
    maxConcurrentCalls: Int | Double = null,
    maxConcurrentCallsPerWorker: Int | Double = null,
    maxConcurrentWorkers: Int | Double = null,
    maxRetries: Int | Double = null,
    workerOptions: ForkOptions = null
  ): FarmOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoStart)) __obj.updateDynamic("autoStart")(autoStart.asInstanceOf[js.Any])
    if (maxCallTime != null) __obj.updateDynamic("maxCallTime")(maxCallTime.asInstanceOf[js.Any])
    if (maxCallsPerWorker != null) __obj.updateDynamic("maxCallsPerWorker")(maxCallsPerWorker.asInstanceOf[js.Any])
    if (maxConcurrentCalls != null) __obj.updateDynamic("maxConcurrentCalls")(maxConcurrentCalls.asInstanceOf[js.Any])
    if (maxConcurrentCallsPerWorker != null) __obj.updateDynamic("maxConcurrentCallsPerWorker")(maxConcurrentCallsPerWorker.asInstanceOf[js.Any])
    if (maxConcurrentWorkers != null) __obj.updateDynamic("maxConcurrentWorkers")(maxConcurrentWorkers.asInstanceOf[js.Any])
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (workerOptions != null) __obj.updateDynamic("workerOptions")(workerOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[FarmOptions]
  }
}

