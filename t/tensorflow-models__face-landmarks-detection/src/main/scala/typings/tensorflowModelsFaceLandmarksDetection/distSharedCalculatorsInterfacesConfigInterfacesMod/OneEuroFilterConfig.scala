package typings.tensorflowModelsFaceLandmarksDetection.distSharedCalculatorsInterfacesConfigInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OneEuroFilterConfig extends StObject {
  
  var beta: js.UndefOr[Double] = js.undefined
  
  var derivateCutOff: js.UndefOr[Double] = js.undefined
  
  var disableValueScaling: js.UndefOr[Boolean] = js.undefined
  
  var frequency: js.UndefOr[Double] = js.undefined
  
  var minAllowedObjectScale: js.UndefOr[Double] = js.undefined
  
  var minCutOff: js.UndefOr[Double] = js.undefined
  
  var thresholdBeta: js.UndefOr[Double] = js.undefined
  
  var thresholdCutOff: js.UndefOr[Double] = js.undefined
}
object OneEuroFilterConfig {
  
  inline def apply(): OneEuroFilterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OneEuroFilterConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OneEuroFilterConfig] (val x: Self) extends AnyVal {
    
    inline def setBeta(value: Double): Self = StObject.set(x, "beta", value.asInstanceOf[js.Any])
    
    inline def setBetaUndefined: Self = StObject.set(x, "beta", js.undefined)
    
    inline def setDerivateCutOff(value: Double): Self = StObject.set(x, "derivateCutOff", value.asInstanceOf[js.Any])
    
    inline def setDerivateCutOffUndefined: Self = StObject.set(x, "derivateCutOff", js.undefined)
    
    inline def setDisableValueScaling(value: Boolean): Self = StObject.set(x, "disableValueScaling", value.asInstanceOf[js.Any])
    
    inline def setDisableValueScalingUndefined: Self = StObject.set(x, "disableValueScaling", js.undefined)
    
    inline def setFrequency(value: Double): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
    
    inline def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
    
    inline def setMinAllowedObjectScale(value: Double): Self = StObject.set(x, "minAllowedObjectScale", value.asInstanceOf[js.Any])
    
    inline def setMinAllowedObjectScaleUndefined: Self = StObject.set(x, "minAllowedObjectScale", js.undefined)
    
    inline def setMinCutOff(value: Double): Self = StObject.set(x, "minCutOff", value.asInstanceOf[js.Any])
    
    inline def setMinCutOffUndefined: Self = StObject.set(x, "minCutOff", js.undefined)
    
    inline def setThresholdBeta(value: Double): Self = StObject.set(x, "thresholdBeta", value.asInstanceOf[js.Any])
    
    inline def setThresholdBetaUndefined: Self = StObject.set(x, "thresholdBeta", js.undefined)
    
    inline def setThresholdCutOff(value: Double): Self = StObject.set(x, "thresholdCutOff", value.asInstanceOf[js.Any])
    
    inline def setThresholdCutOffUndefined: Self = StObject.set(x, "thresholdCutOff", js.undefined)
  }
}
