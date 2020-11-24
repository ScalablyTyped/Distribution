package typings.tuyaPanelKit.themeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  light :tuya-panel-kit.tuya-panel-kit/theme.TipsTheme,   dark :tuya-panel-kit.tuya-panel-kit/theme.TipsTheme} & std.Partial<tuya-panel-kit.tuya-panel-kit/theme.TipsTheme> */
@js.native
trait Tips extends js.Object {
  
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
  implicit class TipsOps[Self <: Tips] (val x: Self) extends AnyVal {
    
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
    def setDark(value: TipsTheme): Self = this.set("dark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLight(value: TipsTheme): Self = this.set("light", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgColor(value: String): Self = this.set("bgColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBgColor: Self = this.set("bgColor", js.undefined)
  }
}
