package typings
package atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatOptimizerUnderscoreConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdamOptimizerConfig extends js.Object {
  var beta1: scala.Double
  var beta2: scala.Double
  var epsilon: js.UndefOr[scala.Double] = js.undefined
  var learning_rate: scala.Double
}

object AdamOptimizerConfig {
  @scala.inline
  def apply(
    beta1: scala.Double,
    beta2: scala.Double,
    learning_rate: scala.Double,
    epsilon: scala.Int | scala.Double = null
  ): AdamOptimizerConfig = {
    val __obj = js.Dynamic.literal(beta1 = beta1, beta2 = beta2, learning_rate = learning_rate)
    if (epsilon != null) __obj.updateDynamic("epsilon")(epsilon.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdamOptimizerConfig]
  }
}

