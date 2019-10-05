package typings.winrt.Windows.ApplicationModel.Contacts.Provider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AddContactResult extends js.Object

@JSGlobal("Windows.ApplicationModel.Contacts.Provider.AddContactResult")
@js.native
object AddContactResult extends js.Object {
  @js.native
  sealed trait added extends AddContactResult
  
  @js.native
  sealed trait alreadyAdded extends AddContactResult
  
  @js.native
  sealed trait unavailable extends AddContactResult
  
  /* 0 */ val added: typings.winrt.Windows.ApplicationModel.Contacts.Provider.AddContactResult.added with Double = js.native
  /* 1 */ val alreadyAdded: typings.winrt.Windows.ApplicationModel.Contacts.Provider.AddContactResult.alreadyAdded with Double = js.native
  /* 2 */ val unavailable: typings.winrt.Windows.ApplicationModel.Contacts.Provider.AddContactResult.unavailable with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AddContactResult with Double] = js.native
}

