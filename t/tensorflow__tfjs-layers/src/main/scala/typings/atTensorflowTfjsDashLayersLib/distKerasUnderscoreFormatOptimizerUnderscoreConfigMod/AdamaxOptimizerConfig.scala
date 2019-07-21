package typings
package atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatOptimizerUnderscoreConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdamaxOptimizerConfig extends js.Object {
  var beta1: scala.Double
  var beta2: scala.Double
  var decay: js.UndefOr[scala.Double] = js.undefined
  var epsilon: js.UndefOr[scala.Double] = js.undefined
  var learning_rate: scala.Double
}

object AdamaxOptimizerConfig {
  @scala.inline
  def apply(
    beta1: scala.Double,
    beta2: scala.Double,
    learning_rate: scala.Double,
    decay: scala.Int | scala.Double = null,
    epsilon: scala.Int | scala.Double = null
  ): AdamaxOptimizerConfig = {
    val __obj = js.Dynamic.literal(beta1 = beta1, beta2 = beta2, learning_rate = learning_rate)
    if (decay != null) __obj.updateDynamic("decay")(decay.asInstanceOf[js.Any])
    if (epsilon != null) __obj.updateDynamic("epsilon")(epsilon.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdamaxOptimizerConfig]
  }
}

