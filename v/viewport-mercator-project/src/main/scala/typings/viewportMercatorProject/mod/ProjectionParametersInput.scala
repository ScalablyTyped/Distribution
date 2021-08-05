package typings.viewportMercatorProject.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectionParametersInput extends StObject {
  
  var altitude: js.UndefOr[Double] = js.undefined
  
  var farZMultiplier: js.UndefOr[Double] = js.undefined
  
  var height: Double
  
  var nearZMultiplier: js.UndefOr[Double] = js.undefined
  
  var pitch: js.UndefOr[Double] = js.undefined
  
  var width: Double
}
object ProjectionParametersInput {
  
  inline def apply(height: Double, width: Double): ProjectionParametersInput = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectionParametersInput]
  }
  
  extension [Self <: ProjectionParametersInput](x: Self) {
    
    inline def setAltitude(value: Double): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
    
    inline def setAltitudeUndefined: Self = StObject.set(x, "altitude", js.undefined)
    
    inline def setFarZMultiplier(value: Double): Self = StObject.set(x, "farZMultiplier", value.asInstanceOf[js.Any])
    
    inline def setFarZMultiplierUndefined: Self = StObject.set(x, "farZMultiplier", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setNearZMultiplier(value: Double): Self = StObject.set(x, "nearZMultiplier", value.asInstanceOf[js.Any])
    
    inline def setNearZMultiplierUndefined: Self = StObject.set(x, "nearZMultiplier", js.undefined)
    
    inline def setPitch(value: Double): Self = StObject.set(x, "pitch", value.asInstanceOf[js.Any])
    
    inline def setPitchUndefined: Self = StObject.set(x, "pitch", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
