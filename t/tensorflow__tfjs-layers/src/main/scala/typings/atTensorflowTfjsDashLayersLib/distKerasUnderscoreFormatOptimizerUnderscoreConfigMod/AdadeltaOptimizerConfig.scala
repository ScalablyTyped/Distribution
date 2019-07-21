package typings
package atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatOptimizerUnderscoreConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdadeltaOptimizerConfig extends js.Object {
  var epsilon: scala.Double
  var learning_rate: scala.Double
  var rho: scala.Double
}

object AdadeltaOptimizerConfig {
  @scala.inline
  def apply(epsilon: scala.Double, learning_rate: scala.Double, rho: scala.Double): AdadeltaOptimizerConfig = {
    val __obj = js.Dynamic.literal(epsilon = epsilon, learning_rate = learning_rate, rho = rho)
  
    __obj.asInstanceOf[AdadeltaOptimizerConfig]
  }
}

