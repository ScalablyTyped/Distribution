package typings.tuyaPanelKit.themeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  type :string,   basic :tuya-panel-kit.tuya-panel-kit/theme.DialogTheme,   dark :tuya-panel-kit.tuya-panel-kit/theme.DialogTheme,   system :tuya-panel-kit.tuya-panel-kit/theme.DialogTheme} & std.Partial<tuya-panel-kit.tuya-panel-kit/theme.DialogTheme> */
@js.native
trait Dialog extends js.Object {
  
  var basic: DialogTheme = js.native
  
  var bg: js.UndefOr[String] = js.native
  
  var cancelFontColor: js.UndefOr[String] = js.native
  
  var cancelFontSize: js.UndefOr[Double] = js.native
  
  var cellHeight: js.UndefOr[Double] = js.native
  
  var confirmFontColor: js.UndefOr[String] = js.native
  
  var confirmFontSize: js.UndefOr[Double] = js.native
  
  var dark: DialogTheme = js.native
  
  var lineColor: js.UndefOr[String] = js.native
  
  var prompt: js.UndefOr[PromptTheme] = js.native
  
  var radius: js.UndefOr[Double] = js.native
  
  var subTitleFontColor: js.UndefOr[String] = js.native
  
  var subTitleFontSize: js.UndefOr[Double] = js.native
  
  var system: DialogTheme = js.native
  
  var titleFontColor: js.UndefOr[String] = js.native
  
  var titleFontSize: js.UndefOr[Double] = js.native
  
  var `type`: String = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object Dialog {
  
  @scala.inline
  def apply(basic: DialogTheme, dark: DialogTheme, system: DialogTheme, `type`: String): Dialog = {
    val __obj = js.Dynamic.literal(basic = basic.asInstanceOf[js.Any], dark = dark.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dialog]
  }
  
  @scala.inline
  implicit class DialogOps[Self <: Dialog] (val x: Self) extends AnyVal {
    
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
    def setBasic(value: DialogTheme): Self = this.set("basic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDark(value: DialogTheme): Self = this.set("dark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystem(value: DialogTheme): Self = this.set("system", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBg(value: String): Self = this.set("bg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBg: Self = this.set("bg", js.undefined)
    
    @scala.inline
    def setCancelFontColor(value: String): Self = this.set("cancelFontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelFontColor: Self = this.set("cancelFontColor", js.undefined)
    
    @scala.inline
    def setCancelFontSize(value: Double): Self = this.set("cancelFontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelFontSize: Self = this.set("cancelFontSize", js.undefined)
    
    @scala.inline
    def setCellHeight(value: Double): Self = this.set("cellHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellHeight: Self = this.set("cellHeight", js.undefined)
    
    @scala.inline
    def setConfirmFontColor(value: String): Self = this.set("confirmFontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfirmFontColor: Self = this.set("confirmFontColor", js.undefined)
    
    @scala.inline
    def setConfirmFontSize(value: Double): Self = this.set("confirmFontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfirmFontSize: Self = this.set("confirmFontSize", js.undefined)
    
    @scala.inline
    def setLineColor(value: String): Self = this.set("lineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineColor: Self = this.set("lineColor", js.undefined)
    
    @scala.inline
    def setPrompt(value: PromptTheme): Self = this.set("prompt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrompt: Self = this.set("prompt", js.undefined)
    
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
    
    @scala.inline
    def setSubTitleFontColor(value: String): Self = this.set("subTitleFontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubTitleFontColor: Self = this.set("subTitleFontColor", js.undefined)
    
    @scala.inline
    def setSubTitleFontSize(value: Double): Self = this.set("subTitleFontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubTitleFontSize: Self = this.set("subTitleFontSize", js.undefined)
    
    @scala.inline
    def setTitleFontColor(value: String): Self = this.set("titleFontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleFontColor: Self = this.set("titleFontColor", js.undefined)
    
    @scala.inline
    def setTitleFontSize(value: Double): Self = this.set("titleFontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleFontSize: Self = this.set("titleFontSize", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
