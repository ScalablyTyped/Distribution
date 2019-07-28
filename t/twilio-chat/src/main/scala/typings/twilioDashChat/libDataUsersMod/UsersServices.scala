package typings.twilioDashChat.libDataUsersMod

import typings.twilioDashChat.libServicesNetworkMod.Network
import typings.twilioDashChat.libSessionMod.Session
import typings.twilioDashSync.twilioDashSyncMod.SyncClient
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
    val __obj = js.Dynamic.literal(network = network, session = session, syncClient = syncClient)
  
    __obj.asInstanceOf[UsersServices]
  }
}

