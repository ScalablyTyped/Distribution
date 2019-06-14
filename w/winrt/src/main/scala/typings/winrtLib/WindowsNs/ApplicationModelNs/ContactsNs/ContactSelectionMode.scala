package typings
package winrtLib.WindowsNs.ApplicationModelNs.ContactsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContactSelectionMode extends js.Object

@JSGlobal("Windows.ApplicationModel.Contacts.ContactSelectionMode")
@js.native
object ContactSelectionMode extends js.Object {
  @js.native
  sealed trait contacts
    extends winrtLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactSelectionMode
  
  @js.native
  sealed trait fields
    extends winrtLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactSelectionMode
  
  /* 0 */ val contacts: contacts with scala.Double = js.native
  /* 1 */ val fields: fields with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactSelectionMode with scala.Double
  ] = js.native
}

