package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ContactsNs.ProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AddContactResult extends js.Object

/** Indicates whether a contact was added successfully. */
@JSGlobal("Windows.ApplicationModel.Contacts.Provider.AddContactResult")
@js.native
object AddContactResult extends js.Object {
  /** The contact was added. */
  @js.native
  sealed trait added extends AddContactResult
  
  /** The contact was already selected by the user. */
  @js.native
  sealed trait alreadyAdded extends AddContactResult
  
  /** The contact was unavailable and was not added. */
  @js.native
  sealed trait unavailable extends AddContactResult
  
  /* 0 */ val added: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ContactsNs.ProviderNs.AddContactResult.added with Double = js.native
  /* 1 */ val alreadyAdded: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ContactsNs.ProviderNs.AddContactResult.alreadyAdded with Double = js.native
  /* 2 */ val unavailable: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ContactsNs.ProviderNs.AddContactResult.unavailable with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AddContactResult with Double] = js.native
}

