package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContactPhoneKind extends js.Object

/** Specifies the kinds of phones for a contact. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactPhoneKind")
@js.native
object ContactPhoneKind extends js.Object {
  /** The phone number of the contact's assistant. */
  @js.native
  sealed trait assistant
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactPhoneKind
  
  /** The business fax of the contact. */
  @js.native
  sealed trait businessFax
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactPhoneKind
  
  /** The company phone of the contact. */
  @js.native
  sealed trait company
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactPhoneKind
  
  /** The home phone of the contact. */
  @js.native
  sealed trait home
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactPhoneKind
  
  /** The home fax of the contact. */
  @js.native
  sealed trait homeFax
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactPhoneKind
  
  /** The mobile phone of the contact. */
  @js.native
  sealed trait mobile
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactPhoneKind
  
  /** A phone of the contact other than home, mobile, or work. */
  @js.native
  sealed trait other
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactPhoneKind
  
  /** The pager number of the contact. */
  @js.native
  sealed trait pager
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactPhoneKind
  
  /** The radio address of the contact. */
  @js.native
  sealed trait radio
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactPhoneKind
  
  /** The work phone of the contact. */
  @js.native
  sealed trait work
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactPhoneKind
  
  val assistant: assistant with java.lang.String = js.native
  val businessFax: businessFax with java.lang.String = js.native
  val company: company with java.lang.String = js.native
  val home: home with java.lang.String = js.native
  val homeFax: homeFax with java.lang.String = js.native
  val mobile: mobile with java.lang.String = js.native
  val other: other with java.lang.String = js.native
  val pager: pager with java.lang.String = js.native
  val radio: radio with java.lang.String = js.native
  val work: work with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactPhoneKind with java.lang.String
  ] = js.native
}

