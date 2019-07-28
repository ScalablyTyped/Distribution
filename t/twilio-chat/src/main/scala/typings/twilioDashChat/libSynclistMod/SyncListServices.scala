package typings.twilioDashChat.libSynclistMod

import typings.twilioDashChat.libServicesNetworkMod.Network
import typings.twilioDashChat.libSessionMod.Session
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyncListServices extends js.Object {
  var network: Network
  var session: Session
}

object SyncListServices {
  @scala.inline
  def apply(network: Network, session: Session): SyncListServices = {
    val __obj = js.Dynamic.literal(network = network, session = session)
  
    __obj.asInstanceOf[SyncListServices]
  }
}

