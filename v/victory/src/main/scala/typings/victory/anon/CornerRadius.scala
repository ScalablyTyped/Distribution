package typings.victory.anon

import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CornerRadius extends StObject {
  
  var cornerRadius: js.UndefOr[Double] = js.undefined
  
  var flyoutStyle: js.UndefOr[CSSProperties] = js.undefined
  
  var pointerLength: js.UndefOr[Double] = js.undefined
  
  var style: js.UndefOr[CSSProperties] = js.undefined
}
object CornerRadius {
  
  inline def apply(): CornerRadius = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CornerRadius]
  }
  
  extension [Self <: CornerRadius](x: Self) {
    
    inline def setCornerRadius(value: Double): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
    
    inline def setCornerRadiusUndefined: Self = StObject.set(x, "cornerRadius", js.undefined)
    
    inline def setFlyoutStyle(value: CSSProperties): Self = StObject.set(x, "flyoutStyle", value.asInstanceOf[js.Any])
    
    inline def setFlyoutStyleUndefined: Self = StObject.set(x, "flyoutStyle", js.undefined)
    
    inline def setPointerLength(value: Double): Self = StObject.set(x, "pointerLength", value.asInstanceOf[js.Any])
    
    inline def setPointerLengthUndefined: Self = StObject.set(x, "pointerLength", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
