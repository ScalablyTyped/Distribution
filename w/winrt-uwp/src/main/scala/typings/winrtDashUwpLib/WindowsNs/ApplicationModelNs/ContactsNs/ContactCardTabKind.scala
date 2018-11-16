package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContactCardTabKind extends js.Object

/** Specifies which tab to display on a mini contact card. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactCardTabKind")
@js.native
object ContactCardTabKind extends js.Object {
  /** The default tab. */
  @js.native
  sealed trait default
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactCardTabKind
  
  /** The email tab. */
  @js.native
  sealed trait email
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactCardTabKind
  
  /** The messaging tab. */
  @js.native
  sealed trait messaging
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactCardTabKind
  
  /** The phone tab. */
  @js.native
  sealed trait phone
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactCardTabKind
  
  /** The video tab. */
  @js.native
  sealed trait video
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactCardTabKind
  
  val default: default with java.lang.String = js.native
  val email: email with java.lang.String = js.native
  val messaging: messaging with java.lang.String = js.native
  val phone: phone with java.lang.String = js.native
  val video: video with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactCardTabKind with java.lang.String
  ] = js.native
}

