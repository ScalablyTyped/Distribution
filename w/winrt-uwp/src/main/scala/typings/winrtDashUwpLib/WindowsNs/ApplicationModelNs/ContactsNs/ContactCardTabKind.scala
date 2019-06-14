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
  
  /* 0 */ val default: default with scala.Double = js.native
  /* 1 */ val email: email with scala.Double = js.native
  /* 2 */ val messaging: messaging with scala.Double = js.native
  /* 3 */ val phone: phone with scala.Double = js.native
  /* 4 */ val video: video with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactCardTabKind with scala.Double
  ] = js.native
}

