package typings.synaptic.synapticMod.Trainer

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
    val __obj = js.Dynamic.literal(error = error, iterations = iterations, time = time)
  
    __obj.asInstanceOf[TrainingResult]
  }
}

