package typings.tampermonkey.Tampermonkey

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextNotification
  extends StObject
     with Notification
     with NotificationDetails {
  
  /** Text of the notification (optional if highlight is set) */
  @JSName("text")
  var text_TextNotification: String
}
object TextNotification {
  
  @scala.inline
  def apply(text: String): TextNotification = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextNotification]
  }
  
  @scala.inline
  implicit class TextNotificationMutableBuilder[Self <: TextNotification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
