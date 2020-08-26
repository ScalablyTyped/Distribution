package typings.typestubIpfs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Id extends js.Object {
  var addresses: js.Array[Multiaddr] = js.native
  var agentVersion: String = js.native
  var id: String = js.native
  var protocolVersion: String = js.native
  var publicKey: String = js.native
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
    val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any], agentVersion = agentVersion.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], protocolVersion = protocolVersion.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
  @scala.inline
  implicit class IdOps[Self <: Id] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddressesVarargs(value: Multiaddr*): Self = this.set("addresses", js.Array(value :_*))
    @scala.inline
    def setAddresses(value: js.Array[Multiaddr]): Self = this.set("addresses", value.asInstanceOf[js.Any])
    @scala.inline
    def setAgentVersion(value: String): Self = this.set("agentVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setProtocolVersion(value: String): Self = this.set("protocolVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublicKey(value: String): Self = this.set("publicKey", value.asInstanceOf[js.Any])
  }
  
}

