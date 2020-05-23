package typings.synaptic.mod.Trainer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DSROptions extends js.Object {
  var cost: js.UndefOr[CostFunction] = js.undefined
  var distractors: js.UndefOr[js.Array[Double]] = js.undefined
  var iterations: js.UndefOr[Double] = js.undefined
  var length: js.UndefOr[Double] = js.undefined
  var log: js.UndefOr[Double] = js.undefined
  var prompts: js.UndefOr[js.Array[Double]] = js.undefined
  var rate: js.UndefOr[Double] = js.undefined
  var schedule: js.UndefOr[TrainingScheduleOptions] = js.undefined
  var success: js.UndefOr[Double] = js.undefined
  var targets: js.UndefOr[js.Array[Double]] = js.undefined
}

object DSROptions {
  @scala.inline
  def apply(
    cost: (/* targetValues */ js.Array[Double], /* outputValues */ js.Array[Double]) => Double = null,
    distractors: js.Array[Double] = null,
    iterations: js.UndefOr[Double] = js.undefined,
    length: js.UndefOr[Double] = js.undefined,
    log: js.UndefOr[Double] = js.undefined,
    prompts: js.Array[Double] = null,
    rate: js.UndefOr[Double] = js.undefined,
    schedule: TrainingScheduleOptions = null,
    success: js.UndefOr[Double] = js.undefined,
    targets: js.Array[Double] = null
  ): DSROptions = {
    val __obj = js.Dynamic.literal()
    if (cost != null) __obj.updateDynamic("cost")(js.Any.fromFunction2(cost))
    if (distractors != null) __obj.updateDynamic("distractors")(distractors.asInstanceOf[js.Any])
    if (!js.isUndefined(iterations)) __obj.updateDynamic("iterations")(iterations.get.asInstanceOf[js.Any])
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.get.asInstanceOf[js.Any])
    if (!js.isUndefined(log)) __obj.updateDynamic("log")(log.get.asInstanceOf[js.Any])
    if (prompts != null) __obj.updateDynamic("prompts")(prompts.asInstanceOf[js.Any])
    if (!js.isUndefined(rate)) __obj.updateDynamic("rate")(rate.get.asInstanceOf[js.Any])
    if (schedule != null) __obj.updateDynamic("schedule")(schedule.asInstanceOf[js.Any])
    if (!js.isUndefined(success)) __obj.updateDynamic("success")(success.get.asInstanceOf[js.Any])
    if (targets != null) __obj.updateDynamic("targets")(targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[DSROptions]
  }
}

