package typings.tuyaPanelKit.themeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  light :tuya-panel-kit.tuya-panel-kit/theme.TipsTheme,   dark :tuya-panel-kit.tuya-panel-kit/theme.TipsTheme} & std.Partial<tuya-panel-kit.tuya-panel-kit/theme.TipsTheme> */
trait Tips extends StObject {
  
  var bgColor: js.UndefOr[String] = js.undefined
  
  var dark: TipsTheme
  
  var light: TipsTheme
}
object Tips {
  
  inline def apply(dark: TipsTheme, light: TipsTheme): Tips = {
    val __obj = js.Dynamic.literal(dark = dark.asInstanceOf[js.Any], light = light.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tips]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Tips] (val x: Self) extends AnyVal {
    
    inline def setBgColor(value: String): Self = StObject.set(x, "bgColor", value.asInstanceOf[js.Any])
    
    inline def setBgColorUndefined: Self = StObject.set(x, "bgColor", js.undefined)
    
    inline def setDark(value: TipsTheme): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
    
    inline def setLight(value: TipsTheme): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
  }
}
