package typings.tuyaPanelKit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DialogCheckbox extends TYFlatListData {
  
  var Icon: js.UndefOr[String] = js.native
  
  var hideOnUnselect: js.UndefOr[Boolean] = js.native
  
  var iconSize: js.UndefOr[Double] = js.native
  
  var reverse: js.UndefOr[Boolean] = js.native
  
  var value: js.UndefOr[String | Double] = js.native
}
object DialogCheckbox {
  
  @scala.inline
  def apply(): DialogCheckbox = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogCheckbox]
  }
  
  @scala.inline
  implicit class DialogCheckboxOps[Self <: DialogCheckbox] (val x: Self) extends AnyVal {
    
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
    def setIcon(value: String): Self = this.set("Icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("Icon", js.undefined)
    
    @scala.inline
    def setHideOnUnselect(value: Boolean): Self = this.set("hideOnUnselect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideOnUnselect: Self = this.set("hideOnUnselect", js.undefined)
    
    @scala.inline
    def setIconSize(value: Double): Self = this.set("iconSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconSize: Self = this.set("iconSize", js.undefined)
    
    @scala.inline
    def setReverse(value: Boolean): Self = this.set("reverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReverse: Self = this.set("reverse", js.undefined)
    
    @scala.inline
    def setValue(value: String | Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
