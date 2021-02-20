package typings.tuyaPanelKit.themeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  light :tuya-panel-kit.tuya-panel-kit/theme.TipsTheme,   dark :tuya-panel-kit.tuya-panel-kit/theme.TipsTheme} & std.Partial<tuya-panel-kit.tuya-panel-kit/theme.TipsTheme> */
@js.native
trait Tips extends StObject {
  
  var bgColor: js.UndefOr[String] = js.native
  
  var dark: TipsTheme = js.native
  
  var light: TipsTheme = js.native
}
object Tips {
  
  @scala.inline
  def apply(dark: TipsTheme, light: TipsTheme): Tips = {
    val __obj = js.Dynamic.literal(dark = dark.asInstanceOf[js.Any], light = light.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tips]
  }
  
  @scala.inline
  implicit class TipsMutableBuilder[Self <: Tips] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBgColor(value: String): Self = StObject.set(x, "bgColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgColorUndefined: Self = StObject.set(x, "bgColor", js.undefined)
    
    @scala.inline
    def setDark(value: TipsTheme): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLight(value: TipsTheme): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
  }
}
