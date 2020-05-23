package typings.winrtUwp.global.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an important date for a contact. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactDate")
@js.native
/** Initializes a new instance of a ContactDate class. */
class ContactDate ()
  extends typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactDate {
  /** Gets and sets the day for an important date for a contact. */
  /* CompleteClass */
  override var day: Double = js.native
  /** Gets and sets the description for an important date for a contact. The maximum string length for the description is 512 characters. */
  /* CompleteClass */
  override var description: String = js.native
  /** Gets and sets the kind of important date for a contact. */
  /* CompleteClass */
  override var kind: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactDateKind = js.native
  /** Gets and sets the month for an important date for a contact. */
  /* CompleteClass */
  override var month: Double = js.native
  /** Gets and sets the year for an important date for a contact. */
  /* CompleteClass */
  override var year: Double = js.native
}

