package typings.tuyaPanelKit.themeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  light :tuya-panel-kit.tuya-panel-kit/theme.PickerTheme,   dark :tuya-panel-kit.tuya-panel-kit/theme.PickerTheme} & std.Partial<tuya-panel-kit.tuya-panel-kit/theme.PickerTheme> */
trait Picker extends StObject {
  
  var dark: PickerTheme
  
  var fontColor: js.UndefOr[String] = js.undefined
  
  var fontSize: js.UndefOr[Double] = js.undefined
  
  var light: PickerTheme
  
  var unitFontColor: js.UndefOr[String] = js.undefined
  
  var unitFontSize: js.UndefOr[Double] = js.undefined
}
object Picker {
  
  @scala.inline
  def apply(dark: PickerTheme, light: PickerTheme): Picker = {
    val __obj = js.Dynamic.literal(dark = dark.asInstanceOf[js.Any], light = light.asInstanceOf[js.Any])
    __obj.asInstanceOf[Picker]
  }
  
  @scala.inline
  implicit class PickerMutableBuilder[Self <: Picker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDark(value: PickerTheme): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontColor(value: String): Self = StObject.set(x, "fontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontColorUndefined: Self = StObject.set(x, "fontColor", js.undefined)
    
    @scala.inline
    def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    @scala.inline
    def setLight(value: PickerTheme): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitFontColor(value: String): Self = StObject.set(x, "unitFontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitFontColorUndefined: Self = StObject.set(x, "unitFontColor", js.undefined)
    
    @scala.inline
    def setUnitFontSize(value: Double): Self = StObject.set(x, "unitFontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitFontSizeUndefined: Self = StObject.set(x, "unitFontSize", js.undefined)
  }
}
