package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContactAddressKind extends js.Object

/** Specifies the kinds of contact addresses. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactAddressKind")
@js.native
object ContactAddressKind extends js.Object {
  /** The home address of the contact. */
  @js.native
  sealed trait home
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactAddressKind
  
  /** An address of the contact other than home or work. */
  @js.native
  sealed trait other
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactAddressKind
  
  /** The work address of the contact. */
  @js.native
  sealed trait work
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactAddressKind
  
  /* 0 */ val home: home with scala.Double = js.native
  /* 2 */ val other: other with scala.Double = js.native
  /* 1 */ val work: work with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactAddressKind with scala.Double
  ] = js.native
}

