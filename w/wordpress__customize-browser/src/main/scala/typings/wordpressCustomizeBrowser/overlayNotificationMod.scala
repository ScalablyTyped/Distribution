package typings.wordpressCustomizeBrowser

import typings.jquery.JQuery.Event
import typings.wordpressCustomizeBrowser.notificationMod.Notification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object overlayNotificationMod {
  
  @JSImport("@wordpress/customize-browser/OverlayNotification", "OverlayNotification")
  @js.native
  open class OverlayNotification protected () extends Notification {
    def this(applicator: js.Object, argsArray: js.Object) = this()
    def this(applicator: js.Object, argsArray: js.Object, options: js.Object) = this()
    
    def handleEscape(event: Event): Unit = js.native
    
    var loading: Boolean = js.native
  }
}
