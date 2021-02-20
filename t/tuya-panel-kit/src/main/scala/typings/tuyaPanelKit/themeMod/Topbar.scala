package typings.tuyaPanelKit.themeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  light :tuya-panel-kit.tuya-panel-kit/theme.TopbarTheme,   dark :tuya-panel-kit.tuya-panel-kit/theme.TopbarTheme} & std.Partial<tuya-panel-kit.tuya-panel-kit/theme.TopbarTheme> */
@js.native
trait Topbar extends StObject {
  
  var background: js.UndefOr[BackgroundProps] = js.native
  
  var color: js.UndefOr[String] = js.native
  
  var dark: TopbarTheme = js.native
  
  var light: TopbarTheme = js.native
}
object Topbar {
  
  @scala.inline
  def apply(dark: TopbarTheme, light: TopbarTheme): Topbar = {
    val __obj = js.Dynamic.literal(dark = dark.asInstanceOf[js.Any], light = light.asInstanceOf[js.Any])
    __obj.asInstanceOf[Topbar]
  }
  
  @scala.inline
  implicit class TopbarMutableBuilder[Self <: Topbar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackground(value: BackgroundProps): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setDark(value: TopbarTheme): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLight(value: TopbarTheme): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
  }
}
