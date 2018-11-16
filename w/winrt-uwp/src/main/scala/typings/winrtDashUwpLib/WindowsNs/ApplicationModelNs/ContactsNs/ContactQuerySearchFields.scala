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
  
  val all: all with java.lang.String = js.native
  val email: email with java.lang.String = js.native
  val name: name with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val phone: phone with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactQuerySearchFields with java.lang.String
  ] = js.native
}

