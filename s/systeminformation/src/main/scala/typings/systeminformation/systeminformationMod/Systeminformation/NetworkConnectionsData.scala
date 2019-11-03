package typings.systeminformation.systeminformationMod.Systeminformation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkConnectionsData extends js.Object {
  var localaddress: String
  var localport: String
  var peeraddress: String
  var peerport: String
  var pid: Double
  var process: String
  var protocol: String
  var state: String
}

object NetworkConnectionsData {
  @scala.inline
  def apply(
    localaddress: String,
    localport: String,
    peeraddress: String,
    peerport: String,
    pid: Double,
    process: String,
    protocol: String,
    state: String
  ): NetworkConnectionsData = {
    val __obj = js.Dynamic.literal(localaddress = localaddress, localport = localport, peeraddress = peeraddress, peerport = peerport, pid = pid, process = process, protocol = protocol, state = state)
  
    __obj.asInstanceOf[NetworkConnectionsData]
  }
}

