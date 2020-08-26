package typings.tensorflowTfjsLayers.optimizerConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MomentumOptimizerConfig extends js.Object {
  var learning_rate: Double = js.native
  var momentum: Double = js.native
  var use_nesterov: js.UndefOr[Boolean] = js.native
}

object MomentumOptimizerConfig {
  @scala.inline
  def apply(learning_rate: Double, momentum: Double): MomentumOptimizerConfig = {
    val __obj = js.Dynamic.literal(learning_rate = learning_rate.asInstanceOf[js.Any], momentum = momentum.asInstanceOf[js.Any])
    __obj.asInstanceOf[MomentumOptimizerConfig]
  }
  @scala.inline
  implicit class MomentumOptimizerConfigOps[Self <: MomentumOptimizerConfig] (val x: Self) extends AnyVal {
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
    def setLearning_rate(value: Double): Self = this.set("learning_rate", value.asInstanceOf[js.Any])
    @scala.inline
    def setMomentum(value: Double): Self = this.set("momentum", value.asInstanceOf[js.Any])
    @scala.inline
    def setUse_nesterov(value: Boolean): Self = this.set("use_nesterov", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUse_nesterov: Self = this.set("use_nesterov", js.undefined)
  }
  
}

