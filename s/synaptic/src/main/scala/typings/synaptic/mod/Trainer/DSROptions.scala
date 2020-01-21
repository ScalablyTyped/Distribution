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
    iterations: Int | Double = null,
    length: Int | Double = null,
    log: Int | Double = null,
    prompts: js.Array[Double] = null,
    rate: Int | Double = null,
    schedule: TrainingScheduleOptions = null,
    success: Int | Double = null,
    targets: js.Array[Double] = null
  ): DSROptions = {
    val __obj = js.Dynamic.literal()
    if (cost != null) __obj.updateDynamic("cost")(js.Any.fromFunction2(cost))
    if (distractors != null) __obj.updateDynamic("distractors")(distractors.asInstanceOf[js.Any])
    if (iterations != null) __obj.updateDynamic("iterations")(iterations.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (log != null) __obj.updateDynamic("log")(log.asInstanceOf[js.Any])
    if (prompts != null) __obj.updateDynamic("prompts")(prompts.asInstanceOf[js.Any])
    if (rate != null) __obj.updateDynamic("rate")(rate.asInstanceOf[js.Any])
    if (schedule != null) __obj.updateDynamic("schedule")(schedule.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(success.asInstanceOf[js.Any])
    if (targets != null) __obj.updateDynamic("targets")(targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[DSROptions]
  }
}

