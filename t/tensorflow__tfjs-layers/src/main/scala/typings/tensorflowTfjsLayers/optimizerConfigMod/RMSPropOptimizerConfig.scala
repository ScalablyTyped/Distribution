package typings.tensorflowTfjsLayers.optimizerConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RMSPropOptimizerConfig extends js.Object {
  var centered: js.UndefOr[Boolean] = js.native
  var decay: js.UndefOr[Double] = js.native
  var epsilon: js.UndefOr[Double] = js.native
  var learning_rate: Double = js.native
  var momentum: js.UndefOr[Double] = js.native
}

object RMSPropOptimizerConfig {
  @scala.inline
  def apply(learning_rate: Double): RMSPropOptimizerConfig = {
    val __obj = js.Dynamic.literal(learning_rate = learning_rate.asInstanceOf[js.Any])
    __obj.asInstanceOf[RMSPropOptimizerConfig]
  }
  @scala.inline
  implicit class RMSPropOptimizerConfigOps[Self <: RMSPropOptimizerConfig] (val x: Self) extends AnyVal {
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
    def setCentered(value: Boolean): Self = this.set("centered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCentered: Self = this.set("centered", js.undefined)
    @scala.inline
    def setDecay(value: Double): Self = this.set("decay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecay: Self = this.set("decay", js.undefined)
    @scala.inline
    def setEpsilon(value: Double): Self = this.set("epsilon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEpsilon: Self = this.set("epsilon", js.undefined)
    @scala.inline
    def setMomentum(value: Double): Self = this.set("momentum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMomentum: Self = this.set("momentum", js.undefined)
  }
  
}

