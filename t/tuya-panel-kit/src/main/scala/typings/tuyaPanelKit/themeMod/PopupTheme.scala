package typings.tuyaPanelKit.themeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PopupTheme extends js.Object {
  
  var backIconColor: String = js.native
  
  var bottomBg: String = js.native
  
  var cancelFontColor: String = js.native
  
  var cancelFontSize: Double = js.native
  
  var cellBg: String = js.native
  
  var cellFontColor: String = js.native
  
  var cellFontSize: Double = js.native
  
  var cellHeight: Double = js.native
  
  var checkboxColor: String = js.native
  
  var confirmFontColor: String = js.native
  
  var confirmFontSize: Double = js.native
  
  var footerRadius: Double = js.native
  
  var lineColor: String = js.native
  
  var list: PopupListTheme = js.native
  
  var numberSelector: PopupNumberSelectorTheme = js.native
  
  var subTitleFontColor: String = js.native
  
  var tintColor: String = js.native
  
  var titleBg: String = js.native
  
  var titleFontColor: String = js.native
  
  var titleFontSize: Double = js.native
  
  var titleHeight: Double = js.native
  
  var titleRadius: Double = js.native
}
object PopupTheme {
  
  @scala.inline
  def apply(
    backIconColor: String,
    bottomBg: String,
    cancelFontColor: String,
    cancelFontSize: Double,
    cellBg: String,
    cellFontColor: String,
    cellFontSize: Double,
    cellHeight: Double,
    checkboxColor: String,
    confirmFontColor: String,
    confirmFontSize: Double,
    footerRadius: Double,
    lineColor: String,
    list: PopupListTheme,
    numberSelector: PopupNumberSelectorTheme,
    subTitleFontColor: String,
    tintColor: String,
    titleBg: String,
    titleFontColor: String,
    titleFontSize: Double,
    titleHeight: Double,
    titleRadius: Double
  ): PopupTheme = {
    val __obj = js.Dynamic.literal(backIconColor = backIconColor.asInstanceOf[js.Any], bottomBg = bottomBg.asInstanceOf[js.Any], cancelFontColor = cancelFontColor.asInstanceOf[js.Any], cancelFontSize = cancelFontSize.asInstanceOf[js.Any], cellBg = cellBg.asInstanceOf[js.Any], cellFontColor = cellFontColor.asInstanceOf[js.Any], cellFontSize = cellFontSize.asInstanceOf[js.Any], cellHeight = cellHeight.asInstanceOf[js.Any], checkboxColor = checkboxColor.asInstanceOf[js.Any], confirmFontColor = confirmFontColor.asInstanceOf[js.Any], confirmFontSize = confirmFontSize.asInstanceOf[js.Any], footerRadius = footerRadius.asInstanceOf[js.Any], lineColor = lineColor.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], numberSelector = numberSelector.asInstanceOf[js.Any], subTitleFontColor = subTitleFontColor.asInstanceOf[js.Any], tintColor = tintColor.asInstanceOf[js.Any], titleBg = titleBg.asInstanceOf[js.Any], titleFontColor = titleFontColor.asInstanceOf[js.Any], titleFontSize = titleFontSize.asInstanceOf[js.Any], titleHeight = titleHeight.asInstanceOf[js.Any], titleRadius = titleRadius.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopupTheme]
  }
  
  @scala.inline
  implicit class PopupThemeOps[Self <: PopupTheme] (val x: Self) extends AnyVal {
    
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
    def setBackIconColor(value: String): Self = this.set("backIconColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomBg(value: String): Self = this.set("bottomBg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelFontColor(value: String): Self = this.set("cancelFontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelFontSize(value: Double): Self = this.set("cancelFontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellBg(value: String): Self = this.set("cellBg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellFontColor(value: String): Self = this.set("cellFontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellFontSize(value: Double): Self = this.set("cellFontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellHeight(value: Double): Self = this.set("cellHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckboxColor(value: String): Self = this.set("checkboxColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfirmFontColor(value: String): Self = this.set("confirmFontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfirmFontSize(value: Double): Self = this.set("confirmFontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterRadius(value: Double): Self = this.set("footerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineColor(value: String): Self = this.set("lineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setList(value: PopupListTheme): Self = this.set("list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberSelector(value: PopupNumberSelectorTheme): Self = this.set("numberSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubTitleFontColor(value: String): Self = this.set("subTitleFontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTintColor(value: String): Self = this.set("tintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleBg(value: String): Self = this.set("titleBg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleFontColor(value: String): Self = this.set("titleFontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleFontSize(value: Double): Self = this.set("titleFontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleHeight(value: Double): Self = this.set("titleHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleRadius(value: Double): Self = this.set("titleRadius", value.asInstanceOf[js.Any])
  }
}
