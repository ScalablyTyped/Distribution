package typings.winrtDashUwp.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an important date for a contact. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactDate")
@js.native
/** Initializes a new instance of a ContactDate class. */
class ContactDate () extends js.Object {
  /** Gets and sets the day for an important date for a contact. */
  var day: Double = js.native
  /** Gets and sets the description for an important date for a contact. The maximum string length for the description is 512 characters. */
  var description: String = js.native
  /** Gets and sets the kind of important date for a contact. */
  var kind: ContactDateKind = js.native
  /** Gets and sets the month for an important date for a contact. */
  var month: Double = js.native
  /** Gets and sets the year for an important date for a contact. */
  var year: Double = js.native
}

