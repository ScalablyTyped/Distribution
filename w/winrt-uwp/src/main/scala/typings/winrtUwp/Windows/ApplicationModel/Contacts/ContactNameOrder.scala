package typings.winrtUwp.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
