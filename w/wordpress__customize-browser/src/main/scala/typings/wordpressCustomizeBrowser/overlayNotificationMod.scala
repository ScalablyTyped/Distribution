package typings.wordpressCustomizeBrowser

import typings.jquery.JQuery.Event
import typings.wordpressCustomizeBrowser.notificationMod.Notification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/customize-browser/OverlayNotification", JSImport.Namespace)
@js.native
object overlayNotificationMod extends js.Object {
  
  @js.native
  class OverlayNotification () extends Notification {
    
    def handleEscape(event: Event): Unit = js.native
    
    var loading: Boolean = js.native
  }
}
