package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.uniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DistributionUniform extends Distribution {
  
  var function: uniform = js.native
  
  var max: js.UndefOr[Double | SignalRef] = js.native
  
  var min: js.UndefOr[Double | SignalRef] = js.native
}
object DistributionUniform {
  
  @scala.inline
  def apply(function: uniform): DistributionUniform = {
    val __obj = js.Dynamic.literal(function = function.asInstanceOf[js.Any])
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
