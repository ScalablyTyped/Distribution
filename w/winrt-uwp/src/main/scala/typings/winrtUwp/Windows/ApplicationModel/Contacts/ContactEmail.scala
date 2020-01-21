package typings.winrtUwp.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an email address of a contact. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactEmail")
@js.native
/** Initializes a new instance of a ContactEmail class. */
class ContactEmail () extends js.Object {
  /** Gets and sets the email address of a contact. The maximum string length for the description is 321 characters. */
  var address: String = js.native
  /** Gets and sets the description of an email address of a contact. The maximum string length for the description is 512 characters. */
  var description: String = js.native
  /** Gets and sets the kind of email address of a contact. */
  var kind: ContactEmailKind = js.native
}

