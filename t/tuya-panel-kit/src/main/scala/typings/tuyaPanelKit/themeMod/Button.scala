package typings.tuyaPanelKit.themeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  light :tuya-panel-kit.tuya-panel-kit/theme.ButtonTheme,   dark :tuya-panel-kit.tuya-panel-kit/theme.ButtonTheme} & std.Partial<tuya-panel-kit.tuya-panel-kit/theme.ButtonTheme> */
@js.native
trait Button extends js.Object {
  
  var bgHeight: js.UndefOr[Double | Null] = js.native
  
  var bgRadius: js.UndefOr[Double | Null] = js.native
  
  var bgWidth: js.UndefOr[Double | Null] = js.native
  
  var dark: ButtonTheme = js.native
  
  var fontSize: js.UndefOr[Double] = js.native
  
  var iconSize: js.UndefOr[Double] = js.native
  
  var light: ButtonTheme = js.native
  
  var margin: js.UndefOr[js.Array[Double]] = js.native
}
object Button {
  
  @scala.inline
  def apply(dark: ButtonTheme, light: ButtonTheme): Button = {
    val __obj = js.Dynamic.literal(dark = dark.asInstanceOf[js.Any], light = light.asInstanceOf[js.Any])
    __obj.asInstanceOf[Button]
  }
  
  @scala.inline
  implicit class ButtonOps[Self <: Button] (val x: Self) extends AnyVal {
    
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
    def setDark(value: ButtonTheme): Self = this.set("dark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLight(value: ButtonTheme): Self = this.set("light", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgHeight(value: Double): Self = this.set("bgHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBgHeight: Self = this.set("bgHeight", js.undefined)
    
    @scala.inline
    def setBgHeightNull: Self = this.set("bgHeight", null)
    
    @scala.inline
    def setBgRadius(value: Double): Self = this.set("bgRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBgRadius: Self = this.set("bgRadius", js.undefined)
    
    @scala.inline
    def setBgRadiusNull: Self = this.set("bgRadius", null)
    
    @scala.inline
    def setBgWidth(value: Double): Self = this.set("bgWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBgWidth: Self = this.set("bgWidth", js.undefined)
    
    @scala.inline
    def setBgWidthNull: Self = this.set("bgWidth", null)
    
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    
    @scala.inline
    def setIconSize(value: Double): Self = this.set("iconSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconSize: Self = this.set("iconSize", js.undefined)
    
    @scala.inline
    def setMarginVarargs(value: Double*): Self = this.set("margin", js.Array(value :_*))
    
    @scala.inline
    def setMargin(value: js.Array[Double]): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
  }
}
