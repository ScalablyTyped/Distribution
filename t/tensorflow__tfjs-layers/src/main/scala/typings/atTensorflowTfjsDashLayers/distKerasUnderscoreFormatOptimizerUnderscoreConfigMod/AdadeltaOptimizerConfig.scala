package typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatOptimizerUnderscoreConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdadeltaOptimizerConfig extends js.Object {
  var epsilon: Double
  var learning_rate: Double
  var rho: Double
}

object AdadeltaOptimizerConfig {
  @scala.inline
  def apply(epsilon: Double, learning_rate: Double, rho: Double): AdadeltaOptimizerConfig = {
    val __obj = js.Dynamic.literal(epsilon = epsilon.asInstanceOf[js.Any], learning_rate = learning_rate.asInstanceOf[js.Any], rho = rho.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AdadeltaOptimizerConfig]
  }
}

