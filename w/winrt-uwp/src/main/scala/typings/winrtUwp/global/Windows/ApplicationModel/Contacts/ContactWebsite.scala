package typings.winrtUwp.global.Windows.ApplicationModel.Contacts

import typings.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the info about a Web site for a contact. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactWebsite")
@js.native
/** Initializes a new instance of a ContactWebsite class. */
class ContactWebsite ()
  extends typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactWebsite {
  /** Gets and sets the description of a Web site for a contact. The maximum string length for the description is 512 characters. */
  /* CompleteClass */
  override var description: String = js.native
  /* CompleteClass */
  override var rawValue: js.Any = js.native
   /* unmapped type */ /** Gets and sets the Uniform Resource Identifier (URI) of a Web site for a contact. */
  /* CompleteClass */
  override var uri: Uri = js.native
}

