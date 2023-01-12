package typings.tampermonkey.Tampermonkey

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Notification extends StObject {
  
  /** Flag whether to highlight the tab that sends the notification */
  var highlight: js.UndefOr[Boolean] = js.undefined
  
  var image: js.UndefOr[String] = js.undefined
  
  /**
    * Called when the notification is closed (no matter if this was
    * triggered by a timeout or a click) or the tab was highlighted
    */
  var onclick: js.UndefOr[NotificationOnClick] = js.undefined
  
  /** Called in case the user clicks the notification */
  var ondone: js.UndefOr[NotificationOnDone] = js.undefined
  
  /** Whether to play or not play a sound */
  var silent: js.UndefOr[Boolean] = js.undefined
  
  /** Text of the notification (optional if highlight is set) */
  var text: js.UndefOr[String] = js.undefined
  
  /** Time after that the notification will be hidden. `0` = disabled */
  var timeout: js.UndefOr[Double] = js.undefined
  
  /** Notification title. If not specified the script name is used */
  var title: js.UndefOr[String] = js.undefined
}
object Notification {
  
  inline def apply(): Notification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Notification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Notification] (val x: Self) extends AnyVal {
    
    inline def setHighlight(value: Boolean): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
    
    inline def setHighlightUndefined: Self = StObject.set(x, "highlight", js.undefined)
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setOnclick(value: NotificationOnClick): Self = StObject.set(x, "onclick", value.asInstanceOf[js.Any])
    
    inline def setOnclickUndefined: Self = StObject.set(x, "onclick", js.undefined)
    
    inline def setOndone(value: NotificationOnDone): Self = StObject.set(x, "ondone", value.asInstanceOf[js.Any])
    
    inline def setOndoneUndefined: Self = StObject.set(x, "ondone", js.undefined)
    
    inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
