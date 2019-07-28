package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ContactsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContactQueryDesiredFields extends js.Object

/** Defines which fields must exist on a contact in order to match a search operation. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactQueryDesiredFields")
@js.native
object ContactQueryDesiredFields extends js.Object {
  /** The contact must have an email address. */
  @js.native
  sealed trait emailAddress extends ContactQueryDesiredFields
  
  /** No required fields */
  @js.native
  sealed trait none extends ContactQueryDesiredFields
  
  /** The contact must have a phone number. */
  @js.native
  sealed trait phoneNumber extends ContactQueryDesiredFields
  
  /** The contact must have a postal address. */
  @js.native
  sealed trait postalAddress extends ContactQueryDesiredFields
  
  /* 2 */ val emailAddress: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ContactsNs.ContactQueryDesiredFields.emailAddress with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ContactsNs.ContactQueryDesiredFields.none with Double = js.native
  /* 1 */ val phoneNumber: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ContactsNs.ContactQueryDesiredFields.phoneNumber with Double = js.native
  /* 3 */ val postalAddress: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ContactsNs.ContactQueryDesiredFields.postalAddress with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContactQueryDesiredFields with Double] = js.native
}

