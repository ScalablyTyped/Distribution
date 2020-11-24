package typings.wordpressCustomizeBrowser.notificationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationParams extends js.Object {
  
  var containerClasses: js.UndefOr[String] = js.native
  
  var dismissible: js.UndefOr[Boolean] = js.native
  
  var message: String = js.native
  
  var setting: js.UndefOr[String] = js.native
  
  var template: js.UndefOr[js.Function1[/* data */ Notification, Unit]] = js.native
  
  var templateId: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object NotificationParams {
  
  @scala.inline
  def apply(message: String): NotificationParams = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationParams]
  }
  
  @scala.inline
  implicit class NotificationParamsOps[Self <: NotificationParams] (val x: Self) extends AnyVal {
    
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
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerClasses(value: String): Self = this.set("containerClasses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerClasses: Self = this.set("containerClasses", js.undefined)
    
    @scala.inline
    def setDismissible(value: Boolean): Self = this.set("dismissible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDismissible: Self = this.set("dismissible", js.undefined)
    
    @scala.inline
    def setSetting(value: String): Self = this.set("setting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetting: Self = this.set("setting", js.undefined)
    
    @scala.inline
    def setTemplate(value: /* data */ Notification => Unit): Self = this.set("template", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    
    @scala.inline
    def setTemplateId(value: String): Self = this.set("templateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateId: Self = this.set("templateId", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
