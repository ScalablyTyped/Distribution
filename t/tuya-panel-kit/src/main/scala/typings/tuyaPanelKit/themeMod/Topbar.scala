package typings.tuyaPanelKit.themeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  light :tuya-panel-kit.tuya-panel-kit/theme.TopbarTheme,   dark :tuya-panel-kit.tuya-panel-kit/theme.TopbarTheme} & std.Partial<tuya-panel-kit.tuya-panel-kit/theme.TopbarTheme> */
@js.native
trait Topbar extends js.Object {
  
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
  implicit class TopbarOps[Self <: Topbar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDark(value: TopbarTheme): Self = this.set("dark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLight(value: TopbarTheme): Self = this.set("light", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackground(value: BackgroundProps): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
  }
}
