package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.utilMod.Vector2
import typings.vegaTypings.vegaTypingsStrings.density
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DensityTransform extends _Transforms {
  
  var as: js.UndefOr[(Vector2[String | SignalRef]) | SignalRef] = js.native
  
  var distribution: js.UndefOr[Distribution | SignalRef] = js.native
  
  var extent: js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef] = js.native
  
  var maxsteps: js.UndefOr[Double | SignalRef] = js.native
  
  var method: js.UndefOr[DensityMethod | SignalRef] = js.native
  
  var minsteps: js.UndefOr[Double | SignalRef] = js.native
  
  var steps: js.UndefOr[Double | SignalRef] = js.native
  
  var `type`: density = js.native
}
object DensityTransform {
  
  @scala.inline
  def apply(`type`: density): DensityTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DensityTransform]
  }
  
  @scala.inline
  implicit class DensityTransformMutableBuilder[Self <: DensityTransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAs(value: (Vector2[String | SignalRef]) | SignalRef): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    @scala.inline
    def setDistribution(value: Distribution | SignalRef): Self = StObject.set(x, "distribution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistributionUndefined: Self = StObject.set(x, "distribution", js.undefined)
    
    @scala.inline
    def setExtent(value: (Vector2[Double | SignalRef]) | SignalRef): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
    
    @scala.inline
    def setMaxsteps(value: Double | SignalRef): Self = StObject.set(x, "maxsteps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxstepsUndefined: Self = StObject.set(x, "maxsteps", js.undefined)
    
    @scala.inline
    def setMethod(value: DensityMethod | SignalRef): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setMinsteps(value: Double | SignalRef): Self = StObject.set(x, "minsteps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinstepsUndefined: Self = StObject.set(x, "minsteps", js.undefined)
    
    @scala.inline
    def setSteps(value: Double | SignalRef): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
    
    @scala.inline
    def setType(value: density): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
