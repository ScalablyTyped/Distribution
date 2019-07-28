package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ContactsNs

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
  sealed trait default extends ContactCardTabKind
  
  /** The email tab. */
  @js.native
  sealed trait email extends ContactCardTabKind
  
  /** The messaging tab. */
  @js.native
  sealed trait messaging extends ContactCardTabKind
  
  /** The phone tab. */
  @js.native
  sealed trait phone extends ContactCardTabKind
  
  /** The video tab. */
  @js.native
  sealed trait video extends ContactCardTabKind
  
  /* 0 */ val default: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ContactsNs.ContactCardTabKind.default with Double = js.native
  /* 1 */ val email: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ContactsNs.ContactCardTabKind.email with Double = js.native
  /* 2 */ val messaging: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ContactsNs.ContactCardTabKind.messaging with Double = js.native
  /* 3 */ val phone: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ContactsNs.ContactCardTabKind.phone with Double = js.native
  /* 4 */ val video: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ContactsNs.ContactCardTabKind.video with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContactCardTabKind with Double] = js.native
}

