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
  
  val added: added with java.lang.String = js.native
  val alreadyAdded: alreadyAdded with java.lang.String = js.native
  val unavailable: unavailable with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.ApplicationModelNs.ContactsNs.ProviderNs.AddContactResult with java.lang.String
  ] = js.native
}

