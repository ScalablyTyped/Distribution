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
  
  @scala.inline
  def apply(): ForceTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("force")
    __obj.asInstanceOf[ForceTransform]
  }
  
  @scala.inline
  implicit class ForceTransformMutableBuilder[Self <: ForceTransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlpha(value: Double | SignalRef): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlphaMin(value: Double | SignalRef): Self = StObject.set(x, "alphaMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlphaMinUndefined: Self = StObject.set(x, "alphaMin", js.undefined)
    
    @scala.inline
    def setAlphaTarget(value: Double | SignalRef): Self = StObject.set(x, "alphaTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlphaTargetUndefined: Self = StObject.set(x, "alphaTarget", js.undefined)
    
    @scala.inline
    def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    @scala.inline
    def setForces(value: (js.Array[Force | SignalRef]) | SignalRef): Self = StObject.set(x, "forces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForcesUndefined: Self = StObject.set(x, "forces", js.undefined)
    
    @scala.inline
    def setForcesVarargs(value: (Force | SignalRef)*): Self = StObject.set(x, "forces", js.Array(value :_*))
    
    @scala.inline
    def setIterations(value: Double | SignalRef): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIterationsUndefined: Self = StObject.set(x, "iterations", js.undefined)
    
    @scala.inline
    def setRestart(value: Boolean | SignalRef): Self = StObject.set(x, "restart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestartUndefined: Self = StObject.set(x, "restart", js.undefined)
    
    @scala.inline
    def setSignal(value: SignalName): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    @scala.inline
    def setStatic(value: Boolean | SignalRef): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaticUndefined: Self = StObject.set(x, "static", js.undefined)
    
    @scala.inline
    def setType(value: force): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVelocityDecay(value: Double | SignalRef): Self = StObject.set(x, "velocityDecay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVelocityDecayUndefined: Self = StObject.set(x, "velocityDecay", js.undefined)
  }
}
