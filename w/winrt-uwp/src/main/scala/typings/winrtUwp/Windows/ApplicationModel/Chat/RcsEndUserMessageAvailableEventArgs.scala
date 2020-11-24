package typings.winrtUwp.Windows.ApplicationModel.Chat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides the data for a MessageAvailableChanged event. */
@js.native
trait RcsEndUserMessageAvailableEventArgs extends js.Object {
  
  /** Gets a Boolean value indicating if a new message is available. */
  var isMessageAvailable: Boolean = js.native
  
  /** Gets the actual message to display, or empty if IsMessageAvailable is FALSE. */
  var message: RcsEndUserMessage = js.native
}
object RcsEndUserMessageAvailableEventArgs {
  
  @scala.inline
  def apply(isMessageAvailable: Boolean, message: RcsEndUserMessage): RcsEndUserMessageAvailableEventArgs = {
    val __obj = js.Dynamic.literal(isMessageAvailable = isMessageAvailable.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[RcsEndUserMessageAvailableEventArgs]
  }
  
  @scala.inline
  implicit class RcsEndUserMessageAvailableEventArgsOps[Self <: RcsEndUserMessageAvailableEventArgs] (val x: Self) extends AnyVal {
    
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
    def setIsMessageAvailable(value: Boolean): Self = this.set("isMessageAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: RcsEndUserMessage): Self = this.set("message", value.asInstanceOf[js.Any])
  }
}
