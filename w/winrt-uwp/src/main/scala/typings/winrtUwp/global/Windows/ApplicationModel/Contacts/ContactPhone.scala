package typings.winrtUwp.global.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents info about the phone for a contact. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactPhone")
@js.native
/** Initializes a new instance of a ContactPhone class. */
class ContactPhone ()
  extends typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactPhone {
  /** Gets and sets the description of the phone for a contact. The maximum string length for the description is 512 characters. */
  /* CompleteClass */
  override var description: String = js.native
  /** Gets and sets the kind of phone for a contact. */
  /* CompleteClass */
  override var kind: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactPhoneKind = js.native
  /** Gets and sets the phone number of a phone for a contact. The maximum string length for the phone number is 50 characters. */
  /* CompleteClass */
  override var number: String = js.native
}

