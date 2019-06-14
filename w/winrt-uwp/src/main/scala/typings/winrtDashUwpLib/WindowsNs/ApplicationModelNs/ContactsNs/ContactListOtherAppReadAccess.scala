package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContactListOtherAppReadAccess extends js.Object

/** Specifies the level of contact read access granted to other apps. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactListOtherAppReadAccess")
@js.native
object ContactListOtherAppReadAccess extends js.Object {
  /** Other apps have read access to system and app contacts. */
  @js.native
  sealed trait full
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactListOtherAppReadAccess
  
  /** Other apps can only read contacts for this app. */
  @js.native
  sealed trait limited
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactListOtherAppReadAccess
  
  /** Other apps can only read system contacts. */
  @js.native
  sealed trait systemOnly
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactListOtherAppReadAccess
  
  /* 2 */ val full: full with scala.Double = js.native
  /* 1 */ val limited: limited with scala.Double = js.native
  /* 0 */ val systemOnly: systemOnly with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactListOtherAppReadAccess with scala.Double
  ] = js.native
}

