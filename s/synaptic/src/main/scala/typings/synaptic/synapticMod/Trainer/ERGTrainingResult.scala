package typings.synaptic.synapticMod.Trainer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ERGTrainingResult extends js.Object {
  var error: Double
  var generate: js.Any
  var iterations: Double
  var test: js.Any
  var time: Double
}

object ERGTrainingResult {
  @scala.inline
  def apply(error: Double, generate: js.Any, iterations: Double, test: js.Any, time: Double): ERGTrainingResult = {
    val __obj = js.Dynamic.literal(error = error, generate = generate, iterations = iterations, test = test, time = time)
  
    __obj.asInstanceOf[ERGTrainingResult]
  }
}

