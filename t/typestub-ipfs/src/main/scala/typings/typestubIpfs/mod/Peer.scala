package typings.typestubIpfs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Peer extends js.Object {
  var addr: Multiaddr = js.native
  var peer: PeerInfo = js.native
}

object Peer {
  @scala.inline
  def apply(addr: Multiaddr, peer: PeerInfo): Peer = {
    val __obj = js.Dynamic.literal(addr = addr.asInstanceOf[js.Any], peer = peer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Peer]
  }
  @scala.inline
  implicit class PeerOps[Self <: Peer] (val x: Self) extends AnyVal {
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
    def setAddr(value: Multiaddr): Self = this.set("addr", value.asInstanceOf[js.Any])
    @scala.inline
    def setPeer(value: PeerInfo): Self = this.set("peer", value.asInstanceOf[js.Any])
  }
  
}

