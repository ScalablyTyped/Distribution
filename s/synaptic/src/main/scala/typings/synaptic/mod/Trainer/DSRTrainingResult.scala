package typings.synaptic.mod.Trainer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DSRTrainingResult extends js.Object {
  var error: Double = js.native
  var iterations: Double = js.native
  var success: js.Any = js.native
  var time: Double = js.native
}

object DSRTrainingResult {
  @scala.inline
  def apply(error: Double, iterations: Double, success: js.Any, time: Double): DSRTrainingResult = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[DSRTrainingResult]
  }
  @scala.inline
  implicit class DSRTrainingResultOps[Self <: DSRTrainingResult] (val x: Self) extends AnyVal {
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
    def setError(value: Double): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setIterations(value: Double): Self = this.set("iterations", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuccess(value: js.Any): Self = this.set("success", value.asInstanceOf[js.Any])
    @scala.inline
    def setTime(value: Double): Self = this.set("time", value.asInstanceOf[js.Any])
  }
  
}

