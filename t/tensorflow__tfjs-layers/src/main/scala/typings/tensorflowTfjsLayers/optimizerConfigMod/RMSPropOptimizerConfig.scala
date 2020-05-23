package typings.tensorflowTfjsLayers.optimizerConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RMSPropOptimizerConfig extends js.Object {
  var centered: js.UndefOr[Boolean] = js.undefined
  var decay: js.UndefOr[Double] = js.undefined
  var epsilon: js.UndefOr[Double] = js.undefined
  var learning_rate: Double
  var momentum: js.UndefOr[Double] = js.undefined
}

object RMSPropOptimizerConfig {
  @scala.inline
  def apply(
    learning_rate: Double,
    centered: js.UndefOr[Boolean] = js.undefined,
    decay: js.UndefOr[Double] = js.undefined,
    epsilon: js.UndefOr[Double] = js.undefined,
    momentum: js.UndefOr[Double] = js.undefined
  ): RMSPropOptimizerConfig = {
    val __obj = js.Dynamic.literal(learning_rate = learning_rate.asInstanceOf[js.Any])
    if (!js.isUndefined(centered)) __obj.updateDynamic("centered")(centered.get.asInstanceOf[js.Any])
    if (!js.isUndefined(decay)) __obj.updateDynamic("decay")(decay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(epsilon)) __obj.updateDynamic("epsilon")(epsilon.get.asInstanceOf[js.Any])
    if (!js.isUndefined(momentum)) __obj.updateDynamic("momentum")(momentum.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RMSPropOptimizerConfig]
  }
}

