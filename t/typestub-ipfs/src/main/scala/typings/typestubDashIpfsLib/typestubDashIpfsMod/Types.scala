package typings
package typestubDashIpfsLib.typestubDashIpfsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Types extends js.Object {
  var Buffer: js.Any
  var CID: typestubDashIpfsLib.typestubDashIpfsMod.CID
  var PeerId: java.lang.String | js.Any
  var PeerInfo: js.Any
  var multiaddr: Multiaddr
  var multihash: Multihash
}

object Types {
  @scala.inline
  def apply(
    Buffer: js.Any,
    CID: CID,
    PeerId: java.lang.String | js.Any,
    PeerInfo: js.Any,
    multiaddr: Multiaddr,
    multihash: Multihash
  ): Types = {
    val __obj = js.Dynamic.literal(Buffer = Buffer, CID = CID, PeerId = PeerId.asInstanceOf[js.Any], PeerInfo = PeerInfo, multiaddr = multiaddr, multihash = multihash.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Types]
  }
}

