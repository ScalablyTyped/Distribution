package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs

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
  sealed trait emailAddress
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactQueryDesiredFields
  
  /** No required fields */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactQueryDesiredFields
  
  /** The contact must have a phone number. */
  @js.native
  sealed trait phoneNumber
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactQueryDesiredFields
  
  /** The contact must have a postal address. */
  @js.native
  sealed trait postalAddress
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactQueryDesiredFields
  
  /* 2 */ val emailAddress: emailAddress with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 1 */ val phoneNumber: phoneNumber with scala.Double = js.native
  /* 3 */ val postalAddress: postalAddress with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactQueryDesiredFields with scala.Double
  ] = js.native
}

