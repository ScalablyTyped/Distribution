package typings.twilioChat.userMod

import typings.twilioChat.sessionMod.Session
import typings.twilioSync.mod.SyncClient
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
    val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any], syncClient = syncClient.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserServices]
  }
}

