package typings.tensorflowTfjsLayers.optimizerConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdagradOptimizerConfig extends js.Object {
  
  var initial_accumulator_value: js.UndefOr[Double] = js.native
  
  var learning_rate: Double = js.native
}
object AdagradOptimizerConfig {
  
  @scala.inline
  def apply(learning_rate: Double): AdagradOptimizerConfig = {
    val __obj = js.Dynamic.literal(learning_rate = learning_rate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdagradOptimizerConfig]
  }
  
  @scala.inline
  implicit class AdagradOptimizerConfigOps[Self <: AdagradOptimizerConfig] (val x: Self) extends AnyVal {
    
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
    def setInitial_accumulator_value(value: Double): Self = this.set("initial_accumulator_value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitial_accumulator_value: Self = this.set("initial_accumulator_value", js.undefined)
  }
}
