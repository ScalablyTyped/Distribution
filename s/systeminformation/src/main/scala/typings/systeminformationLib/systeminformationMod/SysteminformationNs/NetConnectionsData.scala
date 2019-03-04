package typings
package systeminformationLib.systeminformationMod.SysteminformationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetConnectionsData extends js.Object {
  var localaddress: java.lang.String
  var localport: java.lang.String
  var peeraddress: java.lang.String
  var peerport: java.lang.String
  var protocol: java.lang.String
  var state: java.lang.String
}

object NetConnectionsData {
  @scala.inline
  def apply(
    localaddress: java.lang.String,
    localport: java.lang.String,
    peeraddress: java.lang.String,
    peerport: java.lang.String,
    protocol: java.lang.String,
    state: java.lang.String
  ): NetConnectionsData = {
    val __obj = js.Dynamic.literal(localaddress = localaddress, localport = localport, peeraddress = peeraddress, peerport = peerport, protocol = protocol, state = state)
  
    __obj.asInstanceOf[NetConnectionsData]
  }
}

