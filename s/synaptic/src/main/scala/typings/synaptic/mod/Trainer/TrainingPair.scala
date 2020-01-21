package typings.synaptic.mod.Trainer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrainingPair extends js.Object {
  var input: js.Array[Double]
  var output: js.Array[Double]
}

object TrainingPair {
  @scala.inline
  def apply(input: js.Array[Double], output: js.Array[Double]): TrainingPair = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TrainingPair]
  }
}

