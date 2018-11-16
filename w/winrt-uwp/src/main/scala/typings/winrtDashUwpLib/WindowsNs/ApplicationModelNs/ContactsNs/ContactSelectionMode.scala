package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContactSelectionMode extends js.Object

/** Specifies whether you want to request an entire contact, or only specific fields. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactSelectionMode")
@js.native
object ContactSelectionMode extends js.Object {
  /** Specifies that you want to select the entire contact. */
  @js.native
  sealed trait contacts
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactSelectionMode
  
  /** Specifies that you want to select only certain fields. */
  @js.native
  sealed trait fields
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactSelectionMode
  
  val contacts: contacts with java.lang.String = js.native
  val fields: fields with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactSelectionMode with java.lang.String
  ] = js.native
}

