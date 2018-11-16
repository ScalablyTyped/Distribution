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
  
  val home: home with java.lang.String = js.native
  val other: other with java.lang.String = js.native
  val work: work with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactAddressKind with java.lang.String
  ] = js.native
}

