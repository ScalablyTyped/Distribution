package typings.tuyaPanelKit.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackIconColor extends js.Object {
  
  var backIconColor: js.UndefOr[String] = js.native
  
  var bottomBg: js.UndefOr[String] = js.native
  
  var cancelFontColor: js.UndefOr[String] = js.native
  
  var cancelFontSize: js.UndefOr[Double] = js.native
  
  var cellBg: js.UndefOr[String] = js.native
  
  var cellFontColor: js.UndefOr[String] = js.native
  
  var cellFontSize: js.UndefOr[Double] = js.native
  
  var cellHeight: js.UndefOr[Double] = js.native
  
  var checkboxColor: js.UndefOr[String] = js.native
  
  var confirmFontColor: js.UndefOr[String] = js.native
  
  var confirmFontSize: js.UndefOr[Double] = js.native
  
  var footerRadius: js.UndefOr[Double] = js.native
  
  var lineColor: js.UndefOr[String] = js.native
  
  var list: js.UndefOr[CellFontColor] = js.native
  
  var numberSelector: js.UndefOr[CellPlusColor] = js.native
  
  var subTitleFontColor: js.UndefOr[String] = js.native
  
  var tintColor: js.UndefOr[String] = js.native
  
  var titleBg: js.UndefOr[String] = js.native
  
  var titleFontColor: js.UndefOr[String] = js.native
  
  var titleFontSize: js.UndefOr[Double] = js.native
  
  var titleHeight: js.UndefOr[Double] = js.native
  
  var titleRadius: js.UndefOr[Double] = js.native
}
object BackIconColor {
  
  @scala.inline
  def apply(): BackIconColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackIconColor]
  }
  
  @scala.inline
  implicit class BackIconColorOps[Self <: BackIconColor] (val x: Self) extends AnyVal {
    
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
    def deleteBackIconColor: Self = this.set("backIconColor", js.undefined)
    
    @scala.inline
    def setBottomBg(value: String): Self = this.set("bottomBg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBottomBg: Self = this.set("bottomBg", js.undefined)
    
    @scala.inline
    def setCancelFontColor(value: String): Self = this.set("cancelFontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelFontColor: Self = this.set("cancelFontColor", js.undefined)
    
    @scala.inline
    def setCancelFontSize(value: Double): Self = this.set("cancelFontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelFontSize: Self = this.set("cancelFontSize", js.undefined)
    
    @scala.inline
    def setCellBg(value: String): Self = this.set("cellBg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellBg: Self = this.set("cellBg", js.undefined)
    
    @scala.inline
    def setCellFontColor(value: String): Self = this.set("cellFontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellFontColor: Self = this.set("cellFontColor", js.undefined)
    
    @scala.inline
    def setCellFontSize(value: Double): Self = this.set("cellFontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellFontSize: Self = this.set("cellFontSize", js.undefined)
    
    @scala.inline
    def setCellHeight(value: Double): Self = this.set("cellHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellHeight: Self = this.set("cellHeight", js.undefined)
    
    @scala.inline
    def setCheckboxColor(value: String): Self = this.set("checkboxColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckboxColor: Self = this.set("checkboxColor", js.undefined)
    
    @scala.inline
    def setConfirmFontColor(value: String): Self = this.set("confirmFontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfirmFontColor: Self = this.set("confirmFontColor", js.undefined)
    
    @scala.inline
    def setConfirmFontSize(value: Double): Self = this.set("confirmFontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfirmFontSize: Self = this.set("confirmFontSize", js.undefined)
    
    @scala.inline
    def setFooterRadius(value: Double): Self = this.set("footerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooterRadius: Self = this.set("footerRadius", js.undefined)
    
    @scala.inline
    def setLineColor(value: String): Self = this.set("lineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineColor: Self = this.set("lineColor", js.undefined)
    
    @scala.inline
    def setList(value: CellFontColor): Self = this.set("list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteList: Self = this.set("list", js.undefined)
    
    @scala.inline
    def setNumberSelector(value: CellPlusColor): Self = this.set("numberSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberSelector: Self = this.set("numberSelector", js.undefined)
    
    @scala.inline
    def setSubTitleFontColor(value: String): Self = this.set("subTitleFontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubTitleFontColor: Self = this.set("subTitleFontColor", js.undefined)
    
    @scala.inline
    def setTintColor(value: String): Self = this.set("tintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTintColor: Self = this.set("tintColor", js.undefined)
    
    @scala.inline
    def setTitleBg(value: String): Self = this.set("titleBg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleBg: Self = this.set("titleBg", js.undefined)
    
    @scala.inline
    def setTitleFontColor(value: String): Self = this.set("titleFontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleFontColor: Self = this.set("titleFontColor", js.undefined)
    
    @scala.inline
    def setTitleFontSize(value: Double): Self = this.set("titleFontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleFontSize: Self = this.set("titleFontSize", js.undefined)
    
    @scala.inline
    def setTitleHeight(value: Double): Self = this.set("titleHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleHeight: Self = this.set("titleHeight", js.undefined)
    
    @scala.inline
    def setTitleRadius(value: Double): Self = this.set("titleRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleRadius: Self = this.set("titleRadius", js.undefined)
  }
}
