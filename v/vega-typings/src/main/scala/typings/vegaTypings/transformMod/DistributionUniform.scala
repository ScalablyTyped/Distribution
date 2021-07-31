package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.uniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DistributionUniform
  extends StObject
     with Distribution {
  
  var function: uniform
  
  var max: js.UndefOr[Double | SignalRef] = js.undefined
  
  var min: js.UndefOr[Double | SignalRef] = js.undefined
}
object DistributionUniform {
  
  @scala.inline
  def apply(): DistributionUniform = {
    val __obj = js.Dynamic.literal(function = "uniform")
    __obj.asInstanceOf[DistributionUniform]
  }
  
  @scala.inline
  implicit class DistributionUniformMutableBuilder[Self <: DistributionUniform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFunction(value: uniform): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax(value: Double | SignalRef): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: Double | SignalRef): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
  }
}
