package typings.tuyaPanelKit.themeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  light :tuya-panel-kit.tuya-panel-kit/theme.ButtonTheme,   dark :tuya-panel-kit.tuya-panel-kit/theme.ButtonTheme} & std.Partial<tuya-panel-kit.tuya-panel-kit/theme.ButtonTheme> */
trait Button extends StObject {
  
  var bgHeight: js.UndefOr[Double | Null] = js.undefined
  
  var bgRadius: js.UndefOr[Double | Null] = js.undefined
  
  var bgWidth: js.UndefOr[Double | Null] = js.undefined
  
  var dark: ButtonTheme
  
  var fontSize: js.UndefOr[Double] = js.undefined
  
  var iconSize: js.UndefOr[Double] = js.undefined
  
  var light: ButtonTheme
  
  var margin: js.UndefOr[js.Array[Double]] = js.undefined
}
object Button {
  
  inline def apply(dark: ButtonTheme, light: ButtonTheme): Button = {
    val __obj = js.Dynamic.literal(dark = dark.asInstanceOf[js.Any], light = light.asInstanceOf[js.Any])
    __obj.asInstanceOf[Button]
  }
  
  extension [Self <: Button](x: Self) {
    
    inline def setBgHeight(value: Double): Self = StObject.set(x, "bgHeight", value.asInstanceOf[js.Any])
    
    inline def setBgHeightNull: Self = StObject.set(x, "bgHeight", null)
    
    inline def setBgHeightUndefined: Self = StObject.set(x, "bgHeight", js.undefined)
    
    inline def setBgRadius(value: Double): Self = StObject.set(x, "bgRadius", value.asInstanceOf[js.Any])
    
    inline def setBgRadiusNull: Self = StObject.set(x, "bgRadius", null)
    
    inline def setBgRadiusUndefined: Self = StObject.set(x, "bgRadius", js.undefined)
    
    inline def setBgWidth(value: Double): Self = StObject.set(x, "bgWidth", value.asInstanceOf[js.Any])
    
    inline def setBgWidthNull: Self = StObject.set(x, "bgWidth", null)
    
    inline def setBgWidthUndefined: Self = StObject.set(x, "bgWidth", js.undefined)
    
    inline def setDark(value: ButtonTheme): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
    
    inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setIconSize(value: Double): Self = StObject.set(x, "iconSize", value.asInstanceOf[js.Any])
    
    inline def setIconSizeUndefined: Self = StObject.set(x, "iconSize", js.undefined)
    
    inline def setLight(value: ButtonTheme): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
    
    inline def setMargin(value: js.Array[Double]): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setMarginVarargs(value: Double*): Self = StObject.set(x, "margin", js.Array(value*))
  }
}
