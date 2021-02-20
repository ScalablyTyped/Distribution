package typings.wordpressCustomizeBrowser

import typings.jquery.JQuery
import typings.std.HTMLElement
import typings.wordpressCustomizeBrowser.classMod.Class
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    def initialize(code: js.UndefOr[scala.Nothing], params: NotificationParams): Unit = js.native
    def initialize(code: String): Unit = js.native
    def initialize(code: String, params: NotificationParams): Unit = js.native
    
    def render(): JQuery[HTMLElement] = js.native
    
    var template: Null | (js.Function1[/* data */ this.type, Unit]) = js.native
    
    var templateId: String = js.native
  }
  
  @js.native
  trait NotificationParams extends StObject {
    
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
    implicit class NotificationParamsMutableBuilder[Self <: NotificationParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainerClasses(value: String): Self = StObject.set(x, "containerClasses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerClassesUndefined: Self = StObject.set(x, "containerClasses", js.undefined)
      
      @scala.inline
      def setDismissible(value: Boolean): Self = StObject.set(x, "dismissible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDismissibleUndefined: Self = StObject.set(x, "dismissible", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetting(value: String): Self = StObject.set(x, "setting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSettingUndefined: Self = StObject.set(x, "setting", js.undefined)
      
      @scala.inline
      def setTemplate(value: /* data */ Notification => Unit): Self = StObject.set(x, "template", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTemplateId(value: String): Self = StObject.set(x, "templateId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateIdUndefined: Self = StObject.set(x, "templateId", js.undefined)
      
      @scala.inline
      def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
