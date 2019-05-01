package typings
package typestubDashIpfsLib.typestubDashIpfsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Id extends js.Object {
  var addresses: js.Array[Multiaddr]
  var agentVersion: java.lang.String
  var id: java.lang.String
  var protocolVersion: java.lang.String
  var publicKey: java.lang.String
}

object Id {
  @scala.inline
  def apply(
    addresses: js.Array[Multiaddr],
    agentVersion: java.lang.String,
    id: java.lang.String,
    protocolVersion: java.lang.String,
    publicKey: java.lang.String
  ): Id = {
    val __obj = js.Dynamic.literal(addresses = addresses, agentVersion = agentVersion, id = id, protocolVersion = protocolVersion, publicKey = publicKey)
  
    __obj.asInstanceOf[Id]
  }
}

