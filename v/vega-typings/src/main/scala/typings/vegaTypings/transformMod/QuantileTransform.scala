package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.quantile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuantileTransform
  extends StObject
     with Transforms {
  
  var as: js.UndefOr[(js.Array[String | SignalRef]) | SignalRef] = js.undefined
  
  var field: FieldRef
  
  var groupby: js.UndefOr[js.Array[FieldRef] | SignalRef] = js.undefined
  
  var probs: js.UndefOr[js.Array[Double] | SignalRef] = js.undefined
  
  var step: js.UndefOr[Double | SignalRef] = js.undefined
  
  var `type`: quantile
}
object QuantileTransform {
  
  inline def apply(field: FieldRef): QuantileTransform = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("quantile")
    __obj.asInstanceOf[QuantileTransform]
  }
  
  extension [Self <: QuantileTransform](x: Self) {
    
    inline def setAs(value: (js.Array[String | SignalRef]) | SignalRef): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    inline def setAsVarargs(value: (String | SignalRef)*): Self = StObject.set(x, "as", js.Array(value*))
    
    inline def setField(value: FieldRef): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setGroupby(value: js.Array[FieldRef] | SignalRef): Self = StObject.set(x, "groupby", value.asInstanceOf[js.Any])
    
    inline def setGroupbyUndefined: Self = StObject.set(x, "groupby", js.undefined)
    
    inline def setGroupbyVarargs(value: FieldRef*): Self = StObject.set(x, "groupby", js.Array(value*))
    
    inline def setProbs(value: js.Array[Double] | SignalRef): Self = StObject.set(x, "probs", value.asInstanceOf[js.Any])
    
    inline def setProbsUndefined: Self = StObject.set(x, "probs", js.undefined)
    
    inline def setProbsVarargs(value: Double*): Self = StObject.set(x, "probs", js.Array(value*))
    
    inline def setStep(value: Double | SignalRef): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    inline def setType(value: quantile): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
