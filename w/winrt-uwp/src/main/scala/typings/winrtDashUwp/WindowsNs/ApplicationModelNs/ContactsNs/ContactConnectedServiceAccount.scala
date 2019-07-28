package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ContactsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a connected service account for a contact. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactConnectedServiceAccount")
@js.native
/** Initializes a new instance of a ContactConnectedServiceAccount class. */
class ContactConnectedServiceAccount () extends js.Object {
  /** Gets and sets the identifier of a connected service account for a contact. The maximum string length for the identifier is 321 characters. */
  var id: String = js.native
  /** Gets and sets the service name of a connected service account for a contact. The maximum string length for the service name is 256 characters. */
  var serviceName: String = js.native
}

