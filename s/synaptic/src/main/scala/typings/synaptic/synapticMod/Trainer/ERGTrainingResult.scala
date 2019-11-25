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
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], generate = generate.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ERGTrainingResult]
  }
}

