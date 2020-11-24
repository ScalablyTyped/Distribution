package typings.tuyaPanelKit.themeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DialogTheme extends js.Object {
  
  var bg: String = js.native
  
  var cancelFontColor: String = js.native
  
  var cancelFontSize: Double = js.native
  
  var cellHeight: Double = js.native
  
  var confirmFontColor: String = js.native
  
  var confirmFontSize: Double = js.native
  
  var lineColor: String = js.native
  
  var prompt: PromptTheme = js.native
  
  var radius: Double = js.native
  
  var subTitleFontColor: String = js.native
  
  var subTitleFontSize: Double = js.native
  
  var titleFontColor: String = js.native
  
  var titleFontSize: Double = js.native
  
  var width: Double = js.native
}
object DialogTheme {
  
  @scala.inline
  def apply(
    bg: String,
    cancelFontColor: String,
    cancelFontSize: Double,
    cellHeight: Double,
    confirmFontColor: String,
    confirmFontSize: Double,
    lineColor: String,
    prompt: PromptTheme,
    radius: Double,
    subTitleFontColor: String,
    subTitleFontSize: Double,
    titleFontColor: String,
    titleFontSize: Double,
    width: Double
  ): DialogTheme = {
    val __obj = js.Dynamic.literal(bg = bg.asInstanceOf[js.Any], cancelFontColor = cancelFontColor.asInstanceOf[js.Any], cancelFontSize = cancelFontSize.asInstanceOf[js.Any], cellHeight = cellHeight.asInstanceOf[js.Any], confirmFontColor = confirmFontColor.asInstanceOf[js.Any], confirmFontSize = confirmFontSize.asInstanceOf[js.Any], lineColor = lineColor.asInstanceOf[js.Any], prompt = prompt.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], subTitleFontColor = subTitleFontColor.asInstanceOf[js.Any], subTitleFontSize = subTitleFontSize.asInstanceOf[js.Any], titleFontColor = titleFontColor.asInstanceOf[js.Any], titleFontSize = titleFontSize.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogTheme]
  }
  
  @scala.inline
  implicit class DialogThemeOps[Self <: DialogTheme] (val x: Self) extends AnyVal {
    
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
    def setBg(value: String): Self = this.set("bg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelFontColor(value: String): Self = this.set("cancelFontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelFontSize(value: Double): Self = this.set("cancelFontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellHeight(value: Double): Self = this.set("cellHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfirmFontColor(value: String): Self = this.set("confirmFontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfirmFontSize(value: Double): Self = this.set("confirmFontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineColor(value: String): Self = this.set("lineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrompt(value: PromptTheme): Self = this.set("prompt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubTitleFontColor(value: String): Self = this.set("subTitleFontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubTitleFontSize(value: Double): Self = this.set("subTitleFontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleFontColor(value: String): Self = this.set("titleFontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleFontSize(value: Double): Self = this.set("titleFontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
}
