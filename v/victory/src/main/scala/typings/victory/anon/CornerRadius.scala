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
  
  @scala.inline
  def apply(): CornerRadius = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CornerRadius]
  }
  
  @scala.inline
  implicit class CornerRadiusMutableBuilder[Self <: CornerRadius] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCornerRadius(value: Double): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCornerRadiusUndefined: Self = StObject.set(x, "cornerRadius", js.undefined)
    
    @scala.inline
    def setFlyoutStyle(value: CSSProperties): Self = StObject.set(x, "flyoutStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlyoutStyleUndefined: Self = StObject.set(x, "flyoutStyle", js.undefined)
    
    @scala.inline
    def setPointerLength(value: Double): Self = StObject.set(x, "pointerLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointerLengthUndefined: Self = StObject.set(x, "pointerLength", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
