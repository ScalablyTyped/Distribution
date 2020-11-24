package typings.wepy.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelColor extends js.Object {
  
  var cancelColor: js.UndefOr[String] = js.native
  
  var cancelText: js.UndefOr[String] = js.native
  
  var confirmColor: js.UndefOr[String] = js.native
  
  var confirmText: js.UndefOr[String] = js.native
  
  var content: String = js.native
  
  var showCancel: js.UndefOr[Boolean] = js.native
  
  var title: String = js.native
}
object CancelColor {
  
  @scala.inline
  def apply(content: String, title: String): CancelColor = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelColor]
  }
  
  @scala.inline
  implicit class CancelColorOps[Self <: CancelColor] (val x: Self) extends AnyVal {
    
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
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelColor(value: String): Self = this.set("cancelColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelColor: Self = this.set("cancelColor", js.undefined)
    
    @scala.inline
    def setCancelText(value: String): Self = this.set("cancelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelText: Self = this.set("cancelText", js.undefined)
    
    @scala.inline
    def setConfirmColor(value: String): Self = this.set("confirmColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfirmColor: Self = this.set("confirmColor", js.undefined)
    
    @scala.inline
    def setConfirmText(value: String): Self = this.set("confirmText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfirmText: Self = this.set("confirmText", js.undefined)
    
    @scala.inline
    def setShowCancel(value: Boolean): Self = this.set("showCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowCancel: Self = this.set("showCancel", js.undefined)
  }
}
