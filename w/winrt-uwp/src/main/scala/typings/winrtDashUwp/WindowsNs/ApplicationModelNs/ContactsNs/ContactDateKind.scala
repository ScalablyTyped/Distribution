package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ContactsNs

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
  
  /* 1 */ val anniversary: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ContactsNs.ContactDateKind.anniversary with Double = js.native
  /* 0 */ val birthday: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ContactsNs.ContactDateKind.birthday with Double = js.native
  /* 2 */ val other: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ContactsNs.ContactDateKind.other with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContactDateKind with Double] = js.native
}

