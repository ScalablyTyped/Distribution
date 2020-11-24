package typings.winrtUwp.global.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines whether to search the local ContactStore or a server. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactQuerySearchScope")
@js.native
object ContactQuerySearchScope extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactQuerySearchScope with Double
  ] = js.native
  
  /* 0 */ val local: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactQuerySearchScope.local with Double = js.native
  
  /* 1 */ val server: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactQuerySearchScope.server with Double = js.native
}
