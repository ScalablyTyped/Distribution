package typings.trimblemapsTrimblemapsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlyToOptions
  extends StObject
     with AnimationOptions
     with CameraOptions {
  
  var curve: js.UndefOr[Double] = js.undefined
  
  var maxDuration: js.UndefOr[Double] = js.undefined
  
  var minZoom: js.UndefOr[Double] = js.undefined
  
  var screenSpeed: js.UndefOr[Double] = js.undefined
  
  var speed: js.UndefOr[Double] = js.undefined
}
object FlyToOptions {
  
  inline def apply(): FlyToOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlyToOptions]
  }
  
  extension [Self <: FlyToOptions](x: Self) {
    
    inline def setCurve(value: Double): Self = StObject.set(x, "curve", value.asInstanceOf[js.Any])
    
    inline def setCurveUndefined: Self = StObject.set(x, "curve", js.undefined)
    
    inline def setMaxDuration(value: Double): Self = StObject.set(x, "maxDuration", value.asInstanceOf[js.Any])
    
    inline def setMaxDurationUndefined: Self = StObject.set(x, "maxDuration", js.undefined)
    
    inline def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
    
    inline def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
    
    inline def setScreenSpeed(value: Double): Self = StObject.set(x, "screenSpeed", value.asInstanceOf[js.Any])
    
    inline def setScreenSpeedUndefined: Self = StObject.set(x, "screenSpeed", js.undefined)
    
    inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    
    inline def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
  }
}
