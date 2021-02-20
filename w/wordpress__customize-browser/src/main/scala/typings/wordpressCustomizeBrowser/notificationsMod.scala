package typings.wordpressCustomizeBrowser

import typings.jquery.JQuery
import typings.jquery.JQuery.Event
import typings.std.HTMLElement
import typings.wordpressCustomizeBrowser.notificationMod.Notification
import typings.wordpressCustomizeBrowser.valuesMod.Values
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notificationsMod {
  
  @JSImport("@wordpress/customize-browser/Notifications", "Notifications")
  @js.native
  class Notifications protected () extends Values[Notification] {
    def this(applicator: js.Object, argsArray: js.Object) = this()
    def this(applicator: js.Object, argsArray: js.Object, options: js.Object) = this()
    
    var alt: Boolean = js.native
    
    def constrainFocus(event: Event): Unit = js.native
    
    def count(): Double = js.native
    
    def get(args: NotificationsGetOptions): js.Array[Notification] = js.native
    
    def initialize(options: NotificationsOptions): Unit = js.native
    
    def render(): Unit = js.native
  }
  
  @js.native
  trait NotificationsGetOptions extends StObject {
    
    var sort: js.UndefOr[Boolean] = js.native
  }
  object NotificationsGetOptions {
    
    @scala.inline
    def apply(): NotificationsGetOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotificationsGetOptions]
    }
    
    @scala.inline
    implicit class NotificationsGetOptionsMutableBuilder[Self <: NotificationsGetOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSort(value: Boolean): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    }
  }
  
  @js.native
  trait NotificationsOptions extends StObject {
    
    var alt: js.UndefOr[Boolean] = js.native
    
    var container: js.UndefOr[JQuery[HTMLElement]] = js.native
  }
  object NotificationsOptions {
    
    @scala.inline
    def apply(): NotificationsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotificationsOptions]
    }
    
    @scala.inline
    implicit class NotificationsOptionsMutableBuilder[Self <: NotificationsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlt(value: Boolean): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      @scala.inline
      def setContainer(value: JQuery[HTMLElement]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    }
  }
}
