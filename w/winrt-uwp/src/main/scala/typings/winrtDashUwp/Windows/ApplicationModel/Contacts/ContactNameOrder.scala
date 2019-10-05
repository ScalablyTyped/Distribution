package typings.winrtDashUwp.Windows.ApplicationModel.Contacts

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
  sealed trait firstNameLastName extends ContactNameOrder
  
  /** Show name by last name, then first. */
  @js.native
  sealed trait lastNameFirstName extends ContactNameOrder
  
  /* 0 */ val firstNameLastName: typings.winrtDashUwp.Windows.ApplicationModel.Contacts.ContactNameOrder.firstNameLastName with Double = js.native
  /* 1 */ val lastNameFirstName: typings.winrtDashUwp.Windows.ApplicationModel.Contacts.ContactNameOrder.lastNameFirstName with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContactNameOrder with Double] = js.native
}

