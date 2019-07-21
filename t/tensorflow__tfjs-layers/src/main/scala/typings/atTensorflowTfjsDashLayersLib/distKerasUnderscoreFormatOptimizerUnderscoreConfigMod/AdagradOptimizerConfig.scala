package typings
package atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatOptimizerUnderscoreConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdagradOptimizerConfig extends js.Object {
  var initial_accumulator_value: js.UndefOr[scala.Double] = js.undefined
  var learning_rate: scala.Double
}

object AdagradOptimizerConfig {
  @scala.inline
  def apply(learning_rate: scala.Double, initial_accumulator_value: scala.Int | scala.Double = null): AdagradOptimizerConfig = {
    val __obj = js.Dynamic.literal(learning_rate = learning_rate)
    if (initial_accumulator_value != null) __obj.updateDynamic("initial_accumulator_value")(initial_accumulator_value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdagradOptimizerConfig]
  }
}

