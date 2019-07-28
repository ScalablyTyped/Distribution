package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ContactsNs

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
  sealed trait contacts extends ContactSelectionMode
  
  /** Specifies that you want to select only certain fields. */
  @js.native
  sealed trait fields extends ContactSelectionMode
  
  /* 0 */ val contacts: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ContactsNs.ContactSelectionMode.contacts with Double = js.native
  /* 1 */ val fields: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ContactsNs.ContactSelectionMode.fields with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContactSelectionMode with Double] = js.native
}

