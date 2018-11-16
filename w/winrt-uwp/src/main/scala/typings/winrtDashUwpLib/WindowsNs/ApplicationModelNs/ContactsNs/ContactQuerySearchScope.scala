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
  
  val local: local with java.lang.String = js.native
  val server: server with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactQuerySearchScope with java.lang.String
  ] = js.native
}

