package typings.winrtUwp.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a change to a Contact . */
trait ContactChange extends js.Object {
  /** Gets a value that indicates the type of change that occurred. */
  var changeType: ContactChangeType
  /** Gets the Contact object that changed. */
  var contact: Contact
}

object ContactChange {
  @scala.inline
  def apply(changeType: ContactChangeType, contact: Contact): ContactChange = {
    val __obj = js.Dynamic.literal(changeType = changeType.asInstanceOf[js.Any], contact = contact.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactChange]
  }
}

