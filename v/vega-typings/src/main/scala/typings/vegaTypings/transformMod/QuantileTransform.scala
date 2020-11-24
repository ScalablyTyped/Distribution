package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.quantile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QuantileTransform extends _Transforms {
  
  var as: js.UndefOr[(js.Array[String | SignalRef]) | SignalRef] = js.native
  
  var field: FieldRef = js.native
  
  var groupby: js.UndefOr[js.Array[FieldRef] | SignalRef] = js.native
  
  var probs: js.UndefOr[js.Array[Double] | SignalRef] = js.native
  
  var step: js.UndefOr[Double | SignalRef] = js.native
  
  var `type`: quantile = js.native
}
object QuantileTransform {
  
  @scala.inline
  def apply(field: FieldRef, `type`: quantile): QuantileTransform = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuantileTransform]
  }
  
  @scala.inline
  implicit class QuantileTransformOps[Self <: QuantileTransform] (val x: Self) extends AnyVal {
    
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
    def setField(value: FieldRef): Self = this.set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: quantile): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsVarargs(value: (String | SignalRef)*): Self = this.set("as", js.Array(value :_*))
    
    @scala.inline
    def setAs(value: (js.Array[String | SignalRef]) | SignalRef): Self = this.set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    
    @scala.inline
    def setGroupbyVarargs(value: FieldRef*): Self = this.set("groupby", js.Array(value :_*))
    
    @scala.inline
    def setGroupby(value: js.Array[FieldRef] | SignalRef): Self = this.set("groupby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupby: Self = this.set("groupby", js.undefined)
    
    @scala.inline
    def setProbsVarargs(value: Double*): Self = this.set("probs", js.Array(value :_*))
    
    @scala.inline
    def setProbs(value: js.Array[Double] | SignalRef): Self = this.set("probs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProbs: Self = this.set("probs", js.undefined)
    
    @scala.inline
    def setStep(value: Double | SignalRef): Self = this.set("step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
  }
}
