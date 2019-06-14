package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.UserDataAccountsNs.SystemAccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DeviceAccountServerType extends js.Object

/** Defines the server types for syncing. */
@JSGlobal("Windows.ApplicationModel.UserDataAccounts.SystemAccess.DeviceAccountServerType")
@js.native
object DeviceAccountServerType extends js.Object {
  /** Exchange server */
  @js.native
  sealed trait exchange
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.UserDataAccountsNs.SystemAccessNs.DeviceAccountServerType
  
  /** IMAP server */
  @js.native
  sealed trait imap
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.UserDataAccountsNs.SystemAccessNs.DeviceAccountServerType
  
  /** POP server */
  @js.native
  sealed trait pop
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.UserDataAccountsNs.SystemAccessNs.DeviceAccountServerType
  
  /* 0 */ val exchange: exchange with scala.Double = js.native
  /* 2 */ val imap: imap with scala.Double = js.native
  /* 1 */ val pop: pop with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.UserDataAccountsNs.SystemAccessNs.DeviceAccountServerType with scala.Double
  ] = js.native
}

