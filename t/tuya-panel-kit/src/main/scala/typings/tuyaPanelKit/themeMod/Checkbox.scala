package typings.tuyaPanelKit.themeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  light :tuya-panel-kit.tuya-panel-kit/theme.CheckboxTheme,   dark :tuya-panel-kit.tuya-panel-kit/theme.CheckboxTheme} & std.Partial<tuya-panel-kit.tuya-panel-kit/theme.CheckboxTheme> */
trait Checkbox extends StObject {
  
  var activeColor: js.UndefOr[String] = js.undefined
  
  var dark: CheckboxTheme
  
  var disabledColor: js.UndefOr[String] = js.undefined
  
  var fontColor: js.UndefOr[String] = js.undefined
  
  var light: CheckboxTheme
  
  var size: js.UndefOr[Double] = js.undefined
}
object Checkbox {
  
  inline def apply(dark: CheckboxTheme, light: CheckboxTheme): Checkbox = {
    val __obj = js.Dynamic.literal(dark = dark.asInstanceOf[js.Any], light = light.asInstanceOf[js.Any])
    __obj.asInstanceOf[Checkbox]
  }
  
  extension [Self <: Checkbox](x: Self) {
    
    inline def setActiveColor(value: String): Self = StObject.set(x, "activeColor", value.asInstanceOf[js.Any])
    
    inline def setActiveColorUndefined: Self = StObject.set(x, "activeColor", js.undefined)
    
    inline def setDark(value: CheckboxTheme): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
    
    inline def setDisabledColor(value: String): Self = StObject.set(x, "disabledColor", value.asInstanceOf[js.Any])
    
    inline def setDisabledColorUndefined: Self = StObject.set(x, "disabledColor", js.undefined)
    
    inline def setFontColor(value: String): Self = StObject.set(x, "fontColor", value.asInstanceOf[js.Any])
    
    inline def setFontColorUndefined: Self = StObject.set(x, "fontColor", js.undefined)
    
    inline def setLight(value: CheckboxTheme): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
