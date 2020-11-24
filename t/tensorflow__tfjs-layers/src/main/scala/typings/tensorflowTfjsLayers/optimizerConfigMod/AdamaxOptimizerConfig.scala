package typings.tensorflowTfjsLayers.optimizerConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdamaxOptimizerConfig extends js.Object {
  
  var beta1: Double = js.native
  
  var beta2: Double = js.native
  
  var decay: js.UndefOr[Double] = js.native
  
  var epsilon: js.UndefOr[Double] = js.native
  
  var learning_rate: Double = js.native
}
object AdamaxOptimizerConfig {
  
  @scala.inline
  def apply(beta1: Double, beta2: Double, learning_rate: Double): AdamaxOptimizerConfig = {
    val __obj = js.Dynamic.literal(beta1 = beta1.asInstanceOf[js.Any], beta2 = beta2.asInstanceOf[js.Any], learning_rate = learning_rate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdamaxOptimizerConfig]
  }
  
  @scala.inline
  implicit class AdamaxOptimizerConfigOps[Self <: AdamaxOptimizerConfig] (val x: Self) extends AnyVal {
    
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
    def setDecay(value: Double): Self = this.set("decay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecay: Self = this.set("decay", js.undefined)
    
    @scala.inline
    def setEpsilon(value: Double): Self = this.set("epsilon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEpsilon: Self = this.set("epsilon", js.undefined)
  }
}
