package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.mixture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DistributionMixture extends Distribution {
  
  var distributions: js.UndefOr[(js.Array[Distribution | SignalRef]) | SignalRef] = js.native
  
  var field: String | TransformField = js.native
  
  var function: mixture = js.native
  
  var weights: js.UndefOr[(js.Array[Double | SignalRef]) | SignalRef] = js.native
}
object DistributionMixture {
  
  @scala.inline
  def apply(field: String | TransformField, function: mixture): DistributionMixture = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], function = function.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionMixture]
  }
  
  @scala.inline
  implicit class DistributionMixtureOps[Self <: DistributionMixture] (val x: Self) extends AnyVal {
    
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
    def setField(value: String | TransformField): Self = this.set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunction(value: mixture): Self = this.set("function", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistributionsVarargs(value: (Distribution | SignalRef)*): Self = this.set("distributions", js.Array(value :_*))
    
    @scala.inline
    def setDistributions(value: (js.Array[Distribution | SignalRef]) | SignalRef): Self = this.set("distributions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistributions: Self = this.set("distributions", js.undefined)
    
    @scala.inline
    def setWeightsVarargs(value: (Double | SignalRef)*): Self = this.set("weights", js.Array(value :_*))
    
    @scala.inline
    def setWeights(value: (js.Array[Double | SignalRef]) | SignalRef): Self = this.set("weights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeights: Self = this.set("weights", js.undefined)
  }
}
