package typings.tuyaPanelKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BgColor extends StObject {
  
  var bgColor: js.UndefOr[String] = js.undefined
  
  var bgHeight: js.UndefOr[Double] = js.undefined
  
  var bgRadius: js.UndefOr[Double] = js.undefined
  
  var bgWidth: js.UndefOr[Double] = js.undefined
  
  var fontColor: js.UndefOr[String] = js.undefined
  
  var fontSize: js.UndefOr[Double] = js.undefined
  
  var iconColor: js.UndefOr[String] = js.undefined
  
  var iconSize: js.UndefOr[Double] = js.undefined
  
  var margin: js.UndefOr[js.Array[Double]] = js.undefined
}
object BgColor {
  
  inline def apply(): BgColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BgColor]
  }
  
  extension [Self <: BgColor](x: Self) {
    
    inline def setBgColor(value: String): Self = StObject.set(x, "bgColor", value.asInstanceOf[js.Any])
    
    inline def setBgColorUndefined: Self = StObject.set(x, "bgColor", js.undefined)
    
    inline def setBgHeight(value: Double): Self = StObject.set(x, "bgHeight", value.asInstanceOf[js.Any])
    
    inline def setBgHeightUndefined: Self = StObject.set(x, "bgHeight", js.undefined)
    
    inline def setBgRadius(value: Double): Self = StObject.set(x, "bgRadius", value.asInstanceOf[js.Any])
    
    inline def setBgRadiusUndefined: Self = StObject.set(x, "bgRadius", js.undefined)
    
    inline def setBgWidth(value: Double): Self = StObject.set(x, "bgWidth", value.asInstanceOf[js.Any])
    
    inline def setBgWidthUndefined: Self = StObject.set(x, "bgWidth", js.undefined)
    
    inline def setFontColor(value: String): Self = StObject.set(x, "fontColor", value.asInstanceOf[js.Any])
    
    inline def setFontColorUndefined: Self = StObject.set(x, "fontColor", js.undefined)
    
    inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setIconColor(value: String): Self = StObject.set(x, "iconColor", value.asInstanceOf[js.Any])
    
    inline def setIconColorUndefined: Self = StObject.set(x, "iconColor", js.undefined)
    
    inline def setIconSize(value: Double): Self = StObject.set(x, "iconSize", value.asInstanceOf[js.Any])
    
    inline def setIconSizeUndefined: Self = StObject.set(x, "iconSize", js.undefined)
    
    inline def setMargin(value: js.Array[Double]): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setMarginVarargs(value: Double*): Self = StObject.set(x, "margin", js.Array(value :_*))
  }
}
