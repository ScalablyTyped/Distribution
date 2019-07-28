package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ContactsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  /* 0 */ val local: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ContactsNs.ContactQuerySearchScope.local with Double = js.native
  /* 1 */ val server: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ContactsNs.ContactQuerySearchScope.server with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContactQuerySearchScope with Double] = js.native
}

