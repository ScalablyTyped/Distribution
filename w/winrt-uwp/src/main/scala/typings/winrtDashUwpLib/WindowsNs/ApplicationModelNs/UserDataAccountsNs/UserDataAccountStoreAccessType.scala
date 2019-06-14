package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.UserDataAccountsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UserDataAccountStoreAccessType extends js.Object

/** Specifies the requested access type in a call to RequestStoreAsync . */
@JSGlobal("Windows.ApplicationModel.UserDataAccounts.UserDataAccountStoreAccessType")
@js.native
object UserDataAccountStoreAccessType extends js.Object {
  /** Read-only access to app user data accounts and system user data accounts. */
  @js.native
  sealed trait allAccountsReadOnly
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.UserDataAccountsNs.UserDataAccountStoreAccessType
  
  /** Read/write access to the current app's user data accounts. */
  @js.native
  sealed trait appAccountsReadWrite
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.UserDataAccountsNs.UserDataAccountStoreAccessType
  
  /* 0 */ val allAccountsReadOnly: allAccountsReadOnly with scala.Double = js.native
  /* 1 */ val appAccountsReadWrite: appAccountsReadWrite with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.UserDataAccountsNs.UserDataAccountStoreAccessType with scala.Double
  ] = js.native
}

