package typings.tuyaPanelKit.themeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  light :tuya-panel-kit.tuya-panel-kit/theme.TopbarTheme,   dark :tuya-panel-kit.tuya-panel-kit/theme.TopbarTheme} & std.Partial<tuya-panel-kit.tuya-panel-kit/theme.TopbarTheme> */
trait Topbar extends StObject {
  
  var background: js.UndefOr[BackgroundProps] = js.undefined
  
  var color: js.UndefOr[String] = js.undefined
  
  var dark: TopbarTheme
  
  var light: TopbarTheme
}
object Topbar {
  
  inline def apply(dark: TopbarTheme, light: TopbarTheme): Topbar = {
    val __obj = js.Dynamic.literal(dark = dark.asInstanceOf[js.Any], light = light.asInstanceOf[js.Any])
    __obj.asInstanceOf[Topbar]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Topbar] (val x: Self) extends AnyVal {
    
    inline def setBackground(value: BackgroundProps): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDark(value: TopbarTheme): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
    
    inline def setLight(value: TopbarTheme): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
  }
}
