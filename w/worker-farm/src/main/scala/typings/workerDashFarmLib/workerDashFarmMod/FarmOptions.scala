package typings
package workerDashFarmLib.workerDashFarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FarmOptions extends js.Object {
  var autoStart: js.UndefOr[scala.Boolean] = js.undefined
  var maxCallTime: js.UndefOr[scala.Double] = js.undefined
  var maxCallsPerWorker: js.UndefOr[scala.Double] = js.undefined
  var maxConcurrentCalls: js.UndefOr[scala.Double] = js.undefined
  var maxConcurrentCallsPerWorker: js.UndefOr[scala.Double] = js.undefined
  var maxConcurrentWorkers: js.UndefOr[scala.Double] = js.undefined
  var maxRetries: js.UndefOr[scala.Double] = js.undefined
  var workerOptions: js.UndefOr[nodeLib.childUnderscoreProcessMod.ForkOptions] = js.undefined
}

object FarmOptions {
  @scala.inline
  def apply(
    autoStart: js.UndefOr[scala.Boolean] = js.undefined,
    maxCallTime: scala.Int | scala.Double = null,
    maxCallsPerWorker: scala.Int | scala.Double = null,
    maxConcurrentCalls: scala.Int | scala.Double = null,
    maxConcurrentCallsPerWorker: scala.Int | scala.Double = null,
    maxConcurrentWorkers: scala.Int | scala.Double = null,
    maxRetries: scala.Int | scala.Double = null,
    workerOptions: nodeLib.childUnderscoreProcessMod.ForkOptions = null
  ): FarmOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoStart)) __obj.updateDynamic("autoStart")(autoStart)
    if (maxCallTime != null) __obj.updateDynamic("maxCallTime")(maxCallTime.asInstanceOf[js.Any])
    if (maxCallsPerWorker != null) __obj.updateDynamic("maxCallsPerWorker")(maxCallsPerWorker.asInstanceOf[js.Any])
    if (maxConcurrentCalls != null) __obj.updateDynamic("maxConcurrentCalls")(maxConcurrentCalls.asInstanceOf[js.Any])
    if (maxConcurrentCallsPerWorker != null) __obj.updateDynamic("maxConcurrentCallsPerWorker")(maxConcurrentCallsPerWorker.asInstanceOf[js.Any])
    if (maxConcurrentWorkers != null) __obj.updateDynamic("maxConcurrentWorkers")(maxConcurrentWorkers.asInstanceOf[js.Any])
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (workerOptions != null) __obj.updateDynamic("workerOptions")(workerOptions)
    __obj.asInstanceOf[FarmOptions]
  }
}

