package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FillStyle_ extends StObject {
  
  var fillStyle: js.UndefOr[String] = js.undefined
  
  var shadowBlur: js.UndefOr[String] = js.undefined
  
  var shadowColor: js.UndefOr[String] = js.undefined
  
  var strokeStyle: js.UndefOr[String] = js.undefined
}
object FillStyle_ {
  
  inline def apply(): FillStyle_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FillStyle_]
  }
  
  extension [Self <: FillStyle_](x: Self) {
    
    inline def setFillStyle(value: String): Self = StObject.set(x, "fillStyle", value.asInstanceOf[js.Any])
    
    inline def setFillStyleUndefined: Self = StObject.set(x, "fillStyle", js.undefined)
    
    inline def setShadowBlur(value: String): Self = StObject.set(x, "shadowBlur", value.asInstanceOf[js.Any])
    
    inline def setShadowBlurUndefined: Self = StObject.set(x, "shadowBlur", js.undefined)
    
    inline def setShadowColor(value: String): Self = StObject.set(x, "shadowColor", value.asInstanceOf[js.Any])
    
    inline def setShadowColorUndefined: Self = StObject.set(x, "shadowColor", js.undefined)
    
    inline def setStrokeStyle(value: String): Self = StObject.set(x, "strokeStyle", value.asInstanceOf[js.Any])
    
    inline def setStrokeStyleUndefined: Self = StObject.set(x, "strokeStyle", js.undefined)
  }
}
