package typings
package atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatOptimizerUnderscoreConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RMSPropOptimizerConfig extends js.Object {
  var centered: js.UndefOr[scala.Boolean] = js.undefined
  var decay: js.UndefOr[scala.Double] = js.undefined
  var epsilon: js.UndefOr[scala.Double] = js.undefined
  var learning_rate: scala.Double
  var momentum: js.UndefOr[scala.Double] = js.undefined
}

object RMSPropOptimizerConfig {
  @scala.inline
  def apply(
    learning_rate: scala.Double,
    centered: js.UndefOr[scala.Boolean] = js.undefined,
    decay: scala.Int | scala.Double = null,
    epsilon: scala.Int | scala.Double = null,
    momentum: scala.Int | scala.Double = null
  ): RMSPropOptimizerConfig = {
    val __obj = js.Dynamic.literal(learning_rate = learning_rate)
    if (!js.isUndefined(centered)) __obj.updateDynamic("centered")(centered)
    if (decay != null) __obj.updateDynamic("decay")(decay.asInstanceOf[js.Any])
    if (epsilon != null) __obj.updateDynamic("epsilon")(epsilon.asInstanceOf[js.Any])
    if (momentum != null) __obj.updateDynamic("momentum")(momentum.asInstanceOf[js.Any])
    __obj.asInstanceOf[RMSPropOptimizerConfig]
  }
}

