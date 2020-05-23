package typings.winrtUwp.Windows.ApplicationModel.UserDataAccounts.SystemAccess

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
  
}

