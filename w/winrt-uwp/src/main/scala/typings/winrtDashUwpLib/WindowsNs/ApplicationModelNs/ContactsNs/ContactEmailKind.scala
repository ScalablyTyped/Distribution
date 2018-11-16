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
  
  val other: other with java.lang.String = js.native
  val personal: personal with java.lang.String = js.native
  val work: work with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactEmailKind with java.lang.String
  ] = js.native
}

