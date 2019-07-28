package typings.typestubDashIpfs.typestubDashIpfsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Id extends js.Object {
  var addresses: js.Array[Multiaddr]
  var agentVersion: String
  var id: String
  var protocolVersion: String
  var publicKey: String
}

object Id {
  @scala.inline
  def apply(
    addresses: js.Array[Multiaddr],
    agentVersion: String,
    id: String,
    protocolVersion: String,
    publicKey: String
  ): Id = {
    val __obj = js.Dynamic.literal(addresses = addresses, agentVersion = agentVersion, id = id, protocolVersion = protocolVersion, publicKey = publicKey)
  
    __obj.asInstanceOf[Id]
  }
}

