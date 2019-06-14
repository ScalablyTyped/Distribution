package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.UserDataAccountsNs

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
  sealed trait appointment
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.UserDataAccountsNs.UserDataAccountContentKinds
  
  /** Contact data content. */
  @js.native
  sealed trait contact
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.UserDataAccountsNs.UserDataAccountContentKinds
  
  /** Email data content. */
  @js.native
  sealed trait email
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.UserDataAccountsNs.UserDataAccountContentKinds
  
  /* 2 */ val appointment: appointment with scala.Double = js.native
  /* 1 */ val contact: contact with scala.Double = js.native
  /* 0 */ val email: email with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.UserDataAccountsNs.UserDataAccountContentKinds with scala.Double
  ] = js.native
}

