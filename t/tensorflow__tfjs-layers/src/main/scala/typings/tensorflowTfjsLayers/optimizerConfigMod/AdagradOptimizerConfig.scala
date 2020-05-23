package typings.tensorflowTfjsLayers.optimizerConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdagradOptimizerConfig extends js.Object {
  var initial_accumulator_value: js.UndefOr[Double] = js.undefined
  var learning_rate: Double
}

object AdagradOptimizerConfig {
  @scala.inline
  def apply(learning_rate: Double, initial_accumulator_value: js.UndefOr[Double] = js.undefined): AdagradOptimizerConfig = {
    val __obj = js.Dynamic.literal(learning_rate = learning_rate.asInstanceOf[js.Any])
    if (!js.isUndefined(initial_accumulator_value)) __obj.updateDynamic("initial_accumulator_value")(initial_accumulator_value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdagradOptimizerConfig]
  }
}

