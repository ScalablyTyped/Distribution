package typings.tensorflowTfjsLayers.optimizerConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MomentumOptimizerConfig extends js.Object {
  var learning_rate: Double
  var momentum: Double
  var use_nesterov: js.UndefOr[Boolean] = js.undefined
}

object MomentumOptimizerConfig {
  @scala.inline
  def apply(learning_rate: Double, momentum: Double, use_nesterov: js.UndefOr[Boolean] = js.undefined): MomentumOptimizerConfig = {
    val __obj = js.Dynamic.literal(learning_rate = learning_rate.asInstanceOf[js.Any], momentum = momentum.asInstanceOf[js.Any])
    if (!js.isUndefined(use_nesterov)) __obj.updateDynamic("use_nesterov")(use_nesterov.asInstanceOf[js.Any])
    __obj.asInstanceOf[MomentumOptimizerConfig]
  }
}

