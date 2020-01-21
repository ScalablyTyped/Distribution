package typings.typestubIpfs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PeerInfo extends js.Object {
  var id: PeerId
  var multiaddr: Multiaddr
  var multiaddrs: js.Array[Multiaddr]
  def distinctMultiaddr(): js.Array[Multiaddr]
}

object PeerInfo {
  @scala.inline
  def apply(
    distinctMultiaddr: () => js.Array[Multiaddr],
    id: PeerId,
    multiaddr: Multiaddr,
    multiaddrs: js.Array[Multiaddr]
  ): PeerInfo = {
    val __obj = js.Dynamic.literal(distinctMultiaddr = js.Any.fromFunction0(distinctMultiaddr), id = id.asInstanceOf[js.Any], multiaddr = multiaddr.asInstanceOf[js.Any], multiaddrs = multiaddrs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PeerInfo]
  }
}

