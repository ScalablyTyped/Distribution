package typings.vegaTypings.typesSpecTransformMod

import typings.vegaTypings.typesSpecSignalMod.SignalRef
import typings.vegaTypings.typesSpecUtilMod.Vector2
import typings.vegaTypings.vegaTypingsStrings.density
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DensityTransform
  extends StObject
     with Transforms {
  
  var as: js.UndefOr[(Vector2[String | SignalRef]) | SignalRef] = js.undefined
  
  var distribution: js.UndefOr[Distribution | SignalRef] = js.undefined
  
  var extent: js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef] = js.undefined
  
  var maxsteps: js.UndefOr[Double | SignalRef] = js.undefined
  
  var method: js.UndefOr[DensityMethod | SignalRef] = js.undefined
  
  var minsteps: js.UndefOr[Double | SignalRef] = js.undefined
  
  var steps: js.UndefOr[Double | SignalRef] = js.undefined
  
  var `type`: density
}
object DensityTransform {
  
  inline def apply(): DensityTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("density")
    __obj.asInstanceOf[DensityTransform]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DensityTransform] (val x: Self) extends AnyVal {
    
    inline def setAs(value: (Vector2[String | SignalRef]) | SignalRef): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    inline def setDistribution(value: Distribution | SignalRef): Self = StObject.set(x, "distribution", value.asInstanceOf[js.Any])
    
    inline def setDistributionUndefined: Self = StObject.set(x, "distribution", js.undefined)
    
    inline def setExtent(value: (Vector2[Double | SignalRef]) | SignalRef): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
    
    inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
    
    inline def setMaxsteps(value: Double | SignalRef): Self = StObject.set(x, "maxsteps", value.asInstanceOf[js.Any])
    
    inline def setMaxstepsUndefined: Self = StObject.set(x, "maxsteps", js.undefined)
    
    inline def setMethod(value: DensityMethod | SignalRef): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setMinsteps(value: Double | SignalRef): Self = StObject.set(x, "minsteps", value.asInstanceOf[js.Any])
    
    inline def setMinstepsUndefined: Self = StObject.set(x, "minsteps", js.undefined)
    
    inline def setSteps(value: Double | SignalRef): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    inline def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
    
    inline def setType(value: density): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
