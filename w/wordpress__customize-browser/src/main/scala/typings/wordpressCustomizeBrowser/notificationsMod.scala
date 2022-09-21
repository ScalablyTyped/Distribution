package typings.wordpressCustomizeBrowser

import typings.jquery.JQuery
import typings.jquery.JQuery.Event
import typings.std.HTMLElement
import typings.wordpressCustomizeBrowser.notificationMod.Notification
import typings.wordpressCustomizeBrowser.valuesMod.Values
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notificationsMod {
  
  @JSImport("@wordpress/customize-browser/Notifications", "Notifications")
  @js.native
  open class Notifications protected () extends Values[Notification] {
    def this(applicator: js.Object, argsArray: js.Object) = this()
    def this(applicator: js.Object, argsArray: js.Object, options: js.Object) = this()
    
    var alt: Boolean = js.native
    
    def constrainFocus(event: Event): Unit = js.native
    
    def count(): Double = js.native
    
    def get(args: NotificationsGetOptions): js.Array[Notification] = js.native
    
    def initialize(options: NotificationsOptions): Unit = js.native
    
    def render(): Unit = js.native
  }
  
  trait NotificationsGetOptions extends StObject {
    
    var sort: js.UndefOr[Boolean] = js.undefined
  }
  object NotificationsGetOptions {
    
    inline def apply(): NotificationsGetOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotificationsGetOptions]
    }
    
    extension [Self <: NotificationsGetOptions](x: Self) {
      
      inline def setSort(value: Boolean): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    }
  }
  
  trait NotificationsOptions extends StObject {
    
    var alt: js.UndefOr[Boolean] = js.undefined
    
    var container: js.UndefOr[JQuery[HTMLElement]] = js.undefined
  }
  object NotificationsOptions {
    
    inline def apply(): NotificationsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotificationsOptions]
    }
    
    extension [Self <: NotificationsOptions](x: Self) {
      
      inline def setAlt(value: Boolean): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      inline def setContainer(value: JQuery[HTMLElement]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    }
  }
}
