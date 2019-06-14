package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs

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
  sealed trait local
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactQuerySearchScope
  
  /** Server */
  @js.native
  sealed trait server
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactQuerySearchScope
  
  /* 0 */ val local: local with scala.Double = js.native
  /* 1 */ val server: server with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactQuerySearchScope with scala.Double
  ] = js.native
}

