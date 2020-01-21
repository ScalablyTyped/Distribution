package typings.systeminformation.mod.Systeminformation

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
    val __obj = js.Dynamic.literal(localaddress = localaddress.asInstanceOf[js.Any], localport = localport.asInstanceOf[js.Any], peeraddress = peeraddress.asInstanceOf[js.Any], peerport = peerport.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], process = process.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NetworkConnectionsData]
  }
}

