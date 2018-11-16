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
  
  val appointment: appointment with java.lang.String = js.native
  val contact: contact with java.lang.String = js.native
  val email: email with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.UserDataAccountsNs.UserDataAccountContentKinds with java.lang.String
  ] = js.native
}

