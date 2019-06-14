package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContactNameOrder extends js.Object

/** Specifies the name order for a contact. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactNameOrder")
@js.native
object ContactNameOrder extends js.Object {
  /** Show name by first name, then last name. */
  @js.native
  sealed trait firstNameLastName
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactNameOrder
  
  /** Show name by last name, then first. */
  @js.native
  sealed trait lastNameFirstName
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactNameOrder
  
  /* 0 */ val firstNameLastName: firstNameLastName with scala.Double = js.native
  /* 1 */ val lastNameFirstName: lastNameFirstName with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactNameOrder with scala.Double
  ] = js.native
}

