package typings.tensorflowModelsFaceLandmarksDetection.configInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VelocityFilterConfig extends StObject {
  
  var disableValueScaling: js.UndefOr[Boolean] = js.undefined
  
  var minAllowedObjectScale: js.UndefOr[Double] = js.undefined
  
  var velocityScale: js.UndefOr[Double] = js.undefined
  
  var windowSize: js.UndefOr[Double] = js.undefined
}
object VelocityFilterConfig {
  
  inline def apply(): VelocityFilterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VelocityFilterConfig]
  }
  
  extension [Self <: VelocityFilterConfig](x: Self) {
    
    inline def setDisableValueScaling(value: Boolean): Self = StObject.set(x, "disableValueScaling", value.asInstanceOf[js.Any])
    
    inline def setDisableValueScalingUndefined: Self = StObject.set(x, "disableValueScaling", js.undefined)
    
    inline def setMinAllowedObjectScale(value: Double): Self = StObject.set(x, "minAllowedObjectScale", value.asInstanceOf[js.Any])
    
    inline def setMinAllowedObjectScaleUndefined: Self = StObject.set(x, "minAllowedObjectScale", js.undefined)
    
    inline def setVelocityScale(value: Double): Self = StObject.set(x, "velocityScale", value.asInstanceOf[js.Any])
    
    inline def setVelocityScaleUndefined: Self = StObject.set(x, "velocityScale", js.undefined)
    
    inline def setWindowSize(value: Double): Self = StObject.set(x, "windowSize", value.asInstanceOf[js.Any])
    
    inline def setWindowSizeUndefined: Self = StObject.set(x, "windowSize", js.undefined)
  }
}
