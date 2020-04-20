package typings.synaptic.mod.Trainer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrainingResult extends js.Object {
  var error: Double
  var iterations: Double
  var time: Double
}

object TrainingResult {
  @scala.inline
  def apply(error: Double, iterations: Double, time: Double): TrainingResult = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrainingResult]
  }
}

