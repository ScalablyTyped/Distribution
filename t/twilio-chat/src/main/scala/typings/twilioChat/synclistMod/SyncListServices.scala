package typings.twilioChat.synclistMod

import typings.twilioChat.networkMod.Network
import typings.twilioChat.sessionMod.Session
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
    val __obj = js.Dynamic.literal(network = network.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SyncListServices]
  }
}

