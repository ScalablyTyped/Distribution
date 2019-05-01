package typings
package twilioDashChatLib.libUserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserServices extends js.Object {
  var session: twilioDashChatLib.libSessionMod.Session
  var syncClient: twilioDashSyncLib.twilioDashSyncMod.SyncClient
}

object UserServices {
  @scala.inline
  def apply(
    session: twilioDashChatLib.libSessionMod.Session,
    syncClient: twilioDashSyncLib.twilioDashSyncMod.SyncClient
  ): UserServices = {
    val __obj = js.Dynamic.literal(session = session, syncClient = syncClient)
  
    __obj.asInstanceOf[UserServices]
  }
}

