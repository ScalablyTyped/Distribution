package typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UserDataAccountContentKinds extends js.Object
/** The type of user data content. */
@JSGlobal("Windows.ApplicationModel.UserDataAccounts.UserDataAccountContentKinds")
@js.native
object UserDataAccountContentKinds extends js.Object {
  
  /** Appointment data content. */
  @js.native
  sealed trait appointment extends UserDataAccountContentKinds
  
  /** Contact data content. */
  @js.native
  sealed trait contact extends UserDataAccountContentKinds
  
  /** Email data content. */
  @js.native
  sealed trait email extends UserDataAccountContentKinds
}
