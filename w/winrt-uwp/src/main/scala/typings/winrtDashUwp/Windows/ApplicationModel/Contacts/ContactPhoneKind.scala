package typings.winrtDashUwp.Windows.ApplicationModel.Contacts

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
  sealed trait assistant extends ContactPhoneKind
  
  /** The business fax of the contact. */
  @js.native
  sealed trait businessFax extends ContactPhoneKind
  
  /** The company phone of the contact. */
  @js.native
  sealed trait company extends ContactPhoneKind
  
  /** The home phone of the contact. */
  @js.native
  sealed trait home extends ContactPhoneKind
  
  /** The home fax of the contact. */
  @js.native
  sealed trait homeFax extends ContactPhoneKind
  
  /** The mobile phone of the contact. */
  @js.native
  sealed trait mobile extends ContactPhoneKind
  
  /** A phone of the contact other than home, mobile, or work. */
  @js.native
  sealed trait other extends ContactPhoneKind
  
  /** The pager number of the contact. */
  @js.native
  sealed trait pager extends ContactPhoneKind
  
  /** The radio address of the contact. */
  @js.native
  sealed trait radio extends ContactPhoneKind
  
  /** The work phone of the contact. */
  @js.native
  sealed trait work extends ContactPhoneKind
  
  /* 8 */ val assistant: typings.winrtDashUwp.Windows.ApplicationModel.Contacts.ContactPhoneKind.assistant with Double = js.native
  /* 5 */ val businessFax: typings.winrtDashUwp.Windows.ApplicationModel.Contacts.ContactPhoneKind.businessFax with Double = js.native
  /* 7 */ val company: typings.winrtDashUwp.Windows.ApplicationModel.Contacts.ContactPhoneKind.company with Double = js.native
  /* 0 */ val home: typings.winrtDashUwp.Windows.ApplicationModel.Contacts.ContactPhoneKind.home with Double = js.native
  /* 6 */ val homeFax: typings.winrtDashUwp.Windows.ApplicationModel.Contacts.ContactPhoneKind.homeFax with Double = js.native
  /* 1 */ val mobile: typings.winrtDashUwp.Windows.ApplicationModel.Contacts.ContactPhoneKind.mobile with Double = js.native
  /* 3 */ val other: typings.winrtDashUwp.Windows.ApplicationModel.Contacts.ContactPhoneKind.other with Double = js.native
  /* 4 */ val pager: typings.winrtDashUwp.Windows.ApplicationModel.Contacts.ContactPhoneKind.pager with Double = js.native
  /* 9 */ val radio: typings.winrtDashUwp.Windows.ApplicationModel.Contacts.ContactPhoneKind.radio with Double = js.native
  /* 2 */ val work: typings.winrtDashUwp.Windows.ApplicationModel.Contacts.ContactPhoneKind.work with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContactPhoneKind with Double] = js.native
}

