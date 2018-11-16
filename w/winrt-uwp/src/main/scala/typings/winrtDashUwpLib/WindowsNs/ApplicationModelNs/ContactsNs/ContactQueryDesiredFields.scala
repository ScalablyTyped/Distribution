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
  
  val emailAddress: emailAddress with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val phoneNumber: phoneNumber with java.lang.String = js.native
  val postalAddress: postalAddress with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactQueryDesiredFields with java.lang.String
  ] = js.native
}

