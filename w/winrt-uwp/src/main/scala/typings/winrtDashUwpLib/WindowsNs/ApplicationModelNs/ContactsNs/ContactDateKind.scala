package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs

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
  sealed trait anniversary
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactDateKind
  
  /** The birthday of the contact. */
  @js.native
  sealed trait birthday
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactDateKind
  
  /** An important date of the contact other than birthday or anniversary. */
  @js.native
  sealed trait other
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactDateKind
  
  /* 1 */ val anniversary: anniversary with scala.Double = js.native
  /* 0 */ val birthday: birthday with scala.Double = js.native
  /* 2 */ val other: other with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactDateKind with scala.Double
  ] = js.native
}

