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
    decay: Int | Double = null,
    epsilon: Int | Double = null,
    momentum: Int | Double = null
  ): RMSPropOptimizerConfig = {
    val __obj = js.Dynamic.literal(learning_rate = learning_rate.asInstanceOf[js.Any])
    if (!js.isUndefined(centered)) __obj.updateDynamic("centered")(centered.asInstanceOf[js.Any])
    if (decay != null) __obj.updateDynamic("decay")(decay.asInstanceOf[js.Any])
    if (epsilon != null) __obj.updateDynamic("epsilon")(epsilon.asInstanceOf[js.Any])
    if (momentum != null) __obj.updateDynamic("momentum")(momentum.asInstanceOf[js.Any])
    __obj.asInstanceOf[RMSPropOptimizerConfig]
  }
}

