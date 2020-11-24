package typings.winrtUwp.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
