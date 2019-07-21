package typings
package atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatOptimizerUnderscoreConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MomentumOptimizerConfig extends js.Object {
  var learning_rate: scala.Double
  var momentum: scala.Double
  var use_nesterov: js.UndefOr[scala.Boolean] = js.undefined
}

object MomentumOptimizerConfig {
  @scala.inline
  def apply(
    learning_rate: scala.Double,
    momentum: scala.Double,
    use_nesterov: js.UndefOr[scala.Boolean] = js.undefined
  ): MomentumOptimizerConfig = {
    val __obj = js.Dynamic.literal(learning_rate = learning_rate, momentum = momentum)
    if (!js.isUndefined(use_nesterov)) __obj.updateDynamic("use_nesterov")(use_nesterov)
    __obj.asInstanceOf[MomentumOptimizerConfig]
  }
}

