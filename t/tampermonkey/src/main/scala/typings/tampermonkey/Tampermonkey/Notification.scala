package typings.tampermonkey.Tampermonkey

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Notification extends js.Object {
  
  /** Flag whether to highlight the tab that sends the notification */
  var highlight: js.UndefOr[Boolean] = js.native
  
  var image: js.UndefOr[String] = js.native
  
  /**
    * Called when the notification is closed (no matter if this was
    * triggered by a timeout or a click) or the tab was highlighted
    */
  var onclick: js.UndefOr[NotificationOnClick] = js.native
  
  /** Called in case the user clicks the notification */
  var ondone: js.UndefOr[NotificationOnDone] = js.native
  
  /** Text of the notification (optional if highlight is set) */
  var text: js.UndefOr[String] = js.native
  
  /** Time after that the notification will be hidden. `0` = disabled */
  var timeout: js.UndefOr[Double] = js.native
  
  /** Notification title. If not specified the script name is used */
  var title: js.UndefOr[String] = js.native
}
object Notification {
  
  @scala.inline
  def apply(): Notification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Notification]
  }
  
  @scala.inline
  implicit class NotificationOps[Self <: Notification] (val x: Self) extends AnyVal {
    
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
    def setHighlight(value: Boolean): Self = this.set("highlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlight: Self = this.set("highlight", js.undefined)
    
    @scala.inline
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    
    @scala.inline
    def setOnclick(value: NotificationOnClick): Self = this.set("onclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnclick: Self = this.set("onclick", js.undefined)
    
    @scala.inline
    def setOndone(value: NotificationOnDone): Self = this.set("ondone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOndone: Self = this.set("ondone", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
