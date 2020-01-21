package typings.twilioChat.usersMod

import typings.twilioChat.networkMod.Network
import typings.twilioChat.sessionMod.Session
import typings.twilioSync.mod.SyncClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersServices extends js.Object {
  var network: Network
  var session: Session
  var syncClient: SyncClient
}

object UsersServices {
  @scala.inline
  def apply(network: Network, session: Session, syncClient: SyncClient): UsersServices = {
    val __obj = js.Dynamic.literal(network = network.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], syncClient = syncClient.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UsersServices]
  }
}

