package typings
package twilioDashChatLib.libDataUsersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersServices extends js.Object {
  var network: twilioDashChatLib.libServicesNetworkMod.Network
  var session: twilioDashChatLib.libSessionMod.Session
  var syncClient: twilioDashSyncLib.twilioDashSyncMod.SyncClient
}

object UsersServices {
  @scala.inline
  def apply(
    network: twilioDashChatLib.libServicesNetworkMod.Network,
    session: twilioDashChatLib.libSessionMod.Session,
    syncClient: twilioDashSyncLib.twilioDashSyncMod.SyncClient
  ): UsersServices = {
    val __obj = js.Dynamic.literal(network = network, session = session, syncClient = syncClient)
  
    __obj.asInstanceOf[UsersServices]
  }
}

