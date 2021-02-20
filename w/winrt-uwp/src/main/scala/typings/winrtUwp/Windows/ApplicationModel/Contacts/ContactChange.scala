package typings.winrtUwp.Windows.ApplicationModel.Contacts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a change to a Contact . */
@js.native
trait ContactChange extends StObject {
  
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
  implicit class ContactChangeMutableBuilder[Self <: ContactChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeType(value: ContactChangeType): Self = StObject.set(x, "changeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContact(value: Contact): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
  }
}
