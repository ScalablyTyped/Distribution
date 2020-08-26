package typings.tensorflowTfjsLayers.optimizerConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SGDOptimizerConfig extends js.Object {
  var learning_rate: Double = js.native
}

object SGDOptimizerConfig {
  @scala.inline
  def apply(learning_rate: Double): SGDOptimizerConfig = {
    val __obj = js.Dynamic.literal(learning_rate = learning_rate.asInstanceOf[js.Any])
    __obj.asInstanceOf[SGDOptimizerConfig]
  }
  @scala.inline
  implicit class SGDOptimizerConfigOps[Self <: SGDOptimizerConfig] (val x: Self) extends AnyVal {
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
  }
  
}

