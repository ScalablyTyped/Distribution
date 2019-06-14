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
  
  /* 8 */ val assistant: assistant with scala.Double = js.native
  /* 5 */ val businessFax: businessFax with scala.Double = js.native
  /* 7 */ val company: company with scala.Double = js.native
  /* 0 */ val home: home with scala.Double = js.native
  /* 6 */ val homeFax: homeFax with scala.Double = js.native
  /* 1 */ val mobile: mobile with scala.Double = js.native
  /* 3 */ val other: other with scala.Double = js.native
  /* 4 */ val pager: pager with scala.Double = js.native
  /* 9 */ val radio: radio with scala.Double = js.native
  /* 2 */ val work: work with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactPhoneKind with scala.Double
  ] = js.native
}

