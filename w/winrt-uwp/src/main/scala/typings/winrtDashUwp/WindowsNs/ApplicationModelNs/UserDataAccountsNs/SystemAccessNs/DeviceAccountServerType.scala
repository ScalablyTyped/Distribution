package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.UserDataAccountsNs.SystemAccessNs

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
  sealed trait exchange extends DeviceAccountServerType
  
  /** IMAP server */
  @js.native
  sealed trait imap extends DeviceAccountServerType
  
  /** POP server */
  @js.native
  sealed trait pop extends DeviceAccountServerType
  
  /* 0 */ val exchange: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.UserDataAccountsNs.SystemAccessNs.DeviceAccountServerType.exchange with Double = js.native
  /* 2 */ val imap: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.UserDataAccountsNs.SystemAccessNs.DeviceAccountServerType.imap with Double = js.native
  /* 1 */ val pop: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.UserDataAccountsNs.SystemAccessNs.DeviceAccountServerType.pop with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeviceAccountServerType with Double] = js.native
}

