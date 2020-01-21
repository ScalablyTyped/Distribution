package typings.synaptic.mod.Trainer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrainingScheduleDoData extends js.Object {
  var error: js.Any
  var iterations: js.Any
  /**
    * The current learning rate.
    */
  var rate: js.Any
}

object TrainingScheduleDoData {
  @scala.inline
  def apply(error: js.Any, iterations: js.Any, rate: js.Any): TrainingScheduleDoData = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any], rate = rate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TrainingScheduleDoData]
  }
}

