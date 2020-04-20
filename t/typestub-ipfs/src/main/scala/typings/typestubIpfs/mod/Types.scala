package typings.typestubIpfs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Types extends js.Object {
  var Buffer: js.Any
  var CID: typings.typestubIpfs.mod.CID
  var PeerId: String | js.Any
  var PeerInfo: js.Any
  var multiaddr: Multiaddr
  var multihash: Multihash
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
}

