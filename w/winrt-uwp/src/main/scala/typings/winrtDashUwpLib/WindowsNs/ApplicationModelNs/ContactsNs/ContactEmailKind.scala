package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContactEmailKind extends js.Object

/** Specifies the kinds of email addresses for a contact. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactEmailKind")
@js.native
object ContactEmailKind extends js.Object {
  /** An email address of the contact other than personal or work. */
  @js.native
  sealed trait other
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactEmailKind
  
  /** The personal email address of the contact. */
  @js.native
  sealed trait personal
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactEmailKind
  
  /** The work email address of the contact. */
  @js.native
  sealed trait work
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactEmailKind
  
  /* 2 */ val other: other with scala.Double = js.native
  /* 0 */ val personal: personal with scala.Double = js.native
  /* 1 */ val work: work with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactEmailKind with scala.Double
  ] = js.native
}

