package typings.wordpressCustomizeBrowser

import typings.jquery.JQuery
import typings.std.HTMLElement
import typings.wordpressCustomizeBrowser.classMod.Class
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notificationMod {
  
  @JSImport("@wordpress/customize-browser/Notification", "Notification")
  @js.native
  class Notification protected () extends Class {
    def this(applicator: js.Object, argsArray: js.Object) = this()
    def this(applicator: js.Object, argsArray: js.Object, options: js.Object) = this()
    
    var code: String = js.native
    
    var containerClasses: String = js.native
    
    def initialize(): Unit = js.native
    def initialize(code: String): Unit = js.native
    def initialize(code: String, params: NotificationParams): Unit = js.native
    def initialize(code: Unit, params: NotificationParams): Unit = js.native
    
    def render(): JQuery[HTMLElement] = js.native
    
    var template: Null | (js.Function1[/* data */ this.type, Unit]) = js.native
    
    var templateId: String = js.native
  }
  
  trait NotificationParams extends StObject {
    
    var containerClasses: js.UndefOr[String] = js.undefined
    
    var dismissible: js.UndefOr[Boolean] = js.undefined
    
    var message: String
    
    var setting: js.UndefOr[String] = js.undefined
    
    var template: js.UndefOr[js.Function1[/* data */ Notification, Unit]] = js.undefined
    
    var templateId: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object NotificationParams {
    
    inline def apply(message: String): NotificationParams = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotificationParams]
    }
    
    extension [Self <: NotificationParams](x: Self) {
      
      inline def setContainerClasses(value: String): Self = StObject.set(x, "containerClasses", value.asInstanceOf[js.Any])
      
      inline def setContainerClassesUndefined: Self = StObject.set(x, "containerClasses", js.undefined)
      
      inline def setDismissible(value: Boolean): Self = StObject.set(x, "dismissible", value.asInstanceOf[js.Any])
      
      inline def setDismissibleUndefined: Self = StObject.set(x, "dismissible", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setSetting(value: String): Self = StObject.set(x, "setting", value.asInstanceOf[js.Any])
      
      inline def setSettingUndefined: Self = StObject.set(x, "setting", js.undefined)
      
      inline def setTemplate(value: /* data */ Notification => Unit): Self = StObject.set(x, "template", js.Any.fromFunction1(value))
      
      inline def setTemplateId(value: String): Self = StObject.set(x, "templateId", value.asInstanceOf[js.Any])
      
      inline def setTemplateIdUndefined: Self = StObject.set(x, "templateId", js.undefined)
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
