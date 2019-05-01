package typings
package twilioDashChatLib.libSynclistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyncListServices extends js.Object {
  var network: twilioDashChatLib.libServicesNetworkMod.Network
  var session: twilioDashChatLib.libSessionMod.Session
}

object SyncListServices {
  @scala.inline
  def apply(
    network: twilioDashChatLib.libServicesNetworkMod.Network,
    session: twilioDashChatLib.libSessionMod.Session
  ): SyncListServices = {
    val __obj = js.Dynamic.literal(network = network, session = session)
  
    __obj.asInstanceOf[SyncListServices]
  }
}

