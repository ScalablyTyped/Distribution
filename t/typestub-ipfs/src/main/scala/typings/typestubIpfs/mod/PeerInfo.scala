package typings.typestubIpfs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PeerInfo extends js.Object {
  var id: PeerId = js.native
  var multiaddr: Multiaddr = js.native
  var multiaddrs: js.Array[Multiaddr] = js.native
  def distinctMultiaddr(): js.Array[Multiaddr] = js.native
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
  @scala.inline
  implicit class PeerInfoOps[Self <: PeerInfo] (val x: Self) extends AnyVal {
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
    def setDistinctMultiaddr(value: () => js.Array[Multiaddr]): Self = this.set("distinctMultiaddr", js.Any.fromFunction0(value))
    @scala.inline
    def setId(value: PeerId): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setMultiaddr(value: Multiaddr): Self = this.set("multiaddr", value.asInstanceOf[js.Any])
    @scala.inline
    def setMultiaddrsVarargs(value: Multiaddr*): Self = this.set("multiaddrs", js.Array(value :_*))
    @scala.inline
    def setMultiaddrs(value: js.Array[Multiaddr]): Self = this.set("multiaddrs", value.asInstanceOf[js.Any])
  }
  
}

