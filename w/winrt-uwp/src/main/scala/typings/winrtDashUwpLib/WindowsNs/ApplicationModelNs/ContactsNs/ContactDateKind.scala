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
  
  val anniversary: anniversary with java.lang.String = js.native
  val birthday: birthday with java.lang.String = js.native
  val other: other with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactDateKind with java.lang.String
  ] = js.native
}

