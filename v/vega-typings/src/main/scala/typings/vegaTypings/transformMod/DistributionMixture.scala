package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.mixture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DistributionMixture
  extends StObject
     with Distribution {
  
  var distributions: js.UndefOr[(js.Array[Distribution | SignalRef]) | SignalRef] = js.undefined
  
  var field: String | TransformField
  
  var function: mixture
  
  var weights: js.UndefOr[(js.Array[Double | SignalRef]) | SignalRef] = js.undefined
}
object DistributionMixture {
  
  inline def apply(field: String | TransformField): DistributionMixture = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], function = "mixture")
    __obj.asInstanceOf[DistributionMixture]
  }
  
  extension [Self <: DistributionMixture](x: Self) {
    
    inline def setDistributions(value: (js.Array[Distribution | SignalRef]) | SignalRef): Self = StObject.set(x, "distributions", value.asInstanceOf[js.Any])
    
    inline def setDistributionsUndefined: Self = StObject.set(x, "distributions", js.undefined)
    
    inline def setDistributionsVarargs(value: (Distribution | SignalRef)*): Self = StObject.set(x, "distributions", js.Array(value :_*))
    
    inline def setField(value: String | TransformField): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFunction(value: mixture): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
    
    inline def setWeights(value: (js.Array[Double | SignalRef]) | SignalRef): Self = StObject.set(x, "weights", value.asInstanceOf[js.Any])
    
    inline def setWeightsUndefined: Self = StObject.set(x, "weights", js.undefined)
    
    inline def setWeightsVarargs(value: (Double | SignalRef)*): Self = StObject.set(x, "weights", js.Array(value :_*))
  }
}
