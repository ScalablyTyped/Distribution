package typings.winrtUwp.Windows.ApplicationModel.Chat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents event parameters used by the event handler that processes message change events. */
@js.native
trait ChatMessageChangedEventArgs extends js.Object {
  
  /**
    * The message changed event handler that an application registers with the message store receives a deferral object in the event parameters. The GetDeferral method registers a change deferral and allows an application to take action related to the change before the message store completes the change.
    * @return Gets a deferral for the MessageChanged event.
    */
  def getDeferral(): ChatMessageChangedDeferral = js.native
}
object ChatMessageChangedEventArgs {
  
  @scala.inline
  def apply(getDeferral: () => ChatMessageChangedDeferral): ChatMessageChangedEventArgs = {
    val __obj = js.Dynamic.literal(getDeferral = js.Any.fromFunction0(getDeferral))
    __obj.asInstanceOf[ChatMessageChangedEventArgs]
  }
  
  @scala.inline
  implicit class ChatMessageChangedEventArgsOps[Self <: ChatMessageChangedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setGetDeferral(value: () => ChatMessageChangedDeferral): Self = this.set("getDeferral", js.Any.fromFunction0(value))
  }
}
