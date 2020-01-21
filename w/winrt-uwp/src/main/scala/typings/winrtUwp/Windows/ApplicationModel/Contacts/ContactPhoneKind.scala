package typings.winrtUwp.Windows.ApplicationModel.Contacts

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContactPhoneKind with Double] = js.native
  /* 8 */ @js.native
  object assistant extends TopLevel[assistant with Double]
  
  /* 5 */ @js.native
  object businessFax extends TopLevel[businessFax with Double]
  
  /* 7 */ @js.native
  object company extends TopLevel[company with Double]
  
  /* 0 */ @js.native
  object home extends TopLevel[home with Double]
  
  /* 6 */ @js.native
  object homeFax extends TopLevel[homeFax with Double]
  
  /* 1 */ @js.native
  object mobile extends TopLevel[mobile with Double]
  
  /* 3 */ @js.native
  object other extends TopLevel[other with Double]
  
  /* 4 */ @js.native
  object pager extends TopLevel[pager with Double]
  
  /* 9 */ @js.native
  object radio extends TopLevel[radio with Double]
  
  /* 2 */ @js.native
  object work extends TopLevel[work with Double]
  
}

