package typings.winrt.Windows.Media.Devices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDialRequestedEventArgs extends js.Object {
  
  var contact: js.Any = js.native
  
  def handled(): Unit = js.native
}
object IDialRequestedEventArgs {
  
  @scala.inline
  def apply(contact: js.Any, handled: () => Unit): IDialRequestedEventArgs = {
    val __obj = js.Dynamic.literal(contact = contact.asInstanceOf[js.Any], handled = js.Any.fromFunction0(handled))
    __obj.asInstanceOf[IDialRequestedEventArgs]
  }
  
  @scala.inline
  implicit class IDialRequestedEventArgsOps[Self <: IDialRequestedEventArgs] (val x: Self) extends AnyVal {
    
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
