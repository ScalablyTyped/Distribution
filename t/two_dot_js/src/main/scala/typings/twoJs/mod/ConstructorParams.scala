package typings.twoJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConstructorParams extends StObject {
  
  var autostart: js.UndefOr[Boolean] = js.undefined
  
  var fullscreen: js.UndefOr[Boolean] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var ratio: js.UndefOr[Double] = js.undefined
  
  var `type`: js.UndefOr[Types] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object ConstructorParams {
  
  inline def apply(): ConstructorParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConstructorParams]
  }
  
  extension [Self <: ConstructorParams](x: Self) {
    
    inline def setAutostart(value: Boolean): Self = StObject.set(x, "autostart", value.asInstanceOf[js.Any])
    
    inline def setAutostartUndefined: Self = StObject.set(x, "autostart", js.undefined)
    
    inline def setFullscreen(value: Boolean): Self = StObject.set(x, "fullscreen", value.asInstanceOf[js.Any])
    
    inline def setFullscreenUndefined: Self = StObject.set(x, "fullscreen", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setRatio(value: Double): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
    
    inline def setRatioUndefined: Self = StObject.set(x, "ratio", js.undefined)
    
    inline def setType(value: Types): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
