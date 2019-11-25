package typings.synaptic.synapticMod.Trainer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DSRTrainingResult extends js.Object {
  var error: Double
  var iterations: Double
  var success: js.Any
  var time: Double
}

object DSRTrainingResult {
  @scala.inline
  def apply(error: Double, iterations: Double, success: js.Any, time: Double): DSRTrainingResult = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DSRTrainingResult]
  }
}

