package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContactCardHeaderKind extends js.Object

/** Specifies the type of header information to show on a contact card. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactCardHeaderKind")
@js.native
object ContactCardHeaderKind extends js.Object {
  /** Display a basic header. */
  @js.native
  sealed trait basic
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactCardHeaderKind
  
  /** Display the default header. */
  @js.native
  sealed trait default
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactCardHeaderKind
  
  /** Display an enterprise header. */
  @js.native
  sealed trait enterprise
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactCardHeaderKind
  
  val basic: basic with java.lang.String = js.native
  val default: default with java.lang.String = js.native
  val enterprise: enterprise with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactCardHeaderKind with java.lang.String
  ] = js.native
}

