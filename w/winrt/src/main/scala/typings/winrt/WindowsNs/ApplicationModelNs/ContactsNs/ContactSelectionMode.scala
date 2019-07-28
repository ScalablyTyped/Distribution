package typings.winrt.WindowsNs.ApplicationModelNs.ContactsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContactSelectionMode extends js.Object

@JSGlobal("Windows.ApplicationModel.Contacts.ContactSelectionMode")
@js.native
object ContactSelectionMode extends js.Object {
  @js.native
  sealed trait contacts extends ContactSelectionMode
  
  @js.native
  sealed trait fields extends ContactSelectionMode
  
  /* 0 */ val contacts: typings.winrt.WindowsNs.ApplicationModelNs.ContactsNs.ContactSelectionMode.contacts with Double = js.native
  /* 1 */ val fields: typings.winrt.WindowsNs.ApplicationModelNs.ContactsNs.ContactSelectionMode.fields with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContactSelectionMode with Double] = js.native
}

