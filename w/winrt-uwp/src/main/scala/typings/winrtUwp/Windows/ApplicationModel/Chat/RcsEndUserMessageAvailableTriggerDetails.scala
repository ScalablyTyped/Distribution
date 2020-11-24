package typings.winrtUwp.Windows.ApplicationModel.Chat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data to the background task about a new message. */
@js.native
trait RcsEndUserMessageAvailableTriggerDetails extends js.Object {
  
  /** Gets the text of the new message. */
  var text: String = js.native
  
  /** Gets the title of the new message. */
  var title: String = js.native
}
object RcsEndUserMessageAvailableTriggerDetails {
  
  @scala.inline
  def apply(text: String, title: String): RcsEndUserMessageAvailableTriggerDetails = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[RcsEndUserMessageAvailableTriggerDetails]
  }
  
  @scala.inline
  implicit class RcsEndUserMessageAvailableTriggerDetailsOps[Self <: RcsEndUserMessageAvailableTriggerDetails] (val x: Self) extends AnyVal {
    
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
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
}
