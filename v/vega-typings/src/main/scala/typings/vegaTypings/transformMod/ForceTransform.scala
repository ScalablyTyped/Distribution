package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.force
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForceTransform
  extends StObject
     with _Transforms {
  
  var alpha: js.UndefOr[Double | SignalRef] = js.undefined
  
  var alphaMin: js.UndefOr[Double | SignalRef] = js.undefined
  
  var alphaTarget: js.UndefOr[Double | SignalRef] = js.undefined
  
  var forces: js.UndefOr[(js.Array[Force | SignalRef]) | SignalRef] = js.undefined
  
  var iterations: js.UndefOr[Double | SignalRef] = js.undefined
  
  var restart: js.UndefOr[Boolean | SignalRef] = js.undefined
  
  var signal: js.UndefOr[SignalName] = js.undefined
  
  var static: js.UndefOr[Boolean | SignalRef] = js.undefined
  
  var `type`: force
  
  var velocityDecay: js.UndefOr[Double | SignalRef] = js.undefined
}
object ForceTransform {
  
  inline def apply(): ForceTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("force")
    __obj.asInstanceOf[ForceTransform]
  }
  
  extension [Self <: ForceTransform](x: Self) {
    
    inline def setAlpha(value: Double | SignalRef): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAlphaMin(value: Double | SignalRef): Self = StObject.set(x, "alphaMin", value.asInstanceOf[js.Any])
    
    inline def setAlphaMinUndefined: Self = StObject.set(x, "alphaMin", js.undefined)
    
    inline def setAlphaTarget(value: Double | SignalRef): Self = StObject.set(x, "alphaTarget", value.asInstanceOf[js.Any])
    
    inline def setAlphaTargetUndefined: Self = StObject.set(x, "alphaTarget", js.undefined)
    
    inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    inline def setForces(value: (js.Array[Force | SignalRef]) | SignalRef): Self = StObject.set(x, "forces", value.asInstanceOf[js.Any])
    
    inline def setForcesUndefined: Self = StObject.set(x, "forces", js.undefined)
    
    inline def setForcesVarargs(value: (Force | SignalRef)*): Self = StObject.set(x, "forces", js.Array(value :_*))
    
    inline def setIterations(value: Double | SignalRef): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
    
    inline def setIterationsUndefined: Self = StObject.set(x, "iterations", js.undefined)
    
    inline def setRestart(value: Boolean | SignalRef): Self = StObject.set(x, "restart", value.asInstanceOf[js.Any])
    
    inline def setRestartUndefined: Self = StObject.set(x, "restart", js.undefined)
    
    inline def setSignal(value: SignalName): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    inline def setStatic(value: Boolean | SignalRef): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
    
    inline def setStaticUndefined: Self = StObject.set(x, "static", js.undefined)
    
    inline def setType(value: force): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVelocityDecay(value: Double | SignalRef): Self = StObject.set(x, "velocityDecay", value.asInstanceOf[js.Any])
    
    inline def setVelocityDecayUndefined: Self = StObject.set(x, "velocityDecay", js.undefined)
  }
}
