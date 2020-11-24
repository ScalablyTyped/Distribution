package typings.tuyaPanelKit.themeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  light :tuya-panel-kit.tuya-panel-kit/theme.BrickButtonTheme,   dark :tuya-panel-kit.tuya-panel-kit/theme.BrickButtonTheme} & std.Partial<tuya-panel-kit.tuya-panel-kit/theme.BrickButtonTheme> */
@js.native
trait BrickButton extends js.Object {
  
  var bgBorder: js.UndefOr[String] = js.native
  
  var bgBorderWidth: js.UndefOr[Double] = js.native
  
  var bgRadius: js.UndefOr[Double] = js.native
  
  var dark: BrickButtonTheme = js.native
  
  var fontColor: js.UndefOr[String] = js.native
  
  var fontSize: js.UndefOr[Double] = js.native
  
  var light: BrickButtonTheme = js.native
  
  var loadingBackground: js.UndefOr[String] = js.native
  
  var loadingColor: js.UndefOr[String] = js.native
}
object BrickButton {
  
  @scala.inline
  def apply(dark: BrickButtonTheme, light: BrickButtonTheme): BrickButton = {
    val __obj = js.Dynamic.literal(dark = dark.asInstanceOf[js.Any], light = light.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrickButton]
  }
  
  @scala.inline
  implicit class BrickButtonOps[Self <: BrickButton] (val x: Self) extends AnyVal {
    
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
    def setDark(value: BrickButtonTheme): Self = this.set("dark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLight(value: BrickButtonTheme): Self = this.set("light", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgBorder(value: String): Self = this.set("bgBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBgBorder: Self = this.set("bgBorder", js.undefined)
    
    @scala.inline
    def setBgBorderWidth(value: Double): Self = this.set("bgBorderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBgBorderWidth: Self = this.set("bgBorderWidth", js.undefined)
    
    @scala.inline
    def setBgRadius(value: Double): Self = this.set("bgRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBgRadius: Self = this.set("bgRadius", js.undefined)
    
    @scala.inline
    def setFontColor(value: String): Self = this.set("fontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontColor: Self = this.set("fontColor", js.undefined)
    
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    
    @scala.inline
    def setLoadingBackground(value: String): Self = this.set("loadingBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadingBackground: Self = this.set("loadingBackground", js.undefined)
    
    @scala.inline
    def setLoadingColor(value: String): Self = this.set("loadingColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadingColor: Self = this.set("loadingColor", js.undefined)
  }
}
