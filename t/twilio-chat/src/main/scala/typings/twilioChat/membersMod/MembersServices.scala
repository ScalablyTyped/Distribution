package typings.twilioChat.membersMod

import typings.twilioChat.sessionMod.Session
import typings.twilioChat.usersMod.Users
import typings.twilioSync.mod.SyncClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MembersServices extends js.Object {
  var session: Session
  var syncClient: SyncClient
  var users: Users
}

object MembersServices {
  @scala.inline
  def apply(session: Session, syncClient: SyncClient, users: Users): MembersServices = {
    val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any], syncClient = syncClient.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MembersServices]
  }
}

