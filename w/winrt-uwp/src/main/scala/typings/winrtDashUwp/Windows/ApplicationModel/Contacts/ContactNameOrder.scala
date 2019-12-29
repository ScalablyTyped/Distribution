package typings.winrtDashUwp.Windows.ApplicationModel.Contacts

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContactNameOrder with Double] = js.native
  /* 0 */ @js.native
  object firstNameLastName extends TopLevel[firstNameLastName with Double]
  
  /* 1 */ @js.native
  object lastNameFirstName extends TopLevel[lastNameFirstName with Double]
  
}

