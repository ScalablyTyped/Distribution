package typings.synaptic.mod.Trainer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DSROptions extends js.Object {
  var cost: js.UndefOr[CostFunction] = js.native
  var distractors: js.UndefOr[js.Array[Double]] = js.native
  var iterations: js.UndefOr[Double] = js.native
  var length: js.UndefOr[Double] = js.native
  var log: js.UndefOr[Double] = js.native
  var prompts: js.UndefOr[js.Array[Double]] = js.native
  var rate: js.UndefOr[Double] = js.native
  var schedule: js.UndefOr[TrainingScheduleOptions] = js.native
  var success: js.UndefOr[Double] = js.native
  var targets: js.UndefOr[js.Array[Double]] = js.native
}

object DSROptions {
  @scala.inline
  def apply(): DSROptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DSROptions]
  }
  @scala.inline
  implicit class DSROptionsOps[Self <: DSROptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCost(value: (/* targetValues */ js.Array[Double], /* outputValues */ js.Array[Double]) => Double): Self = this.set("cost", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCost: Self = this.set("cost", js.undefined)
    @scala.inline
    def setDistractorsVarargs(value: Double*): Self = this.set("distractors", js.Array(value :_*))
    @scala.inline
    def setDistractors(value: js.Array[Double]): Self = this.set("distractors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDistractors: Self = this.set("distractors", js.undefined)
    @scala.inline
    def setIterations(value: Double): Self = this.set("iterations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIterations: Self = this.set("iterations", js.undefined)
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    @scala.inline
    def setLog(value: Double): Self = this.set("log", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLog: Self = this.set("log", js.undefined)
    @scala.inline
    def setPromptsVarargs(value: Double*): Self = this.set("prompts", js.Array(value :_*))
    @scala.inline
    def setPrompts(value: js.Array[Double]): Self = this.set("prompts", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrompts: Self = this.set("prompts", js.undefined)
    @scala.inline
    def setRate(value: Double): Self = this.set("rate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRate: Self = this.set("rate", js.undefined)
    @scala.inline
    def setSchedule(value: TrainingScheduleOptions): Self = this.set("schedule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchedule: Self = this.set("schedule", js.undefined)
    @scala.inline
    def setSuccess(value: Double): Self = this.set("success", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    @scala.inline
    def setTargetsVarargs(value: Double*): Self = this.set("targets", js.Array(value :_*))
    @scala.inline
    def setTargets(value: js.Array[Double]): Self = this.set("targets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargets: Self = this.set("targets", js.undefined)
  }
  
}

