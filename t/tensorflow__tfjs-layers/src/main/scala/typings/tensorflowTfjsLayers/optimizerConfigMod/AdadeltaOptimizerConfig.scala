package typings.tensorflowTfjsLayers.optimizerConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdadeltaOptimizerConfig extends js.Object {
  var epsilon: Double = js.native
  var learning_rate: Double = js.native
  var rho: Double = js.native
}

object AdadeltaOptimizerConfig {
  @scala.inline
  def apply(epsilon: Double, learning_rate: Double, rho: Double): AdadeltaOptimizerConfig = {
    val __obj = js.Dynamic.literal(epsilon = epsilon.asInstanceOf[js.Any], learning_rate = learning_rate.asInstanceOf[js.Any], rho = rho.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdadeltaOptimizerConfig]
  }
  @scala.inline
  implicit class AdadeltaOptimizerConfigOps[Self <: AdadeltaOptimizerConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEpsilon(value: Double): Self = this.set("epsilon", value.asInstanceOf[js.Any])
    @scala.inline
    def setLearning_rate(value: Double): Self = this.set("learning_rate", value.asInstanceOf[js.Any])
    @scala.inline
    def setRho(value: Double): Self = this.set("rho", value.asInstanceOf[js.Any])
  }
  
}

