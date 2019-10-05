package typings.winrtDashUwp.Windows.ApplicationModel.Contacts

import typings.winrtDashUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the info about a Web site for a contact. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactWebsite")
@js.native
/** Initializes a new instance of a ContactWebsite class. */
class ContactWebsite () extends js.Object {
  /** Gets and sets the description of a Web site for a contact. The maximum string length for the description is 512 characters. */
  var description: String = js.native
  var rawValue: js.Any = js.native
   /* unmapped type */ /** Gets and sets the Uniform Resource Identifier (URI) of a Web site for a contact. */
  var uri: Uri = js.native
}

