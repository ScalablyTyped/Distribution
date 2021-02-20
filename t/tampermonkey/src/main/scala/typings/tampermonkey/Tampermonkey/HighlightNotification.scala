package typings.tampermonkey.Tampermonkey

import typings.tampermonkey.tampermonkeyBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HighlightNotification
  extends Notification
     with NotificationDetails {
  
  @JSName("highlight")
  var highlight_HighlightNotification: `true` = js.native
  
  @JSName("text")
  var text_HighlightNotification: js.UndefOr[scala.Nothing] = js.native
}
object HighlightNotification {
  
  @scala.inline
  def apply(highlight: `true`): HighlightNotification = {
    val __obj = js.Dynamic.literal(highlight = highlight.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightNotification]
  }
  
  @scala.inline
  implicit class HighlightNotificationMutableBuilder[Self <: HighlightNotification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHighlight(value: `true`): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
  }
}
