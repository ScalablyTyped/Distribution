package typings.tampermonkey.Tampermonkey

import typings.tampermonkey.tampermonkeyBooleans.`true`
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
  implicit class HighlightNotificationOps[Self <: HighlightNotification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHighlight(value: `true`): Self = this.set("highlight", value.asInstanceOf[js.Any])
  }
}
