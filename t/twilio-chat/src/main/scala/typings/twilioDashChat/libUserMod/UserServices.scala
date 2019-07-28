package typings.twilioDashChat.libUserMod

import typings.twilioDashChat.libSessionMod.Session
import typings.twilioDashSync.twilioDashSyncMod.SyncClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserServices extends js.Object {
  var session: Session
  var syncClient: SyncClient
}

object UserServices {
  @scala.inline
  def apply(session: Session, syncClient: SyncClient): UserServices = {
    val __obj = js.Dynamic.literal(session = session, syncClient = syncClient)
  
    __obj.asInstanceOf[UserServices]
  }
}

