package typings.winrtUwp.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContactDateKind extends js.Object

/** Specifies the kinds of important dates for a contact. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactDateKind")
@js.native
object ContactDateKind extends js.Object {
  /** The anniversary of the contact. */
  @js.native
  sealed trait anniversary extends ContactDateKind
  
  /** The birthday of the contact. */
  @js.native
  sealed trait birthday extends ContactDateKind
  
  /** An important date of the contact other than birthday or anniversary. */
  @js.native
  sealed trait other extends ContactDateKind
  
}

