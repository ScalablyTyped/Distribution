package typings.systeminformation.systeminformationMod.SysteminformationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetConnectionsData extends js.Object {
  var localaddress: String
  var localport: String
  var peeraddress: String
  var peerport: String
  var protocol: String
  var state: String
}

object NetConnectionsData {
  @scala.inline
  def apply(
    localaddress: String,
    localport: String,
    peeraddress: String,
    peerport: String,
    protocol: String,
    state: String
  ): NetConnectionsData = {
    val __obj = js.Dynamic.literal(localaddress = localaddress, localport = localport, peeraddress = peeraddress, peerport = peerport, protocol = protocol, state = state)
  
    __obj.asInstanceOf[NetConnectionsData]
  }
}

