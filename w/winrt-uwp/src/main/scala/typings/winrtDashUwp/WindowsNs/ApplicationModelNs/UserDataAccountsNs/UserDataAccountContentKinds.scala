package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.UserDataAccountsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  /* 2 */ val appointment: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.UserDataAccountsNs.UserDataAccountContentKinds.appointment with Double = js.native
  /* 1 */ val contact: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.UserDataAccountsNs.UserDataAccountContentKinds.contact with Double = js.native
  /* 0 */ val email: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.UserDataAccountsNs.UserDataAccountContentKinds.email with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UserDataAccountContentKinds with Double] = js.native
}

