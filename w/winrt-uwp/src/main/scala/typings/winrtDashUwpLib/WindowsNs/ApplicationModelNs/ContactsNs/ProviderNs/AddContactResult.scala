package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ProviderNs

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
  sealed trait added
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ProviderNs.AddContactResult
  
  /** The contact was already selected by the user. */
  @js.native
  sealed trait alreadyAdded
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ProviderNs.AddContactResult
  
  /** The contact was unavailable and was not added. */
  @js.native
  sealed trait unavailable
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ProviderNs.AddContactResult
  
  val added: added with java.lang.String = js.native
  val alreadyAdded: alreadyAdded with java.lang.String = js.native
  val unavailable: unavailable with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ProviderNs.AddContactResult with java.lang.String
  ] = js.native
}

