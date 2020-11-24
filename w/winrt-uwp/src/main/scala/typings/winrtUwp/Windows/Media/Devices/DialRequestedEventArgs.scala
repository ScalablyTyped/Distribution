package typings.winrtUwp.Windows.Media.Devices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information for the DialRequested event. */
@js.native
trait DialRequestedEventArgs extends js.Object {
  
  /** Returns the contact that was dialed. */
  var contact: js.Any = js.native
  
  /** Indicates that the DialRequested event has been handled. */
  def handled(): Unit = js.native
}
object DialRequestedEventArgs {
  
  @scala.inline
  def apply(contact: js.Any, handled: () => Unit): DialRequestedEventArgs = {
    val __obj = js.Dynamic.literal(contact = contact.asInstanceOf[js.Any], handled = js.Any.fromFunction0(handled))
    __obj.asInstanceOf[DialRequestedEventArgs]
  }
  
  @scala.inline
  implicit class DialRequestedEventArgsOps[Self <: DialRequestedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setContact(value: js.Any): Self = this.set("contact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandled(value: () => Unit): Self = this.set("handled", js.Any.fromFunction0(value))
  }
}
