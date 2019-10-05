package typings.winrtDashUwp.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a change to a Contact . */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactChange")
@js.native
abstract class ContactChange () extends js.Object {
  /** Gets a value that indicates the type of change that occurred. */
  var changeType: ContactChangeType = js.native
  /** Gets the Contact object that changed. */
  var contact: Contact = js.native
}

