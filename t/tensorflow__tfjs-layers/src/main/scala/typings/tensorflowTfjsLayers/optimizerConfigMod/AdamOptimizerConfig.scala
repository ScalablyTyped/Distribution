package typings.tensorflowTfjsLayers.optimizerConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdamOptimizerConfig extends js.Object {
  var beta1: Double = js.native
  var beta2: Double = js.native
  var epsilon: js.UndefOr[Double] = js.native
  var learning_rate: Double = js.native
}

object AdamOptimizerConfig {
  @scala.inline
  def apply(beta1: Double, beta2: Double, learning_rate: Double): AdamOptimizerConfig = {
    val __obj = js.Dynamic.literal(beta1 = beta1.asInstanceOf[js.Any], beta2 = beta2.asInstanceOf[js.Any], learning_rate = learning_rate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdamOptimizerConfig]
  }
  @scala.inline
  implicit class AdamOptimizerConfigOps[Self <: AdamOptimizerConfig] (val x: Self) extends AnyVal {
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
    def setBeta1(value: Double): Self = this.set("beta1", value.asInstanceOf[js.Any])
    @scala.inline
    def setBeta2(value: Double): Self = this.set("beta2", value.asInstanceOf[js.Any])
    @scala.inline
    def setLearning_rate(value: Double): Self = this.set("learning_rate", value.asInstanceOf[js.Any])
    @scala.inline
    def setEpsilon(value: Double): Self = this.set("epsilon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEpsilon: Self = this.set("epsilon", js.undefined)
  }
  
}

