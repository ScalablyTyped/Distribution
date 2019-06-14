package typings
package winrtLib.WindowsNs.ApplicationModelNs.ContactsNs.ProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AddContactResult extends js.Object

@JSGlobal("Windows.ApplicationModel.Contacts.Provider.AddContactResult")
@js.native
object AddContactResult extends js.Object {
  @js.native
  sealed trait added
    extends winrtLib.WindowsNs.ApplicationModelNs.ContactsNs.ProviderNs.AddContactResult
  
  @js.native
  sealed trait alreadyAdded
    extends winrtLib.WindowsNs.ApplicationModelNs.ContactsNs.ProviderNs.AddContactResult
  
  @js.native
  sealed trait unavailable
    extends winrtLib.WindowsNs.ApplicationModelNs.ContactsNs.ProviderNs.AddContactResult
  
  /* 0 */ val added: added with scala.Double = js.native
  /* 1 */ val alreadyAdded: alreadyAdded with scala.Double = js.native
  /* 2 */ val unavailable: unavailable with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtLib.WindowsNs.ApplicationModelNs.ContactsNs.ProviderNs.AddContactResult with scala.Double
  ] = js.native
}

