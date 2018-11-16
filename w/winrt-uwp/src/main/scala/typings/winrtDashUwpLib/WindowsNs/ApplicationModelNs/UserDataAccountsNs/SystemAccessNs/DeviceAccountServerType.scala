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
  
  val exchange: exchange with java.lang.String = js.native
  val imap: imap with java.lang.String = js.native
  val pop: pop with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.UserDataAccountsNs.SystemAccessNs.DeviceAccountServerType with java.lang.String
  ] = js.native
}

