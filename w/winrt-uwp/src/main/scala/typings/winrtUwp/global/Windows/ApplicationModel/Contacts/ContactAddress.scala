package typings.winrtUwp.global.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the address of a contact. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactAddress")
@js.native
/** Initializes a new instance of a ContactAddress class. */
class ContactAddress ()
  extends typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactAddress {
  /** Gets and sets the country of a contact address. The maximum string length for the country is 1024 characters. */
  /* CompleteClass */
  override var country: String = js.native
  /** Gets and sets the description of a contact address. The maximum string length for the description is 512 characters. */
  /* CompleteClass */
  override var description: String = js.native
  /** Gets and sets the kind of contact address. */
  /* CompleteClass */
  override var kind: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactAddressKind = js.native
  /** Gets and sets the locality of a contact address. The maximum string length for the locality is 1024 characters. */
  /* CompleteClass */
  override var locality: String = js.native
  /** Gets and sets the postal code of a contact address. The maximum string length for the postal code is 1024 characters. */
  /* CompleteClass */
  override var postalCode: String = js.native
  /** Gets and sets the region of a contact address. The maximum string length for the region is 1024 characters. */
  /* CompleteClass */
  override var region: String = js.native
  /** Gets and sets the street address of a contact address. The maximum string length for the street address is 1024 characters. */
  /* CompleteClass */
  override var streetAddress: String = js.native
}

