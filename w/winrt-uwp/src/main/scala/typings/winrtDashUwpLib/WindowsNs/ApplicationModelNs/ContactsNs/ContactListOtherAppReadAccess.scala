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
  
  val full: full with java.lang.String = js.native
  val limited: limited with java.lang.String = js.native
  val systemOnly: systemOnly with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactListOtherAppReadAccess with java.lang.String
  ] = js.native
}

