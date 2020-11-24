package typings.tuyaPanelKit.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloseIcon extends js.Object {
  
  var background: js.UndefOr[String] = js.native
  
  var closeIcon: js.UndefOr[String] = js.native
  
  var errorIcon: js.UndefOr[String] = js.native
  
  var iconColor: js.UndefOr[String] = js.native
  
  var radius: js.UndefOr[Double] = js.native
  
  var successIcon: js.UndefOr[String] = js.native
  
  var text: js.UndefOr[String] = js.native
  
  var warningIcon: js.UndefOr[String] = js.native
}
object CloseIcon {
  
  @scala.inline
  def apply(): CloseIcon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloseIcon]
  }
  
  @scala.inline
  implicit class CloseIconOps[Self <: CloseIcon] (val x: Self) extends AnyVal {
    
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
    def setBackground(value: String): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    
    @scala.inline
    def setCloseIcon(value: String): Self = this.set("closeIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseIcon: Self = this.set("closeIcon", js.undefined)
    
    @scala.inline
    def setErrorIcon(value: String): Self = this.set("errorIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorIcon: Self = this.set("errorIcon", js.undefined)
    
    @scala.inline
    def setIconColor(value: String): Self = this.set("iconColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconColor: Self = this.set("iconColor", js.undefined)
    
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
    
    @scala.inline
    def setSuccessIcon(value: String): Self = this.set("successIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuccessIcon: Self = this.set("successIcon", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setWarningIcon(value: String): Self = this.set("warningIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWarningIcon: Self = this.set("warningIcon", js.undefined)
  }
}
