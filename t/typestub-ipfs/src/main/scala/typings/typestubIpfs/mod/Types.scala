package typings.typestubIpfs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Types extends js.Object {
  var Buffer: js.Any = js.native
  var CID: typings.typestubIpfs.mod.CID = js.native
  var PeerId: String | js.Any = js.native
  var PeerInfo: js.Any = js.native
  var multiaddr: Multiaddr = js.native
  var multihash: Multihash = js.native
}

object Types {
  @scala.inline
  def apply(
    Buffer: js.Any,
    CID: CID,
    PeerId: String | js.Any,
    PeerInfo: js.Any,
    multiaddr: Multiaddr,
    multihash: Multihash
  ): Types = {
    val __obj = js.Dynamic.literal(Buffer = Buffer.asInstanceOf[js.Any], CID = CID.asInstanceOf[js.Any], PeerId = PeerId.asInstanceOf[js.Any], PeerInfo = PeerInfo.asInstanceOf[js.Any], multiaddr = multiaddr.asInstanceOf[js.Any], multihash = multihash.asInstanceOf[js.Any])
    __obj.asInstanceOf[Types]
  }
  @scala.inline
  implicit class TypesOps[Self <: Types] (val x: Self) extends AnyVal {
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
    def setBuffer(value: js.Any): Self = this.set("Buffer", value.asInstanceOf[js.Any])
    @scala.inline
    def setCID(value: CID): Self = this.set("CID", value.asInstanceOf[js.Any])
    @scala.inline
    def setPeerId(value: String | js.Any): Self = this.set("PeerId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPeerInfo(value: js.Any): Self = this.set("PeerInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def setMultiaddr(value: Multiaddr): Self = this.set("multiaddr", value.asInstanceOf[js.Any])
    @scala.inline
    def setMultihash(value: Multihash): Self = this.set("multihash", value.asInstanceOf[js.Any])
  }
  
}

