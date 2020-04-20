package typings.twilioChat.messagesMod

import typings.twilioChat.sessionMod.Session
import typings.twilioMcsClient.mod.McsClient
import typings.twilioSync.mod.SyncClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessagesServices extends js.Object {
  var mcsClient: McsClient
  var session: Session
  var syncClient: SyncClient
}

object MessagesServices {
  @scala.inline
  def apply(mcsClient: McsClient, session: Session, syncClient: SyncClient): MessagesServices = {
    val __obj = js.Dynamic.literal(mcsClient = mcsClient.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], syncClient = syncClient.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagesServices]
  }
}

