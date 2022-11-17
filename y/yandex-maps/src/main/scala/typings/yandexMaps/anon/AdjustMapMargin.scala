package typings.yandexMaps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdjustMapMargin extends StObject {
  
  var adjustMapMargin: js.UndefOr[Boolean] = js.undefined
  
  var collapseOnBlur: js.UndefOr[Boolean] = js.undefined
  
  var float: js.UndefOr["none" | "left" | "right"] = js.undefined
  
  var floatIndex: js.UndefOr[Double] = js.undefined
  
  var popupAnimate: js.UndefOr[Boolean] = js.undefined
  
  var popupFloat: js.UndefOr["auto" | "left" | "right"] = js.undefined
  
  var popupWidth: js.UndefOr[String] = js.undefined
  
  var position: js.UndefOr[Bottom] = js.undefined
  
  var size: js.UndefOr["auto" | "small" | "medium" | "large"] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
}
object AdjustMapMargin {
  
  inline def apply(): AdjustMapMargin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdjustMapMargin]
  }
  
  extension [Self <: AdjustMapMargin](x: Self) {
    
    inline def setAdjustMapMargin(value: Boolean): Self = StObject.set(x, "adjustMapMargin", value.asInstanceOf[js.Any])
    
    inline def setAdjustMapMarginUndefined: Self = StObject.set(x, "adjustMapMargin", js.undefined)
    
    inline def setCollapseOnBlur(value: Boolean): Self = StObject.set(x, "collapseOnBlur", value.asInstanceOf[js.Any])
    
    inline def setCollapseOnBlurUndefined: Self = StObject.set(x, "collapseOnBlur", js.undefined)
    
    inline def setFloat(value: "none" | "left" | "right"): Self = StObject.set(x, "float", value.asInstanceOf[js.Any])
    
    inline def setFloatIndex(value: Double): Self = StObject.set(x, "floatIndex", value.asInstanceOf[js.Any])
    
    inline def setFloatIndexUndefined: Self = StObject.set(x, "floatIndex", js.undefined)
    
    inline def setFloatUndefined: Self = StObject.set(x, "float", js.undefined)
    
    inline def setPopupAnimate(value: Boolean): Self = StObject.set(x, "popupAnimate", value.asInstanceOf[js.Any])
    
    inline def setPopupAnimateUndefined: Self = StObject.set(x, "popupAnimate", js.undefined)
    
    inline def setPopupFloat(value: "auto" | "left" | "right"): Self = StObject.set(x, "popupFloat", value.asInstanceOf[js.Any])
    
    inline def setPopupFloatUndefined: Self = StObject.set(x, "popupFloat", js.undefined)
    
    inline def setPopupWidth(value: String): Self = StObject.set(x, "popupWidth", value.asInstanceOf[js.Any])
    
    inline def setPopupWidthUndefined: Self = StObject.set(x, "popupWidth", js.undefined)
    
    inline def setPosition(value: Bottom): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setSize(value: "auto" | "small" | "medium" | "large"): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
