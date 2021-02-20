package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.quantile
import org.scalablytyped.runtime.StObject
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
  implicit class QuantileTransformMutableBuilder[Self <: QuantileTransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAs(value: (js.Array[String | SignalRef]) | SignalRef): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    @scala.inline
    def setAsVarargs(value: (String | SignalRef)*): Self = StObject.set(x, "as", js.Array(value :_*))
    
    @scala.inline
    def setField(value: FieldRef): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupby(value: js.Array[FieldRef] | SignalRef): Self = StObject.set(x, "groupby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupbyUndefined: Self = StObject.set(x, "groupby", js.undefined)
    
    @scala.inline
    def setGroupbyVarargs(value: FieldRef*): Self = StObject.set(x, "groupby", js.Array(value :_*))
    
    @scala.inline
    def setProbs(value: js.Array[Double] | SignalRef): Self = StObject.set(x, "probs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProbsUndefined: Self = StObject.set(x, "probs", js.undefined)
    
    @scala.inline
    def setProbsVarargs(value: Double*): Self = StObject.set(x, "probs", js.Array(value :_*))
    
    @scala.inline
    def setStep(value: Double | SignalRef): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    @scala.inline
    def setType(value: quantile): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
