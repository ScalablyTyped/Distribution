package typings.winrtUwp.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ContactQuerySearchScope extends js.Object
/** Defines whether to search the local ContactStore or a server. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactQuerySearchScope")
@js.native
object ContactQuerySearchScope extends js.Object {
  
  /** Local */
  @js.native
  sealed trait local extends ContactQuerySearchScope
  
  /** Server */
  @js.native
  sealed trait server extends ContactQuerySearchScope
}
