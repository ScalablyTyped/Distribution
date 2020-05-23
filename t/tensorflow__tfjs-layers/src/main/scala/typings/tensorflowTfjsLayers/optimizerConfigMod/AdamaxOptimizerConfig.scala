package typings.tensorflowTfjsLayers.optimizerConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdamaxOptimizerConfig extends js.Object {
  var beta1: Double
  var beta2: Double
  var decay: js.UndefOr[Double] = js.undefined
  var epsilon: js.UndefOr[Double] = js.undefined
  var learning_rate: Double
}

object AdamaxOptimizerConfig {
  @scala.inline
  def apply(
    beta1: Double,
    beta2: Double,
    learning_rate: Double,
    decay: js.UndefOr[Double] = js.undefined,
    epsilon: js.UndefOr[Double] = js.undefined
  ): AdamaxOptimizerConfig = {
    val __obj = js.Dynamic.literal(beta1 = beta1.asInstanceOf[js.Any], beta2 = beta2.asInstanceOf[js.Any], learning_rate = learning_rate.asInstanceOf[js.Any])
    if (!js.isUndefined(decay)) __obj.updateDynamic("decay")(decay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(epsilon)) __obj.updateDynamic("epsilon")(epsilon.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdamaxOptimizerConfig]
  }
}

