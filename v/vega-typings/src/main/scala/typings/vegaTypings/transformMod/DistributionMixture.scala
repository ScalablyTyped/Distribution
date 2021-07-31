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
  
  @scala.inline
  def apply(field: String | TransformField): DistributionMixture = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], function = "mixture")
    __obj.asInstanceOf[DistributionMixture]
  }
  
  @scala.inline
  implicit class DistributionMixtureMutableBuilder[Self <: DistributionMixture] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDistributions(value: (js.Array[Distribution | SignalRef]) | SignalRef): Self = StObject.set(x, "distributions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistributionsUndefined: Self = StObject.set(x, "distributions", js.undefined)
    
    @scala.inline
    def setDistributionsVarargs(value: (Distribution | SignalRef)*): Self = StObject.set(x, "distributions", js.Array(value :_*))
    
    @scala.inline
    def setField(value: String | TransformField): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunction(value: mixture): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeights(value: (js.Array[Double | SignalRef]) | SignalRef): Self = StObject.set(x, "weights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightsUndefined: Self = StObject.set(x, "weights", js.undefined)
    
    @scala.inline
    def setWeightsVarargs(value: (Double | SignalRef)*): Self = StObject.set(x, "weights", js.Array(value :_*))
  }
}
