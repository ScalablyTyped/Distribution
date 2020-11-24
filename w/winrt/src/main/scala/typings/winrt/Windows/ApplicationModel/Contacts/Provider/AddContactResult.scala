package typings.winrt.Windows.ApplicationModel.Contacts.Provider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
