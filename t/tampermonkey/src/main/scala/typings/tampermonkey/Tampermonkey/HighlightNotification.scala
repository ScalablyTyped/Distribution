package typings.tampermonkey.Tampermonkey

import typings.tampermonkey.tampermonkeyBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HighlightNotification
  extends StObject
     with Notification
     with NotificationDetails {
  
  @JSName("highlight")
  var highlight_HighlightNotification: `true`
  
  @JSName("text")
  var text_HighlightNotification: Unit
}
object HighlightNotification {
  
  @scala.inline
  def apply(text: Unit): HighlightNotification = {
    val __obj = js.Dynamic.literal(highlight = true, text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightNotification]
  }
  
  @scala.inline
  implicit class HighlightNotificationMutableBuilder[Self <: HighlightNotification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHighlight(value: `true`): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: Unit): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
