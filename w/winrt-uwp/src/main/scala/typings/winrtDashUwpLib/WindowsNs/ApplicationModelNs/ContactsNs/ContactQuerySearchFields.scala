package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContactQuerySearchFields extends js.Object

/** Defines which contact fields to search for a text match. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactQuerySearchFields")
@js.native
object ContactQuerySearchFields extends js.Object {
  /** All */
  @js.native
  sealed trait all
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactQuerySearchFields
  
  /** Email address */
  @js.native
  sealed trait email
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactQuerySearchFields
  
  /** Name */
  @js.native
  sealed trait name
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactQuerySearchFields
  
  /** None */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactQuerySearchFields
  
  /** Phone number */
  @js.native
  sealed trait phone
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactQuerySearchFields
  
  /* 4 */ val all: all with scala.Double = js.native
  /* 2 */ val email: email with scala.Double = js.native
  /* 1 */ val name: name with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 3 */ val phone: phone with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactQuerySearchFields with scala.Double
  ] = js.native
}

