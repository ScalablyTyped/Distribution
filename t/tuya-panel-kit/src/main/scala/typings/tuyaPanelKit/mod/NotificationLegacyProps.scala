package typings.tuyaPanelKit.mod

import typings.react.mod.ReactNode
import typings.reactNative.mod.TouchableOpacityProps
import typings.tuyaPanelKit.anon.CloseIcon
import typings.tuyaPanelKit.tuyaPanelKitStrings.error
import typings.tuyaPanelKit.tuyaPanelKitStrings.success
import typings.tuyaPanelKit.tuyaPanelKitStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationLegacyProps extends TouchableOpacityProps {
  
  var autoCloseTime: js.UndefOr[Double] = js.native
  
  var children: js.UndefOr[ReactNode] = js.native
  
  var enableClose: js.UndefOr[String] = js.native
  
  var icon: js.UndefOr[String] = js.native
  
  var message: js.UndefOr[String] = js.native
  
  var onClose: js.UndefOr[js.Function0[Unit]] = js.native
  
  var theme: js.UndefOr[CloseIcon] = js.native
  
  var variant: js.UndefOr[success | warning | error] = js.native
}
object NotificationLegacyProps {
  
  @scala.inline
  def apply(): NotificationLegacyProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationLegacyProps]
  }
  
  @scala.inline
  implicit class NotificationLegacyPropsOps[Self <: NotificationLegacyProps] (val x: Self) extends AnyVal {
    
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
    def setAutoCloseTime(value: Double): Self = this.set("autoCloseTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoCloseTime: Self = this.set("autoCloseTime", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setEnableClose(value: String): Self = this.set("enableClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableClose: Self = this.set("enableClose", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setOnClose(value: () => Unit): Self = this.set("onClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    
    @scala.inline
    def setTheme(value: CloseIcon): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setVariant(value: success | warning | error): Self = this.set("variant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariant: Self = this.set("variant", js.undefined)
  }
}
