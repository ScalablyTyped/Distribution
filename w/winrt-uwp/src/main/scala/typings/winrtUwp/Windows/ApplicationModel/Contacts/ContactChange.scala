package typings.winrtUwp.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a change to a Contact . */
@js.native
trait ContactChange extends js.Object {
  
  /** Gets a value that indicates the type of change that occurred. */
  var changeType: ContactChangeType = js.native
  
  /** Gets the Contact object that changed. */
  var contact: Contact = js.native
}
object ContactChange {
  
  @scala.inline
  def apply(changeType: ContactChangeType, contact: Contact): ContactChange = {
    val __obj = js.Dynamic.literal(changeType = changeType.asInstanceOf[js.Any], contact = contact.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactChange]
  }
  
  @scala.inline
  implicit class ContactChangeOps[Self <: ContactChange] (val x: Self) extends AnyVal {
    
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
    def setChangeType(value: ContactChangeType): Self = this.set("changeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContact(value: Contact): Self = this.set("contact", value.asInstanceOf[js.Any])
  }
}
