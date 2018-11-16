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
  
  val contacts: contacts with java.lang.String = js.native
  val fields: fields with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactSelectionMode with java.lang.String
  ] = js.native
}

